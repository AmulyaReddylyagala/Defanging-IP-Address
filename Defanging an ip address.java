class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ch=new StringBuilder();
        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.')
            ch.append("[.]");
            else
            ch.append(address.charAt(i));
        }
        return ch.toString();
    }
}