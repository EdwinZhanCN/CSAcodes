package Dictionary.src;

public class Fuzzyquery {
    public static void main(String[] args) {
        System.out.println(fuzzySearch("fdsfdsfds", "hello"));
    }
    public static boolean fuzzySearch (String query, String data){
        int allowCount = 0;
        int counted = 0;
        int searchIndex = 0;
        int dataIndex = 0;
        boolean flag = true;
        int i;

        if((i = query.indexOf("~")) > -1){
            if((i+1) < query.length()){
                allowCount = Integer.valueOf(query.substring(i + 1));
            }else{
                allowCount = 2;
            }
        }

        char[] searchArrays = query.substring(0,1).toCharArray();
        char[] dataArrays = data.toCharArray();
        A:
        while(true){
            if(counted > allowCount){
                return false;
            }
            if(dataIndex >= dataArrays.length){
                counted += (searchArrays.length - searchIndex);
                break;
            }

            if(flag){
                boolean match = false;
                for(int j = 0; j <= (allowCount - counted); j++){
                    if((j + searchIndex) >= searchArrays.length){
                        counted += (dataArrays.length - dataIndex);
                        break A;
                    }
                    if(dataArrays[dataIndex] == searchArrays[j + searchIndex]){
                        if( j > 1){
                            break;
                        }
                        counted += j;
                        searchIndex += (j+1);
                        match = true;
                        break;
                    }
                }
                if(!match){
                    counted += 1;
                    flag = false;
                }
            }else{
                boolean match = false;
                for(int j = 0; j<= (allowCount - counted +1); j++){
                    if((j + searchIndex) >= searchArrays.length){
                        counted += (dataArrays.length - dataIndex -1);
                        break A;
                    }
                    if(dataArrays[dataIndex] == searchArrays[j + searchIndex]){
                        if(j > 2){
                            break;
                        }
                        if(j>1){
                            counted += (j-1);
                        }
                        searchIndex += (j+1);
                        match = true;
                        flag = true;
                        break;
                    }

                }
                if(!match){
                    counted +=1;
                    flag = false;
                }
            }
            dataIndex++;
        }
        return counted <= allowCount;
    }
}
