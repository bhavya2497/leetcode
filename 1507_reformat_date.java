class Solution {
    public String reformatDate(String date) {
        System.out.println(date.substring(0,2));
        String[] d = date.split(" ");
        StringBuilder sb = new StringBuilder();
        Map<String,String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        for(int i = d.length-1; i >= 0; i--){
            System.out.println(d[i]);
            if(i == d.length-1){
                sb.append(d[i]);
                sb.append("-");
            }else if(i == d.length-2){
                sb.append(months.get(d[i]));
                sb.append("-");
            }else{
                if(Character.isDigit(date.charAt(0)) && Character.isDigit(date.charAt(1))){
                    sb.append(date.substring(0,2));
                }else{
                    sb.append("0");
                    sb.append(date.substring(0,1));
                }

            }
        }
        

        return sb.toString();
    }
}
