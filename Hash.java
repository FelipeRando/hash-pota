/**
 * Hash
 */ 
public class Hash {
    int[] lista = new int[8];
    public Hash(){}
    
    int hash(int k)
    {
        return k % 10;
    }

    int rehash(int k)
    {
        return k+1;
    }

    public void insere (int k)
    {
        if(hash(k)>lista.length-1||lista[hash(k)]!=0)
        {
            for(int i=0;i<=lista.length-1;i++){
                if (lista[i]==0)
                {
                    lista[i]=k;
                    break;
                }
            }       
        }
        else
        {
            lista[hash(k)]=k;
        }
        
        
    }

    public void remove(int k){}
    
    public int busca(int k)
    {
        return k;
    }
    
}