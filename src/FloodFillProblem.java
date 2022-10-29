import java.util.*;
public class FloodFillProblem {
    public static void main(String[] args) {
    int[][] image={{1,2,1,1},{2,1,1,2},{1,0,1,0}};
    int sr=1;
    int sc=2;
    int newColor=3;
        int [][] result=FloodFillProblem.floodFill(image,sr,sc,newColor);
        for(int i=0;i<image.length;i++){
            for(int j=0;j<=image.length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] floodFill(int[][] img,int x,int y,int color){
        int source=img[x][y];
        if(source==color){
            return img;
        }
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};

        img[x][y]=color;
        for(int i=0;i<dir.length;i++){
            int x1=x+dir[i][0];
            int y1=y+dir[i][1];
            if(x1>=img.length || x1<0 ||y1>=img.length || y1<0 ){
                continue;
            }
            if(img[x1][y1]!=source){
                continue;
            }
            floodFill(img,x1,y1,color);
        }
        return img;
    }
}
