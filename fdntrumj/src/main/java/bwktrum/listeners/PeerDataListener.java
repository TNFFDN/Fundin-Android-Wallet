package fdntrum.listeners;

import java.util.List;

import fdntrum.BwktrumPeer;
import fdntrum.messages.responses.StatusHistory;
import fdntrum.messages.responses.Unspent;
import fdntrum.utility.TxHashHeightWrapper;

/**
 * Created by kaali on 6/17/17.
 */

public interface PeerDataListener {

    void onSubscribedAddressChange(BwktrumPeer fdntrumPeer, String address, String status);

    void onListUnpent(BwktrumPeer fdntrumPeer,String address, List<Unspent> unspent);

    void onBalanceReceive(BwktrumPeer fdntrumPeer, String address, long confirmed, long unconfirmed);

    void onGetHistory(BwktrumPeer fdntrumPeer, StatusHistory statusHistory);
}
