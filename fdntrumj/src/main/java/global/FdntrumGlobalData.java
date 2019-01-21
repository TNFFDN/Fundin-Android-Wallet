package global;

import java.util.ArrayList;
import java.util.List;

import fdntrum.FdntrumPeerData;

/**
 * Created by tnf on 1/14/19.
 */

public class FdntrumGlobalData {

    public static final String[] TRUSTED_NODES = new String[]{
      "66.42.32.6"
      "95.179.211.169"
      "217.69.10.58"
    };

    public static final List<FdntrumPeerData> listTrustedHosts(){
        List<FdntrumPeerData> list = new ArrayList<>();
        for (String trustedNode : TRUSTED_NODES) {
            list.add(new FdntrumPeerData(trustedNode,7777,7777));
        }
        return list;
    }

}
