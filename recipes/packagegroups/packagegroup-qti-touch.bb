SUMMARY = "QTI Touch package groups"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

LICENSE = "BSD-3-Clause-Clear"

PROVIDES = "${PACKAGES}"

PACKAGES = ' \
    packagegroup-qti-touch \
    '

RDEPENDS_packagegroup-qti-touch = ' \
    touchdlkm \
    '

