
package laboratorio2;

public class Operaciones {

    private float elemento1;
    private float elemento2;

    public Operaciones(float elemento1, float elemento2) {
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }
    
    public float getElemento1() {
        return elemento1;
    }

    public void setElemento1(float elemento1) {
        this.elemento1 = elemento1;
    }

    public float getElemento2() {
        return elemento2;
    }

    public void setElemento2(float elemento2) {
        this.elemento2 = elemento2;
    }
    
    public float sumar(){
        return this.elemento1 + this.elemento2;
    }
    
    public float restar(){
        return this.elemento1 - this.elemento2;
    }
    
    public float multiplicar(){
        return this.elemento1 * this.elemento2;
    }
    
    public float dividir(){
        return this.elemento1 / this.elemento2;
    }
    
}
