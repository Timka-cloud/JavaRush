package JavaSyntax.level7.dataTypes;

public class Task1 {
    public static void main(String[] args) {

        int b = 1000000;
        short c = (short) b;
        System.out.println(c);
        byte d = (byte) c;
        System.out.println(d);

        // int b = 1000000; int = 4byte
        // 2147483648 1073741824 536870912 268435456 134217728 67108864 33554432 16777216
        //          0          0         0         0         0        0        0        0
        //
        // 8388608 4194304 2097152 1048576 524288 262144 131072 65536
        //       0       0       0       0      1      1      1     1
        //
        // 32768 16384 8192 4096 2048 1024 512 256
        //     0     1    0    0    0    0   1   0
        //
        // 128 64 32 16 8 4 2 1
        //  0   1  0  0 0 0 0 0
        // result = 1000000
        //
        // short c = (short) b; short = 2byte
        // 32768 16384 8192 4096 2048 1024 512 256
        //     0     1    0    0    0    0   1   0
        //
        // 128 64 32 16 8 4 2 1
        //  0   1  0  0 0 0 0 0
        // result = 16960
        //
        // byte d = (byte) c; byte = 1byte;
        // 128 64 32 16 8 4 2 1
        //  0   1  0  0 0 0 0 0
        // result = 64;
    }
}
