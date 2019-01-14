package fdntrum.listeners;

import fdntrum.FdntrumPeer;

/**
 * Created by tnf on 1/14/19. on 6/17/17.
 */

public interface PeerListener {

    void onConnected(FdntrumPeer fdntrumPeer);

    void onDisconnected(FdntrumPeer fdntrumPeer);

    void onExceptionCaught(FdntrumPeer fdntrumPeer, Exception e);
}
