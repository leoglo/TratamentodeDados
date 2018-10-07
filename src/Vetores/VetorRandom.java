
package Vetores;

public class VetorRandom
{

    public int[] CriarVetor()
    {
       int[] vetor = new int[100000];
       int valor, pos;

        for (pos = 0; pos < vetor.length; pos++)
        {
            valor = (int) (Math.random() * 1000000) + 1;
            vetor[pos] = valor;
        }
        
        return (vetor);
    }

}
