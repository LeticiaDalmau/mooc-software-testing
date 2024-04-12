package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        for(int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i) == 'g') {
                if (i >= 1 && str.toLowerCase().charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.toLowerCase().charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        return true;

    }
}
