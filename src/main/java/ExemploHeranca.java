
import utfpr.ct.dainf.if62c.exemplos.Quadrado;
import utfpr.ct.dainf.if62c.exemplos.Retangulo;
import utfpr.ct.dainf.if62c.exemplos.TrianguloEquilatero;

/**
 * IF62C Fundamentos de Programação 2
 * Exercício de programação em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */public class ExemploHeranca 
{
    public static void main( String[] args )
    {
        Retangulo r = new Retangulo(4, 2);
        Quadrado q = new Quadrado(4);
        TrianguloEquilatero te = new TrianguloEquilatero(4);
        
        System.out.println("Area do retângulo = " + r.getArea());
        System.out.println("Perímetro do retângulo = " + r.getPerimetro());
        System.out.println("Area do quadrado = " + q.getArea());
        System.out.println("Perímetro do quadrado = " + q.getPerimetro());
        System.out.println("Area do triângulo = " + te.getArea());
        System.out.println("Perímetro do triângulo = " + te.getPerimetro());
    }
}
