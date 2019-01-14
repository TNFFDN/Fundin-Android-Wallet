package fdntrum.listeners;

import fdntrum.BwktrumPeer;

/**
 * Created by kaali on 6/17/17.
 */

public interface PeerListener {

    void onConnected(BwktrumPeer fdntrumPeer);

    void onDisconnected(BwktrumPeer fdntrumPeer);

    void onExceptionCaught(BwktrumPeer fdntrumPeer, Exception e);
}
