<?php
$ip = "127.0.0.1:161";

$tcpConnState = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.1");
$tcpConnLocalAddress = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.2");
$tcpConnLocalPort = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.3");
$tcpConnRemAddress = snmp2_walk($ip, "public", ".1.3.6.1.2.1.6.13.1.4");

echo str_pad("Index", 10) . str_pad("State", 20) . str_pad("Local Address", 20) . str_pad("Local Port", 15) . "Remote Address\n";

for ($i = 0; $i < count($tcpConnState); $i++) {
    echo str_pad($i, 10) . str_pad($tcpConnState[$i], 20) . str_pad($tcpConnLocalAddress[$i], 20) . str_pad($tcpConnLocalPort[$i], 15) . $tcpConnRemAddress[$i] . "\n";
}
?>
