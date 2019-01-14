package fdntrum.listeners;

import java.util.List;

import fdntrum.FdntrumPeer;
import fdntrum.messages.responses.StatusHistory;
import fdntrum.messages.responses.Unspent;
import fdntrum.utility.TxHashHeightWrapper;

/**
 * Created by tnf on 1/14/19. on 6/17/17.
 */

public interface PeerDataListener {

    void onSubscribedAddressChange(FdntrumPeer fdntrumPeer, String address, String status);

    void onListUnpent(FdntrumPeer fdntrumPeer,String address, List<Unspent> unspent);

    void onBalanceReceive(FdntrumPeer fdntrumPeer, String address, long confirmed, long unconfirmed);

    void onGetHistory(FdntrumPeer fdntrumPeer, StatusHistory statusHistory);
}
