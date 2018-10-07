package tratamentodedados;

public class Ordenacao
{

    public String mensagem;
    public long tempoinsertonsort;
    public int continsertonsort;
    public long temposelectionsort;
    
    public long tempobubbleSort;
    

    public void insertonsort(int vet[])
    {
        this.tempoinsertonsort = 0;
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
            this.continsertonsort++;
        }
        this.tempoinsertonsort = (System.currentTimeMillis() - start);
        /*for (int pos = 0; pos < vet.length; pos++)
        {
            System.out.println(vet[pos]);
        }*/
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
        this.tempobubbleSort = (System.currentTimeMillis() - start);
        /* for (int pos = 0; pos < vet.length; pos++)
        {
            System.out.println(pos + 1 + " " + vet[pos]);
        }*/
    }

}
