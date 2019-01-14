package fundin.org.fundinwallet.module;

import android.content.SharedPreferences;

import org.fundinj.core.Context;
import org.fundinj.core.NetworkParameters;

import global.WalletConfiguration;
import fundin.org.fundinwallet.utils.Configurations;

import static fundin.org.fundinwallet.module.FundinContext.CONTEXT;
import static fundin.org.fundinwallet.module.FundinContext.Files.BLOCKCHAIN_FILENAME;
import static fundin.org.fundinwallet.module.FundinContext.Files.CHECKPOINTS_FILENAME;
import static fundin.org.fundinwallet.module.FundinContext.Files.WALLET_FILENAME_PROTOBUF;
import static fundin.org.fundinwallet.module.FundinContext.Files.WALLET_KEY_BACKUP_PROTOBUF;
import static fundin.org.fundinwallet.module.FundinContext.NETWORK_PARAMETERS;
import static fundin.org.fundinwallet.module.FundinContext.PEER_DISCOVERY_TIMEOUT_MS;
import static fundin.org.fundinwallet.module.FundinContext.PEER_TIMEOUT_MS;

/**
 * Created by kaali on 6/4/17.
 */

public class WalletConfImp extends Configurations implements WalletConfiguration {

    private static final String PREF_TRUSTED_NODE = "trusted_node";
    private static final String PREFS_KEY_SCHEDULE_BLOCKCHAIN_SERVICE = "sch_block_serv";

    public WalletConfImp(SharedPreferences prefs) {
        super(prefs);
    }

    @Override
    public String getTrustedNodeHost() {
        return getString(PREF_TRUSTED_NODE,null);
    }

    @Override
    public void saveTrustedNode(String host, int port) {
        save(PREF_TRUSTED_NODE,host);
    }

    @Override
    public void saveScheduleBlockchainService(long time){
        save(PREFS_KEY_SCHEDULE_BLOCKCHAIN_SERVICE,time);
    }

    @Override
    public long getScheduledBLockchainService(){
        return getLong(PREFS_KEY_SCHEDULE_BLOCKCHAIN_SERVICE,0);
    }

    @Override
    public int getTrustedNodePort() {
        return FundinContext.NETWORK_PARAMETERS.getPort();
    }

    @Override
    public String getMnemonicFilename() {
        return FundinContext.Files.BIP39_WORDLIST_FILENAME;
    }

    @Override
    public String getWalletProtobufFilename() {
        return WALLET_FILENAME_PROTOBUF;
    }

    @Override
    public NetworkParameters getNetworkParams() {
        return FundinContext.NETWORK_PARAMETERS;
    }

    @Override
    public String getKeyBackupProtobuf() {
        return WALLET_KEY_BACKUP_PROTOBUF;
    }

    @Override
    public long getWalletAutosaveDelayMs() {
        return FundinContext.Files.WALLET_AUTOSAVE_DELAY_MS;
    }

    @Override
    public Context getWalletContext() {
        return CONTEXT;
    }

    @Override
    public String getBlockchainFilename() {
        return BLOCKCHAIN_FILENAME;
    }

    @Override
    public String getCheckpointFilename() {
        return CHECKPOINTS_FILENAME;
    }

    @Override
    public int getPeerTimeoutMs() {
        return PEER_TIMEOUT_MS;
    }

    @Override
    public long getPeerDiscoveryTimeoutMs() {
        return PEER_DISCOVERY_TIMEOUT_MS;
    }

    @Override
    public int getMinMemoryNeeded() {
        return FundinContext.MEMORY_CLASS_LOWEND;
    }

    @Override
    public long getBackupMaxChars() {
        return FundinContext.BACKUP_MAX_CHARS;
    }

    @Override
    public boolean isTest() {
        return FundinContext.IS_TEST;
    }

    @Override
    public int getProtocolVersion() {
        return NETWORK_PARAMETERS.getProtocolVersionNum(NetworkParameters.ProtocolVersion.CURRENT);
    }

}
