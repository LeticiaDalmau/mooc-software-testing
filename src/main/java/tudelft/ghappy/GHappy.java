package tudelft.ghappy;

public class GHappy {

    public boolean gHappy(String str) {
        assert str!=null;
        int existG = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'g') {
                existG = 1;
                if (i >= 1 && str.charAt(i-1) == 'g') { continue; }
                if (i+1 < str.length() && str.charAt(i+1) == 'g') { continue; }
                return false;
            }
        }

        if (existG == 0) { return false; } else { return true; }

    }
}
