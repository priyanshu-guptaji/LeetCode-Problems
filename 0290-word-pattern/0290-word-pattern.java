class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        int start = 0;
        for(int i = 0;i < pattern.length();i++) {
            if(start >= s.length()) return false;

            char ch = pattern.charAt(i);
            int end = start;

            while(end < s.length() &&  s.charAt(end) != ' ') {
                end++;
            }

            String p = s.substring(start,end);
            start = end + 1;

            if(map.containsKey(ch)) {
                if(!p.equals(map.get(ch))) return false;
            } else {
                if(set.contains(p)) return false;
                set.add(p);
                map.put(ch,p);
            } 
        }

        if (start < s.length()) return false;

        return true;
    }
}