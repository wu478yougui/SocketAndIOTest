先运行下面这句：

mvn clean compile exec:java -Dexec.mainClass="com.hand.TCPServerSocket" -Dexec.args="arg0 arg1 arg2" 


然后运行下面这句：

mvn clean compile exec:java -Dexec.mainClass="com.hand.TCPClientSocket" -Dexec.args="arg0 arg1 arg2"
