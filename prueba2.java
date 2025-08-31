public class prueba2 {

    private void imprimirMatriz(char[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

    public void imprimirFigura1(int n) {
        char[][] m = new char[n][2 * n - 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                m[i][j] = ' ';
            }
        }

        for (int i = 0; i < n; i++) {
            int inicio = n - 1 - i;
            int fin = n - 1 + i;
            for (int j = inicio; j <= fin; j++) {
                m[i][j] = '*';
            }
        }

        imprimirMatriz(m);
    }

    public void imprimirFigura2(int n) {
        char[][] m = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = ' ';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                m[i][j] = '*';
            }
        }
        imprimirMatriz(m);
    }

    public void imprimirFigura3(int n) {
        char[][] m = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = ' ';

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                m[i][j] = '*';
            }
        }
        imprimirMatriz(m);
    }

    public void imprimirFigura4(int n) {
        char[][] m = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = ' ';

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - 1 - i; j--) {
                m[i][j] = '*';
            }
        }
        imprimirMatriz(m);
    }

    public void imprimirFigura5(int n) {
        char[][] m = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = ' ';

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                m[i][j] = '*';
            }
        }
        imprimirMatriz(m);
    }
}
