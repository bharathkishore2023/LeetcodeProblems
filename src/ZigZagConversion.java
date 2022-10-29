import java.util.*;
public class ZigZagConversion {
    public static void main(String[] args) {
        String str="PAYPALISHIRING";
        int noOfRows=3;
        System.out.println(ZigZagConversion.convert(str,noOfRows));
    }
        public static  String convert(String s, int numRows) {
            int row=0;
            int col=0;
            int curIndex=0;
            StringBuilder[] sbr=new StringBuilder[numRows];
            for(int i=0;i<numRows;i++){
                sbr[i]=new StringBuilder();
            }
            while(curIndex<s.length()){
                while(row<numRows && curIndex<s.length() ){
                    sbr[row].append(s.charAt(curIndex++));
                    row++;
                }
                row=Math.max(0,row-2);
                while(row>0 && curIndex<s.length()){
                    sbr[row--].append(s.charAt(curIndex++));
                }
            }
            StringBuilder ans=sbr[0];
            for(int i=1;i<numRows;i++){
                ans.append(sbr[i].toString());
            }
            return ans.toString();
        }

    }

