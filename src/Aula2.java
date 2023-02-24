public class Aula2 {

    public static void main(String[] args) {

        //tipos primitivos
        int idade = 25;
        float altura = 1.62F;
        double peso = 68;
        String nome = "Marianne";
        boolean fumante = false;
        boolean exercicio = true;
        int QtdExercicio = 3;
        boolean dor = true;
        int IntDor = 6;

        //Wrappers
        Integer idade1 = 36;
        Float altura1 = 1.77F;
        Double peso1 = 92.5;
        Boolean fumante1 = false;


        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Altura: " + altura + " mt");
        System.out.println("Fumante: " + fumante);
        System.out.println("Exercicio: " + exercicio);
        System.out.println("Dor: " + dor);


        if (exercicio == true) {
            System.out.println("Continue fazendo exercicio físico");
            if (QtdExercicio >= 3) {
                System.out.println("Você está se exercitando legal");
            } else if (QtdExercicio <= 3) {
                System.out.println("Você precisa se exercitar mais");
            }
        }

        if (dor == true) {
            System.out.println("Qual a intensidade da sua dor? " + IntDor);
            if (IntDor >= 5) {
                System.out.println("Precisa de um médico");
            } else {
                System.out.println("Aguarde ai no tranquilinho");
            }
        }

    }
}