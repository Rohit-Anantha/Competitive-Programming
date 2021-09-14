import java.util.Scanner;

public class CutePets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int petPairs = scan.nextInt();

        int[] petOwners = new int[petPairs];
        int[] petAppreciators = new int[petPairs];

        int ownerMax = -1;
        int ownerMaxIndex = -1;

        int appreciatorMax = -1;
        int appreciatorMaxIndex = -1;

        for (int i = 0; i < petPairs; i++) {
            petOwners[i] = scan.nextInt();
            petAppreciators[i] = scan.nextInt();
        }

        for (int i = 0; i < petAppreciators.length; i++) {
            if(ownerMax < petOwners[i])
            {
                ownerMax = petOwners[i];
                ownerMaxIndex = i;
            }
        }

        boolean proved = false;

        for (int i = 0; i < petAppreciators.length; i++) {
            if(petOwners[ownerMaxIndex] < petAppreciators[i])
            {
                proved = true;
            }
        }

        if(proved)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


        scan.close();
    }
}
