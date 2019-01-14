package global;

import java.util.ArrayList;
import java.util.List;

import fdntrum.BwktrumPeerData;

/**
 * Created by kaali on 7/2/17.
 */

public class BwktrumGlobalData {

    public static final String KAALI_TESTNET_SERVER = "node1.fundincrypto.com";

    public static final String[] TRUSTED_NODES = new String[]{"node1.fundincrypto.com"};

    public static final List<BwktrumPeerData> listTrustedHosts(){
        List<BwktrumPeerData> list = new ArrayList<>();
        list.add(new BwktrumPeerData(KAALI_TESTNET_SERVER,52543,55552));
        for (String trustedNode : TRUSTED_NODES) {
            list.add(new BwktrumPeerData(trustedNode,52543,55552));
        }
        return list;
    }

}
