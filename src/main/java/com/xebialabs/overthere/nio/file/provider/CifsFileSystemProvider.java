package com.xebialabs.overthere.nio.file.provider;

import static com.xebialabs.overthere.cifs.CifsConnectionBuilder.CIFS_PROTOCOL;

import com.xebialabs.overthere.ConnectionOptions;
import com.xebialabs.overthere.OperatingSystemFamily;
import com.xebialabs.overthere.OverthereConnection;
import com.xebialabs.overthere.nio.file.OverthereFileSystemProvider;

public class CifsFileSystemProvider extends OverthereFileSystemProvider {
    @Override
    public String getScheme() {
        return CIFS_PROTOCOL;
    }

    @Override
    protected OverthereConnection getConnection(final ConnectionOptions options) {
        options.set(ConnectionOptions.OPERATING_SYSTEM, OperatingSystemFamily.WINDOWS);
        return super.getConnection(options);
    }
}
