public class ati2 {
    public static void main(String[] args) {
        
        int idade = 18;
        double altura = 1.78;
        boolean imprevisto = true; 
        
        String status;
        
        if (imprevisto) {
            status = "Ausente";
        } else {
            status = "Presente";
        }
        
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Status na aula: " + status);
    }
}