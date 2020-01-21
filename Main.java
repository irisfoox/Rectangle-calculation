package first;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=0;
        int y=0;
        int a=0;
        int b=0;
        int bigDiff1=0;
        int bigDiff2=0;
        Calc c=new Calc();
        int maxArea=0;
        int maxPara=0;
        int maxDiff=0;
        for(int i=1;i<=10;i++) {
        	for(int j=2;j<=10;j++) {
        		if(i!=j) {           //so we get rectangle,not a square
        		if(c.area(i, j)>c.parameter(i, j)) {
        			System.out.println("the area is bigger for rec "+i+" "+j);
        			if(c.area(i, j)-c.parameter(i, j)>maxDiff) {
        				maxDiff=c.area(i, j)-c.parameter(i, j);
        				bigDiff1=i;
        				bigDiff2=j;
        			}
        		}else {
        			System.out.println("the parameter is bigger for rec "+i+" "+j);
        		       if(c.area(i, j)-c.parameter(i, j)>maxDiff) {
    				      maxDiff=c.area(i, j)-c.parameter(i, j);
    				      bigDiff1=i;
    				      bigDiff2=j;
    			}
        		}
        		if(c.area(i, j)>maxArea) {
        			maxArea=c.area(i, j);
        			x=i;
        			y=j;
        		}
        		if(c.parameter(i, j)>maxPara) {
        			maxPara=c.parameter(i, j);
        			a=i;
        			b=j;
        		}
        		
        	}
        	}
        }
        System.out.println(String.format("biggest area %s in rec %s on %s", maxArea,x,y));
        System.out.println(String.format("biggest parameter %s in rec %s on %s", maxPara,a,b));
        System.out.println(String.format("biggest diffence %s in rec %s on %s", maxDiff,bigDiff1,bigDiff2));
  
	}

}
