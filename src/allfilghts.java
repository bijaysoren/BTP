import javax.print.DocFlavor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;



public class allfilghts extends JPanel {


    private List<Float> scores;

    public allfilghts(List<Float> scores) {
        this.scores = scores;
    }



    private static void createAndShowGui(List<Float> given) {
        List<Float> scores = given;
        Random random = new Random();

        testGraph mainPanel = new testGraph(scores);

        JFrame frame = new JFrame("DrawGraph");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static void main(String[] args) throws CloneNotSupportedException, ParseException {




        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        FlightClass d = new FlightClass("Delhi", "Agra", "01/14/2012 10:15:00", "01/14/2012 13:50:00", "F0");
        FlightClass d1 = new FlightClass("Agra", "Khajuraho", "01/14/2012 14:30:00", "01/14/2012 15:25:00", "F1");
        FlightClass d2 = new FlightClass("Khajuraho", "Delhi", "01/14/2012 16:00:00", "01/14/2012 19:15:00", "F2");
        FlightClass d3 = new FlightClass("Delhi", "Mumbai", "01/14/2012 21:00:00", "01/14/2012 23:10:00", "F3");

        FlightClass d4 = new FlightClass("Mumbai", "Delhi", "01/15/2012 07:55:00", "01/15/2012 11:30:00", "F4");
        FlightClass d5 = new FlightClass("Delhi", "Jaipur", "01/15/2012 14:25:00", "01/15/2012 15:20:00", "F5");
        FlightClass d6 = new FlightClass("Jaipur", "Delhi", "01/15/2012 15:55:00", "01/15/2012 16:55:00", "F6");
        FlightClass d7 = new FlightClass("Delhi", "Lucknow", "01/15/2012 18:10:00", "01/15/2012 19:25:00", "F7");
        FlightClass d8 = new FlightClass("Lucknow", "Delhi", "01/15/2012 20:00:00", "01/15/2012 21:15:00", "F8");
        FlightClass d9 = new FlightClass("Delhi", "Mumbai", "01/15/2012 23:00:00", "01/16/2012 01:05:00", "F3");

        FlightClass d10 = new FlightClass("Mumbai", "Delhi", "01/16/2012 07:55:00", "01/16/2012 11:30:00", "F4");
        FlightClass d11 = new FlightClass("Delhi", "Jodhpur", "01/16/2012 12:40:00", "01/16/2012 13:55:00", "F0");
        FlightClass d12 = new FlightClass("Jodhpur", "Delhi", "01/16/2012 14:30:00", "01/16/2012 15:45:00", "F1");
        FlightClass d13 = new FlightClass("Mumbai", "Delhi", "01/16/2012 14:50:00", "01/16/2012 18:40:00", "F2");
        FlightClass d14 = new FlightClass("Delhi", "Lucknow", "01/16/2012 19:10:00", "01/16/2012 19:25:00", "F7");
        FlightClass d15 = new FlightClass("Lucknow", "Delhi", "01/16/2012 20:00:00", "01/16/2012 21:15:00", "F8");
        FlightClass d16 = new FlightClass("Delhi", "Mumbai", "01/16/2012 23:00:00", "01/17/2012 01:05:00", "F3");


        FlightClass d17 = new FlightClass("Mumbai", "Delhi", "01/17/2012 07:55:00", "01/17/2012 11:30:00", "F4");
        FlightClass d18 = new FlightClass("Delhi", "Jaipur", "01/17/2012 14:25:00", "01/17/2012 15:20:00", "F5");
        FlightClass d19 = new FlightClass("Jaipur", "Delhi", "01/17/2012 15:55:00", "01/17/2012 16:55:00", "F6");
        FlightClass d20 = new FlightClass("Delhi", "Lucknow", "01/17/2012 18:10:00", "01/17/2012 19:25:00", "F7");
        FlightClass d21 = new FlightClass("Lucknow", "Delhi", "01/17/2012 20:00:00", "01/17/2012 21:15:00", "F8");
        FlightClass d22 = new FlightClass("Delhi", "Mumbai", "01/17/2012 23:00:00", "01/18/2012 01:05:00", "F3");


        FlightClass k = new FlightClass("Kolkata", "Agartala", "01/14/2012 09:50:00", "01/14/2012 10:45:00", "F0");
        FlightClass k1 = new FlightClass("Agartala", "Kolkata", "01/14/2012 11:20:00", "01/14/2012 12:10:00", "F1");
        FlightClass k2 = new FlightClass("Kolkata", "Kathmandu", "01/14/2012 13:30:00", "01/14/2012 15:05:00", "F2");
        FlightClass k3 = new FlightClass("Kathmandu", "Kolkata", "01/14/2012 16:05:00", "01/14/2012 17:10:00", "F3");
        FlightClass k4 = new FlightClass("Kolkata", "Hyderabad", "01/14/2012 19:00:00", "01/14/2012 21:30:00", "F0");

        FlightClass k5 = new FlightClass("Hyderabad", "Kolkata", "01/15/2012 06:00:00", "01/15/2012 08:10:00", "F1");
        FlightClass k6 = new FlightClass("Kolkata", "Mumbai", "01/15/2012 09:45:00", "01/15/2012 12:35:00", "F2");


        FlightClass k7 = new FlightClass("Mumbai", "Kolkata", "01/16/2012 06:10:00", "01/16/2012 09:00:00", "F3");
        FlightClass k8 = new FlightClass("Kolkata", "Yangon", "01/16/2012 10:30:00", "01/16/2012 13:15:00", "F3");
        FlightClass k9 = new FlightClass("Yangon", "Kolkata", "01/16/2012 14:05:00", "01/16/2012 17:20:00", "F3");
        FlightClass k10 = new FlightClass("Kolkata", "Dhaka", "01/16/2012 19:20:00", "01/16/2012 20:40:00", "F3");
        FlightClass k11 = new FlightClass("Dhaka", "Kolkata", "01/16/2012 21:20:00", "01/16/2012 22:10:00", "F3");

        FlightClass k12 = new FlightClass("Kolkata", "Silchar", "01/17/2012 05:50:00", "01/17/2012 07:05:00", "F0");
        FlightClass k13 = new FlightClass("Silchar", "Kolkata", "01/17/2012 07:35:00", "01/17/2012 09:00:00", "F1");
        FlightClass k14 = new FlightClass("Kolkata", "Imphal", "01/17/2012 11:45:00", "01/17/2012 13:10:00", "F2");
        FlightClass k15 = new FlightClass("Imphal", "Kolkata", "01/17/2012 13:50:00", "01/17/2012 16:35:00", "F3");
        FlightClass k16 = new FlightClass("Kolkata", "Hyderabad", "01/17/2012 19:00:00", "01/17/2012 21:30:00", "F0");


        FlightClass m = new FlightClass("Mumbai", "Chennai", "01/14/2012 06:15:00", "01/14/2012 08:10:00", "F0");
        FlightClass m1 = new FlightClass("Chennai", "Mumbai", "01/14/2012 16:05:00", "01/14/2012 18:25:00", "F1");
        FlightClass m2 = new FlightClass("Mumbai", "Hyderabad", "01/14/2012 19:30:00", "01/14/2012 21:05:00", "F2");
        FlightClass m3 = new FlightClass("Hyderabad", "Mumbai", "01/14/2012 22:00:00", "01/14/2012 23:45:00", "F3");

        FlightClass m4 = new FlightClass("Mumbai", "Goa", "01/15/2012 05:20:00", "01/15/2012 06:40:00", "F0");
        FlightClass m5 = new FlightClass("Goa", "Mumbai", "01/15/2012 07:30:00", "01/15/2012 08:45:00", "F0");
        FlightClass m6 = new FlightClass("Mumbai", "Jodhpur", "01/15/2012 09:45:00", "01/15/2012 11:40:00", "F0");
        FlightClass m7 = new FlightClass("Jodhpur", "Mumbai", "01/15/2012 12:20:00", "01/15/2012 14:10:00", "F0");
        FlightClass m8 = new FlightClass("Mumbai", "Hong Kong", "01/15/2012 20:00:00", "01/15/2012 6:30:00", "F0");

        FlightClass m9 = new FlightClass("Hong Kong", "Mumbai", "01/16/2012 18:00:00", "01/17/2012 1:05:00", "F0");

        FlightClass m10 = new FlightClass("Mumbai", "Delhi", "01/17/2012 07:55:00", "01/17/2012 11:35:00", "F0");
        FlightClass m11 = new FlightClass("Delhi", "Mumbai", "01/17/2012 16:50:00", "01/17/2012 20:40:00", "F0");
        FlightClass m12 = new FlightClass("Mumbai", "Abu Dhabi", "01/17/2012 23:30:00", "01/18/2012 1:35:00", "F0");


        FlightClass c = new FlightClass("Chennai", "Kochi", "01/14/2012 08:55:00", "01/14/2012 10:20:00", "F0");
        FlightClass c1 = new FlightClass("Kochi", "Chennai", "01/14/2012 11:00:00", "01/14/2012 12:20:00", "F1");
        FlightClass c2 = new FlightClass("Chennai", "Mumbai", "01/14/2012 16:05:00", "01/14/2012 18:25:00", "F2");

        FlightClass c3 = new FlightClass("Mumbai", "Chennai", "01/15/2012 06:15:00", "01/15/2012 08:10:00", "F3");
        FlightClass c4 = new FlightClass("Chennai", "Madurai", "01/15/2012 12:15:00", "01/15/2012 13:25:00", "F0");
        FlightClass c5 = new FlightClass("Madurai", "Chennai", "01/15/2012 14:05:00", "01/15/2012 15:05:00", "F1");
        FlightClass c6 = new FlightClass("Chennai", "Delhi", "01/15/2012 17:05:00", "01/15/2012 20:00:00", "F2");
        FlightClass c7 = new FlightClass("Delhi", "Chennai", "01/15/2012 20:45:00", "01/15/2012 23:40:00", "F0");


        FlightClass c8 = new FlightClass("Chennai", "Male", "01/16/2012 06:55:00", "01/16/2012 10:05:00", "F2");
        FlightClass c11 = new FlightClass("Male", "Chennai", "01/16/2012 11:25:00", "01/16/2012 16:10:00", "F0");
        FlightClass c9 = new FlightClass("Chennai", "Muscat", "01/16/2012 19:25:00", "01/16/2012 22:00:00", "F2");
        FlightClass c10 = new FlightClass("Muscat", "Chennai", "01/16/2012 23:00:00", "01/17/2012 3:55:00", "F0");

        FlightClass c12 = new FlightClass("Chennai", "Thiruvananthapuram", "01/17/2012 06:55:00", "01/17/2012 08:35:00", "F0");
        FlightClass c13 = new FlightClass("Thiruvananthapuram", "Chennai", "01/17/2012 14:30:00", "01/17/2012 16:10:00", "F1");
        FlightClass c14 = new FlightClass("Chennai", "Delhi", "01/17/2012 17:05:00", "01/17/2012 20:00:00", "F2");
        FlightClass c15 = new FlightClass("Delhi", "Chennai", "01/17/2012 20:45:00", "01/17/2012 23:40:00", "F0");


        FlightClass[] arc_list = {d, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d14, d15, d16, d17, d18, d19, d20, d21, d22};
        FlightClass[] arc_list2 = {m, m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12};

        FlightClass[] arc_list3 = {k, k1, k2, k3, k4, k5, k6, k7, k8, k9, k10, k11, k12, k14, k15, k16};

        FlightClass[] arc_list4 = {c, c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c14, c15};

        HashMap<FlightClass, FlightClass[]> mapper = new HashMap<>();
        HashMap<FlightClass, FlightClass[]> mapper2 = new HashMap<>();
        HashMap<FlightClass, FlightClass[]> mapper3 = new HashMap<>();
        HashMap<FlightClass, FlightClass[]> mapper4 = new HashMap<>();


        for (FlightClass x : arc_list) {
            FlightClass[] result = createcopies(x, 7);
            mapper.put(x, result);
        }
        for (FlightClass x : arc_list2) {
            FlightClass[] result = createcopies(x, 7);
            mapper2.put(x, result);
        }
        for (FlightClass x : arc_list3) {
            FlightClass[] result = createcopies(x, 7);
            mapper3.put(x, result);
        }
        for (FlightClass x : arc_list4) {
            FlightClass[] result = createcopies(x, 7);
            mapper4.put(x, result);
        }

        Map reliabiltyOfAirport = new HashMap();

        ArrayList allAiprots = new ArrayList();


        ArrayList<Float> res = new ArrayList<>();
        ArrayList<Float> res1 = new ArrayList<>();

        ArrayList solution = new ArrayList();



        Map solution_map = new HashMap();

        for (int a = 0; a < 50; a++) {
            float reliabilty = 0;

            Map number = new HashMap();


            for (FlightClass x : arc_list) {
                allAiprots.add(x.origin);
                allAiprots.add(x.destination);
                Random r = new Random();
                int Low = 1;
                int High = 7;
                int Result = r.nextInt(High - Low) + Low;
                number.put(x, Result);
            }
            for (FlightClass x : arc_list2) {
                allAiprots.add(x.origin);
                allAiprots.add(x.destination);
                Random r = new Random();
                int Low = 1;
                int High = 7;
                int Result = r.nextInt(High - Low) + Low;
                number.put(x, Result);
            }
            for (FlightClass x : arc_list3) {
                allAiprots.add(x.origin);
                allAiprots.add(x.destination);
                Random r = new Random();
                int Low = 1;
                int High = 7;
                int Result = r.nextInt(High - Low) + Low;
                number.put(x, Result);
            }
            for (FlightClass x : arc_list4) {
                allAiprots.add(x.origin);
                allAiprots.add(x.destination);
                Random r = new Random();
                int Low = 1;
                int High = 7;
                int Result = r.nextInt(High - Low) + Low;
                number.put(x, Result);
            }

            solution.add(number);




            for (Object x : allAiprots) {

                float r = (float) Math.random();
                System.out.print(x + " " + r);
                reliabiltyOfAirport.put(x, r);
            }



            for (FlightClass key : mapper.keySet()) {


//            System.out.print(key + " list ");
                FlightClass[] list = mapper.get(key);
                for (FlightClass x : list) {
//                System.out.print(x);
                }

//            System.out.println();
            }


            for (int i = 0; i < arc_list.length - 1; i++) {
                FlightClass[] listOfThisOne = (mapper.get(arc_list[i]));
                FlightClass[] listOfNextOne = (mapper.get(arc_list[i + 1]));
                int b  = (int) number.get(arc_list[i]);
                int e  = (int) number.get(arc_list[i+1]);

                FlightClass x = listOfThisOne[b];
                FlightClass y = listOfNextOne[e];
                float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
                long t = timediff(y.d1, x.d2);
                if (t > 0) {
                    reliabilty = (float) (reliabilty + t * refactor);
                }
            }
            for (int i = 0; i < arc_list2.length - 1; i++) {
                FlightClass[] listOfThisOne = (mapper2.get(arc_list2[i]));
                FlightClass[] listOfNextOne = (mapper2.get(arc_list2[i + 1]));
                int b  = (int) number.get(arc_list2[i]);
                int e  = (int) number.get(arc_list2[i+1]);

                FlightClass x = listOfThisOne[b];
                FlightClass y = listOfNextOne[e];
                float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
                long t = timediff(y.d1, x.d2);
                if (t > 0) {
                    reliabilty = (float) (reliabilty + t * refactor);
                }
            }
            for (int i = 0; i < arc_list3.length - 1; i++) {
                FlightClass[] listOfThisOne = (mapper3.get(arc_list3[i]));
                FlightClass[] listOfNextOne = (mapper3.get(arc_list3[i + 1]));
                int b  = (int) number.get(arc_list3[i]);
                int e  = (int) number.get(arc_list3[i+1]);

                FlightClass x = listOfThisOne[b];
                FlightClass y = listOfNextOne[e];

                float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
                long t = timediff(y.d1, x.d2);
                if (t > 0) {
                    reliabilty = (float) (reliabilty + t * refactor);
                }
            }
            for (int i = 0; i < arc_list4.length - 1; i++) {
                FlightClass[] listOfThisOne = (mapper4.get(arc_list4[i]));
                FlightClass[] listOfNextOne = (mapper4.get(arc_list4[i + 1]));
                int b  = (int) number.get(arc_list4[i]);
                int e  = (int) number.get(arc_list4[i+1]);

                FlightClass x = listOfThisOne[b];
                FlightClass y = listOfNextOne[e];
                float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
                long t = timediff(y.d1, x.d2);
                if (t > 0) {
                    reliabilty = (float) (reliabilty + t * refactor);
                }
            }

            System.out.println(" total reilability of the system is" + reliabilty);


            for (int i = 0; i < arc_list.length - 1; i++) {
//            System.out.println(arc_list[i] + " plus "+arc_list[i+1]);
                FlightClass first = arc_list[i];
                FlightClass second = arc_list[i + 1];
                long t = timediff(second.d1, first.d2);
//            System.out.println(t);
            }
            try {
                Date test = format.parse("01/17/2012 1:05:00");

            } catch (ParseException e) {
                e.printStackTrace();
            }


            FlightClass[] test1 = {d17, d18};
            FlightClass[] test2 = {m10, m11};

            flexi(test1, test2);

            long flexibilityValue = 0;
            for (int i = 0; i < arc_list.length - 1; i++) {
                FlightClass[] listOfThisOne = (mapper.get(arc_list[i]));
                FlightClass[] listOfNextOne = (mapper.get(arc_list[i + 1]));

                int b  = (int) number.get(arc_list[i]);
                int e  = (int) number.get(arc_list[i+1]);

                FlightClass[] test = {listOfThisOne[b], listOfNextOne[e]};

                for (int j = 0; j < arc_list3.length - 1; j++) {
                    FlightClass[] listOfThisOne1 = (mapper3.get(arc_list3[j]));
                    FlightClass[] listOfNextOne1 = (mapper3.get(arc_list3[j + 1]));

                    b= (int) number.get(arc_list[j]);
                    e= (int) number.get(arc_list[j+1]);


                    FlightClass[] test3 = {listOfThisOne1[b], listOfNextOne1[e]};

                    flexibilityValue = flexibilityValue + flexi(test, test3);
                }

            }

            res1.add((float) flexibilityValue);
            res.add(reliabilty);

            solution_map.put(number,reliabilty);

            System.out.println("finally we got this the flexibility " + flexibilityValue);




        }





        System.out.println((res));

        ArrayList topo = new ArrayList();

       /* for(int j = 0 ; j < res1.size() ; j++){
            int l = 20;

            Random r = new Random();
            int adder = r.nextInt(l);
            float test = res1.get(j)+(j*adder);

            topo.add(j,test);

        }*/



        for(Object key : solution_map.keySet()){
            topo.add(solution_map.get(key));
        }


//        System.out.println((res1));

        Collections.sort(topo);

        /*for(Object key : solution_map.keySet()){
            if(solution_map.get(key) == topo.get(topo.size()-1) ){
                System.out.println(key + " this is the key ");
            }
        }*/


        for(int gen = 0 ; gen < 50 ; gen++) {

            HashMap newGen = new HashMap();

            if (gen == 0) {

                while (newGen.size() < 50) {

                    ArrayList tournament = new ArrayList();


                    for (int x = 0; x < 50; x++) {


                        Random r = new Random();
                        int Low = 1;
                        int High = solution_map.size() - 1;
                        int x1 = r.nextInt(High - Low) + Low;

                        Random r1 = new Random();
                        int x2 = r.nextInt(High - Low) + Low;



                        if ((float) topo.get(x1) > (float) topo.get(x2)) {

//                            System.out.println(getKeyFromValue(solution_map, topo.get(x1)));
                            tournament.add(getKeyFromValue(solution_map, topo.get(x1)));
                        } else {
//                            System.out.println(getKeyFromValue(solution_map, topo.get(x2)));
                            tournament.add(getKeyFromValue(solution_map, topo.get(x2)));

                        }
                    }


                    Random r1 = new Random();
                    Random r2 = new Random();

                    int Low = 1;
                    int High = 50;
                    int x1 = r1.nextInt(High - Low) + Low;
                    int x2 = r1.nextInt(High - Low) + Low;


                    HashMap first = (HashMap) tournament.get(x1);
                    HashMap second = (HashMap) tournament.get(x2);


                    HashMap offspring = new HashMap();
                    int y = 0;
                    for (Object key : first.keySet()) {
                        if (y / 2 == 0) {
//            System.out.println(key + " " + first.get(key) + " " + second.get(key));
                            offspring.put(key, first.get(key));
                        } else {
//                System.out.println(key + " " + first.get(key) + " " + second.get(key));
                            offspring.put(key, second.get(key));

                        }
                        y++;
                    }

//                    System.out.println(offspring.size());

                    float val = getvalue(arc_list, arc_list2, arc_list3, arc_list4,
                            mapper, mapper2, mapper3, mapper4,
                            offspring, (HashMap) reliabiltyOfAirport);

                    newGen.put(offspring, val);


                }
            } else {
                while (newGen.size() < 50) {

                    ArrayList tournament = new ArrayList();


                    for (int x = 0; x < 50; x++) {


                        Random r = new Random();
                        int Low = 1;
                        int High = solution_map.size() - 1;
                        int x1 = r.nextInt(High - Low) + Low;

                        Random r1 = new Random();
                        int x2 = r.nextInt(High - Low) + Low;



                        if ((float) topo.get(x1) > (float) topo.get(x2)) {

//                            System.out.println(getKeyFromValue(newGen, topo.get(x1)));
                            tournament.add(getKeyFromValue(solution_map, topo.get(x1)));
                        } else {
//                            System.out.println(getKeyFromValue(newGen, topo.get(x2)));
                            tournament.add(getKeyFromValue(solution_map, topo.get(x2)));

                        }
                    }


                    Random r1 = new Random();
                    Random r2 = new Random();

                    int Low = 1;
                    int High = 50;
                    int x1 = r1.nextInt(High - Low) + Low;
                    int x2 = r1.nextInt(High - Low) + Low;


                    HashMap first = (HashMap) tournament.get(x1);
                    HashMap second = (HashMap) tournament.get(x2);


                    HashMap offspring = new HashMap();
                    int y = 0;
//                    System.out.println(tournament.size());
//                    System.out.println(first);

                    for (Object key : first.keySet()) {
                        if (y / 2 == 0) {
//            System.out.println(key + " " + first.get(key) + " " + second.get(key));
                            offspring.put(key, first.get(key));
                        } else {
//                System.out.println(key + " " + first.get(key) + " " + second.get(key));
                            offspring.put(key, second.get(key));

                        }
                        y++;
                    }

//                    System.out.println(offspring.size());

                    float val = getvalue(arc_list, arc_list2, arc_list3, arc_list4,
                            mapper, mapper2, mapper3, mapper4,
                            offspring, (HashMap) reliabiltyOfAirport);

                    newGen.put(offspring, val);


                }

//            System.out.println(newGen.size());
                topo.clear();

                solution_map.clear();
                solution_map.putAll(newGen);

                for (Object key : solution_map.keySet()) {
                    topo.add(solution_map.get(key));
                }


                Collections.sort(topo);

                System.out.println(topo.get(0));

            }
        }















        /*for(Object key : solution_map.keySet()){
            System.out.println(key+" " + solution_map.get(key));
        }*/

    }

    public static long flexi(FlightClass[] seqOne ,FlightClass[]seqTwo){
        FlightClass fi = seqOne[0];
        FlightClass fiPlusOne = seqOne[1];
        FlightClass fj = seqTwo[0];
        FlightClass fjPlusOne = seqTwo[1];




        if(fj.destination == fiPlusOne.origin){
//            System.out.println("we have found it");
            System.out.println("  these are the flights " + fj + " "+ fiPlusOne);
            return (long) (timediff1(fiPlusOne.d1, fj.d2)*1);
        }
        else{
            return 0;
        }



    }
    public static float getvalue(FlightClass[] arc_list,FlightClass[] arc_list2,FlightClass[] arc_list3,FlightClass[] arc_list4,
                                HashMap mapper,HashMap mapper2,HashMap mapper3,HashMap mapper4,
                                HashMap number,HashMap reliabiltyOfAirport)
    {   float reliabilty = 0;
        for (int i = 0; i < arc_list.length - 1; i++) {
            FlightClass[] listOfThisOne = (FlightClass[]) mapper.get(arc_list[i]);
            FlightClass[] listOfNextOne = (FlightClass[]) mapper.get(arc_list[i + 1]);
            int b  = (int) number.get(arc_list[i]);
            int e  = (int) number.get(arc_list[i+1]);

            FlightClass x = listOfThisOne[b];
            FlightClass y = listOfNextOne[e];
            float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
            long t = timediff(y.d1, x.d2);
            if (t > 0) {
                reliabilty = (float) (reliabilty + t * refactor);
            }
        }
        for (int i = 0; i < arc_list2.length - 1; i++) {
            FlightClass[] listOfThisOne = (FlightClass[]) mapper2.get(arc_list2[i]);
            FlightClass[] listOfNextOne = (FlightClass[]) mapper2.get(arc_list2[i + 1]);
            int b  = (int) number.get(arc_list2[i]);
            int e  = (int) number.get(arc_list2[i+1]);

            FlightClass x = listOfThisOne[b];
            FlightClass y = listOfNextOne[e];
            float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
            long t = timediff(y.d1, x.d2);
            if (t > 0) {
                reliabilty = (float) (reliabilty + t * refactor);
            }
        }
        for (int i = 0; i < arc_list3.length - 1; i++) {
            FlightClass[] listOfThisOne = (FlightClass[]) mapper3.get(arc_list3[i]);
            FlightClass[] listOfNextOne = (FlightClass[]) mapper3.get(arc_list3[i + 1]);
            int b  = (int) number.get(arc_list3[i]);
            int e  = (int) number.get(arc_list3[i+1]);

            FlightClass x = listOfThisOne[b];
            FlightClass y = listOfNextOne[e];

            float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
            long t = timediff(y.d1, x.d2);
            if (t > 0) {
                reliabilty = (float) (reliabilty + t * refactor);
            }
        }
        for (int i = 0; i < arc_list4.length - 1; i++) {
            FlightClass[] listOfThisOne = (FlightClass[]) mapper4.get(arc_list4[i]);
            FlightClass[] listOfNextOne = (FlightClass[]) mapper4.get(arc_list4[i + 1]);
            int b  = (int) number.get(arc_list4[i]);
            int e  = (int) number.get(arc_list4[i+1]);

            FlightClass x = listOfThisOne[b];
            FlightClass y = listOfNextOne[e];
            float refactor = (float) reliabiltyOfAirport.get(x.destination);

//           System.out.println(x);
//           System.out.println(y);
            long t = timediff(y.d1, x.d2);
            if (t > 0) {
                reliabilty = (float) (reliabilty + t * refactor);
            }


        }

//        System.out.println(" the new reliability" + reliabilty);
        return reliabilty;
    }

    public static long timediff(Date d2,Date d1){
        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

		/*System.out.print(diffDays + " days, ");
		System.out.print(diffHours + " hours, ");
		System.out.print(diffMinutes + " minutes, ");
		System.out.print(diffSeconds + " seconds.");*/

        long[] result = {diffDays,diffHours,diffMinutes,diffSeconds};

        long result1 =diffDays*24*60+diffHours*60+ diffMinutes;

        return result1;

    }
    public static long timediff1(Date d2,Date d1){
        long diff = d2.getTime() - d1.getTime();

        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000) % 24;
        long diffDays = diff / (24 * 60 * 60 * 1000);

        System.out.print(diffDays + " days, ");
        System.out.print(diffHours + " hours, ");
        System.out.print(diffMinutes + " minutes, ");
        System.out.print(diffSeconds + " seconds.");
        System.out.println();

        long[] result = {diffDays,diffHours,diffMinutes,diffSeconds};

        long result1 =diffDays*24*60+diffHours*60+ diffMinutes;

        return result1;

    }

    public static int addMinutes(Date d,int k){
        int min = d.getMinutes();
        d.setMinutes(min+5);
        int k1 = 2*k;
        return min+k1;
    }
    public static int subMinutes(Date d,int k){
        int min = d.getMinutes();
        int k1=2*k;
        return min-k1;
    }

    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }

    public static FlightClass[] createcopies(FlightClass givenFlightClass,int number) throws ParseException {
        FlightClass[] result = new FlightClass[number];
        int mid = number/2;
        result[mid] =givenFlightClass;

        for(int i = 1 ; i< mid+1; i++) {

            FlightClass temp = new FlightClass(givenFlightClass);
            FlightClass temp1 = new FlightClass(givenFlightClass);


            Date d1 = (Date) temp.d1.clone();
            Date d2 = (Date) temp.d2.clone();

            int min = addMinutes(d1,i);
            int min1 = addMinutes(d2,i);

            d1.setMinutes(min);
            d2.setMinutes(min1);
            temp.d1 = d1;
            temp.d2 = d2;
//
//            System.out.println(temp.d1);
//            System.out.println(temp.d2);
//            System.out.println();
//
//            System.out.println(givenFlightClass.d1);
//            System.out.println(givenFlightClass.d2);

            Date d3 = (Date) temp1.d1.clone();
            Date d4 = (Date) temp1.d2.clone();

            int min3 = subMinutes(d3,i);
            int min4 = subMinutes(d4,i);

            d3.setMinutes(min3);
            d4.setMinutes(min4);
            temp1.d1 = d3;
            temp1.d2 = d4;
//
//            System.out.println(temp1.d1);
//            System.out.println(temp1.d2);

            result[mid+i]=temp;
            result[mid-i]=temp1;

        }




        return result;

    }


}
