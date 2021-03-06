package br.udesc.prog2.exemplo.excecao.checked.novaexcecao;

public class Calculadora {
    
    private float resultado;

    public Calculadora() {
        this.resultado = 0;
    }
    
    public void divide(float x) throws DivisaoPorZeroException{
        if(x == 0)
            throw new DivisaoPorZeroException();
        resultado /= x;
    }
    
    public void divideEspecial(float x) throws DivisaoPorZeroException {
        divide(x);
    }
        
        
    public void soma(float x)throws SomaException {
        if(resultado + x > 100)
            throw new SomaException();
        resultado += x;
    }
    
    public void subtrai(float x){
        resultado -= x;
    }
    
    public void multiplica(float x){
        resultado *= x;
    }

    public float getResultado() {
        return resultado;
    }
    
}
