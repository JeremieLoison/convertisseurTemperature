
/**
 * J'ai réaliser cette application en suivant le tuto d'OpenClassRoom
 * afin de travailler les variables, les conditions et les boucles.
 */
/**
 *
 * @author Jérémie-Loison
 * Je suis en formation de Développeur Logiciel
 * dans l'établissement m2i-Formation Diplômante.
 */
// Import de tout les utilitaires java.
import java.util.*;

public class convertirTempereature {


    public static void main(String[] args) {

        // Permet de récupérer dans la console la saisie au clavier.
        Scanner sc = new Scanner(System.in);

        // Déclaration des variable utilisées pour réaliser la conversion
        double aConvertir, convertit = 0;

        char reponse=' ', mode= ' ';

        // Permet d'afficher à la console le texte. 
        System.out.println("Convertisseur des degrés Celsius et des degrés Fahrenheit");
        System.out.println("--------------------------------------------------------");
    
        do{

            do{
                mode= ' ';
                System.out.println("Choisissez le mode de conversion: ");
                System.out.println("1 - Convertisseur Celsius - Fahrenheit ");
                System.out.println("2 - Convertisseur Fahrenheit - Celsius ");
                mode = sc.nextLine().charAt(0);
                  

                if(mode != '1' && mode != '2')
                    System.out.println("Mode inconnu, veuillez réitérer votre choix.");
                
            } while (mode != '1' && mode != '2');
                //Saisie de la températur à convertir     
                System.out.println("Température à convertir:");
                    aConvertir = sc.nextDouble();
                    // Permet de vider la ligne vue
                    sc.nextLine();
                    
                    if(mode == '1'){
                        convertit = ((9.0/5.0) * aConvertir) + 32.0;
                        System.out.println(aConvertir + " °C correspond à : ");
                        System.out.println(arrondi(convertit, 2) + " °F.");
                    }
                    else{
                        convertit =((aConvertir - 32) * 5) / 9;
                        System.out.println(arrondi(convertit, 2) + " °C.");
                    }
                    do{
                        
                        System.out.println("Souhaitez-vous convertir une autre température ?(O/N)");
                        reponse = sc.nextLine().charAt(0);

                    }while(reponse !='O' && reponse !='N');      
        
}while(reponse == 'O');
        System.out.println("Au revoir !");
    }
    public static double arrondi(double A, int B){
        return (double) ( (int)(A * Math.pow(10, B) + .5)) /Math.pow(10, B);
    }
}