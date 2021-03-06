LICENSE = "CLOSED"
DESCRIPTION = "mgcamd 1.35d only config"

PN = "enigma2-plugin-softcams-mgcamd-config"
#PV = "1.30d"
PR = "r3"

SRC_URI = "http://ilove.hobby-site.com/pub/OpenPLi3/src/mgcamd-config.tar.gz"

S = "${WORKDIR}"

INHIBIT_PACKAGE_STRIP = "1"

do_compile(){
}

do_install() {
	install -d ${D}/usr/keys
	install -m 0644 ${S}/mgcamd-config/usr/keys/peer.cfg ${D}/usr/keys/peer.cfg
	install -m 0644 ${S}/mgcamd-config/usr/keys/mg_cfg ${D}/usr/keys/mg_cfg
}
SRC_URI[autoconf.md5sum] = "69f931c1aa632a9733f691967fbd9845"
SRC_URI[autoconf.sha256sum] = "01e112ee041521b5f8f1bdeaf1bcec5c011097164dd47077badc4adcaa142b8c"
