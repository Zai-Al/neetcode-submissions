class Solution {
    public int romanToInt(String s) {
        int total = 0;

        for(int i = 0; i < s.length(); i++){
           
            if (i + 1 < s.length()){
                
                String num = s.substring(i, i + 2);
                switch (num) {
                    case "IV" -> {
                        total += 4; 
                        i++;
                        continue;
                    }
                    case "IX" -> {
                        total += 9;
                        i++;
                        continue;
                    }
                    case "XL" ->{
                        total += 40;
                        i++;
                        continue;
                    }
                    case "XC" -> {
                        total += 90;
                        i++;
                        continue;
                    }
                    case "CD" -> {
                        total += 400;
                        i++;
                        continue;
                    }
                    case "CM" -> {
                        total += 900;
                        i++;
                        continue;
                    }
                };
           }

           switch (s.charAt(i)) {
                case 'I' -> total += 1;
                case 'V' -> total += 5;
                case 'X' -> total += 10;
                case 'L' -> total += 50;
                case 'C' -> total += 100;
                case 'D' -> total += 500;
                case 'M' -> total += 1000;
            }
        }
        return total;
    }
} 