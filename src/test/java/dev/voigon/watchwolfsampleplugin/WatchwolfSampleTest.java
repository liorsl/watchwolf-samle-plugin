package dev.voigon.watchwolfsampleplugin;

import dev.watchwolf.entities.Position;
import dev.watchwolf.entities.blocks.Block;
import dev.watchwolf.entities.items.ItemType;
import dev.watchwolf.tester.AbstractTest;
import dev.watchwolf.tester.TesterConnector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import java.io.IOException;

@ExtendWith(WatchwolfSampleTest.class)
public class WatchwolfSampleTest extends AbstractTest {

    @Override
    public String getConfigFile() {
        return "src/test/resources/config.yaml";
    }

    /**
     * We'll place one dirt block, run the ctrl-z command, and then there should be air in that place
     * and the player should have his block back.
     */
    @ParameterizedTest
    @ArgumentsSource(WatchwolfSampleTest.class)
    public void restoreTheLastBrokenBlock(TesterConnector connector) throws IOException {
        connector.runCommand("test-cmd");
        Block block = connector.getBlock(new Position("world", 0, 0, 0));
        System.out.println(block);
        Assertions.assertEquals(block.getItemType(), ItemType.ACACIA_LOG);
    }
}
