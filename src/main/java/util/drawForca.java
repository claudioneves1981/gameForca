package util;

public class drawForca {
 

    public static char[][] drawForca(int contador, char[][] arrChar){
                   


                    
            switch (contador) {
                case 1:
                    arrChar[3][7]='(';
                    arrChar[3][8]='O';
                    arrChar[3][9]=')';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;

                case 2:
                    arrChar[4][8]='|';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;

                case 3:
                    arrChar[4][7]='/';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;

                case 4:
                    arrChar[4][9]='\\';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;

                case 5:
                    arrChar[5][8]='V';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;

                case 6:
                    arrChar[6][7]='/';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;
                
                case 7:
                    arrChar[6][9]='\\';
                    for (char[] cs : arrChar) {
                       System.out.println(cs);
                    }
                break;

                default:                    
                    for (char[] cs : arrChar) {
                        System.out.println(cs);
                    }
                break;
            }

        // for (int linha = 0; linha < arrChar.length; linha++) {
        //     for (int coluna = 0; coluna < arrChar[linha].length; coluna++) {
        //         System.out.print(arrChar[linha][coluna]);
        //     }
        //     System.out.println();
        // }
        return arrChar;
    }
}
