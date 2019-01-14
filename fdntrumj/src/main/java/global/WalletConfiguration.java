package global;

import org.fundinj.core.Context;
import org.fundinj.core.NetworkParameters;

/**
 * Created by tnf on 1/14/19. on 6/4/17.
 */

public interface WalletConfiguration {


    int getTrustedNodePort();

    String getTrustedNodeHost();

    void saveTrustedNode(String host,int port);

    void saveScheduleBlockchainService(long time);

    long getScheduledBLockchainService();

    /**************   Constants   ***************/

    String getMnemonicFilename();

    String getWalletProtobufFilename();

    NetworkParameters getNetworkParams();

    String getKeyBackupProtobuf();

    long getWalletAutosaveDelayMs();

    Context getWalletContext();

    String getBlockchainFilename();

    String getCheckpointFilename();

    int getPeerTimeoutMs();

    long getPeerDiscoveryTimeoutMs();

    int getMinMemoryNeeded();

    long getBackupMaxChars();

    boolean isTest();

    int getProtocolVersion();
}
