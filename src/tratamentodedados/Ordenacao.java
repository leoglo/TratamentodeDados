package tratamentodedados;

public class Ordenacao
{

    public String mensagem;
    public long tempoinsertonsort;
    public long temposelectionsort;
    public long tempobubbleSort;
    public long tempoquickSort;

    public void insertonsort(int vet[])
    {
        long start = System.currentTimeMillis();
        for (int i = 1; i < vet.length; i++)
        {
            int aux = vet[i];
            int j = i;

            while ((j > 0) && (vet[j - 1] > aux))
            {
                vet[j] = vet[j - 1];
                j -= 1;
            }
            vet[j] = aux;
        }
        long stop = System.currentTimeMillis();

        this.tempoinsertonsort = (stop - start);

        for (int pos = 0; pos < vet.length; pos++)
        {
            System.out.println(vet[pos]);
        }
        System.out.println(start);
        System.out.println(stop);
        System.out.println(stop - start);

    }

    public void selectionsort(int vet[])
    {
        this.temposelectionsort = 0;
        long start = System.currentTimeMillis();
        int i, j, min, aux;
        int tam = vet.length;
        for (i = 0; i < (tam - 1); i++)
        {
            min = i;
            for (j = (i + 1); j < tam; j++)
            {
                if (vet[j] < vet[min])
                {
                    min = j;
                }
            }
            if (vet[i] != vet[min])
            {
                aux = vet[i];
                vet[i] = vet[min];
                vet[min] = aux;
            }
        }

        this.temposelectionsort = (System.currentTimeMillis() - start);
    }

    public void bubbleSort(int vet[])
    {
        this.tempobubbleSort = 0;
        long start = System.currentTimeMillis();
        int i, j, temp;
        for (i = 0; i < vet.length - 1; i++)
        {
            for (j = (i + 1); j < vet.length; j++)
            {
                if (vet[j] < vet[i])
                {
                    temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }
        long stop = System.currentTimeMillis();
        this.tempobubbleSort = (System.currentTimeMillis() - start);
        for (int pos = 0; pos < vet.length; pos++)
        {
            System.out.println(pos + 1 + " " + vet[pos]);
        }
        System.out.println(start);
        System.out.println(stop);
        System.out.println(stop - start);

    }

    public void quickSort(int[] vetor, int inicio, int fim)
    {
        long start = System.currentTimeMillis();
        if (inicio < fim)
        {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        long stop = System.currentTimeMillis();
        this.tempoquickSort = (stop - start);
    }

    public int separar(int[] vetor, int inicio, int fim)
    {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f)
        {
            if (vetor[i] <= pivo)
            {
                i++;
            }
            else if (pivo < vetor[f])
            {
                f--;
            }
            else
            {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

}
