package com.rson.brothers.gatecswithlecture;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Brother's on 3/30/2016.
 */
public class DbHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION=100;
    private static final String DATABASE_NAME="GatePaper.db";
    private static final String TABLE_QUEST="quest";
    private static final String KEY_ID="id";
    private static final String KEY_QUES="question";
    private static final String KEY_ANSWER="answer";
    private static final String YEAR="year";
    private static final String KEY_IMAGE = "image_data";
    private static final String QUESTION_NO="no";
    private static final String TOPIC="topic";
    private static final String MARKS="some";
    private static final String SUBJECTIVE="Subjective";
    private static final String EXPLAINATION="Explaination";
    private static final String CREATE_TABLE="CREATE TABLE " +TABLE_QUEST+ " (" +KEY_ID+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+KEY_QUES+" TEXT, "+KEY_ANSWER+" TEXT, "+QUESTION_NO+" TEXT, "+TOPIC+" TEXT, "+MARKS+" TEXT, "+YEAR+" TEXT, "+EXPLAINATION+" TEXT, "+SUBJECTIVE+" TEXT);";
    //private static final String CREATE_TABLE="CREATE TABLE "+TABLE_QUEST+" ("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+KEY_QUES+" TEXT, "+KEY_ANSWER+" TEXT,"+KEY_IMAGE +" BLOB);";
    private Context context;
    private SQLiteDatabase dbase;

    private static String m="Maths",algo="Algorithm",ds="Programing and Data Structure",toc="Theory of Computation";
    private static String digital="Digital",cn="Computer Network",os="Operating System",com="Compiler";
    private static String apti="Aptitude",co="Computer Organization",dbms="Database",oth="Other Sub";
    private static String year,marks;
    private static String explanation;
    private static String Q;
    private static Question q;
    private static String path;

    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
        dbase = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db){
        dbase=db;
        Log.e("Reach", "we are inside Dbhelper class in onCreate method before create table");
        //String sql="CREATE TABLE IF NOT EXISTS "+TABLE_QUEST+" ("+KEY_ID+" INTEGER PRIMARY KEY AUTOINCREMENT, "+KEY_QUES
        //+" TEXT, "+KEY_ANSWER+" TEXT, "+KEY_OPTA+" TEXT, "+KEY_OPTB+" TEXT, "+KEY_OPTC+" TEXT)";
        db.execSQL(CREATE_TABLE);
        //MessageClass.Message(context,"onCreate is called");
        Log.e("Reach", "we are inside Dbhelper class in onCreate method after create table");
        addQuestions2005();
        addQuestions2006();
        addQuestions2007();
        addQuestions2008();
        addQuestions2009();
        addQuestions2010();
        addQuestions2011();
        addQuestions2012();
        addQuestions2013();

        year = "2014";
        marks = "1";
        path = "file:///android_asset/2014-1/";
        addQuestions2014();
        year = "2015";
        marks = "1";
        path = "file:///android_asset/2014-2/";
        addQuestions2014_2();
        year = "2016";
        marks = "1";
        path = "file:///android_asset/2014-3/";
        addQuestions2014_3();
        year = "2017";
        marks = "1";
        path = "file:///android_asset/2015-1/";
        addQuestions2015();
        year = "2018";
        marks = "1";
        path = "file:///android_asset/2015-2/";
        addQuestions2015_2();
        year = "2019";
        marks = "1";
        path = "file:///android_asset/2015-3/";
        addQuestions2015_3();
        year = "2020";
        marks = "1";
        path = "file:///android_asset/2016-1/";
        addQuestions2016();
        year = "2021";
        marks = "1";
        path = "file:///android_asset/2016-2/";
        addQuestions2016_2();

        Log.e("Reach", "we are inside Dbhelper class in onCreate method after add question");
        //db.close();
    }
    private void addQuestions2005() {
        // Bitmap largeIcon = BitmapFactory.decodeResource(context.getResources(), R.drawable.large_icon);
        // byte[] img=getBytes(largeIcon);
        Log.e("Reach", "we are inside Dbhelper class in addQuestion method at starting");
        //Question(qUESTION,aNSWER,qUESTION_NO,tOPIC, mARKS, yEAR)

        //**** 2000 questions starts *****//


        //**** 2005 questions starts *****//


        year = "2005";
        path = "file:///android_asset/2005/";
        String space = "file:///android_asset/";
        explanation = "";
        marks="1";
        Q = getQuestion(getstring("What does the following C-statement declare?$$ $$" +
                        "int ( * f) (int * ) ;",
                "A function that takes an integer pointer as argument and returns an integer",
                "A function that takes an integer as argument and returns an integer pointer.",
                "A pointer to a function that takes an integer pointer as argument and returns an integer.",
                "A function that takes an integer pointer as argument and returns a function pointer"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "1", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An Abstract Data Type (ADT) is:", "Same as an abstract class",
                "A data type that cannot be instantiated",
                "A data type type for which only the operations defined on it can be used, but none else",
                "All of the above"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "2", ds,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A common property of logic programming languages and functional languages is:",
                "both are procedural languages",
                "both are based on λ-calculus",
                "both are declarative"
                , "both use Horn-clauses"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "3", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following are essential features of an object-oriented programming language? " +
                        "$$ $$ (i) Abstraction and encapsulation $$ $$(ii) Strictly-typedness " +
                        "$$ $$(iii) Type-safe property coupled with sub-type rule $$ $$(iv) Polymorphism in the presence of inheritance ",
                "(i) and (ii) only",
                "(i) and (iv) only",
                "(i), (ii) and (iv) only"
                , "(i), (iii) and (iv) only"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "4", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A program P reads in 500 integers in the range [0...100] representing the scores of 500 students. " +
                        "It then prints the frequency of each score above 50. What would be the best way for P to store the frequencies?",
                "An array of 50 numbers",
                "An array of 100 numbers",
                "An array of 500 numbers"
                , "A dynamically allocated array of 550 numbers"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "5", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An undirected graph C has n nodes. Its adjacency matrix is given by an n × n square matrix whose " +
                        "$$ $$(i) diagonal elements are 0's, and $$ $$(ii) non-diagonal elements are 1's. $$ $$Which one of the following is TRUE?",
                "Graph G has no minimum spanning tree (MST)",
                "Graph G has a unique MST of cost n-1",
                "Graph G has multiple distinct MSTs, each of cost n-1"
                , "Graph G has multiple spanning trees of different costs"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "6", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The time complexity of computing the transitive closure of a binary relation on a set of n elements is known to be",
                "$O (n)$",
                "$O (n log n)$",
                "$O(n^3/2)$"
                , "$O(n^3)$"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "7", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let A, B and C be non-empty sets and let X = (A - B) - C and Y = (A - C) - (B - C). " +
                        "Which one of the following is TRUE?",
                "$X = Y$",
                "$X ⊂ Y$",
                "$Y ⊂ X$"
                , "none of these"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "8", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following is the Hasse diagram of the poset [{a, b, c, d, e}, ≤]$$ $$<img src='" + path + "qno-9.png'/>",
                "Not a lattice",
                "A lattice but not a distributive lattice",
                "A distributive lattice but not a Boolean algebra"
                , "A Boolean algebra"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "9", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a simple connected planar graph with 13 vertices and 19 edges. " +
                        "Then, the number of faces in the planar embedding of the graph is",
                "6",
                "8",
                "9"
                , "13"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "10", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a simple graph with 20 vertices and 100 edges. The size of the minimum vertex cover of G is 8. " +
                        "Then, the size of the maximum independent set of G is",
                "12",
                "8",
                "Less than 8",
                "More than 12"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "11", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let f(x) be the continuous probability density function of a random variable X. " +
                        "The probability that a < X ≤ b, is ",
                "$f(b - a)$",
                "$f(b) - f(a)$",
                "$∫↙a↖b f(x)dx$"
                , "$∫↙a↖b xf(x)dx$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "12", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The set {1, 2, 4, 7, 8, 11, 13, 14} is a group under multiplication modulo 15. " +
                        "The inverses of 4 and 7 are respectively",
                "3 and 13",
                "2 and 11",
                "4 and 13",
                "8 and 14"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "13", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The grammar $A → AA | (A) | ε$ is not suitable for predictive-parsing because the grammar is",
                "ambiguous",
                "left-recursive",
                "right-recursive"
                , "an operator-grammar"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "14", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following circuit. $$ $$<img src='" + path + "qno-15.png'/>$$ $$Which one of the following is TRUE?",
                "f is independent of X",
                "f is independent of Y",
                "f is independent of Z"
                , "None of X, Y, Z is redundant"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "15", digital, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("The range of integers that can be represented by an n bit 2's complement number system is",
                "$- 2^{n-1}$ to $(2^{n-1} - 1)$",
                "$- (2^{n-1} - 1)$ to $(2^{n-1} - 1)$",
                "$- 2^{n-1}$ to $2^{n-1}$"
                , "$- (2^{n-1} + 1)$ to $(2^(n-1) + 1)$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "16", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The hexadecimal representation of $657_8$ is",
                "1AF", "D78", "D71", "32F"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "17", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The switching expression corresponding to f(A, B, C, D) = Σ (1, 4, 5, 9, 11, 12) is",
                "BC'D' + A'C'D + AB'D",
                "ABC' + ACD + B'C'D",
                "ACD' + A'BC' + AC'D'"
                , "A'BD + ACD' + BCD'"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "18", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is true for a CPU having a single interrupt request line and a single interrupt grant line?",
                "Neither vectored interrupt nor multiple interrupting devices are possible.",
                "Vectored interrupts are not possible but multiple interrupting devices are possible",
                "Vectored interrupts and multiple interrupting devices are both possible.",
                "Vectored interrupt is possible but multiple in¬terrupting devices are not possible."));

        explanation = getExplaination("");

        q = new Question(Q, "B", "19", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Normally user programs are prevented from handling I/O directly by I/O instructions in them. For CPUs having explicit I/O instructions, such I/O protection is ensured by having the I/O instructions privileged. In a CPU with memory mapped I/O, there is no explicit I/O instruction. Which one of the following is true for a CPU with memory mapped I/O?",
                "I/O protection is ensured by operating system routine (s)",
                "I/O protection is ensured by a hardware trap",
                "I/O protection is ensured during system configuration"
                , "I/O protection is not possible"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "20", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the swap space in the disk used for?",
                "Saving temporary html pages",
                "Saving process data",
                "Storing the super-block",
                "Storing device drivers"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "21", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Increasing the RAM of a computer typically improves performance because:",
                "Virtual memory increases",
                "Larger RAMs are faster",
                "Fewer page faults occur",
                "Fewer segmentation faults occur"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "22", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Packets of the same session may be routed through different paths in",
                "TCP, but not UDP",
                "TCP and UDP",
                "UDP, but not TCP",
                "Neither TCP, nor UDP"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "23", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The address resolution protocol (ARP) is used for",
                "Finding the IP address from the DNS",
                "Finding the IP address of the default gateway",
                "Finding the IP address that corresponds to a MAC address",
                "Finding the MAC address that corresponds to an IP address"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "24", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The maximum window size for data transmission using the selective reject protocol " +
                        "with n-bit frame sequence numbers is:",
                "$2^n$",
                "$2^{n-1}$",
                "$2^{n} – 1$",
                "$2^{n-2}$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "25", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a network of LANs connected by bridges, packets are sent from one LAN to another through intermediate bridges." +
                        " Since more than one path may exist between two LANs, packets may have to be routed through multiple bridges. " +
                        "Why is the spanning tree algorithm used for bridge-routing?",
                "For shortest path routing between LANs",
                "For avoiding loops in the routing paths",
                "For fault tolerance",
                "For minimizing collisions"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "26", cn,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An organization has a class B network and wishes to form subnets for 64 departments. The subnet mask would be",
                "255.255.0.0",
                "255.255.64.0",
                "255.255.128.0",
                "255.255.252.0"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "27", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is a key factor for preferring $B^+$ -trees to binary search trees for " +
                        "indexing database relations?",
                "Database relations have a large number of records",
                "Database relations are sorted on the primary key",
                "$B^+$ -trees require less memory than binary search trees",
                "Data transfer from disks is in blocks"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "28", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following statements about normal forms is FALSE?",
                "BCNF is stricter than 3NF",
                "Lossless, dependency-preserving decomposi¬tion into 3NF is always possible",
                "Lossless, dependency-preserving decomposi¬tion into BCNF is always possible",
                "Any relation with two attributes is in BCNF"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "29", dbms,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let r be a relation instance with schema R = (A, B, C, D). We define $r_1$ = $Π_{A, B, C} (r)$ and $r_2$ = $Π_{AD} (r).$ " +
                        "Let $s$ = $r_1$ * $r_2$ where * denotes natural join. Given that the decomposition of $r$ into $r_1$ and $r_2$ is lossy, " +
                        "which one of the following is TRUE?",
                "$s ⊂ r$",
                "$r ∪ s$",
                "$r ⊂ s$"
                , "$r * s = s$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "30", dbms, marks, year, explanation, false);
        this.addQuestion(q);



        marks="2";



        Q = getQuestion(getstring("Consider the following C-program:" +
                        getProgram("prog2005-qno-31.c") + "What does the above program print?",
                "8, 4, 0, 2, 14",
                "8, 4, 0, 2, 0",
                "2, 0, 4, 8, 14",
                "2, 0, 4, 8, 0"));

        explanation = getExplaination("");


        q = new Question(Q, "D", "31", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C-program:" +
                        getProgram("prog2005-qno-32.c") + "The above code compiled without any error or warning. If Line 1 is deleted, " +
                        "the above code will show:",
                "no compile warning or error",
                "some compiler-warnings not leading to unintended results",
                "some compiler-warnings due to type-mismatch eventually leading to unintended results",
                "compiler errors"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "32", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Postorder traversal of a given binary search tree T produces the following sequence of" +
                        " keys 10, 9, 23, 22, 27, 25, 15, 50, 95, 60, 40, 29 Which one of the following sequences of keys can be the " +
                        "result of an inorder traversal of the tree T?",
                "9, 10, 15, 22, 23, 25, 27, 29, 40, 50, 60, 95",
                "9, 10, 15, 22, 40, 50, 60, 95, 23, 25, 27, 29",
                "29, 15, 9, 10, 25, 22, 23, 27, 40, 60, 50, 95",
                "95, 50, 60, 40, 27, 23, 22, 25, 10, 9, 15, 29"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "33", ds,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A Priority-Queue is implemented as a Max-Heap. Initially, it has 5 elements. " +
                        "The level-order traversal of the heap is given below: 10, 8, 5, 3, 2 Two new elements \"1\" and \"7\" are " +
                        "inserted in the heap in that order. The level-order traversal of the heap after the insertion of the elements is:",
                "10, 8, 7, 5, 3, 2, 1",
                "10, 8, 7, 2, 3, 1, 5",
                "10, 8, 7, 1, 2, 3, 5",
                "10, 8, 7, 3, 2, 1, 5"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "34", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("How many distinct binary search trees can be created out of 4 distinct keys?",
                "5", "14", "24", "42"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "35", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a complete k-ary tree, every internal node has exactly k children. " +
                        "The number of leaves in such a tree with n internal nodes is",
                "nk", "(n - 1)k + 1", "n(k - 1) + 1", "n(k - 1)"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "36", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose $T(n) = 2T (n/2) + n, T(0) = T(1) = 1$ Which one of the following is FALSE?",
                "$T(n) = O(n^2)$",
                "$T(n) = θ(n\\ log\\ n)$",
                "$T(n) = Ω(n^2)$"
                , "$T(n) = O(n\\ log\\ n)$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "37", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $G(V, E)$ an undirected graph with positive edge weights. Dijkstra's single-source shortest path algorithm " +
                        "can be implemented using the binary heap data structure with time complexity:",
                "$O(| V |^2)$",
                "$O (| E | + | V | log | V |)$",
                "$O (| V | log | V |)$"
                , "$O ((| E | + | V |) log | V |)$"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "38", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose there are $⌈ log n ⌉$ sorted lists of $⌊ n/(log n) ⌋$ elements each. The time complexity of producing " +
                        "a sorted list of all these elements is : (Hint : Use a heap data structure)",
                "$O(n\\ log\\ log\\ n)$",
                "$θ(n\\ log\\ n)$",
                "$Ω(n\\ log\\ n)$"
                , "$Ω(n^{3\\/2})$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "39", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let P, Q and R be three atomic prepositional assertions. Let X denote $(P ∨ Q) → R$ and $Y$ " +
                        "denote $(P → R) ∨ (Q → R).$ Which one of the following is a tautology?",
                "$X ≡ Y$",
                "$X → Y$",
                "$Y → X$"
                , "$¬ Y → X$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "40", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the first order predicate calculus statement equivalent to the following? Every teacher is liked " +
                        "by some student",
                "∀(x) [teacher (x) → ∃ (y) [student (y) → likes (y, x)]]",
                "∀ (x) [teacher (x) → ∃ (y) [student (y) ^ likes (y, x)]]",
                "∃ (y) ∀ (x) [teacher (x) → [student (y) ^ likes (y, x)]]"
                , "∀ (x) [teacher (x) ^ ∃ (y) [student (y) → likes (y, x)]]"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "41", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let R and S be any two equivalence relations on a non-empty set A. Which one of the following statements is TRUE?",
                "R ∪ S, R ∩ S are both equivalence relations",
                "R ∪ S is an equivalence relation",
                "R ∩ S is an equivalence relation",
                "Neither R ∪ S nor R ∩ S is an equivalence relation"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "42", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let f: B → C and g: A → B be two functions and let h = fog. Given that h is an onto function. " +
                        "Which one of the following is TRUE?",
                "f and g should both be onto functions",
                "f should be onto but g need not be onto",
                "g should be onto but f need not be onto",
                "both f and g need not be onto"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "43", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the minimum number of ordered pairs of non-negative numbers that should be chosen to ensure " +
                        "that there are two pairs (a, b) and (c, d) in the chosen set such that \"a ≡ c mod 3\" and \"b ≡ d mod 5\"",
                "4", "6", "16", "24"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "44", m,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider three decision problems P1, P2 and P3. It is known that P1 is decidable and P2 is undecidable." +
                        " Which one of the following is TRUE?",
                "P3 is decidable if P1 is reducible to P3",
                "P3 is undecidable if P3 is reducible to P2",
                "P3 is undecidable if P2 is reducible to P3",
                "P3 is decidable if P3 is reducible to P2's complement"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "45", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the set H of all 3 × 3 matrices of the type " +
                        "$[\\table \\a,\\f,e;\\0,\\b,\\d;\\0,\\0,\\c]$where a, b, c, d, e and f are real numbers and abc ≠ 0. " +
                        "Under the matrix multiplication operation, the set H is",
                "a group",
                "a monoid but not a group",
                "a semigroup but not a monoid",
                "neither a group nor a semigroup"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "46", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following graphs is NOT planar?$$ $$<img src='" + path + "qno-47.png'/> ",
                "G1",
                "G2",
                "G3",
                "G4"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "47", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following system of equations in three real variables $x_1$, $x_2$ and $x_3$ $$ $$" +
                        " $2x_1 - x_2 + 3x_3 = 1$ <br/>" +
                        "$3x_1 - 2x_2 + 5x_3 = 2$ <br/>" +
                        "$-x_1 + 4x_2 + x_3 = 3$ $$ $$" +
                        "This system of equations has",
                "no solution",
                "a unique solution",
                "more than one but a finite number of solutions",
                "an infinite number of solutions"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "48", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What are the eigenvalues of the following 2 × 2 matrix? $[\\table \\2,\\-1;\\-4,\\5]$",
                " -1 and 1",
                "1 and 6",
                "2 and 5",
                "4 and -1"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "49", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $ G(x) = 1/(1 - x)^2 $ = $ ∑↙{i=0}↖{∞}\\ g(i)x^i, $ where $| x | < 1$. What is $g(i)$ ?",
                "$i$",
                "$i+1$",
                "$2i$",
                "$2^i$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "50", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Box P has 2 red balls and 3 blue balls and box Q has 3 red balls and 1 blue ball. A ball is selected as follows:$$ $$" +
                        "(i)  Select a box" +
                        "<br/>(ii) Choose a ball from the selected box such that each ball in" +
                        "     the box is equally likely to be chosen. The probabilities of" +
                        "     selecting boxes P and Q are $(1/3)$ and $(2/3),$ respectively.  $$ $$" +
                        "Given that a ball selected in the above process is a red ball, the probability that it came from the box P is",
                "$4/19$",
                "$5/19$",
                "$2/9$",
                "$19/30$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "51", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A random bit string of length n is constructed by tossing a fair coin n times and setting a bit to " +
                        "0 or 1 depending on outcomes head and tail, respectively. The probability that two such randomly generated strings" +
                        " are not identical is$$ $$",
                "$1/{2^n}$",
                "$1-{1/n}$",
                "${1/n!}$",
                "$1-{1/{2^n}}$"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "52", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the machine M: <img src='" + path + "qno-53.png'/>$$ $$recognized by M is :",
                "{w ∈ {a, b}* | every a in w is followed by exactly two b's}",
                "{w ∈ {a, b}* | every a in w is followed by at least two b’}",
                "{w ∈ {a, b}* | w contains the substring 'abb'}",
                "{w ∈ {a, b}* | w does not contain 'aa' as a substring}"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "53", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $N_f$ and $N_p$ denote the classes of languages accepted by non-deterministic finite " +
                        "automata and non-deterministic push-down automata, respectively. Let $D_f$ and $D_p$ denote the classes of languages " +
                        "accepted by deterministic finite automata and deterministic push-down automata, respectively. " +
                        "Which one of the following is TRUE?",
                "$D_f ⊂ N_f and D_p ⊂ N_p$",
                "$D_f ⊂ N_f and D_p = N_p$",
                "$D_f = N_f and D_p = N_p$",
                "$D_f = N_f and D_p ⊂ N_p$"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "54", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the languages:$$ $$L1 = ${a^nb^nc^m | n, m > 0}$ $$ $$L2 = ${a^nb^mc^m | n, m > 0}$ $$ $$" +
                        "Which one of the following statements is FALSE?",
                "L1 ∩ L2 is a context-free language",
                "L1 ∪ L2 is a context-free language",
                "L1 and L2 are context-free language",
                "L1 ∩ L2 is a context sensitive language"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "55", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L_1$ be a recursive language, and let $L_2$ be a recursively enumerable but not a recursive language. Which one of the following is TRUE?$$ $$" +
                        "$\\ov{L_1}$ --> Complement of $L_1$$$ $$" +
                        "$\\ov{L_2}$ --> Complement of $L_2$ ",
                "$\\ov{L_1}$ is recursive and $\\ov{L_2}$ is recursively enumerable",
                "$\\ov{L_1}$ is recursive and $\\ov{L_2}$ is not recursively enumerable",
                "$\\ov{L_1}$ and $\\ov{L_2}$ are recursively enumerable",
                "$\\ov{L_1}$ is recursively enumerable and $\\ov{L_2}$ is recursive"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "56", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the languages:$$ $$" +
                        "$L_1$  = $\\{ww^R |w ∈ \\{0, 1\\}^*\\}$ <br/>" +
                        "$L_2$  = $\\{w#w^R | w ∈ \\{0, 1\\}^*\\},$  where # is a special symbol<br/>" +
                        "$L_3$  = $\\{ww |  w ∈  \\{0, 1\\}^*\\}$ $$ $$" +
                        "Which one of the following is TRUE?$$ $$",
                "$L_1$ is a deterministic CFL",
                "$L_2$ is a deterministic CFL",
                "$L_3$ is a CFL, but not a deterministic CFL",
                "$L_3$ is a deterministic CFL"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "57", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following two problems on undirected graphs$$ $$" +
                        "α :  Given G(V, E), does G have an independent set of size | V | - 4? $$ $$" +
                        "β :  Given G(V, E), does G have an independent set of size 5? $$ $$" +
                        "Which one of the following is TRUE?",
                "α is in P and β is NP-complete",
                "α is NP-complete and β is in P",
                "Both α and β are NP-complete",
                "Both α and β are in P"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "58", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the grammar$$ $$" +
                        "$E → E + n | E × n | n $ $$ $$" +
                        "For a sentence $n + n × n$, the handles in the right-sentential form of the reduction are $$ $$" +
                        "",
                "$n, E + n$ and $E + n × n$",
                "$n, E + n$ and $E + E × n$",
                "$n, n + n$ and $n + n × n$",
                "$n, E + n$ and $E × n$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "59", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the grammar$$ $$S → (S) | a$$ $$" +
                        "Let the number of states in SLR(1), LR(1) and LALR(1) parsers for the grammar be $n_1, n_2$ and $n_3$ respectively." +
                        " The following relationship holds good$$ $$",
                "$n_1 < n_2 < n_3$",
                "$n_1 = n_3 < n_2$",
                "$n_1 = n_2 = n_3$",
                "$n_1 ≥ n_3 ≥ n_2$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "60", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider line number 3 of the following C- program.$$ $$int main ( ) {              $$ $$" +
                        "int I, N;                      $$ $$fro (I = 0, I < N, I++);       $$ $$}" +
                        "$$ $$Identify the compiler's response about this line while creating the object-module",
                "No compilation error",
                "Only a lexical error",
                "Only syntactic errors",
                "Both lexical and syntactic errors"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "61", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following circuit involving a positive edge triggered D FF <img src='" + path + "qno-62-1.png'/>" +
                        "$$ $$Consider the following timing diagram. Let Ai represent the logic level on the line A in the i-th clock period.$$ $$" +
                        "<img src='" + path + "qno-62-2.png'/>",
                "$A_0 A_l A_1↖{-} A_3 A_4$",
                "$A_0 A_l A_2↖{-} A_3 A_4$",
                "$A_l A_2 A_2↖{-} A_3 A_4$",
                "$A_l A_2↖{-} A_3 A_4 A_5↖{-}$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "62", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following diagram represents a finite state machine which takes as input a binary number from the " +
                        "least significant bit. $$ $$" +
                        "<img src='" + path + "qno-63-1.png'/>$$ $$" +
                        "Which one of the following is TRUE?",
                "It computes 1's complement of the input number",
                "It computes 2's complement of the input number",
                "It increments the input number",
                "It decrements the input number"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "63", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following circuit $$ $$" +
                        "<img src='" + path + "qno-64-1.png'/>$$ $$The flip-flops are positive edge triggered D FFs. Each state is " +
                        "designated as a two bit string Q0Q1. Let the initial state be 00. The state transition sequence is:",
                "<img src='" + path + "qno-64-2.png'/>",
                "<img src='" + path + "qno-64-3.png'/>",
                "<img src='" + path + "qno-64-4.png'/>",
                "<img src='" + path + "qno-64-5.png'/>"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "64", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a three word machine instruction$$ $$" +
                        "ADD A[R0], @ B $$ $$The first operand (destination) \"A [R0]\" uses indexed addressing mode with R0 as the index register. " +
                        "The second operand (source) \"@ B\" uses indirect addressing mode. A and B are memory addresses residing at the second and " +
                        "the third words, respectively. The first word of the instruction specifies the opcode, the index register designation and " +
                        "the source and destination addressing modes. During execution of ADD instruction, the two operands are added and stored in " +
                        "the destination (first operand). The number of memory cycles needed during the execution cycle of the instruction is",
                "3",
                "4",
                "5",
                "6"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "65", co, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Match each of the high level language statements given on the left hand side with the most natural " +
                        "addressing mode from those listed on the right hand side." + MyTable(4, 2, getText(2, "Column A", "Column B",
                "1) A[1] = B[J];", "A) Indirect addressing",
                "2) while [*A++];", "B) Indexed, addressing", "3) int temp = *x;", "C) Autoincrement ", "5", "2", "7", "2",
                "9", "5", "6", "4", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false),
                "(1, C), (2, B), (3, A)",
                "(1, A), (2, C), (3, B)",
                "(1, B), (2, C), (3, A)",
                "(1, A), (2, B), (3, C)"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "66", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a direct mapped cache of size 32 KB with block size 32 bytes. The CPU generates 32 bit addresses. " +
                        "The number of bits needed for cache indexing and the number of tag bits are respectively",
                "10,17",
                "10,22",
                "15,17",
                "5,17"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "67", co,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A 5 stage pipelined CPU has the following sequence of stages:$$ $$" +
                        "IF — Instruction fetch from instruction memory,$$ $$" +
                        "RD — Instruction decode and register read,$$ $$" +
                        "EX — Execute: ALU operation for data and address computation,$$ $$" +
                        "MA — Data memory access - for write access, the register read at RD stage is used,$$ $$" +
                        "WB — Register write back.$$ $$" +
                        "Consider the following sequence of instructions:$$ $$" +
                        "$I_1$ : L R0, 1oc1;  R0 <= M[loc1]$$ $$" +
                        "$I_2$ : A R0, R0;    R0 <= R0 + R0$$ $$" +
                        "$I_3$ : S R2, R0;    R2 <= R2 - R0$$ $$Let each stage take one clock cycle.$$ $$" +
                        "What is the number of clock cycles taken to complete the above sequence of instructions starting from the fetch of $I_1$ ?",
                "8",
                "10",
                "12",
                "15"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "68", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A device with data transfer rate 10 KB/sec is connected to a CPU. Data is transferred byte-wise. " +
                        "Let the interrupt overhead be 4 msec. The byte transfer time between the device interface register and CPU or memory " +
                        "is negligible. What is the minimum performance gain of operating the device under interrupt mode over operating it " +
                        "under program controlled mode?",
                "15", "25", "35", "45"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "69", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a disk drive with the following specifications: 16 surfaces, 512 tracks/surface, 512 sectors/track, " +
                        "1 KB/sector, rotation speed 3000 rpm. The disk is operated in cycle stealing mode whereby whenever one byte word is ready " +
                        "it is sent to memory; similarly, for writing, the disk interface reads a 4 byte word from the memory in each DMA cycle. " +
                        "Memory cycle time is 40 nsec. The maximum percentage of time that the CPU gets blocked during DMA operation is:",
                "10", "25", "40", "50"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "70", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose n processes, P1, …. Pn share m identical resource units, which can be reserved and released one at a time. " +
                        "The maximum resource requirement of process $P_i$ is $S_i$, where $S_i$ > 0. Which one of the following is a sufficient " +
                        "condition for ensuring that deadlock does not ",
                "$∀_i,s_i &lt; m$",
                "$∀_i,s_i &lt; n$",
                "$∑↙{i=1}↖n s_i &lt; (m+n)$",
                "$∑↙{i=1}↖n s_i &lt; (m*n)$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "71", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following code fragment:" + getProgram("prog2005-qno-72.c") +
                        "Let u, v be the values printed by the parent process, and x, y be the values printed by the child process. Which one of" +
                        " the following is TRUE?",
                "u = x + 10 and v = y",
                "u = x + 10 and v != y",
                "u + 10 = x and v = y",
                "u + 10 = x and v != y"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "72", ds, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("In a packet switching network, packets are routed from source to destination along a single path having " +
                        "two intermediate nodes. If the message size is 24 bytes and each packet contains a header of 3 bytes, then the " +
                        "optimum packet size is:",
                "4", "6", "7", "9"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "73", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose the round trip propagation delay for a 10 Mbps Ethernet having 48-bit jamming signal is 46.4 ms. " +
                        "The minimum frame size is",
                "94", "416", "464", "512"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "74", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let E1 and E2 be two entities in an E/R diagram with simple single-valued attributes. R1 and R2 are " +
                        "two relationships between E1 and E2, where R1 is one-to-many and R2 is many-to-many. R1 and R2 do not have any " +
                        "attributes of their own. What is the minimum number of tables required to represent this situation in the relational model?",
                "2", "3", "4", "5"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "75", dbms,marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring(("The following table has two attributes A and C where A is the primary key and C is the foreign key " +
                        "referencing A with on-delete cascade." + MyTable(8, 2, getText(2, "A", "C", "2", "4", "3", "4", "4", "3", "5", "2", "7", "2",
                "9", "5", "6", "4", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "The set of all tuples that must be additionally deleted to preserve referential integrity when the tuple (2,4) is deleted is:"),
                "(3,4) and (6,4)",
                "(5,2) and (7,2)",
                "(5,2), (7,2) and (9,5)",
                "(3,4), (4,3) and (6,4)"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "76", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The relation book (title, price) contains the titles and prices of different books. Assuming that no" +
                        " two books have the same price, what does the following SQL query list?$$ $$" +
                        "select title$$ $$" +
                        "  from book as B$$ $$" +
                        "  where (select count(*)$$ $$" +
                        "     from book as T$$ $$" +
                        "     where T.price > B.price) < 5 $$ $$",
                "Titles of the four most expensive books",
                "Title of the fifth most inexpensive book",
                "Title of the fifth most expensive bookTitles of the five most expensive books",
                "Titles of the five most expensive books"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "77", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a relation scheme $R = (A, B, C, D, E, H)$ on which the following functional dependencies hold: " +
                        "{A –> B, BC –> D, E –> C, D –> A}. What are the candidate keys of R?",
                "AE, BE",
                "AE, BE, DE",
                "AEH, BEH, BCH",
                "AEH, BEH, DEH"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "78", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 79-80</B>$$ $$Consider the following data path of a CPU. <img src='" + path + "qno-79.png'/>$$ $$" +
                        "The, ALU, the bus and all the registers in the data path are of identical size. All operations including " +
                        "incrementation of the PC and the GPRs are to be carried out in the ALU. Two clock cycles are needed for memory read " +
                        "operation - the first one for loading address in the MAR and the next one for loading data from the memory bus into " +
                        "the MDR The instruction \"add R0, R1\" has the register transfer interpretation R0 < = R0 + R1. The minimum number of " +
                        "clock cycles needed for execution cycle of this instruction is.",
                "2",
                "3",
                "4",
                "5"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "79", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 79-80</B>$$ $$Consider the following data path of a CPU.<img src='" + path + "qno-79.png'/>$$ $$" +
                        "The, ALU, the bus and all the registers in the data path are of identical size. All operations including incrementation " +
                        "of the PC and the GPRs are to be carried out in the ALU. Two clock cycles are needed for memory read operation - the " +
                        "first one for loading address in the MAR and the next one for loading data from the memory bus into the MDR 79. The " +
                        "instruction \"call Rn, sub\" is a two word instruction. Assuming that PC is incremented during the fetch cycle of the " +
                        "first word of the instruction, its register transfer interpretation is$$ $$" +
                        "Rn < = PC + 1;$$ $$" +
                        "PC < = M[PC]; $$ $$" +
                        "The minimum number of CPU clock cycles needed during the execution cycle of this instruction is:",
                "2",
                "3",
                "4",
                "5"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "80", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 81-82:</B>$$ $$Consider the following C-function:" + getProgram("prog2005-qno-81.c") +
                        "The space complexity of the above function is:",
                "$O(1)$",
                "$O(n)$",
                "$O(n!)$",
                "$O(n^n)$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "81", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 81-82:</B>$$ $$Consider the following C-function:" + getProgram("prog2005-qno-81.c") +
                        "Suppose we modify the above function foo() and store the values of foo (i), 0 < = i < n, as and when they are computed. " +
                        "With this modification, the time complexity for function foo() is significantly reduced. The space complexity of the " +
                        "modified function would be:",
                "$O(1)$",
                "$O(n)$",
                "$O(n!)$",
                "$O(n^n)$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "82", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 83-84:</B>$$ $$Let s and t be two vertices in a undirected graph G = (V, E) having distinct " +
                        "positive edge weights. Let $[X, Y]$ be a partition of V such that s ∈ X and t ∈ Y. Consider the edge e having the" +
                        " minimum weight amongst all those edges that have one vertex in X and one vertex in Y The edge e must definitely belong to:",
                "the minimum weighted spanning tree of G",
                "the weighted shortest path from s to t",
                "each path from s to t",
                "the weighted longest path from s to t"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "83", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 83-84:</B>$$ $$Let s and t be two vertices in a undirected graph G + (V, E) having " +
                        "distinct positive edge weights. Let [X, Y] be a partition of V such that s ∈ X and t ∈ Y. Consider the edge e " +
                        "having the minimum weight amongst all those edges that have one vertex in X and one vertex in Y. Let the weight of " +
                        "an edge e denote the congestion on that edge. The congestion on a path is defined to be the maximum of the congestions " +
                        "on the edges of the path. We wish to find the path from s to t having minimum congestion. Which one of the following " +
                        "paths is always such a path of minimum congestion?",
                "a path from s to t in the minimum weighted spanning tree",
                "a weighted shortest path from s to t",
                "an Euler walk from s to t",
                "a Hamiltonian path from s to t"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "84", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 85-86:</B>$$ $$Consider the following expression grammar. The semantic rules for expression " +
                        "calculation are stated next to each grammar production.$$ $$" +
                        " $E → number$   /$E.val = number. val$ $$ $$" +
                        "$| E '+' E$   /$ E^(1).val = E^(2).val + E^(3).val$ $$ $$" +
                        "$| E '×' E$   /$ E^(1).val = E^(2).val × E^(3).val$ $$ $$" +
                        "The above grammar and the semantic rules are fed to a yacc tool (which is an LALR (1) parser generator) for parsing and " +
                        "evaluating arithmetic expressions. Which one of the following is true about the action of yacc for the given grammar?",
                "It detects recursion and eliminates recursion",
                "It detects reduce-reduce conflict, and resolves",
                "It detects shift-reduce conflict, and resolves the conflict in favor of a shift over a reduce action",
                "It detects shift-reduce conflict, and resolves the conflict in favor of a reduce over a shift action"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "85", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 85-86:</B>$$ $$Consider the following expression grammar. The semantic rules for expression " +
                        "calculation are stated next to each grammar production.$$ $$" +
                        " $E → number$   /$E.val = number. val$ $$ $$" +
                        "$| E '+' E$   /$ E^(1).val = E^(2).val + E^(3).val$ $$ $$" +
                        "$| E '×' E$   /$ E^(1).val = E^(2).val × E^(3).val$ $$ $$" +
                        "Assume the conflicts in Part (a) of this question are resolved and an LALR(1) parser is generated for parsing arithmetic " +
                        "expressions as per the given grammar. Consider an expression 3 × 2 + 1. What precedence and associativity properties does " +
                        "the generated parser realize?",
                "Equal precedence and left associativity; expression is evaluated to 7",
                "Equal precedence and right associativity; expression is evaluated to 9",
                "Precedence of '×' is higher than that of '+', and both operators are left associative; expression is evaluated to 7",
                "Precedence of '+' is higher than that of '×', and both operators are left associative; expression is evaluated to 9"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "86", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 87-88:</B>$$ $$We are given 9 tasks $T_1, T_2.... T_9$. The execution of each task requires " +
                        "one unit of time. We can execute one task at a time. Each task $T_i$ has a profit $P_i$ and a deadline $d_i$ Profit $P_i$ " +
                        "is earned if the task is completed before the end of the $d_i^{th}$ unit of time.$$ $$" +
                        MyTable(3, 10, getText(10, "Task", "$T_1$", "$T_2$", "$T_3$", "$T_4$", "$T_5$", "$T_6$", "$T_7$", "$T_8$", "$T_9$", "Profit",
                                "15", "20", "30", "18", "18", "10", "23", "16", "25", "Deadline", "7", "2", "5", "3", "4", "5", "2", "7", "3"), false, false) +
                        "Are all tasks completed in the schedule that gives maximum profit?",
                "All tasks are completed",
                "T1 and T6 are left out",
                "T1 and T8 are left out",
                "T4 and T6 are left out"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "87", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 87-88:</B>$$ $$We are given 9 tasks $T_1, T_2.... T_9$. The execution of each task requires one " +
                        "unit of time. We can execute one task at a time. Each task $T_i$ has a profit $P_i$ and a deadline $d_i$ Profit $P_i$ is" +
                        " earned if the task is completed before the end of the $d_i^{th}$ unit of time.$$ $$" +
                        MyTable(3, 10, getText(10, "Task", "$T_1$", "$T_2$", "$T_3$", "$T_4$", "$T_5$", "$T_6$", "$T_7$", "$T_8$", "$T_9$", "Profit",
                                "15", "20", "30", "18", "18", "10", "23", "16", "25", "Deadline", "7", "2", "5", "3", "4", "5", "2", "7", "3"), false, false) +
                        "What is the maximum profit earned?",
                "147",
                "165",
                "167",
                "175"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "88", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 89-90:</B>$$ $$Consider the following floating point format $$ $$<img src='" + path + "qno-89.png'/>" +
                        "$$ $$Mantissa is a pure fraction in sign-magnitude form. The decimal number $0.239 × 2^13$ has the following hexadecimal" +
                        " representation (without normalization and rounding off :",
                "0D 24",
                "0D 4D",
                "4D 0D",
                "4D 3D"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "89", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 89-90:</B>$$ $$Consider the following floating point format $$ $$<img src='" + path + "qno-89.png'/>" +
                        "$$ $$Mantissa is a pure fraction in sign-magnitude form. The normalized representation for the above format is specified " +
                        "as follows. The mantissa has an implicit 1 preceding the binary (radix) point. Assume that only 0's are padded in while " +
                        "shifting a field. The normalized representation of the above number $(0.239 × 2^13)$ is:",
                "0A 20",
                "11 34",
                "49 DO",
                "4A E8"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "90", digital, marks, year, explanation, false);
        this.addQuestion(q);
    }




    //**** 2006 questions starts *****//



    private void addQuestions2006() {

        path = "file:///android_asset/2006/";
        year = "2006";
        marks = "1";
        Q = getQuestion(getstring("Consider the polynomial $p(x) = a_0 + a_1x + a_2x^2 + a_3x^3 ,$ where $a_i ≠ 0 ∀_i.$ " +
                        "The minimum number of multiplications needed to evaluate $p$ on an input $x$ is: ",
                "3",
                "4",
                "6",
                "9"));

        explanation = getExplaination("$$ $$" +
                "Using Horner's Rule, we can write the polynomial as following $a_0$ + ($a_1$ + ($a_2$ + $a_3$x)x)x In " +
                "the above form, we need to do only 3 multiplications" +
                "$$ $$p = $a_3$ X x    ------------ (1)\n" +
                "\n" +
                "$$ $$q = ($a_2$ + p) X x  ---------(2)\n" +
                "\n" +
                "$$ $$r = ($a_1$ + q) X x  ---------(3)\n" +
                "\n" +
                "$$ $$result = $a_0$ + r ");

        q = new Question(Q, "A", "1", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let X,Y,Z be sets of sizes x, y and z respectively. Let W = X × Y and E be the set\n" +
                        "of all subsets of W. The number of functions from Z to E is: ",
                "${{{Z}^2^{xy}}}$",
                "$Zx{2}^{xy}$",
                "${{{Z}^2^{x+y}}}$",
                "$2^{xyz}$"));

        explanation = getExplaination("$$ $$" +
                "Number of functions from a set A of size m to set B of size n is $n^m,$ because each of the m elements of A has n choices for mapping.$$ $$ Now here m=|Z|=z, and n=|E|=$2^{xy}$ because number of subsets of a set of size $n$ is $2^n,$ and here set W has size of xy. \n" +
                "$$ $$So number of functions from Z to $E = (2^{xy})^z=2^{xyz}.$ So option (D) is correct.");


        q = new Question(Q, "B", "2", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The set {1,2,3,5,7,8,9} under multiplication modulo 10 is not a group. Given\n" +
                        "below are four plausible reasons. Which one of them is false?",
                "It is not closed",
                "2 does not have an inverse",
                "3 does not have an inverse",
                "8 does not have an inverse"));

        explanation = getExplaination("A is not closed under multiplication as we may get 0 after multiplication and 0 is not present in set. $$ $$2 doesn't have an inverse as there is no x such that (2*x) mod 10 is 1. $$ $$3 has an inverse as (3*7) mod 10 is 1. 8 doesn't have an inverse as there is no x such that (2*x) mod 10 is 1.");

        q = new Question(Q, "C", "3", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A relation R is defined on ordered pairs of integers as follows:\n" +
                        "(x,y) R(u,v) if x < u and y > v. Then R is:",
                "Neither a Partial Order nor an Equivalence Relation",
                "A Partial Order but not a Total Order",
                "A Total Order",
                "An Equivalence Relation"));

        explanation = getExplaination("R is not reflexive.");

        q = new Question(Q, "A", "4",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("For which one of the following reasons does Internet Protocol (IP) use the timeto-\n" +
                        "live (TTL) field in the IP datagram header?",
                "Ensure packets reach destination within that time",
                "Discard packets that reach later than that time",
                "Prevent packets from looping indefinitely",
                "Limit the time for which a packet gets queued in intermediate routers."));

        explanation = getExplaination("following are lines from wikipedia Time to live (TTL) or hop limit is a mechanism that limits the lifespan or lifetime of data in a computer or network. " +
                "$$ $$TTL may be implemented as a counter or timestamp attached to or embedded in the data. Once the prescribed event count or timespan has elapsed, data is discarded. " +
                "$$ $$In computer networking, TTL prevents a data packet from circulating indefinitely.");

        q = new Question(Q, "C", "5", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider three CPU-intensive processes, which require 10, 20 and 30 time units\n" +
                        "and arrive at times 0, 2 and 6, respectively. How many context switches are" +
                        " needed if the operating system implements a shortest remaining time first\n" +
                        "scheduling algorithm? Do not count the context switches at time zero and at the\n" +
                        "end.",
                "1", "2", "3", "4"));

        explanation = getExplaination("Let three process be P0, P1 and P2 with arrival times 0, 2 and 6 respectively and CPU burst times 10, 20 and 30 respectively. " +
                "$$ $$At time 0, P0 is the only available process so it runs. At time 2, P1 arrives, but P0 has the shortest remaining time, so it continues. At time 6, P2 arrives,$$ $$ but P0 has the shortest remaining time, so it continues. " +
                "At time 10, P1 is scheduled as it is the shortest remaining time process. " +
                "$$ $$At time 30, P2 is scheduled. Only two context switches are needed. P0 to P1 and P1 to P2.");

        q = new Question(Q, "B", "6", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following grammar.$$ $$S -> S * E$$ $$S -> E$$ $$E -> F + E$$ $$E -> F$$ $$F -> id$$ $$" +
                        "Consider the following LR(0) items corresponding to the grammar above.$$ $$(i) S -> S * .E$$ $$(ii) E -> F. + E$$ $$(iii) E -> F + .E $$ $$" +
                        "Given the items above, which two of them will appear in the same set in the canonical sets-of-items for the grammar?",
                "(i) and (ii)",
                "(ii) and (iii)",
                "(i) and (iii)",
                "None of the above"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "7", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("You are given a free running clock with a duty cycle of 50% and a digital\n" +
                        "waveform f which changes only at the negative edge of the clock. Which one of\n" +
                        "the following circuits (using clocked D flip-flops) will delay the phase of f by\n" +
                        "180°?",
                "<img src='" + path + "qno-8.png'/>",
                "<img src='" + path + "qno-8-2.png'/>",
                "<img src='" + path + "qno-8-c.png'/>",
                "<img src='" + path + "qno-8-d.png'/>"));

        explanation = getExplaination("$$ $$" +
                "We assume the D flip-flop to be negative edge triggered. \n" +
                " \n" +
                "$$ $$In option (A), during the negative edge of the clock, first flip-flop inverts complement of ‘f’. But, the output of first flip-flop has the same phase as ‘f’.$$ $$ Now, we give this output as input to the second flip-flop, which is enabled by ‘clk’. $$ $$Thus, we get a double inverted output having same phase as the input. So, A is not the correct option. \n" +
                " \n" +
                "$$ $$In option (B) and (D), the output is inverted ‘f’. But, we want ‘f’ as the output. So, (B) and (D) can’t be the answer. \n" +
                " \n" +
                "$$ $$In option (C), the first flip-flop is activated by ‘clk’. So, the output of first flip-flop has the same phase as ‘f’. $$ $$But, the second flip-flop is enabled by complement of ‘clk’. Since the clock ‘clk’ has a duty cycle of 50% , we get the output having phase delay of 180 degrees. \n" +
                " \n" +
                "$$ $$Therefore, (C) is the correct answer. ");

        q = new Question(Q, "C", "8", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A CPU has 24-bit instructions. A program starts at address 300 (in decimal).\n" +
                        "Which one of the following is a legal program counter (all values in decimal)?",
                "400", "500", "600", "700"));

        explanation = getExplaination("Here, size of instruction  =  24/8 = 3 bytes.\n" +
                "\n" +
                "Program Counter can shift 3 bytes at a time to jump to next instruction.\n" +
                "\n" +
                "So the given options must be divisible by 3. only 600 is satisfied.");

        q = new Question(Q, "C", "9", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a binary max heap containing n numbers, the smallest element can be found\n" +
                        "in time",
                "$O(n)$", "$O(log\\ n)$", "$(log\\ log\\ n)$", "$O(1)$"));

        explanation = getExplaination("$$ $$In a max heap, the smallest element is always present at a leaf node. $$ $$So we need to check for all leaf nodes for the minimum value. Worst case complexity will be O(n)" +
                getProgram("exp2006-qno-10.txt") + "");

        q = new Question(Q, "A", "10", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a weighted complete graph G on the vertex set {$v_1, v_2, ....v_n$} such that\n" +
                        "the weight of the edge $(v_i, v_j)$ is $2|i-j|.$ The weight of a minimum spanning tree\n" +
                        "of G is:",
                "$n - 1$",
                "$2n - 2$",
                "$(\\table \\n;\\2)$",
                "$n^2$"));

        explanation = getExplaination("$$ $$Minimum spanning tree of such a graph is $$ $$" +
                getProgram("exp2006-qno-11.txt"));


        q = new Question(Q, "B", "11", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("To implement Dijkstra’s shortest path algorithm on unweighted graphs so that it\n" +
                        "runs in linear time, the data structure to be used is:",
                "Queue", "Stack", "Heap", "B-Tree"));

        explanation = getExplaination("$$ $$The shortest path in an un-weighted graph means the smallest number of edges that must be traversed in order to reach the destination in the graph. " +
                "$$ $$This is the same problem as solving the weighted version where all the weights happen to be 1. If we use Queue (FIFO) instead of Priority Queue (Min Heap), we get the shortest path in linear time O(|V| + |E|). " +
                "$$ $$Basically we do BFS traversal of the graph to get the shortest paths.");

        q = new Question(Q, "A", "12", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A scheme for storing binary trees in an array X is as follows. Indexing of X starts\n" +
                        "at 1 instead of 0. the root is stored at X[1]. For a node stored at X[i], the left\n" +
                        "child, if any, is stored in X[2i] and the right child, if any, in X[2i+1]. To be able to\n" +
                        "store any binary tree on n vertices the minimum size of X should be",
                "$log_2n$", "$n$", "$2n+1$", "$2^n-1$"));

        explanation = getExplaination("$$ $$" +
                "For a right skewed binary tree, number of nodes will be 2^n – 1. $$ $$" +
                "For example, in below binary tree, node ‘A’ will be stored at index 1, ‘B’ at index 3, ‘C’ at index 7 and ‘D’ at index 15." +
                getProgram("exp2006-qno-13.txt") + "");

        q = new Question(Q, "D", "13", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following in place sorting algorithms needs the minimum\n" +
                        "number of swaps?",
                "Quick sort", "Insertion sort", "Selection sort", "Heap sort"));

        explanation = getExplaination("For selection sort, number of swaps required is minimum ( Θ(n) ).");

        q = new Question(Q, "C", "14", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C-program fragment in which i, j and n are integer\n" +
                        "variables.$$ $$for (i = n, j = 0; i > 0; i /= 2, j += i);$$ $$Let val(j) denote " +
                        "the value stored in the variable j after termination of the for loop. " +
                        "Which one of the following is true? ",
                "$val ( j ) = θ (log\\ n)$",
                "$val ( j ) = θ (√n)$",
                "$val ( j ) = θ (n)$",
                "$val ( j ) = θ (n\\ log\\ n)$"));

        explanation = getExplaination("the semicolon after the for loop, so there is nothing in the body.$$ $$" +
                " The variable j is initially 0 and value of j is sum of values of i. " +
                "i is initialized as n and is reduced to half in each iteration.$$ $$j = n/2 + n/4 + n/8 + .. + 1 = Θ(n)");

        q = new Question(Q, "C", "15", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let S be an NP-complete problem and Q and R be two other problems not known\n" +
                        "to be in NP. Q is polynomial time reducible to S and S is polynomial-time\n" +
                        "reducible to R. Which one of the following statements is true?",
                "R is NP-complete", "R is NP-hard", "Q is NP-complete", "Q is NP-hard"));

        explanation = getExplaination("$$ $$Option A is incorrect because R is not in NP. A NP Complete problem has to be in both NP and NP-hard.$$ $$" +
                "B is Correct option because a NP Complete problem S is polynomial time educable to R.$$ $$" +
                "C is Incorrect option because Q is not in NP.$$ $$" +
                "D is Incorrect option because there is no NP-complete problem that is polynomial time Turing-reducible to Q");

        q = new Question(Q, "B", "16", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An element in an array X is called a leader if it is greater than all elements to the\n" +
                        "right of it in X. The best algorithm to find all leaders in an array",
                "Solves it in linear time using a left to right pass of the array",
                "Solves it in linear time using a right to left pass of the array",
                "Solves it using divide and conquer in time $θ(n log n)$",
                "Solves it in time $θ(n^2)$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "17", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("We are given a set $X = {x_1, .... x_n}$ where $x_i = 2^i.$ A sample $S ⊆ X$ is " +
                        "drawn by selecting each $x_i$ independently with probability $p_i = 1/2.$ The expected " +
                        "value of the smallest number in sample $S$ is:",
                "$1/n$",
                "$2$",
                "$√n$",
                "$n$"));

        explanation = getExplaination("$$ $$");

        q = new Question(Q, "D", "18",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L_1=\\{0^{n+m}1^n0^m|n,m ≥0\\},$  $L_2=\\{0^{n+m}1^{n+m}0^m|n,m ≥0\\},$ and" +
                        " $L_3=\\{0^{n+m}1^{n+m}0^{n+m}|n,m ≥0\\},$ $$ $$Which of these languages are NOT context free?",
                "$L_1$ only",
                "$L_3$ only",
                "$L_1$ and $L_2$",
                "$L_2$ and $L_3$"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "19", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following log sequence of two transactions on a bank account, with initial balance 12000, that transfer 2000 to a mortgage payment and then " +
                        "apply a 5% interest.$$ $$"
                        + MyTable(7, 3, getText(3, "1.", "T1", "start", "2.", "T1", "B old=12000 new=10000", "3.", "T1", "M old=0 new=2000", "4.", "T1", "commit", "5.", "T2", "start", "6.",
                "T2", "B old=10000 new=10500", "7.", "T2", "commit", "", "", "", "", "", "", "", "", ""), false, true) +
                        "$$ $$Suppose the database system cra shes just before log record 7 is written. When the system is restarted, which one statement is true of the recovery procedure?",
                "We must redo log record 6 to set B to 10500",
                "We must undo log record 6 to set B to 10000 and then redo log records 2\n" +
                        "and 3",
                "We need not redo log records 2 and 3 because transaction T1 has committed",
                "We can apply redo and undo operations in arbitrary order because they are\n" +
                        "idempotent."));

        explanation = getExplaination("We must undo log record 6 to set B to 10000 and then redo log records 2 and 3 bcoz system fail before commit operation. " +
                "$$ $$So we need to undone active transactions(T2) and redo committed transactions (T1) " +
                "$$ $$Note:Here we are not using checkpoints. Checkpoint : Checkpoint is a mechanism where all the previous logs are removed from the system and stored permanently in a storage disk. Checkpoint declares a point before which the DBMS was in consistent state, and all the transactions were committed. " +
                "$$ $$Recovery: When a system with concurrent transactions crashes and recovers, it behaves in the following manner − =>The recovery system reads the logs backwards from the end to the last checkpoint. =>It maintains two lists, an undo-list and a redo-list." +
                " =>If the recovery system sees a log with and or just , it puts the transaction in the redo-list. =>If the recovery system sees a log with but no commit or abort log found, it puts the transaction in undo-list. All the transactions in the undo-list are then undone" +
                " and their logs are removed. All the transactions in the redo-list and their previous logs are removed and then redone before saving their logs. $$ $$" +
                "So Answer is B redo log records 2 and 3 and undo log record 6");

        q = new Question(Q, "B", "20", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("For each element in a set of size 2n, an unbiased coin is tossed. " +
                        "The 2n coin tosses are independent. An element is chosen if the corresponding " +
                        "coin toss were head. The probability that exactly n elements are chosen is:",
                "$ (\\table \\2n;\\n)/4^n$",
                "$ (\\table \\2n;\\n)/2^n$",
                "$ 1/(\\table \\2n;\\n)$",
                "$1/2$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "21",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let E, F and G be finite sets. Let X = (E ∩ F) - (F ∩ G) and Y = (E - (E ∩ G)) - (E - F)." +
                        " Which one of the following is true?",
                "X ⊂ Y",
                "X ⊃ Y",
                "X = Y",
                "X - Y ≠ $ϕ$ and Y - X ≠ $ϕ$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "22", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("F is an n×n real matrix. b is an n×1 real vector. Suppose there are two n×1 vectors, " +
                        "u and v such that, u ≠ v and Fu = b, Fv = b. Which one of the following statements is false?",
                "Determinant of F is zero",
                "There are an infinite number of solutions to Fx = b",
                "There is an x≠0 such that Fx = 0",
                "F must have two identical rows"));

        explanation = getExplaination("$$ $$Since Fu = b, and also Fv = b, so we have (Fu - Fb) = 0 i.e. F(u-v) = 0. Since u≠v, F is a singular matrix i.e. its determinant is 0.$$ $$" +
                " Now for a singular matrix F, either Fx = b has no solution or infinitely many solutions, but as we are already given two solutions u and v for x, Fx = b has to have infinitely many solutions. Moreover, by definition of singular matrix, there exists an x≠0 such that Fx = 0 . So options (A), (B), and (C) are true." +
                "$$ $$ Option (D) is false because it may not be necessary that two rows are identical, instead, two columns can be identical and we can get F as singular matrix then. So option (D) is correct answer. ");

        q = new Question(Q, "D", "23", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given a set of elements $N = {1, 2, ..., n}$ and two arbitrary subsets " +
                        "$A⊆N$ and $B⊆N,$ how many of the $n!$ permutations $π$ from $N$ to $N$ satisfy min " +
                        "$(π(A))$ = min $(π(B)),$ where min$(S)$ is the smallest integer in the set of integers " +
                        "$S,$ and $π(S)$ is the set of integers obtained by applying permutation $π$ to each element of $S?$",
                "$(n - |A ∪ B|) |A| |B|$",
                "$(|A|^2+|B|^2)n^2$",
                "$n!$ ${|A∩B|} / {|A∪B|}$",
                "$|A∩B|^2 / (\\table \\n;\\ {|A∪B|})$"));

        explanation = getExplaination("$$ $$" +
                "First let us understand what question is asking. So π is a function from N to N, which just permutes the elements of N, so there will be n! such permutations. Now given a particular π i.e. given a particular permutation scheme, we have to find number of permutations out of these n! permuations in which minimum elements of A and B after applying π to them are same. So for example, if N = {1,2,3}, π is {2,3,1}, and if A is {1,3}, then π(A) = {2,1}. Now number of elements in A ∪ B is |A ∪ B|. We can choose permutations for A ∪ B in nC|A∪B| ways. Note that here we are just choosing elements for permutation, and not actually permuting. Let this chosen set be P. Now once we have chosen numbers for permutations, we have to select mapping from each element of A ∪ B to some element of P. So first of all, to achieve required condition specified in question, we have to map minimum number in P to any of the number in A ∩ B, so that min(π(A)) = min(π(B)). We can do this in |A∩B| ways, since we can choose any element of |A∩B| to be mapped to minimum number in P. Now we come to permutation. $$ $$We can permute numbers in P in |A∪B-1|! ways, since one number (minimum) is already fixed. Moreover, we can also permute remaining n - |A∪B-1| in (n - |A∪B-1|)! ways, so total no. of ways = nC|A∪B|∗|A∩B|∗|A∪B−1|!∗(n−|A∪B−1|)!=n!|A∩B||A∪B| So option (C) is correct. ");

        q = new Question(Q, "C", "24", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $S=\\{1,2,3,......m\\},m>3.$ Let $X_1.......X_n$ be subset of $S$ each of size $3$" +
                        " Define a function $f$ from $S$ to the set of natural number as,  $f(i)$ is the number of " +
                        "sets $X_j$ that contain the element $i.$ That is $f(i)=|\\{j|i ∈ X_j|\\}|.$" +
                        " Then $∑↙{i=1}↖mf(i)$",
                "$3m$",
                "$3n$",
                "$2m+1$",
                "$2n+1$"));

        explanation = getExplaination("First of all, number of subsets of S of size 3 is $mC_3$ i.e. $n=mC_3.$ " +
                "Now we count number of subsets in which a particular element i appears, that will be $(m−1)C_2,$ " +
                "because 1 element is already known, and we have to choose 2 elements from remaining m-1 elements. ");

        q = new Question(Q, "B", "25", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the first order predicate calculus statements given below correctly\n" +
                        "expresses the following English statement?\n" +
                        "Tigers and lions attack if they are hungry or threatened.",
                "∀x [( tiger(x) ∧ lion(x))→ {(hungry(x) ∨ threatened(x)) → attacks(x)}]",
                "∀x [( tiger(x) ∨ lion(x))→ {(hungry(x) ∨ threatened(x)) ∧ attacks(x)}]",
                "∀x [( tiger(x) ∨ lion(x))→ {(attacks(x) → hungry(x)) ∨ threatened(x)}]",
                "∀x [( tiger(x) ∨ lion(x))→ {(hungry(x) ∨ threatened(x)) → attacks(x)}]"));

        explanation = getExplaination("The statement \"Tigers and lions attack if they are hungry or threatened\" " +
                "means that if an animal is either tiger or lion, then if it is hungry or threatened, it will attack. " +
                "So option (D) is correct. $$ $$Don't get confused by \"and\" between tigers and lions in the statement. " +
                "This \"and\" doesn't mean that we will write \"tiger(x) ∧ lion(x) \", because that would have meant that " +
                "an animal is both tiger and lion, which is not what we want.");

        q = new Question(Q, "D", "26", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following propositional statements:$$ $$" +
                        "$P1 : ((A ∧ B) → C)) ≡ ((A → C) ∧ (B → C))$ $$ $$ $P2 : ((A ∨ B) → C)) ≡ ((A → C) ∨ (B → C))$ $$ $$" +
                        " Which one of the following is true?",
                "P1 is a tautology, but not P2",
                "P2 is a tautology, but not P1",
                "P1 and P2 are both tautologies",
                "Both P1 and P2 are not tautologies"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "27", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A logical binary relation □ , is defined as follows:$$ $$" + MyTable(5, 3, getText(3, "A", "B", "A□B", "True", "True", "True", "True", "False", "True", "False", "True", "False", "False", "False", "True", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$Let ~be the unary negation (NOT) operator, with higher precedence then □.\n" +
                        "Which one of the following is equivalent to A ∧ B?",
                "(~ A □ B)", "~ (A □ ~ B)", "~ (~ A □ ~ B)", "~ (~ A □ B)"));

        explanation = getExplaination("In A∧B, we have 3 entries as False, and one as True. In table, it is opposite case, so we have to negate A □ B, moreover, $$ $$" +
                "we want True only when both A and B are true, so in 3rd entry (which becomes true after negation), $$ $$" +
                "we want both true, so we have to negate A also. So A ∧ B ≡ ~(~A □ B), so option (D) is correct. Source:");

        q = new Question(Q, "D", "28",digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If s is a string over $(0 + 1)^*$\n" +
                        " then let $n_0(s)$  denote the number of $0’s$ in $s$\n" +
                        " and $n_1(s)$  the number of $1’s$ in $s.$ Which one of the following languages is not\n" +
                        "regular?",
                "$L = \\{$ $s ∈ (0 + 1)^*| n_0(s)$ is a 3-digit prime }",
                "$L = \\{$ $s ∈ (0 + 1)^*|$ for every prefix's of $s,|n_0 (s') − n_1(s')| ≤ 2$ }",
                "$L = \\{$ $s∈ (0 + 1)^*$ $|n_0(s)-n_1(s)|≤4$ }", "$L = \\{$ $s∈(0 + 1)^*| n_0(s)$ mod$7=n_1(s)$ mod$5=0$ }"));

        explanation = getExplaination("Languages in option (A) And (D) are finite so both the options are eliminated. For option A: There are finite no. of 3 digit prime numbers. $$ $$There exists a FA for every finite set. Hence FA is possible. For option D: Possible remainders for 7 is 0 to 6, and for 5 its 0 to 4.$$ $$" +
                " Using 35 states, FA can be made. For option B: We can have 6 states (including 1 reject state) state 1: difference is 0 state 2: difference is 1 (more 1s) state 3: difference is 1 (more 0s) state 4: difference is 2 (more 1s) state 5: difference is 2 (more 0s) state 6: reject state for difference > = 3 Suppose the string is 000101 Scan 0 -> state 3 Scan 0 -> state 5 Scan 0 -> reject (since diff. is 3 now) Similarly if we try for string: 010100, this will be accepted.");

        q = new Question(Q, "C", "29",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("For S ∈$(0 + 1)^*$ let d(s) denote the decimal value of s (e.g. d(101) = 5). " +
                        "<br/>Let L = { s∈$(0 + 1)^*$ |d(s)mod5 = 2 and d(s)mod7 ≠ 4}.$$ $$ Which one of the following statements is true?",
                "L is recursively enumerable, but not recursive",
                "L is recursive, but not context-free",
                "L is context-free, but not regular",
                "L is regular"));

        explanation = getExplaination("It is regular L1=d(s) mod 5 =2 is regular with 5 states L2=d(s) mod 7 =4 is regular with 7 states $$ $$" +
                "therefore L1 ⋀ L2' should be regular because regular grammar are closed under intersection and compliment");

        q = new Question(Q, "D", "30",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $SHAM_3$ be the problem of finding a Hamiltonian cycle in a graph G = (V,E) " +
                        "with V divisible by 3 and $DHAM_3$ be the problem of determining if a Hamiltonian cycle " +
                        "exists in such graphs. Which one of the following is true?",
                "Both $DHAM_3$ and $SHAM_3$ are NP-hard",
                "$SHAM_3$ is NP-hard, but $DHAM_3$ is not",
                "$DHAM_3$ is NP-hard, but $SHAM_3$ is not",
                "Neither $DHAM_3$ nor $SHAM_3$ is NP-hard"));

        explanation = getExplaination("The problem of finding whether there exist a Hamiltonian Cycle or not is NP Hard and NP Complete Both. Finding a Hamiltonian cycle in a graph G = (V,E) with V divisible by 3 is also NP Hard.");

        q = new Question(Q, "A", "31", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following statements about the context free grammar <br/>" +
                        "G = {S → SS, S → ab, S → ba, S → Ε} $$ $$" +
                        "I. G is ambiguous$$ $$II. G produces all strings with equal number of a’s and b’s$$ $$III. G can be accepted by a deterministic PDA.$$ $$",
                "I only", "I and III only", "II and III only", "I,II and III only"));

        explanation = getExplaination("II is not correct because this grammer cannot produce aabb");

        q = new Question(Q, "B", "32", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L_1$ be a regular language, $L_2$ be a deterministic context-free language and $L_3$ a recursively enumerable, but not recursive, language. Which one of the following statements is false?",
                "$L_1 ∩ L_2$ is a deterministic CFL",
                "$L_3 ∩ L_1$ is recursive",
                "$L_1 ∩ L_2$ is context free",
                "$L_1 ∩ L_2 ∩ L_3$ is recursively enumerable"));

        explanation = getExplaination("$$ $$(A) This statement is true because deterministic context free languages are closed under intersection with regular languages. \n" +
                "$$ $$(B) This statement is false because L1 is recursive and every recursive language is decidable. L3 is recursively enumerable but not recursive. So, L3 is undecidable. Intersection of recursive language and recursive enumerable language is recursively enumerable . \n" +
                "$$ $$(C) This statement is true because L1 is regular. Every regular language is also a context free languages. L2 is a deterministic context free language and every DCFL is also a context free languages. Every context free language is closed under Union. \n" +
                "$$ $$(D) This statement is true beacuse L1 is regular hence it is also recursively enumerable. L2 is deterministic context free language so, it is also recursively enumerable . Recursively enumerable languages are closed under intersection. \n" +
                "\n" +
                " \n" +
                "$$ $$Thus, problem mentioned in option (A) is undecidable.");

        q = new Question(Q, "B", "33", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the regular language $L = (111 + 11111)^*.$ The minimum number of states in any DFA accepting this languages is:",
                "3",
                "5",
                "8", "9"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "34",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<img src='" + path + "qno-35.png'/>$$ $$Consider the circuit above. Which one of the following options " +
                        "correctly represents f (x, y, z)?",
                "$x\\ov{z}$ + xy + $\\ov{y}z$",
                "$x\\ov{z}$ + xy + $\\ov{yz}$",
                "xz + xy + $\\ov{yz}$",
                "xz + $x\\ov{y}$ + $\\ov{y}z$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "35", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given two three bit numbers $a_2a_1a_0$ and $b_2b_1b_0$ and $c,$ the carry in, the function that represents the $carry$ generate function when these two numbers are added is:",
                "$a_2 b_2 + a_2 a_1 b_1 + a_2 a_1 a_0 b_0 $ $+ a_2 a_0 b_1 b_0 + a_1 b_2 b_1 + a_1 a_0 b_2 b_0 + a_0 b_2 b_1 b_0$",
                "$a_2 b_2 + a_2 b_1 b_0 + a_2 a_1 b_1 b_0 $ $+ a_1 a_0 b_2 b_1 + a_1 a_0 b_2 + a_1 a_0 b_2 b_0 + a_2 a_0 b_1 b_0$",
                "$a_2 + b_2 + (a_2 ⊕ b_2) $ $(a_1 + b_1 + (a_1 ⊕ b_1) (a_0 + b_0))$",
                "$a_2 b_2 + \\ov{a_2} a_1 b_1 + \\ov{a_2 a_1} a_0 b_0 $ $+ \\ov{a_2} a_0 \\ov{b_1} b_0 + a_1 \\ov{b_2} b_1 + \\ov{a_1} a_0 \\ov{b_2} b_0 + a_0 \\ov{b_2 b_1} b_0$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "36", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the circuit in the diagram. The ⊕ operator represents Ex-OR. The D flipflops are initialized to zeroes (cleared)." +
                        "$$ $$<img src='" + path + "qno-37.png'/>$$ $$The following data: 100110000 is supplied to the “data” terminal in nine clock cycles. After that the values of $q_2q_1q_0$ are:",
                "000", "001", "010", "101"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "37", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a Boolean function f (w, x, y, z). suppose that exactly one of its inputs is allowed to change at a time. " +
                        "If the function happens to be true for two input vectors $i_1 = (w_1, x_1, y_1, z_1)$ and $i_2 = (w_2, x_2, y_2, z_2)$" +
                        " we would like the function to remain true as the input changes from $i_1$ to $i_2$ $(i_1$ and $i_2$ differ in exactly one bit position), " +
                        "without becoming false momentarily. $$ $$Let f (w, x, y, z) = ∑(5,7,11,12,13,15). " +
                        "$$ $$Which of the following cube covers of f will ensure that the required property is satisfied?$$ $$",
                "$\\ov{w}xz,wx\\ov{y}, x\\ov{y}z, xyz,wyz$",
                "$wxy,\\ov{w}xz,wyz$",
                "$wx\\ov{yz}, xz,w\\ov{x}yz$",
                "$wzy,wyz,wxz,\\ov{w}xz, x\\ov{y}z, xyz$"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "38", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("We consider the addition of two 2’s complement numbers $b_{n-1}b_{n-2}...b_0$ and $a_{n-1}a_{n-2}...a_0.$" +
                        " A binary adder for adding unsigned binary numbers is used to add the two numbers. The sum is denoted by $c_{n-1}c_{n-2}...c_0$ and the carry-out by $c_{out}.$ " +
                        "Which one of the following options correctly identifies the overflow condition?",
                "$c_{out}(\\ov{a_{n-1} ⊕ b_{n-1}})$",
                "$a_{n-1}b_{n-1}\\ov{c_{n-1}}+\\ov{a_{n-1}b_{n-1}}c_{n-1}$",
                "$c_{out} ⊕ c_{n-1}$",
                "$a_{n-1} ⊕ b_{n-1} ⊕ c_{n-1}$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "39", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider numbers represented in 4-bit gray code. Let $h_3h_2h_1h_0$ be the gray code\n" +
                        "representation of a number n and let $g_3g_2g_1g_0$ be the gray code of\n" +
                        "(n + 1) (modulo 16) value of the number. Which one of the following functions is\n" +
                        "correct?",
                "$ g_0 (h_3 h_2 h_1 h_0) = $ $∑ (1,2,3,6,10,13,14,15) $",
                "$ g_1 (h_3 h_2 h_1 h_0) = $ $∑ (4,9,10,11,12,13,14,15) $",
                "$ g_2 (h_3 h_2 h_1 h_0) = $ $∑ (2,4,5,6,7,12,13,15) $",
                "$ g_3 (h_3 h_2 h_1 h_0) = $ $∑ (0,1,6,7,10,11,12,13) $"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "40", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A CPU has a cache with block size 64 bytes. The main memory has $k$ banks, each\n" +
                        "bank being $c$ bytes wide. Consecutive $c$ − byte chunks are mapped on\n" +
                        "consecutive banks with wrap-around. All the $k$ banks can be accessed in parallel,\n" +
                        "but two accesses to the same bank must be serialized. A cache block access may\n" +
                        "involve multiple iterations of parallel bank accesses depending on the amount of\n" +
                        "data obtained by accessing all the $k$ banks in parallel. Each iteration requires\n" +
                        "decoding the bank numbers to be accessed in parallel and this takes .\n" +
                        "$k/2ns$." +
                        " The\n" +
                        "latency of one bank access is 80 ns. If c = 2 and k = 24, the latency of retrieving\n" +
                        "a cache block starting at address zero from main memory is:",
                "$92ns$",
                "$104ns$",
                "$172ns$", "$184ns$"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "41", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A CPU has a five-stage pipeline and runs at 1 GHz frequency. Instruction fetch\n" +
                        "happens in the first stage of the pipeline. A conditional branch instruction\n" +
                        "computes the target address and evaluates the condition in the third stage of the\n" +
                        "pipeline. The processor stops fetching new instructions following a conditional\n" +
                        "branch until the branch outcome is known. A program executes $10^9$ instructions\n" +
                        "out of which 20% are conditional branches. If each instruction takes one cycle to\n" +
                        "complete on average, the total execution time of the program is:",
                "1.0 second", "1.2 seconds", "1.4 seconds", "1.6 seconds"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "42", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a new instruction named branch-on-bit-set (mnemonic bbs). The\n" +
                        "instruction “bbs reg, pos, label” jumps to label if bit in position pos of register\n" +
                        "operand reg is one. A register is 32 bits wide and the bits are numbered 0 to 31,\n" +
                        "bit in position 0 being the least significant. Consider the following emulation of\n" +
                        "this instruction on a processor that does not have bbs implemented." +
                        " <br/>temp←reg & mask <br/>Branch to label if temp is non-zero." +
                        "$$ $$The variable temp is a temporary register. For correct emulation, the variable\n" +
                        "mask must be generated by$$ $$",
                "mask ← 0 ×1 □ pos", "mask ← 0 × ffffffff □ pos",
                "mask ← pos", "mask ← 0 × f"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "43", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Station A uses 32 byte packets to transmit messages to Station B using a sliding\n" +
                        "window protocol. The round trip delay between A and B is 80 milliseconds and\n" +
                        "the bottleneck bandwidth on the path between A and B is 128 kbps. What is the\n" +
                        "optimal window size that A should use?",
                "20", "40", "160", "320"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "44", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Two computers C1 and C2 are configured as follows. C1 has IP address\n" +
                        "203.197.2.53 and netmask 255.255.128.0. C2 has IP address 203.197.75.201\n" +
                        "and netmask 255.255.192.0. which one of the following statements is true?",
                "C1 and C2 both assume they are on the same network",
                "C2 assumes C1 is on same network, but C1 assumes C2 is on a different\n" +
                        "network",
                "C1 assumes C2 is on same network, but C2 assumes C1 is on a different\n" +
                        "network",
                "C1 and C2 both assume they are on different networks."));

        explanation = getExplaination("");

        q = new Question(Q, "C", "45", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Station A needs to send a message consisting of 9 packets to Station B using a\n" +
                        "sliding window (window size 3) and go-back-n error control strategy. All packets\n" +
                        "are ready and immediately available for transmission. If every $5^{th}$ packet that A\n" +
                        "transmits gets lost (but no acks from B ever get lost), then what is the number of\n" +
                        "packets that A will transmit for sending the message to B?",
                "12", "14", "16", "18"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "46", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following graph:<img src='" + path + "qno-47.png'/>$$ $$" +
                        "Which one of the following cannot be the sequence of edges added, in that\n" +
                        "order, to a minimum spanning tree using Kruskal’s algorithm?",
                "(a—b),(d—f),(b—f),(d—c),(d—e)",
                "(a—b),(d—f),(d—c),(b—f),(d—e)",
                "(d—f),(a—b),(d—c),(b—f),(d—e)",
                "(d—f),(a—b),(b—f),(d—e),(d—c)"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "47", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let T be a depth first search tree in an undirected graph G. Vertices u and v are\n" +
                        "leaves of this tree T. The degrees of both u and v in G are at least 2. which one\n" +
                        "of the following statements is true?",
                "There must exist a vertex w adjacent to both u and v in G",
                "There must exist a vertex w whose removal disconnects u and v in G",
                "There must exist a cycle in G containing u and v",
                "There must exist a cycle in G containing u and all its neighbours in G."));

        explanation = getExplaination("");

        q = new Question(Q, "B", "48", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An implementation of a queue Q, using two stacks S1 and S2, is given below:" +
                        getProgram("prog2006-qno-49.c") + "Let n insert and m(≤ n) delete operations be performed in an arbitrary order\n" +
                        "on an empty queue Q. Let x and y be the number of push and pop operations\n" +
                        "performed respectively in the process. Which one of the following is true for all\n" +
                        "m and n?",
                "n+m ≤ x < 2n and 2m ≤ y ≤ n+m",
                "n+m ≤ x < 2n and 2m ≤ y ≤ 2n",
                "2m ≤ x < 2n and 2m ≤ y ≤ n+m",
                "2m ≤ x <2n and 2m ≤ y ≤ 2n"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "49", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A set X can be represented by an array x [n] as follows:$$ $$" +
                        "x[i]= $\\{\\table 1,if i∈X;0,otherwise$ $$ $$Consider the following algorithm in which x,y and z are Boolean arrays of size n:$$ $$" +
                        getProgram("prog2006-qno-50.txt") + "$$ $$The set Z computed by the algorithm is:",
                "(X ∪ Y)",
                "(X ∩ Y)",
                "(X-Y) ∩ (Y-X)", "(X-Y) ∪ (Y-X)"));

        explanation = getExplaination("");

        q = new Question(Q, "D", "50", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following recurrence:" +
                        "$$ $$T (n) = 2T (⌈$√n$⌉) + 1,T (1) = 1$$ $$Which one of the following is true?",
                "T (n) = $θ(log\\ log\\ n)$",
                "T (n) = $θ (log\\ n)$",
                "T (n) = $θ (√n)$",
                "T (n) = $θ (n)$"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "51", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The median of n elements can be found in O(n) time. Which one of the following\n" +
                        "is correct about the complexity of quick sort, in which median is selected as\n" +
                        "pivot?",
                "$θ(n)$", "$θ(n$ $log$ $n)$", "$θ(n^2)$", "$θ(n^3)$"));

        explanation = getExplaination("");


        q = new Question(Q, "D", "52", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C-function in which a[n] and b[m] are two sorted integer arrays and c[n + m] be another integer array." +
                        getProgram("prog2006-qno-53.c") + "Which of the following condition(s) hold(s) after the termination of the while loop?  $$ $$" +
                        "(i) j < m, k = n+j-1, and a[n-1] < b[j] if i = n $$ $$" +
                        "(ii) i < n, k = m+i-1, and b[m-1] ≤ a[i] if j = m",
                "only (i)",
                "only (ii)",
                "either (i) or (ii) but not both",
                "neither (i) nor (ii)"));


        explanation = getExplaination("The function xyz( ) is similar to merge( ) of mergeSort( ).\n" +
                "The condition $$ $$(i) is true if the last inserted element in c[ ] is from a[ ] and condition $$ $$(ii) is true if the last inserted element is from b[ ].");
        q = new Question(Q, "C", "53", algo, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Given two arrays of numbers $a_1, a_2, a_3,...a_n$ and $b_1, b_2, .. b_n$ where each number is 0 or 1, " +
                        "the fastest algorithm to find the largest span(i, j) such that $a_i + a_{i+1}, ....a_j$ = $ b_i + b_{i+1}, .. b_j.$" +
                        " or report that there is not such span,",
                "Takes $O(3^n)$ and $Ω(2^n)$ time if hashing is permitted",
                "Takes $O(n^3)$ and $Ω(n^{2.5})$ time in the key comparison model",
                "Takes $θ(n)$ time and space",
                "Takes $O(√n)$ time only if the sum of the 2n elements is an even number"));

        explanation = getExplaination("The problem can be solved in  Takes θ(n) time and space.\n" +
                "$$ $$1. Since there are total n elements, maximum sum is n for both arrays.\n" +
                "$$ $$2. Difference between two sums varies from -n to n. So there are total 2n + 1 possible values of difference.\n" +
                "$$ $$3. If differences between prefix sums of two arrays become same at two points, then subarrays between these two points have same sum.\n" +
                "$$ $$Applied Algorithm.\n" +
                "$$ $$1. Create an auxiliary array of size 2n+1 to store starting points of all possible values of differences (Note that possible values of differences vary from -n to n, i.e., there are total 2n+1 possible values)\n" +
                "$$ $$2. Initialize starting points of all differences as -1.\n" +
                "$$ $$3. Initialize maxLen as 0 and prefix sums of both arrays as 0, preSum1 = 0, preSum2 = 0\n" +
                "$$ $$4. Travers both arrays from i = 0 to n-1.\n" +
                "$$ $$ a. Update prefix sums: preSum1 += arr1[i], preSum2 += arr2[i]\n" +
                "$$ $$ b. Compute difference of current prefix sums: curr_diff = preSum1 – preSum2\n" +
                "$$ $$ c. Find index in diff array: diffIndex = n + curr_diff // curr_diff can be negative and can go till -n\n" +
                "$$ $$ d. If curr_diff is 0, then i+1 is maxLen so far\n" +
                "$$ $$ e. Else If curr_diff is seen first time, i.e., starting point of current diff is -1, then update starting point as i\n" +
                "$$ $$ f. Else (curr_diff is NOT seen first time), then consider i as ending point and find length of current same sum span. If this length is more, then update maxLen\n" +
                "$$ $$ 5. Return maxLen");

        q = new Question(Q, "C", "54", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider these two functions and two statements S1 and S2 about them" +
                        getProgram("prog2006-qno-55.c") + "S1: The transformation form work1 to work2 is valid, i.e.," +
                        " for any program state and input arguments, work2 will compute the same output and have the same" +
                        " effect on program state as work1 $$ $$ S2: All the transformations applied to work1 to get work2" +
                        " will always improve the performance (i.e reduce CPU time) of work2 compared to work1",
                "S1 is false and S2 is false",
                "S1 is false and S2 is true",
                "S1 is true and S2 is false",
                "S1 is true and S2 is true"));


        explanation = getExplaination("S1 is true because even by adding an extra variable  (t1) instead of directly computing, the output will be obviously be same. S2 is false: Adding an extra variable can NOT improve the performance in anyway So Answer is C");
        q = new Question(Q, "C", "55", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following code written in a pass-by-reference language like FORTRAN and these statements about the code." +
                        getProgram("prog2006-qno-56.c") + "" +
                        "$$ $$S1: The compiler will generate code to allocate a temporary nameless cell, initialize it to 13, and pass the address of the cell swap " +
                        "$$ $$S2: On execution the code will generate a runtime error on line L1 " +
                        "$$ $$S3: On execution the code will generate a runtime error on line L2 " +
                        "$$ $$S4: The program will print 13 and 8 " +
                        "$$ $$S5: The program will print 13 and -2 $$ $$Exactly the following set of statement(s) is correct:",
                "S1 and S2",
                "S1 and S4",
                "S3",
                "S1 and S5"));


        explanation = getExplaination("");


        q = new Question(Q, "A", "56", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider this C code to swap two integers and these five statements after it:" +
                        getProgram("prog2006-qno-57.c") + "$$ $$S1: will generate a compilation error " +
                        "$$ $$S2: may generate a segmentation fault at runtime depending on the arguments passed " +
                        "$$ $$S3: correctly implements the swap procedure for all input pointers referring to integers " +
                        "stored in memory locations accessible to the process $$ $$S4: implements the swap procedure" +
                        " correctly for some but not all valid input pointers $$ $$S5: may add or subtract integers and pointers.",
                "S1",
                "S2 and S3",
                "S2 and S4",
                "S2 and S5"));


        explanation = getExplaination("$$ $$S2: May generate segmentation fault if value at pointers px or py is constant or px or py points to a memory location that is invalid\n" +
                "$$ $$S4: May not work for all inputs as arithmetic overflow can occur");

        q = new Question(Q, "C", "57", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following grammar:" +
                        "$$ $$S → FR\n" +
                        "$$ $$R → *S | ε\n" +
                        "$$ $$F → id$$ $$In the predictive parser table, M, of the grammar the entries M[S, id] and M[R, \\$] respectively.",
                "{S → FR} and {R → ε }",
                "{S → FR} and { }",
                "{S → FR} and {R → *S}",
                "{F → id} and {R → ε}"));


        explanation = getExplaination("$$ $$Here representing the parsing table as M[ X , Y ], where X represents rows( Non terminals) and Y represents columns(terminals). Here are the rules to fill the parsing table. For each distinct production rule A→α, of the grammar, we need to apply the given rules:$$ $$" +
                "Rule 1: if A → α is a production, for each terminal 'a' in FIRST(α), add A→α to M[ A , a ] $$ $$" +
                "Rule 2 : if ' ε ' is in FIRST(α), add A → α to M [ A , b ] for each 'b' in FOLLOW(A). As Entries have been asked corresponding to Non-Terminal S and R, hence we only need to consider their productions to get the answer. For S → FR, according to rule 1, this production rule should be placed at the entry M[ S, FIRST(FR) ], and from the given grammar, FIRST(FR) ={id}, hence S→FR is placed in the parsing table at entry M[S , id].$$ $$" +
                "Similarly, For R → S, this production rule should be placed at entry M[ R, FIRST(S) ], and as FIRST(S) = FIRST(F) = {id} hence, R->S is placed at entry M[R,id] and For R->ε, as FIRST(ε) = {ε}, hence rule 2 should be applied, therefore, this production rule should be placed in the parsing table at entry M[R,FOLLOW(R)], and FOLLOW(R) = FOLLOW(S) = {\\$}, hence R→ε is placed at entry M[ R, \\$ ].$$ $$Therefore Answer is option A");

        q = new Question(Q, "A", "58", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following translation scheme. $$ $$" +
                        "S → ER $$ $$" +
                        "R → *E{print(\"*\");}R | ε $$ $$" +
                        "E → F + E {print(\"+\");} | F $$ $$" +
                        "F → (S) | id {print(id.value);} $$ $$" +
                        "Here id is a token that represents an integer and id.value represents the corresponding integer value. For an input '2 * 3 + 4', this translation scheme prints",
                "2 * 3 + 4",
                "2 * +3 4",
                "2 3 * 4 +",
                "2 3 4+*"));


        explanation = getExplaination("");

        q = new Question(Q, "D", "59", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C code segment.$$ $$" +
                        getProgram("prog2006-qno-60.c") + "Which one of the following is false?",
                "The code contains loop invariant computation",
                "There is scope of common sub-expression elimination in this code",
                "There is scope of strength reduction in this code",
                "There is scope of dead code elimination in this code"));


        explanation = getExplaination("4*j is common subexpression elimination so B is true.\n" +
                "$$ $$" +
                "5*i can be moved out of inner loop so can be i%2. \n" +
                "Means, A is true as we have loop invariant computation.\n" +
                "$$ $$" +
                "Next, 4*j as well as 5*i can be replaced with a = - 4;\n" +
                "before j loop then a = a + 4; where 4*j is computed,\n" +
                "likewise for 5*i. C is true as there is scope of strength \n" +
                "reduction. \n" +
                "$$ $$" +
                "So answer is D.");


        q = new Question(Q, "D", "60", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The atomic fetch-and-set x, y instruction unconditionally sets the memory" +
                        " location x to 1 and fetches the old value of x n y without allowing any intervening" +
                        " access to the memory location x. consider the following implementation of P and" +
                        " V functions on a binary semaphore S." +
                        getProgram("prog2006-qno-61.c") + "$$ $$Which one of the following is true?$$ $$",

                "The implementation may not work if context switching is disabled in P",
                "Instead of using fetch-and –set, a pair of normal load/store can be used",
                "The implementation of V is wrong",
                "The code does not implement a binary semaphore"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "61", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A CPU generates 32-bit virtual addresses. The page size is 4 KB. The processor has a translation look-aside buffer (TLB) which can hold a total of 128 page table entries and is 4-way set associative. The minimum size of the TLB tag is:",
                "11 bits", "13 bits", "15 bits", "20 bits"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "62", os, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("A computer system supports 32-bit virtual addresses as well as 32-bit physical addresses. Since the virtual address space is of the same size as the physical address space, the operating system designers decide to get rid of the virtual memory entirely. Which one of the following is true?",
                "Efficient implementation of multi-user support is no longer possible",
                "The processor cache organization can be made more efficient now",
                "Hardware support for memory management is no longer needed",
                "CPU scheduling can be made more efficient now"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "63", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider three processes (process id 0, 1, 2 respectively) with compute time\n" +
                        "bursts 2, 4 and 8 time units. All processes arrive at time zero. Consider the\n" +
                        "longest remaining time first (LRTF) scheduling algorithm. In LRTF ties are broken\n" +
                        "by giving priority to the process with the lowest process id. The average turn\n" +
                        "around time is:",
                "13 units", "14 units", "15 units", "16 units"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "64", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider three processes, all arriving at time zero, with total execution time of\n" +
                        "10, 20 and 30 units, respectively. Each process spends the first 20% of execution\n" +
                        "time doing I/O, the next 70% of time doing computation, and the last 10% of\n" +
                        "time doing I/O again. The operating system uses a shortest remaining compute\n" +
                        "time first scheduling algorithm and schedules a new process either when the\n" +
                        "running process gets blocked on I/O or when the running process finishes its\n" +
                        "compute burst. Assume that all I/O operations can be overlapped as much as\n" +
                        "possible. For what percentage of time does the CPU remain idle?",
                "0%", "10.6%", "30.0%", "89.4%"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "65", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following snapshot of a system running n processes. Process i is\n" +
                        "holding $x_i$ instances of a resource R, 1 ≤ i ≤ n. currently, all instances of R are\n" +
                        "occupied. Further, for all i, process i has placed a request for an additional\n" +
                        "$y_i$ instances while holding the $x_i$ instances it already has. There are exactly two\n" +
                        "processes p and q such that  $Y_p = Y_q = 0.$ Which one of the following can serve as\n" +
                        "a necessary condition to guarantee that the system is not approaching a\n" +
                        "deadlock?",
                "min $(X_p, X_q)$ < $max_{k≠p,q} (Y_k)$",
                "$X_p + X_q$ ≥ $min_{k≠p,q} (Y_k)$",
                "max $(X_p, X_q)$ > 1",
                "min $(X_p, X_q)$ > 1"));

        explanation = getExplaination("");

        q = new Question(Q, "B", "66", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relation account (customer, balance) where customer is a primary key and there are no null values. We would like to rank customers according to decreasing balance. The customer with the largest balance gets rank 1. ties are not broke but ranks are skipped: if exactly two customers have the largest balance they each get rank 1 and rank 2 is not assigned$$ $$" +
                        getProgram("prog2006-qno-67.txt") +
                        "$$ $$Consider these statements about Query1 and Query2.$$ $$" +
                        "$$ $$1. Query1 will produce the same row set as Query2 for \n" +
                        "   some but not all databases.\n" +
                        "$$ $$2. Both Query1 and Query2 are correct implementation \n" +
                        "   of the specification\n" +
                        "$$ $$3. Query1 is a correct implementation of the specification\n" +
                        "   but Query2 is not\n" +
                        "$$ $$4. Neither Query1 nor Query2 is a correct implementation\n" +
                        "   of the specification\n" +
                        "$$ $$5. Assigning rank with a pure relational query takes \n" +
                        "   less time than scanning in decreasing balance order \n" +
                        "   assigning ranks using ODBC.$$ $$Which two of the above statements are correct? ",
                "2 and 5", "1 and 3", "1 and 4", "3 and 5"));


        explanation = getExplaination("Query 1 and Query 2 will give the same result if all the customers have distinct balance. So, for some databases, the result of query 1 and query 2 will be same. \n" +
                "  Now, let us consider a fact that all the entries in the database have the same value for balance. Ideally, all the customers should have rank 1, but both the queries will give all the customers a rank equal to the number of customers in the database. So, both the queries do not give us the required output. \n" +
                "  Thus, C is the correct choice. ");


        q = new Question(Q, "C", "67", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relation \"enrolled(student, course)\" in which (student, course) is the primary key, and the relation \"paid(student, amount)\" where student is the primary key. Assume no null values and no foreign keys or integrity constraints. Given the following four queries:$$ $$" +
                        getProgram("prog2006-qno-68.txt") +
                        "$$ $$Which one of the following statements is correct?",
                "All queries return identical row sets for any database",
                "Query2 and Query4 return identical row sets for all databases but there exist databases for which Query1 and Query2 return different row sets.",
                "There exist databases for which Query3 returns strictly fewer rows than Query2",
                "There exist databases for which Query4 will encounter an integrity violation at runtime."));
        q = new Question(Q, "A", "68", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relation enrolled(student, course) in which (student, course) is the primary key, and the relation paid(student, amount), where student is the primary key. Assume no null values and no foreign keys or integrity constraints. Assume that amounts 6000, 7000, 8000, 9000 and 10000 were each paid by 20% of the students. Consider these query plans (Plan 1 on left, Plan 2 on right) to \"list all courses taken by students who have paid more than x\".$$ $$" +
                        "<img src='" + path + "qno-69.png'/>" + "<img src='" + path + "qno-69-2.png'/>" +
                        "$$ $$A disk seek takes 4ms, disk data transfer bandwidth is 300 MB/s and checking a tuple to see if amount is greater than x takes 10 micro-seconds." +
                        " Which of the following statements is correct?$$ $$",
                "Plan 1 and Plan 2 will not output identical row sets for all databases.",
                "A course may be listed more than once in the output of Plan 1 for some databases",
                "For x = 5000, Plan 1 executes faster than Plan 2 for all databases.",
                "For x = 9000, Plan I executes slower than Plan 2 for all databases."));

        explanation = getExplaination("Assuming that large enough memory is available for all data needed. Both plans need to load both tables courses and enrolled. So disk access time is same for both plans.\n" +
                "$$ $$Plan 2 does lesser number of comparisons compared to plan 1.\n" +
                "$$ $$1) Join operation will require more comparisons as the second table will have more rows in plan 2 compared to plan 1.\n" +
                "$$ $$2) The joined table of two tables will will have more rows, so more comparisons are needed to find amounts greater than x.");

        q = new Question(Q, "C", "69", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following functional dependencies are given:" +
                        "$$ $$AB→CD, AF$→$D, DE→F, C→G, F→E, G→A$$ $$Which one of the following options is false?",
                "{CF}+ = {ACDEFG}", "{BG}+ = {ABCDG}", "{AF}+ = {ACDEFG}", "{AB}+ = {ABCDFG}"));
        q = new Question(Q, "C", "70", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 71, 72, 73:</B>$$ $$" +
                        "The $2^n$ vertices of a graph G corresponds to all subsets of a set of size n, for n ≥ 6 . " +
                        "Two vertices of G are adjacent if and only if the corresponding sets intersect in exactly two elements. " +
                        "$$ $$The number of vertices of degree zero in G is:",
                "$1$",
                "$n$",
                "$n+1$",
                "$2^n$"));

        explanation = getExplaination("There are n nodes which are single and 1 node which belong to empty set. And since they are not having 2 or more elements so they won’t be connected to anyone hence total number of nodes with degree 0 are n+1 hence answer should be none. Thanks to roger for the explanation.");

        q = new Question(Q, "C", "71", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 71, 72, 73:</B>$$ $$" +
                        "The $2^n$ vertices of a graph G corresponds to all subsets of a set of size n, for n ≥ 6. " +
                        "Two vertices of G are adjacent if and only if the corresponding sets intersect in exactly two elements. " +
                        "$$ $$The maximum degree of a vertex in G is:$$ $$" +
                        "",
                "$(\\table n\\/2; 2)2^{n\\/2}$",
                "$2^{n-2}$",
                "$2^{n-3}×3$",
                "$2^{n-1}$"));

        explanation = getExplaination("Let us take an example {a, b, c, d, e, f} The maximum degree would be of any vertex that corresponds to a sunset with half vertices. For example consider {a, b, c}. It has degree as 24. It intersects with 8 subsets with intersection as {a, b}. The subsets are {a, b}, {a, b, d}, {a, b, e}, {a, b, f}, {a, b, d, e}, {a, b, e, f}, {a, b, d, f} and {a, b, d, e, f}. Similarly, it intersects with 8 vertices with intersection as {a, c} and 8 more vertices with intersection as {b, c}. There are n/2 C 2 ways to pick two elements from a subset of size n/2. Every such subset can have intersection with $2^{n/2}$ other subsets.");

        q = new Question(Q, "A", "72", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 71, 72, 73:</B>$$ $$" +
                        "The $2^n$ vertices of a graph G corresponds to all subsets of a set of size n, for n ≥ 6. " +
                        "Two vertices of G are adjacent if and only if the corresponding sets intersect in exactly two elements. " +
                        "$$ $$The number of connected components in G is:",
                "$n$",
                "$n+2$",
                "$2^{n\\/2}$",
                "$2^n/n$"));

        explanation = getExplaination("n+1 nodes of the graph not connected to anyone as explained in question 70 while others are connected so total number of connected components are n+2 (n+1 connected components by each of the n+1 vertices plus 1 connected component by remaining vertices).");

        q = new Question(Q, "B", "73", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 74, 75:</B>$$ $$Consider two cache organizations: " +
                        "The first one is 32 KB 2-way set associative with 32-byte block size. The second one is of the " +
                        "same size but direct mapped. The size of an address is 32 bits in both cases. A 2-to-1 multiplexer has a" +
                        " latency of 0.6 ns while a kbit comparator has a latency of k/10 ns. The hit latency of the set associative " +
                        "organization is $h_1$ while that of the direct mapped one is $h_2.$" +
                        "$$ $$ The value of $h_1$ is:",
                "2.4 ns", "2.3 ns", "1.8 ns", "1.7 ns"));

        explanation = getExplaination("$$ $$Cache size = 32 KB = 32 * $2^{10}$ bytes Cache block size = 32 bytes Number of blocks = 2 \n" +
                "$$ $$Total combinations are : = cache size / (Number of blocks * block size) = 32 * $2^{10}$ / (2 * 32) = 512 = 2^{9} \n" +
                "$$ $$Therefore, number of index bits = 9 \n" +
                "$$ $$Since, cache block size is 32 bytes i.e. $2^5$ bytes. Number of offset bits = 5 \n" +
                "$$ $$So, number of tag bits = 32 – 9 – 5 = 18 \n" +
                "$$ $$Hit latency $(h_1)$ = 0.6 + (18 / 10) ns = 2.4 ns \n" +
                "$$ $$So option (A) is correct. ");

        q = new Question(Q, "A", "74", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 74, 75:</B>$$ $$Consider two cache organizations: " +
                        "The first one is 32 KB 2-way set associative with 32-byte block size. The second one is" +
                        " of the same size but direct mapped. The size of an address is 32 bits in both cases. A 2-to-1" +
                        " multiplexer has a latency of 0.6 ns while a kbit comparator has a latency of k/10 ns. The hit " +
                        "latency of the set associative organization is $h_1$ while that of the direct mapped one is $h_2.$ " +
                        "$$ $$The value of $h_2$ is:",
                "2.4 ns",
                "2.3 ns", "1.8 ns", "1.7 ns"));

        explanation = getExplaination("$$ $$Cache size = 32 KB = 32 * $2^{10}$ bytes Cache block size = 32 bytes Number of blocks = 1 \n" +
                "$$ $$Total combinations are : = cache size / (Number of blocks * block size) = 32 * 2^{10} / (1 * 32) = 1024 = 2^{10} \n" +
                "$$ $$Therefore, number of index bits = 10 \n" +
                "$$ $$Since, cache block size is 32 bytes i.e. $2^5$ bytes. Number of offset bits = 5 \n" +
                "$$ $$So, number of tag bits = 32 – 10 – 5 = 17 \n" +
                "$$ $$Hit latency $(h_2)$ = (17 / 10) ns = 1.7 ns \n" +
                " \n" +
                "$$ $$Thus, option (D) is correct. ");

        q = new Question(Q, "D", "75", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 76, 77:</B>$$ $$A 3-ary max heap is like a binary max heap, but instead of 2 children, nodes have 3 children. " +
                        "A 3-ary heap can be represented by an array as follows: The root is stored in the first location, a[0], " +
                        "nodes in the next level, from left to right, is stored from a[1] to a[3]. The nodes from the second level of " +
                        "the tree from left to right are stored from a[4] location onward. An item x can be inserted into a 3-ary heap " +
                        "containing n items by placing x in the location a[n] and pushing it up the tree to satisfy the heap property. " +
                        "$$ $$Which one of the following is a valid sequence of elements in an array representing 3-ary max heap?",
                "1, 3, 5, 6, 8, 9",
                "9, 6, 3, 1, 8, 5",
                "9, 3, 6, 8, 5, 1",
                "9, 5, 6, 8, 3, 1"));

        explanation = getExplaination("$$ $$3-ary Max Heap can be constructed from sequence given in option D" +
                getProgram("exp2006-qno-76.txt"));

        q = new Question(Q, "D", "76", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Common Data for Questions 76, 77:</B>$$ $$A 3-ary max heap is like a binary max heap, but instead of 2 children, nodes have 3 children." +
                        " A 3-ary heap can be represented by an array as follows: The root is stored in the first location, a[0], nodes in the next level, " +
                        "from left to right, is stored from a[1] to a[3]. The nodes from the second level of the tree from left to right are stored from a[4] " +
                        "location onward. An item x can be inserted into a 3-ary heap containing n items by placing x in the location a[n] and pushing it up the " +
                        "tree to satisfy the heap property. " +
                        "$$ $$Suppose the elements 7, 2, 10 and 4 are inserted, in that order, into the valid 3- ary max heap found in the previous question," +
                        " Which one of the following is the sequence of items in the array representing the resultant heap?",
                "10, 7, 9, 8, 3, 1, 5, 2, 6, 4", "10, 9, 8, 7, 6, 5, 4, 3, 2, 1",
                "10, 9, 4, 5, 7, 6, 8, 2, 1, 3", "10, 8, 6, 9, 7, 2, 3, 4, 1, 5"));

        explanation = getExplaination("$$ $$" +
                getProgram("exp2006-qno-77.txt"));

        q = new Question(Q, "A", "77", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 78 & 79:</B>$$ $$" +
                        "Barrier is a synchronization construct where a set of processes synchronizes globally i.e.\n" +
                        "each process in the set arrives at the barrier and waits for all others to arrive and then\n" +
                        "all processes leave the barrier. Let the number of processes in the set be three and S be\n" +
                        "a binary semaphore with the usual P and V functions. Consider the following C\n" +
                        "implementation of a barrier with line numbers shown on below.$$ $$" +
                        getProgram("prog2006-qno-78.txt") + "$$ $$The variables process_arrived and process_left are shared among all" +
                        " processes and are initialized to zero. In a concurrent program all the three processes call the barrier" +
                        " function when they need to synchronize globally.$$ $$ The above implementation of barrier is incorrect. Which one of the following is true?",
                "The barrier implementation is wrong due to the use of binary semaphore S",
                "The barrier implementation may lead to a deadlock if two barrier in invocations are used in immediate succession.",
                "Lines 6 to 10 need not be inside a critical section",
                "The barrier implementation is correct if there are only two processes instead of three."));

        explanation = getExplaination("$$ $$" +
                "It is possible that process_arrived becomes greater than 3. It will not be possible for process arrived to become 3 again, hence deadlock.");

        q = new Question(Q, "B", "78", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 78 & 79:</B>$$ $$" +
                        "Barrier is a synchronization construct where a set of processes synchronizes globally i.e. each process in the set arrives at the barrier and waits for all others to arrive and then all processes leave the barrier. Let the number of processes in the set be three and S be a binary semaphore with the usual P and V functions. Consider the following C implementation of a barrier with line numbers shown on below." +
                        "$$ $$" + getProgram("prog2006-qno-78.txt") + "The variables process_arrived and process_left are shared among all processes and are initialized to zero. In a concurrent program all the three processes call the barrier function when they need to synchronize globally." +
                        "$$ $$ Which one of the following rectifies the problem in the implementation?",
                "Lines 6 to 10 are simply replaced by process_arrived--",
                "At the beginning of the barrier the first process to enter the barrier waits\n" +
                        "until process_arrived becomes zero before proceeding to execute P(S).",
                "Context switch is disabled at the beginning of the barrier and re-enabled at\n" +
                        "the end.",
                "The variable process_left is made private instead of shared"));

        explanation = getExplaination("$$ $$" +
                "$$ $$Step ‘2’ should not be executed when the process enters the barrier second time till other two processes have not completed their 7th step. This is to prevent variable process_arrived becoming greater than 3. \n" +
                "$$ $$So, when variable process_arrived becomes zero and variable process_left also becomes zero then the problem of deadlock will be resolved. \n" +
                "$$ $$Thus, at the beginning of the barrier the first process to enter the barrier waits until process_arrived becomes zero before proceeding to execute P(S). \n" +
                " \n" +
                "$$ $$Thus, option (B) is correct. ");

        q = new Question(Q, "B", "79", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 80 & 81:</B>$$ $$" +
                        "A CPU has a 32 KB direct mapped cache with 128-byte block size. Suppose A is a two-dimensional array of size 512×512" +
                        " with elements that occupy 8-bytes each. Consider the following two C code segments, P1 and P2.$$ $$" +
                        getProgram("prog2006-qno-80.txt") + "$$ $$P1 and P2 are executed independently with the same initial state," +
                        " namely, the array A is not in the cache and i, j, x are in registers. Let the number of cache misses experienced " +
                        "by P1 be $M_1$ and that for P2 be $M_2 .$" +
                        "$$ $$ The value of $M_1$ is:",
                "0", "2048", "16384", "262144"));

        explanation = getExplaination("$$ $$" +
                "$$ $$[P1] runs the loops in a way that access elements of A in row major order and [P2] accesses elements in column major order. No of cache blocks = CacheSize/BlockSize = 32KB / 128 Byte = 256 No. of array elements in Each Block = BlockSize/ElementSize = 128 Byte / 8 Byte = 16 Total Misses for [P1] = ArraySize * (No. of array elements in Each Block) / (No of cache blocks) = 512 * 512 * 16 / 256 = 16384 ");

        q = new Question(Q, "C", "80", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 80 & 81:</B>$$ $$" +
                        "A CPU has a 32 KB direct mapped cache with 128-byte block size. Suppose A is a two-dimensional" +
                        " array of size 512×512 with elements that occupy 8-bytes each. Consider the following two C code" +
                        " segments, P1 and P2.$$ $$" +
                        getProgram("prog2006-qno-80.txt")
                        + "P1 and P2 are executed independently with the same initial state, namely, the array A " +
                        "" +
                        "is not in the cache and i, j, x are in registers. Let the number of cache misses experienced " +
                        "by P1 be $M_1$ and that for P2 be $M_2 .$ $$ $$ The value of the ratio $M_1/M_2$ is:",
                "$0$", "$1/16$", "$1/8$", "$16$"));

        explanation = getExplaination("$$ $$" +
                "$$ $$[P2] runs the loops in a way that access elements of A in row major order and [P2] accesses elements in column major order. No of cache blocks = CacheSize/BlockSize = 32KB / 128 Byte = 256 No. of array elements in Each Block = BlockSize/ElementSize = 128 Byte / 8 Byte = 16 Total Misses for [P1] = ArraySize * (No. of array elements in Each Block) / (No of cache blocks) = 512 * 512 * 16 / 256 = 16384 Total Misses for [P2] = Total Number of elements in array (For every element, there would be a miss) = 512 * 512 = 262144. Ration m1/m2 = 16384 / 262144 = 1/16.");


        q = new Question(Q, "B", "81",co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 83 & 82:</B>$$ $$" +
                        "Consider the diagram shown below where a number of LANs are connected by (transparent) bridges. In order to avoid packets looping through circuits in the graph, the bridges organize themselves in a spanning tree. First, the root bridge is identified as the bridge with the least serial number. Next, the root sends out (one or more) data units to enable the setting up of the spanning tree of shortest paths from the root bridge to each bridge. Each bridge identifies a port (the root port) through which it will forward frames to the root bridge. Port conflicts are always resolved in favour of the port with the lower index value. When there is a possibility of multiple bridges forwarding to the same LAN (but not through the root port), ties are broken as follows: bridges closest to the root get preference and between such bridges, the one with the lowest serial number is preferred.$$ $$" +
                        "<img src='" + path + "qno-82.png'/>" + "$$ $$For the given connection of LANs by bridges, which one of the following choices represents the depth first traversal of the spanning tree of bridges?",
                "B1, B5, B3, B4, B2", "B1, B3, B5, B2, B4", "B1, B5, B2, B3, B4", "B1, B3, B4, B5, B2"));

        explanation = getExplaination("$$ $$" +
                getProgram("exp2006-qno-76.txt") + "$$ $$Note that B4 and B2 are connected through B3 (Not B5) because B3 has lower serial number than B5. One DFS traversal of tree is B1 B5 B3 B4 B2 Hence Option A is the Answer");

        q = new Question(Q, "A", "82", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 83 & 82:</B>$$ $$" +
                        "Consider the diagram shown below where a number of LANs are connected by (transparent) bridges. In order to avoid packets looping through circuits in the graph, the bridges organize themselves in a spanning tree. First, the root bridge is identified as the bridge with the least serial number. Next, the root sends out (one or more) data units to enable the setting up of the spanning tree of shortest paths from the root bridge to each bridge. Each bridge identifies a port (the root port) through which it will forward frames to the root bridge. Port conflicts are always resolved in favour of the port with the lower index value. When there is a possibility of multiple bridges forwarding to the same LAN (but not through the root port), ties are broken as follows: bridges closest to the root get preference and between such bridges, the one with the lowest serial number is preferred.$$ $$" +
                        "<img src='" + path + "qno-82.png'/>" + "$$ $$Consider the data given in above question. Consider the correct spanning tree for the previous question. Let host H1 send out a broadcast ping packet. Which of the following options represents the correct forwarding table on B3?",
                MyTable(3, 2, getText(2, "Hosts", "Port", "H1,H2,H3,H4", "3", "H5,H6,H9,H10", "1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false),
                MyTable(5, 2, getText(2, "Hosts", "Port", "H1,H2", "4", "H3,H4", "3", "H5,H6", "1", "H7,H8,H9,H10,H11,H12", "2", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false),
                MyTable(5, 2, getText(2, "Hosts", "Port", "H3,H4", "3", "H5,H6,H9,H10", "1", "H1, H2", "4", " H7, H8, H11, H12", "2", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false),
                MyTable(4, 2, getText(2, "Hosts", "Port", "H1, H2, H3, H4", "3", "H5, H7, H9, H10", "1", "H7, H8, H11, H12", "4", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false)));

        explanation = getExplaination("$$ $$");

        q = new Question(Q, "A", "83", cn,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 84 & 85:</B>$$ $$" +
                        "Which one of the following grammars generates the language" +
                        "L = {$a^ib^j$ | i ≠ j}",
                "$$S→AC|CB$$ $$C→aCb|a|b$$ $$A→aA|∈$$ $$B→Bb|∈$$",
                "$$S→aS|Sb|a|b$$",
                "$$S→AC|CB$$ $$C→aCb|∈$$ $$A→aA|∈$$ $$B→Bb|∈$$",
                "$$S→AC|CB$$ $$C→aCb|∈$$ $$A→aA|a$$ $$B→Bb|b$$"));
        explanation = getExplaination("$$ $$" +
                "Language L contains the strings : {abb, aab, abbb, aabbb, aaabb, aa, bb, .......}, i.e, all a's appear before b's in a string, and \"number of a's\" is not equal to \"number of b's\", So i ≠ j.\n" +
                "$$ $$Here Grammar A, B & C also generate the string \"ab\", where i = j, and many more strings with i = j, hence these grammars do not generate the language L, because for a string that belongs to language L, exponent i should not be equal to exponent  j.\n" +
                "Grammar D : $$ $$This Grammar never generates a string with equal no of a's and b's, i.e. i=j. Hence this grammar generates the language L. Hence Option D.");

        q = new Question(Q, "D", "84",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Questions 84 & 85:</B>$$ $$" +
                        "In the correct grammar of previous question, what is " +
                        "the length of the derivation (number of steps starring from S) to generate the string $a^lb^m$ with l ≠ m?",
                "max(l,m) + 2",
                "l + m + 2",
                "l + m + 3",
                "max(l, m) + 3"));

        explanation = getExplaination("");

        q = new Question(Q, "A", "85", toc,marks, year, explanation, false);
        this.addQuestion(q);
    }



    //**** 2007 questions starts *****//



    private void addQuestions2007() {
        year = "2007";
        path = "file:///android_asset/2007/";
        marks="1";

        Q = getQuestion(getstring("Consider the following two statements about the function f (x) = |x| : $$ $$" +
                        "P. f (x) is continuous for all real values of x$$ $$" +
                        "Q. f (x) is differentiable for all real values of x$$ $$Which of the following is TRUE?",
                "P is true and Q is false.", "P is false and Q is true.", "Both P and Q are true.", "Both P and Q are false."));

        explanation = getExplaination("");

        q = new Question(Q, "A", "1", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let S be a set of n elements. The number of ordered pairs in the largest and the\n" +
                        "smallest equivalence relations on S are:",
                "$n\\ and\\ n$", "$n^2\\ and\\ n$", "$n^2\\ and\\ 0$", "$n\\ and\\ 1$"));
        explanation = getExplaination("");

        q = new Question(Q, "B", "2",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the maximum number of different Boolean functions involving n Boolean\n" +
                        "variables?",
                "$n^2$", "$2^n$", "$2^{2^n}$", "$2^{n^2}$"));

        explanation = getExplaination("");

        q = new Question(Q, "C", "3",  digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be the non-planar graph with the minimum possible number of edges. Then\n" +
                        "G has",
                "9 edges and 5 vertices", "9 edges and 6 vertices",
                "10 edges and 5 vertices", "10 edges and 6 vertices"));

        explanation = getExplaination("");
        q = new Question(Q, "B", "4",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the DAG with Consider V = {1, 2, 3, 4, 5, 6}, shown below. Which of the following is NOT a topological ordering?" +
                        "$$ $$<img src='" + path + "qno-5.png'/>",
                "1 2 3 4 5 6", "1 3 2 4 5 6", "1 3 2 4 6 5", "3 2 4 1 6 5"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "5",  algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following problems is undecidable?",
                "Membership problem for CFGs.", "Ambiguity problem for CFGs.",
                "Finiteness problem for FSAs.", "Equivalence problem for FSAs"));

        explanation = getExplaination("");
        q = new Question(Q, "B", "6",  toc, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is TRUE?",
                "Every subset of a regular set is regular.", "Every finite subset of a non-regular set is regular.",
                "The union of two non-regular sets is not regular.", "Infinite union of finite sets is regular."));

        explanation = getExplaination("");
        q = new Question(Q, "B", "7",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("How many 3-to-8 line decoders with an enable input are needed to construct a 6-\n" +
                        "to-64 line decoder without using any other logic gates?",
                "7", "8", "9", "10"));

        explanation = getExplaination("");
        q = new Question(Q, "C", "8",  digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following Boolean function of four variables:$$ $$" +
                        "f (w, x, y, z) = ∑(1,3,4,6,9,11,12,14)$$ $$The function is:",
                "independent of one variables.", "independent of two variables.",
                "independent of three variables.", "dependent on all the variables."));

        explanation = getExplaination("");
        q = new Question(Q, "B", "9",  digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a 4-way set associative cache consisting of 128 lines with a line size of\n" +
                        "64 words. The CPU generates a 20-bit address of a word in main memory. The\n" +
                        "number of bits in the TAG, LINE and WORD fields are respectively:",
                "9,6,5", "7,7,6", "7,5,8", "9,5,6"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "10",  co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a disk pack with 16 surfaces, 128 tracks per surface and 256 sectors\n" +
                        "per track. 512 bytes of data are stored in a bit serial manner in a sector. The\n" +
                        "capacity of the disk pack and the number of bits required to specify a particular\n" +
                        "sector in the disk are respectively:",
                "256 Mbyte, 19 bits", "256 Mbyte, 28 bits",
                "512 Mbyte, 20 bits", "64 Gbyte, 28 bits"));

        explanation = getExplaination("");
        q = new Question(Q, "A", "11",  co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The height of a binary tree is the maximum number of edges in any root to leaf\n" +
                        "path. The maximum number of nodes in a binary tree of height h is:",
                "$2^h-1$", "$2^{h-1}-1$", "$2^{h+1}-1$", "$2^{h+1}$"));

        explanation = getExplaination("");
        q = new Question(Q, "C", "12",  algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The maximum number of binary trees that can be formed with three unlabeled\n" +
                        "nodes is:",
                "1", "5", "4", "3"));

        explanation = getExplaination("");
        q = new Question(Q, "B", "13",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following sorting algorithms has the lowest worst-case complexity?",
                "Merge sort", "Bubble sort", "Quick sort", "Selection sort"));

        explanation = getExplaination("");
        q = new Question(Q, "A", "14",  algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following segment of C-code:$$ $$" +
                        getProgram(year + "/prog2007-qno-15.txt") + "The number of comparisons made in the execution of the loop" +
                        " for any n > 0 is: Base of Log is 2 in all options.",
                "$⌈log_2 n⌉$", "$n$", "$⌈log_2 n⌉+1$", "$⌊log_2 n⌋$+1"));
        q = new Question(Q, "D", "15",  algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Group 1 contains some CPU scheduling algorithms and Group 2 contains some applications. Match entries in Group 1 to entries in Group 2." +
                        MyTable(4, 2, getText(2, "Group I", "Group II", "(P) Gang Scheduling", "(1) Guaranteed Scheduling", "(Q) Rate Monotonic Scheduling", "(2) Real-time Scheduling", "(R) Fair Share Scheduling ", "(3) Thread Scheduling", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) + "",
                "P – 3 Q – 2 R – 1", "P – 1 Q – 2 R – 3", "P – 2 Q – 3 R – 1", "P – 1 Q – 3 R – 2"));

        explanation = getExplaination("");
        q = new Question(Q, "A", "16", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following statements about user level threads and kernel level threads. Which one of the following statement is FALSE?",
                "Context switch time is longer for kernel level threads than for user level threads.",
                "User level threads do not need any hardware support.",
                "Related kernel level threads can be scheduled on different processors in a multi-processor system.",
                "Blocking one kernel level thread blocks all related threads."));

        explanation = getExplaination("");
        q = new Question(Q, "D", "17", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is a top-down parser?",
                "Recursive descent parser", "Operator precedence parser", "An LR(k) parser", "An LALR(k) parser"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "18",com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In Ethernet when Manchester encoding is used, the bit rate is:",
                "Half the baud rate.", "Twice the baud rate.",
                "Same as the baud rate.", "None of the above."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "19", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following uses UDP as the transport protocol?",
                "HTTP", "Telnet", "DNS", "SMTP"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "20", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("How many different non-isomorphic Abelian groups of order 4 are there",
                "2", "3", "4", "5"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "21", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let Graph(x) be a predicate which denotes that x is a graph. " +
                        "Let Connected(x) be a predicate which denotes that x is connected. " +
                        "Which of the following first order logic sentences DOES NOT represent the statement: " +
                        "“Not every graph is connected”?",
                "¬∀x(Graph(x)=>connected(x))",
                "∃x(Graph(x)∧¬Connected(x))",
                "¬∀x(¬Graph(x) ∨ connected(x))",
                "∀x(Graph(x) => ¬connected(x))"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "22", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following graphs has an Eulerian circuit?",
                "Any k-regular graph where k is an even number.", "A complete graph on 90 vertices.",
                "The complement of a cycle on 25 vertices.", "None of the above"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "23",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose we uniformly and randomly select a permutation from the 20! Permutations of 1, 2, 3 ,…..,20. What is the probability that 2 appears at an earlier position than any other even number in the selected permutation?",
                "$1/2$", "$1/10$", "$9!/20!$", "None of these"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "24",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let A be a 4 x 4 matrix with eigenvalues -5, -2, 1, 4. Which of the following is an eigen value of" +
                        "$[\\table A,I;I,A]$ where I is the 4 x 4 identity matrix?",
                "-5", "-7",
                "2", "1"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "25",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the set S = {a,b,c,d}. Consider the following 4 partitions $π_1, π_2, π_3, π_4$ on" +
                        " S:<br/> $π_1=\\{\\ov{abcd}\\},$<br/> $π_2=\\{\\ov{ab},\\ov{cd}\\},$<br/> $π_3=\\{\\ov{abc},\\ov{d}\\},$<br/> $π_4=\\{\\ov{a},\\ov{b},\\ov{c},\\ov{d}\\}.$" +
                        "<br/>Let p be the partial\n" +
                        "order on the set of partitions  S' = $\\{π_1, π_2, π_3, π_4\\}$ defined as follows: $π_i$ p $π_j$ if and\n" +
                        "only if \n" +
                        "$π_i$ refines  $π_j.$ The poset diagram for (S',p)  is:",
                "$$ $$    <img src='" + path + "qno-26-1.png'/>", "$$ $$    <img src='" + path + "qno-26-2.png'/>",
                "$$ $$    <img src='" + path + "qno-26-3.png'/>", "$$ $$    <img src='" + path + "qno-26-4.png'/>"));

        explanation = getExplaination("");
        q = new Question(Q, "C", "26", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the set of (column) vectors defined by" +
                        "<br/> $X={x∈R^3|x_1+x_2+x_3=0,$ where $x^T$=$[x_1,x_2,x_3]^T$}.<br/> Which of the following is TRUE?",
                "{$[1,-1,0]^T$, $[1,0,-1]^T$} is a basis for the subspace X.",
                "{$[1,-1,0]^T$, $[1,0,-1]^T$} is a linearly independent set, but" +
                        " it does not span X and therefore is not a basis of X.",
                "X is not a subspace of $R^3$",
                "None of the above."));

        explanation = getExplaination("");
        q = new Question(Q, "A", "27", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the series $X_{n+1}$ = $X_n/2$ + $9/(8 X_n),$ $X_0$ = 0.5 obtained from the Newton-Raphson method. The series converges to",
                "1.5", "$√2$", "1.6", "1.4"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "28", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A minimum state deterministic finite automaton accepting the language " +
                        "<br/>L={w | w ∈ {0,1} *, number of 0's and 1's in w are divisible by 3 and 5, respectively} has",
                "15 states", "11 states", "10 states", "9 states"));

        explanation = getExplaination("");
        q = new Question(Q, "A", "29",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The language L= ${0^i21^i | i ≥ 0 }$ over the alphabet {0,1, 2} is:",
                "not recursive", "is recursive and is a deterministic CFL",
                "is a regular language", "is not a deterministic CFL but a CFL"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "30", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following languages is regular? ",
                "{$ww^R|w $ ∈ {0,1}+}",
                "{$ww^Rx|x,w$ ∈ {0,1}+}",
                "{$wxw^R|x,w$ ∈ {0,1}+}",
                "{$xww^R|x,w$ ∈ {0,1}+}"));

        explanation = getExplaination("");
        q = new Question(Q, "C", "31",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let f(w, x, y, z) = ∑(0, 4, 5, 7, 8, 9, 13, 15). " +
                        "Which of the following expressions are NOT equivalent to f?"+
                        "<br/>P. x'y'z' + w'xy' + wy'z + xz" +
                        "<br/>Q. w'y'z' + wx'y' + xz"+
                        "<br/>R. w'y'z' + wx'y' + xyz + xy'z"+
                        "<br/>S. x'y'z' + wx'y' + w'y<br/>",
                "P only",
                "Q and S",
                "R and S",
                "S only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Define the connective * for the Boolean variables X and Y as: X * Y = XY + X' Y'. Let Z = X * Y." +
                        "$$ $$Consider the following expressions P, Q and R.\n" +
                        "<br/>$P: X = Y*Z$ \n" +
                        " <br/> $Q: Y = X*Z$ \n" +
                        " <br/> $R: X*Y*Z=1$ $$ $$Which of the following is TRUE?",
                "Only P and Q are valid",
                "Only Q and R are valid.",
                "Only P and R are valid.",
                "All P, Q, R are valid."));

        explanation = getExplaination("");
        q = new Question(Q, "D", "33", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose only one multiplexer and one inverter are allowed to be used to implement any Boolean function of n variables. What is the minimum size of the multiplexer needed?",
                "$2^n$ line to 1 line", "$2^{n+1}$ line to 1 line",
                "$2^{n-1}$ line to 1 line", "$2^{n-2}$ line to 1 line"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "34", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a look-ahead carry generator, the carry generate function $G_i$ and the carry propagate function $P_i$ for inputs $A_i$ and $B_i$ are given by:" +
                        "$$ $$ $P_i$ = $A_i$ ⊕ $B_i$ and $G_i$ = $A_iB_i$ $$ $$" +
                        "The expressions for the sum bit $S_i$ and the carry bit $C_{i+1}$ of the look-ahead carry adder are given by:$$ $$" +
                        "$S_i$ = $P_i$ ⊕ $C_i$ and $C_{i+1}$ = $G_i$ + $P_iC_i ,$ where $C_0$ is the input carry. " +
                        "$$ $$Consider a two-level logic implementation of the look-ahead carry generator. Assume that all $P_i$ and $G_i$ are available for the carry generator circuit and that the AND and OR gates can have any number of inputs. The number of AND gates and OR gates needed to implement the look-ahead carry generator for a 4-bit adder with $S_3, S_2, S_1, S_0$ and $C_4$ as its outputs are respectively:",
                "6, 3", "10, 4", "6, 4", "10, 5"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "35", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The control signal functions of a 4-bit binary counter are given below (where X is “don’t care”) The counter is connected as follows:" +
                        MyTable(5, 5, getText(5, "Clear", "Clock", "Load", "Count", "Function", "1", "X", "X", "X", "Clear to 0",
                                "0", "X", "0", "0", "No Change", "0", "↑", "1", "X", "Load input", "0", "↑", "0", "1", "Count next", "", "", "", "", ""), true, false) +
                        "$$ $$The counter is connected as follows:$$ $$<img src='" + path + "qno-36.png'/>$$ $$" +
                        "Assume that the counter and gate delays are negligible. If the counter starts at 0, then it cycles through the following sequence:",
                "0, 3, 4", "0, 3, 4, 5",
                "0, 1, 2, 3, 4", "0, 1, 2, 3, 4, 5"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "36", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a pipelined processor with the following four stages:" +
                        getProgram(year + "/prog2007-qno-37.txt") + "The IF, ID and WB stages take one clock cycle each to complete the operation. The number of clock cycles for the EX stage dependson the instruction. The ADD and SUB instructions need 1 clock cycle and the MUL instruction needs 3 clock cycles in the EX stage. Operand forwarding is used in the pipelined processor. What is the number of clock cycles taken to complete the following sequence of instructions?" +
                        getProgram(year + "/prog2007-qno-37-1.txt") + "",
                "7", "8",
                "10", "14"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "37", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following postfix expression with single digit operands is evaluated using a stack:" +
                        "$$ $$8 2 3 ^ / 2 3 * + 5 1 * - $$ $$Note that ^ is the exponentiation operator. " +
                        "The top two elements of the stack after the first * is evaluated are:",
                "6, 1", "5, 7", "3, 2", "1, 5"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "38", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The inorder and preorder traversal of a binary tree are" +
                        "<br/> d b e a f c g and a b d e c f g, respectively." +
                        " $$ $$The postorder traversal of the binary tree is:",
                "d e b f g c a", "e d b g f c a", "e d b f g c a", "d e f g b c a"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "39", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a hash table of size seven, with starting index zero, and a hash function (3x + 4)mod7. Assuming the hash table is initially empty, which of the following is the contents of the table when the sequence 1, 3, 8, 10 is inserted into the table using closed hashing? Note that ‘_’ denotes an empty location in the table.",
                "8, _, _, _, _, _, 10", "1, 8, 10, _, _, _, 3",
                "1, _, _, _, _, _,3", "1, 10, 8, _, _, _, 3"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "40", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In an unweighted, undirected connected graph, the shortest path from a node S\n" +
                        "to every other node is computed most efficiently, in terms of time complexity, by",
                "Dijkstra’s algorithm starting from S.",
                "Warshall’s algorithm",
                "Performing a DFS starting from S.",
                "Performing a BFS starting from S."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "41",algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C function, what is the output?" +
                        getProgram(year + "/prog2007-qno-42.txt") + "",
                "5", "7",
                "9", "18"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "42", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A complete n-ary tree is a tree in which each node has n children or no children." +
                        " Let I be the number of internal nodes and L be the number of leaves in a complete n-ary tree. " +
                        "If L = 41, and I = 10, what is the value of n?",
                "3", "4",
                "5", "6"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "43", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the following C function, let n ≥ m." +
                        getProgram(year + "/prog2007-qno-44.txt") + "How many recursive calls are made by this function?",
                "$Θ (log_2 n)$", "$Ω(n)$",
                "$Θ(log_2 log_2 n)$", "$Θ(√n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "44", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the time complexity of the following recursive function:" +
                        getProgram(year + "/prog2007-qno-45.txt") + "",
                "$Θ (n^2)$", "$Θ(nlog_2 n)$",
                "$Θ(log_2 n)$", "$Θ(log_2 log_2 n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "45", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program segment where CellNode represents a node in a binary tree:" +
                        getProgram(year + "/prog2007-qno-46.txt") + "The value returned by GetValue() when a pointer to the root" +
                        " of a binary tree is passed as its argument is:",
                "the number of nodes in the tree",
                "the number of internal nodes in the tree",
                "the number of leaf nodes in the tree",
                "the height of the tree"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "46", ds, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Consider the process of inserting an element into a Max Heap, where the Max Heap is represented by an array. Suppose we perform a binary search on the path from the new leaf to the root to find the position for the newly inserted element, the number of comparisons performed is:",
                "$Θ(log_2 n)$", "$Θ (log_2 log_2 n)$", "$Θ (n)$", "$Θ (nlog_2 n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "47", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is TRUE about formulae in Conjunctive Normal Form?",
                "For any formula, there is a truth assignment for which at least half the clauses evaluate to true.",
                "For any formula, there is a truth assignment for which all the clauses evaluate to true",
                "There is a formula such that for each truth assignment, at most one-fourth of the clauses evaluate to true.",
                "None of the above"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "48", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let w be the minimum weight among all edge weights in an undirected connected graph. Let e be a specific edge of weight w . Which of the following is FALSE?",
                "There is a minimum spanning tree containing e.",
                "If e is not in a minimum spanning tree T, then in the cycle formed by adding e to T, all edges have the same weight.",
                "Every minimum spanning tree has an edge of weight w.",
                "e is present in every minimum spanning tree"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "49", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An array of n numbers is given, where n is an even number. The maximum as well as the " +
                        "minimum of these n numbers needs to be determined. " +
                        "Which of the following is TRUE about the number of comparisons needed?",
                "At least 2n - c comparisons, for some constant c, are needed.",
                "At most 1.5n - 2 comparisons are needed.",
                "At least n Log 2n comparisons are needed.",
                "None of the above."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "50", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program segment$$ $$" +
                        getProgram(year + "/prog2007-qno-51.txt") + "$$ $$Let T(n) denotes the number of times the for loop is executed by the program on input n. Which of the following is TRUE?",
                " T(n) = O($(√n)$) and T(n) = Ω($(√n)$)",
                "T(n) = O($(√n)$) and T(n) = Ω(1) ",
                " T(n) = O$(n)$ and T(n) = Ω($(√n)$)",
                "None of the above"));

        explanation = getExplaination("");
        q = new Question(Q, "B", "51", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the grammar with non-terminals N = {$S,C,S_1$},terminals T={a,b,i,t,e}," +
                        " with S as the start symbol, and the following set of rules:" +
                        getProgram(year + "/prog2007-qno-52.txt") + "$$ $$The grammar is NOT  LL(1) because:",
                "it is left recursive",
                "it is right recursive",
                "it is ambiguous",
                "It is not context-free."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "52", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following two statements:$$ $$" +
                        "P: Every regular grammar is LL(1)\n" +
                        "$$ $$Q: Every regular set has a LR(1) grammar$$ $$Which of the following is TRUE?",
                "Both P and Q are true",
                "P is true and Q is false",
                "P is false and Q is true",
                "Both P and Q are false"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "53", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a simplified computer the instructions are:" +
                        "$$ $$<B>OP $R_j,R_i$ :-</B> Performs  $R_j$ OP $R_i$ and stores the result in register $R_i$." +
                        "$$ $$<B>OP $m,R_i$ :-</B> Performs val  OP $R_i$ and stores the result in  $R_i$. val\n" +
                        "<br/>denotes the content of memory location m." +
                        "$$ $$<B>MOV $m,R_i$ :-</B> Moves the content of memory location m to register $R_i$." +
                        "$$ $$<B>MOV $R_i,m$ :-</B> Moves the content of register $R_i$ to memory location m." +
                        "$$ $$The computer has only to registers, and OP is either ADD or SUB. Consider the\n" +
                        "following basic block:$$ $$ $t_1=a+b$ $$ $$ $t_2=c+d$ $$ $$ $t_3=e-t_2$ $$ $$ $t_4=t_1-t_3$" +
                        "$$ $$Assume that all operands are initially in memory. The final value of the\n" +
                        "computation should be in memory. What is the minimum number of MOV\n" +
                        "instructions in the code generated for this basic block?",
                "2",
                "3",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "54", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An operating system uses Shortest Remaining Time first (SRT) process\n" +
                        "scheduling algorithm. Consider the arrival times and execution times for the\n" +
                        "following processes:$$ $$" +
                        MyTable(5, 3, getText(3, "Process", "Execution time", "Arrival time", "P1", "20", "0", "P2", "25", "15", "P3", "10", "30", "P4", "15", "45", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$What is the total waiting time for process P2?",
                "5",
                "15",
                "40",
                "55"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "55", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A virtual memory system uses First In First Out (FIFO) page replacement policy and allocates a fixed number of frames to a process. Consider the following statements:$$ $$" +
                        "<B>P:</B> Increasing the number of page frames allocated to a \n" +
                        "   process sometimes increases the page fault rate." +
                        "$$ $$<B>Q:</B> Some programs do not exhibit locality of reference.$$ $$Which one of the following is TRUE? ",
                "Both P and Q are true, and Q is the reason for P",
                "Both P and Q are true, but Q is not the reason for P.",
                "P is false, but Q is true",
                "Both P and Q are false"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "56", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A single processor system has three resource types X, Y and Z, which are shared by three processes. There are 5 units of each resource type. Consider the following scenario, where the column alloc denotes the number of units of each resource type allocated to each process, and the column request denotes the number of units of each resource type requested by a process in order to complete execution. Which of these processes will finish LAST?" +
                        "$$ $$<B>Alloc :-</B>" + MyTable(4, 4, getText(4, "", "X", "Y", "Z", "P0", "1", "2", "1", "P1", "2", "0", "1", "P2", "2", "2", "1", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, true) +
                        "$$ $$<B>Request :-</B>" + MyTable(4, 4, getText(4, "", "X", "Y", "Z", "P0", "1", "0", "3", "P1", "0", "1", "2", "P2", "1", "2", "0", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, true) + "",
                "P0",
                "P1",
                "P2",
                "None of the above, since the system is in a deadlock"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "57", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Two processes, P1 and P2, need to access a critical section of code. Consider the following synchronization construct used by the processes:" +
                        getProgram(year + "/prog2007-qno-58.txt") + "Here, wants1 and wants2 are shared variables, which are initialized to false. Which one of the following statements is TRUE about the above construct?",
                "It does not ensure mutual exclusion.",
                "It does not ensure bounded waiting.",
                "It requires that processes enter the critical section in strict alternation.",
                "It does not prevent deadlocks, but ensures mutual exclusion."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "58", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Information about a collection of students is given by the relation <B>studinfo</B>(<U>studId,</U> name, sex). The relation <B>enroll</B>(<U>studId, courseId</U>) gives which student has enrolled for (or taken) that course(s). Assume that every course is taken by at least one male and at least one female student. What does the following relational algebra expression represent?" +
                        "$$ $$ $∏_{courseId}((∏_{studId}(σ_{sex=\"female\"}(studInfo))$ × $∏_{courseId}(enroll))-enroll)$",
                "Courses in which all the female students are enrolled.",
                "Courses in which a proper subset of female students are enrolled.",
                "Courses in which only male students are enrolled.",
                "None of the above."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "59", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relation <B>employee</B>(<U>name</U>, sex, supervisorName) with name as the key. supervisorName gives the name of the supervisor of the employee under consideration. What does the following Tuple Relational Calculus query produce?" +
                        "$$ $$ {e.name|employee(e)∧} (∀x)[¬employee(x) ∨ x.supervisorName ≠ e.name ∨ x.sex=\"male\"]}",
                "Names of employees with a male supervisor.",
                "Names of employees with no immediate male subordinates.",
                "Names of employees with no immediate female subordinates.",
                "Names of employees with a female supervisor."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "60", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the table <B>employee</B>(<U>empId</U>, name, department, salary) and the two queries $Q_1 ,Q_2$ below. Assuming that department 5 has more than one employee, and we want to find the employees who get higher salary than anyone in the department 5, which one of the statements is TRUE for any arbitrary employee table?" +
                        "$$ $$" + getProgram(year + "/prog2007-qno-61.txt"),
                "$Q_1$ is the correct query",
                "$Q_2$ is the correct query",
                "Both $Q_1$ and $Q_2$ produce the same answer.",
                "Neither $Q_1$ nor $Q_2$ is the correct query"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "61", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following statements if FALSE?",
                "Any relation with two attributes is in BCNF.",
                "A relation in which every key has only one attribute is in 2NF.",
                "A prime attribute can be transitively dependent on a key in a 3 NF relation.",
                "A prime attribute can be transitively dependent on a key in a BCNF relation."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "62", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The order of a leaf node in a $B^+$ -tree is the maximum number of (value, data record pointer) " +
                        "pairs it can hold. Given that the block size is 1K bytes, data record pointer is 7 bytes long, the " +
                        "value field is 9 bytes long and a block pointer is 6 bytes long, what is the order of the leaf node?",
                "63", "64", "67", "68"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "63", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following schedules involving two transactions. Which one of the following statements is TRUE?" +
                        "$$ $$ $S_1:r_1(X);r_1(Y);r_2(X);r_2(Y);w_2(Y);w_1(X)$" +
                        "$$ $$ $S_2:r_1(X);r_2(X);r_2(Y);w_2(Y);r_1(Y);w_1(X)$",
                "Both $S_1$ and $S_2$ are conflict serializable",
                "$S_1$ is conflict serializable and $S_2$ is not conflict serializable.",
                "$S_1$ is not conflict serializable and $S_2$ is conflict serializable.",
                "Both $S_1$ and $S_2$ are not conflict serializable."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "64", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("There are n stations in a slotted LAN. Each station attempts to transmit with a probability p in each time slot. What is the probability that ONLY one station transmits in a given time slot?" +
                        "",
                "$np(1-p)^{n-1}$", "$(1-p)^{n-1}$",
                "$p(1-p)^{n-1}$", "$1-(1-p)^{n-1}$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "65", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a token ring network the transmission speed is $10^7$ bps and the propagation speed is " +
                        "200 metres/micro second. The 1-bit delay in this network is equivalent to:",
                "500 metres of cable.",
                "200 metres of cable",
                "20 metres of cable",
                "50 metres of cable."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "66", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The address of a class B host is to be split into subnets with a 6-bit subnet number. " +
                        "What is the maximum number of subnets and the maximum number of hosts in each subnet?",
                "62 subnets and 262142 hosts.",
                "64 subnets and 262142 hosts",
                "62 subnets and 1022 hosts",
                "64 subnets and 1024 hosts."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "67", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The message 11001001 is to be transmitted using the CRC polynomial $x^3 + 1$ " +
                        "to protect it from errors. The message that should be transmitted is:",
                "11001001000",
                "11001001011",
                "11001010",
                "110010010011"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "68", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The distance between two stations M and N is L kilometers. All frames are K bits long. The propagation delay per kilometer is t seconds. Let R bits/second be the channel capacity. Assuming that processing delay is negligible, the minimum number of bits for the sequence number field in a frame for maximum utilization, when the sliding window protocolis used, is:" +
                        "",
                "$⌈log_2 {2LtR+2k}/K⌉$", "$⌈log_2 {2LtR}/K⌉$",
                "$⌈log_2 {2LtR+K}/K⌉$", "$⌈log_2 {2LtR+K}/{2K}⌉$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "69",cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the following:$$ $$" +
                        MyTable(5, 2, getText(2, "(P) SMTP", "(1) Application layer", "(Q) BGP", "(2) Transport layer", "(R) TCP", "(3) Data link layer", "(S) PPP", "(4) Network layer", "", "(5) Physical layer ", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false) + "",
                "P – 2 Q – 1 R – 3 S – 5", "P – 1 Q – 4 R – 2 S – 3",
                "P – 1 Q – 4 R – 2 S – 5", "P – 2 Q – 4 R – 1 S – 3"));

        explanation = getExplaination("");
        q = new Question(Q, "B", "70", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 71,72 &73 </B>$$ $$Consider the following program segment. Here R1, R2 and R3 are the general purpose registers.$$ $$" +
                        getProgram(year + "/prog2007-qno-71.txt") + "$$ $$Assume that the content of memory location 3000 is 10 and the content of the register\n" +
                        "R3 is 2000. The content of each of the memory locations from 2000 to 2010 is 100. The\n" +
                        "program is loaded from the memory location 1000. All the numbers are in decimal.$$ $$" +
                        "Assume that the memory is word addressable. The number of memory references\n" +
                        "for accessing the data in executing the program completely is:" +
                        "",
                "10", "11",
                "20", "21"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "71", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 71,72 & 73 </B>$$ $$Consider the following program segment. Here R1, R2 and R3 are the general purpose registers.$$ $$" +
                        getProgram(year + "/prog2007-qno-71.txt") + "$$ $$Assume that the content of memory location 3000 is 10 and the content of the register\n" +
                        "R3 is 2000. The content of each of the memory locations from 2000 to 2010 is 100. The\n" +
                        "program is loaded from the memory location 1000. All the numbers are in decimal.$$ $$" +
                        "Assume that the memory is word addressable. After the execution of this" +
                        "program, the content of memory location 2010 is:" +
                        "",
                "100", "101",
                "102", "110"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "72", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 71,72 & 73 </B>$$ $$Consider the following program segment. Here R1, R2 and R3 are the general purpose registers.$$ $$" +
                        getProgram(year + "/prog2007-qno-71.txt") + "$$ $$Assume that the content of memory location 3000 is 10 and the content of the register\n" +
                        "R3 is 2000. The content of each of the memory locations from 2000 to 2010 is 100. The\n" +
                        "program is loaded from the memory location 1000. All the numbers are in decimal.$$ $$" +
                        "Assume that the memory is byte addressable and the word size is 32 bits. If an\n" +
                        "interrupt occurs during the execution of the instruction “INC R3”, what return\n" +
                        "address will be pushed on to the stack?" +
                        "",
                "1005", "1020",
                "1024", "1040"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "73", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 74 & 75 </B>$$ $$Consider the following Finite State Automaton:$$ $$" +
                        "<img src='" + path + "qno-74.png'/>" +
                        "$$ $$The language accepted by this automaton is given by the regular expression",
                "$b^*ab^*ab^*ab^*$",
                "$(a+b)^*$",
                "$b^*a(a+b)^*$",
                "$b^*ab^*ab^*$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "74", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 74 & 75 </B>$$ $$Consider the following Finite State Automaton:$$ $$" +
                        "<img src='" + path + "qno-74.png'/>" +
                        "$$ $$The minimum state automaton equivalent to the above FSA has the following\n" +
                        "number of states",
                "1",
                "2",
                "3",
                "4"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "75", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 76 & 77 </B>$$ $$Suppose the letters a, b, c, d, e, f have probabilities $1/2, 1/4, 1/8, 1/16, 1/32, 1/32$ respectively. $$ $$" +
                        "Which of the following is the Huffman code for the letter a, b, c, d, e, f?" +
                        "",
                "0, 10, 110, 1110, 11110, 11111",
                "11, 10, 011, 010, 001, 000",
                "11, 10, 01, 001, 0001, 0000",
                "110, 100, 010, 000, 001, 111"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "76", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 76 & 77 </B>$$ $$Suppose the letters a, b, c, d, e, f have probabilities $1/2, 1/4, 1/8, 1/16, 1/32, 1/32$ respectively. $$ $$" +
                        "$$ $$What is the average length of the  correct answer to previous question?" +
                        "",
                "3",
                "2.1875",
                "2.25",
                "1.9375"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "77", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 78 & 79 </B>$$ $$Consider the CFG with {S,A,B) as the non-terminal alphabet, {a,b) as the terminal alphabet, S as the start symbol and the following set of production rules:" +
                        getProgram(year + "/prog2007-qno-78.txt") +
                        "Which of the following strings is generated by the grammar?",
                "aaaabb",
                "aabbbb",
                "aabbab",
                "abbbba"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "78", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 78 & 79 </B>$$ $$Consider the CFG with {S,A,B) as the non-terminal alphabet, {a,b) as the terminal alphabet, S as the start symbol and the following set of production rules:" +
                        getProgram(year + "/prog2007-qno-78.txt") +
                        "For the correct answer strings to previous question, how many derivation trees are there?",
                "1",
                "2",
                "3",
                "4"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "79", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 80 & 81 </B>$$ $$Consider a machine with a byte addressable main memory of $ 2^16$ bytes. Assume that a\n" +
                        "direct mapped data cache consisting of 32 lines of 64 bytes each is used in the system.\n" +
                        "A 50 × 50 two-dimensional array of bytes is stored in the main memory starting from\n" +
                        "memory location 1100H. Assume that the data cache is initially empty. The complete\n" +
                        "array is accessed twice. Assume that the contents of the data cache do not change in\n" +
                        "between the two accesses." +
                        "$$ $$How many data cache misses will occur in total?",
                "48",
                "50",
                "56",
                "59"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "80", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 80 & 81 </B>$$ $$Consider a machine with a byte addressable main memory of $ 2^16$ bytes. Assume that a\n" +
                        "direct mapped data cache consisting of 32 lines of 64 bytes each is used in the system.\n" +
                        "A 50 × 50 two-dimensional array of bytes is stored in the main memory starting from\n" +
                        "memory location 1100H. Assume that the data cache is initially empty. The complete\n" +
                        "array is accessed twice. Assume that the contents of the data cache do not change in\n" +
                        "between the two accesses." +
                        "$$ $$Which of the following lines of the data cache will be replaced by new blocks in\n" +
                        "accessing the array for the second time?",
                "line 4 to line 11",
                "line 4 to line 12",
                "line 0 to line 7",
                "line 0 to line 8"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "81", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 82 & 83 </B>$$ $$A process has been allocated 3 page frames. Assume that none of the pages of the\n" +
                        "process are available in the memory initially. The process makes the following sequence\n" +
                        "of page references (reference string): 1, 2, 1, 3, 7, 4, 5, 6, 3, 1" +
                        "$$ $$If optimal page replacement policy is used, how many page faults occur for the\n" +
                        "above reference string?",
                "7",
                "8",
                "9",
                "10"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "82", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 82 & 83 </B>$$ $$A process has been allocated 3 page frames. Assume that none of the pages of the\n" +
                        "process are available in the memory initially. The process makes the following sequence\n" +
                        "of page references (reference string): 1, 2, 1, 3, 7, 4, 5, 6, 3, 1" +
                        "$$ $$Least Recently Used (LRU) page replacement policy is a practical approximation\n" +
                        "to optimal page replacement. For the above reference string, how many more\n" +
                        "page faults occur with LRU than with the optimal page replacement policy?",
                "0",
                "1",
                "2",
                "3"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "83", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 84 & 85 </B>$$ $$Suppose that a robot is placed on the Cartesian plane. " +
                        "At each step it is allowed to move either one unit up or one unit right, i.e., if it is at (i,j) " +
                        "then it can move to either (i+1,j) or (i,j+1). $$ $$" +
                        "How many distinct paths are there for the robot to reach the point (10,10) starting ",
                "$(\\table \\20;\\10)$",
                "$2^{20}$",
                "$2^{10}$",
                "None of the above"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "84",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 84 & 85 </B>$$ $$Suppose that a robot is placed on the Cartesian plane. " +
                        "At each step it is allowed to move either one unit up or one unit right, i.e., if it is at (i,j) " +
                        "then it can move to either (i+1,j) or (i,j+1). $$ $$" +
                        "Suppose that the robot is not allowed to traverse the line segment from (4,4) to (5,4). " +
                        "With this constraint, how many distinct paths are there for the robot to reach (10,10) starting from (0,0)?",
                "$2^9$",
                "$2^{19}$",
                "$(\\table \\8;\\ 4)×(\\table \\11;\\ 5)$",
                "$(\\table \\20;\\ 10)-(\\table \\8;\\ 4)×(\\table \\11;\\ 5)$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "85", m, marks, year, explanation, false);
        this.addQuestion(q);

    }

    //**** 2008 questions starts *****//

    private void addQuestions2008() {
        year = "2008";
        path="file:///android_asset/2008/";
        marks = "1";
        Q = getQuestion(getstring("${lim}↙{x→∞}$ ${x-sin x}/{x+cos x}$ equals",
                "1",
                "-1",
                "∞",
                "-∞"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "1", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If P, Q, R are subsets of the universal set U, then " +
                        "$(P ∩ Q ∩ R) ∪ (P^c ∩ Q ∩ R) ∪ Q^c ∪ R^c$ is",
                "$Q^c ∪ R^c$",
                "$P ∪ Q^c ∪ R^c$",
                "$P^c ∪ Q^c ∪ R^c$",
                "U"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "2", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following system of equations" +
                        "$$ $$ $x_1+x_2+2x_3=1$ $$ $$ $x_1+2x_2+3x_3=2$" +
                        "$$ $$ $x_1+4x_2+αx_3=4$ $$ $$has a unique solution. The only possible value(s) for α is/are",
                "0",
                "either 0 or 1",
                "one of 0, 1 or -1",
                "any real number"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "3", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the IEEE floating point representation, the hexadecimal value 0 × 00000000 corresponds to",
                "the normalized value $2^{-127}$",
                "the normalized value $2^{-126}$",
                "the normalized value +0",
                "the special value +0"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "4", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the Karnaugh map shown below, X denotes a don't care term. What is the minimal form of the function represented by the Karnaugh map?" +
                        MyTable(5, 5, getText(5, "cd↓/ab→", "00", "01", "11", "10", "00", "1", "1", "", "1", "01", "X", "", "", "", "11", "X", "", "", "", "10", "1", "1", "", "X", "", "", "", "", ""), true, true) +
                        "",
                "$\\ov{b}.\\ov{d}+\\ov{a}.\\ov{d}$",
                "$\\ov{a}.\\ov{b}+\\ov{b}.\\ov{d}+\\ov{a}.b.\\ov{d}$",
                "$\\ov{b}.\\ov{d}+\\ov{a}.b.\\ov{d}$",
                "$\\ov{a}.\\ov{b}+\\ov{b}.\\ov{d}+\\ov{a}.\\ov{d}$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "5", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let r denote number system radix. The only value(s) of r that satisfy the\n" +
                        "equation   $√{121_r} = 11_r$ is / are",
                "decimal 10",
                "decimal 11",
                "decimal 10 and 11",
                "any value > 2"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "6", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The most efficient algorithm for finding the number of connected components in\n" +
                        "an undirected graph on n vertices and m edges has time complexity",
                "Θ(n)",
                "Θ(m)",
                "Θ(m+n)",
                "Θ(mn)"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "7", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given $f_1, f_3$ and $f$ in canonical sum of products form (in decimal) for the circuit" +
                        "$$ $$<img src='" + path + "qno-8.png'/>$$ $$" +
                        "$f_1$ = ∑ m(4,5,6,7,8) $$ $$" +
                        "$f_2$ = ∑ m(1,6,15)$$ $$" +
                        "$f$ = ∑ m(1,6,8,15)$$ $$ then $f_2$ is:",
                "∑ m(4,6)",
                "∑ m(4,8)",
                "∑ m(6,8)",
                "∑ m(4,6,8)"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "8", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is true for the language{ $a^p$ | p is a prime} ?",
                "It is not accepted by a Turing Machine",
                "It is regular but not context-free",
                "It is context-free but not regular",
                "It is neither regular nor context-free, but accepted by a Turing machine"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "9", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following are decidable?$$ $$" +
                        "I. Whether the intersection of two regular languages is infinite" +
                        "$$ $$II. Whether a given context-free language is regular" +
                        "$$ $$III. Whether two push-down automata accept the same language" +
                        "$$ $$IV. Whether a given grammar is context-free",
                "I and II",
                "I and IV", "II and III",
                "II and IV"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "10", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following describes a handle (as applicable to LR-parsing)\n" +
                        "appropriately?",
                "It is the position in a sentential form where the next shift or reduce operation\n" +
                        "will occur",
                "It is non-terminal whose production will be used for reduction in the next\n" +
                        "step",
                "It is a production that may be used for reduction in a future step along with a\n" +
                        "position in the sentential form where the next shift or reduce operation will\n" +
                        "occur",
                "It is the production p that will be used for reduction in the next step along\n" +
                        "with a position in the sentential form where the right hand side of the\n" +
                        "production may be found"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "11", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Some code optimizations are carried out on the intermediate code because",
                "They enhance the portability of the compiler to other target processors",
                "Program analysis is more accurate on intermediate code than on machine\n" +
                        "code",
                "The information from dataflow analysis cannot otherwise be used for\n" +
                        "optimization",
                "The information from the front end cannot otherwise be used for optimization"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "12", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If L and $\\ov{L}$ are recursively enumerable then L is",
                "regular",
                "context-free",
                "context-sensitive",
                "recursive"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "13", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the maximum size of data that the application layer can pass on to the\n" +
                        "TCP layer below?",
                "Any size",
                "$2^16$ bytes-size of TCP header",
                "$2^16$ bytes",
                "1500 bytes"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "14", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following tuple relational calculus expression(s) is/are equivalent to\n" +
                        "∀t ∈ r (P (t))?" +
                        "$$ $$ I.  ¬∃t ∈ r (P (t))" +
                        "$$ $$ II. ∃t ∉ r (P (t))" +
                        "$$ $$ III. ¬∃t ∈ r (¬P (t))" +
                        "$$ $$ IV. ∃t ∉ r (¬P (t))",
                "I only", "II only", "III only",
                "III and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "15", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A clustering index is defined on the fields which are of type",
                "non-key and ordering",
                "non-key and non-ordering",
                "key and ordering",
                "key and non-ordering"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "16", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following system calls results in the sending of SYN packets?",
                "socket",
                "bind",
                "listen",
                "connect"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "17", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which combination of the integer variables x, y and z makes the variable a get\n" +
                        "the value 4 in the following expression?$$ $$" +
                        "a=(x > y)?((x > z)? x:z):((y >z)?y:z)",
                "x = 3,y = 4, z = 2",
                "x = 6,y = 5,z = 3",
                "x = 6,y = 3,z = 5",
                "x = 5, y = 4,z = 5"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "18", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The Breadth First Search algorithm has been implemented using the queue data structure. One possible order of visiting the nodes of the following graph is$$ $$" +
                        "<img src='" + path + "qno-19.png'/>",
                "MNOPQR",
                "NQMPOR",
                "QMNPRO",
                "QMNPOR"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "19", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The data blocks of a very large file in the Unix file system are allocated using",
                "contiguous allocation",
                "linked allocation",
                "indexed allocation",
                "an extension of indexed allocation"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "20", os, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("The minimum number of equal length subintervals needed to approximate$$ $$" +
                        "$∫↙{1}↖{2}xe^x$ dx to an accuracy of at least" +
                        "$1/3×10^{-6}$ using the trapezoidal rule is",
                "1000e",
                "1000",
                "100e",
                "100"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "21", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The Newton-Raphson iteration $x_{n+1}=1/2(x_n+R/x_n)$ can be used to compute the",
                "square of R",
                "reciprocal of R",
                "square root of R",
                "logarithm of R"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "22", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements is true for every planar graph on n vertices?",
                "The graph is connected",
                "The graph is Eulerian",
                "The graph has a vertex-cover of size at most $3n/4$",
                "The graph has an independent set of size at least $n/3$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "23", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $P = ∑↙{1≤i≤2k} i$ (where i is odd) and $Q = ∑↙{1≤i≤2k} i$ (where i is even), and where k is a positive integer. Then",
                "P = Q − K",
                "P = Q + K",
                "P = Q",
                "P = Q + 2K"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "24", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A point on a curve is said to be an extremum if it is a local minimum or a local\n" +
                        "maximum. The number of distinct extrema for the curve $3x^4 − 16x^3 + 24x^2 + 37$ is",
                "0", "1", "2", "3"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "25", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If P, Q, R are Boolean variables, " +
                        "then <br/>$(P + \\ov{Q})(P.\\ov{Q} + P.R)(\\ov{P}.\\ov{R} + \\ov{Q})$<br/> simplifies to",
                "$P.\\ov{Q}$",
                "$P.\\ov{R}$",
                "$P.\\ov{Q}+R$",
                "$P.\\ov{R}+Q$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "26", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Aishwarya studies either computer science or mathematics everyday. If she studies computer science on a day, then the probability that she studies mathematics the next day is 0.6. If she studies mathematics on a day, then the probability that she studies computer science the next day is 0.4. Given that Aishwarya studies computer science on Monday, what is the probability that she studies computer science on Wednesday?",
                "0.24",
                "0.36",
                "0.4",
                "0.6"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "27", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("How many of the following matrices have an eigenvalue 1?$$ $$" +
                        "$[\\table \\1,\\0;\\0,\\0]$ $[\\table \\0,\\1;\\0,\\0]$" +
                        "$[\\table \\1,\\-1;\\1,\\1]$" +
                        " and $[\\table \\-1,\\0;\\1,\\-1]$",
                "one",
                "two",
                "three",
                "four"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "28", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let X be a random variable following normal distribution with mean +1 and variance 4. Let Y be another normal variable with mean -1 and variance unknown If P(X ≤ -1) = P(Y ≥ 2). the standard deviation of Y is",
                "$3$",
                "$2$",
                "$√2$",
                "$1$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "29", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let fsa and pda be two predicates such that fsa(x) means x is a finite state\n" +
                        "automaton, and pda(y) means that y is a pushdown automaton. Let equivalent\n" +
                        "be another predicate such that equivalent (a, b) means a and b are equivalent.\n" +
                        "Which of the following first order logic statements represents the following:\n" +
                        "Each finite state automaton has an equivalent pushdown automaton",
                "(∀x fsa(x)) => (∃y pda(y) ∧ equivalent (x,y))",
                "~∀y(∃x fsa(x) => pda(y) ∧ equivalent (x,y))",
                "∀x ∃y(fsa(x) ∧ pda(y) ∧ equivalent(x,y))",
                "∀x ∃y(fsa(y) ∧ pda(x) ∧ equivalent(x,y))"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "30", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("P and Q are two propositions. Which of the following logical expressions are\n" +
                        "equivalent?$$ $$" +
                        "I.   P ∨ ~Q$$ $$ II.  ~(~P ∧ Q)$$ $$ III.  (P ∧ Q) ∨ (P ∧ ~Q) ∨ (~P ∧ ~Q)$$ $$" +
                        "IV.  (P ∧ Q) ∨(P ∧ ~Q) ∨ (~P ∧ ~Q)",
                "Only I and II",
                "Only I, II and III",
                "Only I, II and IV",
                "All of I, II III and IV"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "31", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("For a magnetic disk with concentric circular tracks, the seek latency is not linearly\n" +
                        "proportional to the seek distance due to",
                "non-uniform distribution of requests",
                "arm starting and stopping inertia",
                "higher capacity of tracks on the periphery of the platter",
                "use of unfair arm scheduling policies"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is/are true of the auto-increment addressing mode?$$ $$" +
                        "I. It is useful in creating self-relocating code" +
                        "$$ $$II. If it is included in an Instruction Set Architecture, then an additional ALU is\n" +
                        "required for effective address calculation" +
                        "$$ $$III. The amount of increment depends on the size of the data item accessed",
                "I only",
                "II only",
                "III only",
                "II and III only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "33", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following must be true for the RFE (Return From Exception)\n" +
                        "instruction on a general purpose processor?" +
                        "$$ $$I. It must be a trap instruction" +
                        "$$ $$II. It must be a privileged instruction" +
                        "$$ $$III. An exception cannot be allowed to occur during execution of an RFE\n" +
                        "instruction",
                "I only",
                "II only",
                "I and II only",
                "I, II and III only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "34", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("For inclusion to hold between two cache levels L1 and L2 in a multi-level cache\n" +
                        "hierarchy, which of the following are necessary?" +
                        "$$ $$I. L1 must be a write-through cache" +
                        "$$ $$II. L2 must be a write-through cache" +
                        "$$ $$III. The associativity of L2 must be greater than that of L1" +
                        "$$ $$IV. The L2 cache must be at least as large as the L1 cache",
                "IV only",
                "I and IV only",
                "I, II and IV only",
                "I, II, III and IV"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "35",co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following are NOT true in a pipelined processor?" +
                        "$$ $$I. Bypassing can handle all RAW hazards" +
                        "$$ $$II. Register renaming can eliminate all register carried WAR hazards" +
                        "$$ $$III. Control hazard penalties can be eliminated by dynamic branch prediction",
                "I and II only",
                "I and III only",
                "II and III only",
                "I, II and III"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "36", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The use of multiple register windows with overlap causes a reduction in the\n" +
                        "number of memory accesses for" +
                        "$$ $$I. Function locals and parameters" +
                        "$$ $$II. Register saves and restores" +
                        "$$ $$III. Instruction fetches",
                "I only",
                "II only",
                "III only",
                "I, II and III"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "37", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In an instruction execution pipeline, the earliest that the data TLB (Translation\n" +
                        "Lookaside Buffer) can be accessed is",
                "Before effective address calculation has started",
                "During effective address calculation",
                "After effective address calculation has completed",
                "After data cache lookup has completed"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "38", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following functions:$$ $$" +
                        "f(n) = $2^n$\n" +
                        "$$ $$g(n) = $n!$\n" +
                        "$$ $$h(n) = $n^{log\\ n}$ $$ $$Which of the following statements about the asymptotic behaviour of f(n), g(n), and h(n) is true?",
                " f(n) = O(g(n)); g(n) = O(h(n))",
                " f(n) = Ω(g(n)); g(n) = O(h(n))",
                " g(n) = O(f(n)); h(n) = O(f(n))",
                " h(n) = O(f(n)); g(n) = Ω(f(n))"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "39", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The minimum number of comparisons required to determine if an integer appears more than $n/2$ times in a sorted array of $n$ integers is",
                "θ(n)",
                "θ(log n)",
                "θ(log* n)",
                "θ(1)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "40", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A B-tree of order 4 is built from scratch by 10 successive insertions. What is the maximum number of node splitting operations that may take place?",
                "3",
                "4",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "41", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("G is a graph on n vertices and 2n - 2 edges. The edges of G can be partitioned into two edge-disjoint spanning trees. Which of the following is NOT true for G?",
                "For every subset of k vertices, the induced subgraph has at most 2k-2 edges",
                "The minimum cut in G has at least two edges",
                "There are two edge-disjoint paths between every pair to vertices",
                "There are two vertex-disjoint paths between every pair of vertices"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "42", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the Quicksort algorithm. Suppose there is a procedure for finding a pivot element which splits the list into two sub-lists each of which contains at least one-fifth of the elements. Let T(n) be the number of comparisons required to sort n elements. Then",
                "T(n) ≤ 2T(n/5) + n",
                "T(n) ≤ T(n/5) + T(4n/5) + n",
                "T(n) ≤ 2T(4n/5) + n",
                "T(n) ≤ 2T(n/2) + n"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "43", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The subset-sum problem is defined as follows: Given a set S of n positive\n" +
                        "integers and a positive integer W, determine whether there is a subset of S\n" +
                        "Whose elements sum to W.$$ $$" +
                        "An algorithm Q solves this problem in O(nW) time. Which of the following\n" +
                        "statements is false?",
                "Q solves the subset-sum problem in polynomial time when the input is\n" +
                        "encoded in unary",
                "Q solves the subset-sum problem in polynomial time when the input is\n" +
                        "encoded in binary",
                "The subset sum problem belongs to the class NP",
                "The subset sum problem is NP-hard"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "44", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Dijkstra’s single source shortest path algorithm when run from vertex a in the below graph, computes the correct shortest path distance to" +
                        "<img src='" + path + "qno-45.png'/>",
                " only vertex a",
                " only vertices a, e, f, g, h",
                " only vertices a, b, c, d",
                " all the vertices"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "45", algo, marks, year, explanation, false);
        this.addQuestion(q);



        Q = getQuestion(getstring("You are given the postorder traversal, P, of a binary search tree on the n elements 1, 2, ..., n. You have to determine the unique binary search tree that has P as its postorder traversal. What is the time complexity of the most efficient algorithm for doing this?",
                "Θ(log n)",
                "Θ(n)",
                "Θ(n log n)",
                "none of the above, as the tree cannot be uniquely determined."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "46", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("We have a binary heap on n elements and wish to insert n more elements (not necessarily one after another) into this heap. The total time required for this is",
                "Θ$(log\\ n)$",
                "Θ$(n)$",
                "Θ$(n\\ log\\ n)$",
                "$n^2$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "47", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements is false?",
                "Every NFA can be converted to an equivalent DFA",
                "Every non-deterministic Turing machine can be converted to an equivalent deterministic Turing machine",
                "Every regular language is also a context-free language",
                "Every subset of a recursively enumerable set is recursive"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "48", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given below are two finite state automata (→ indicates the start state and F indicates a final state)$$ $$" +
                        "Y:" +
                        MyTable(3, 3, getText(3, "", "a", "b", "→1", "1", "2", "2(F)", "2", "1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "Z:" +
                        MyTable(3, 3, getText(3, "", "a", "b", "→1", "2", "2", "2(F)", "1", "1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "$$ $$Which of the following represents the product automaton Z×Y?",
                MyTable(5, 3, getText(3, "", "a", "b", "→P", "S", "R", "Q", "R", "S", "R(F)", "Q", "P", "S", "Q", "P", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false),
                MyTable(5, 3, getText(3, "", "a", "b", "→P", "S", "Q", "Q", "R", "S", "R(F)", "Q", "P", "S", "P", "Q", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false),
                MyTable(5, 3, getText(3, "", "a", "b", "→P", "Q", "S", "Q", "R", "S", "R(F)", "Q", "P", "S", "Q", "P", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false),
                MyTable(5, 3, getText(3, "", "a", "b", "→P", "S", "Q", "Q", "S", "R", "R(F)", "Q", "P", "S", "Q", "P", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false)));
        explanation = getExplaination("");
        q = new Question(Q, "B", "49", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are true?" +
                        "$$ $$I. Every left-recursive grammar can be converted to a right-recursive grammar\n" +
                        "and vice-versa" +
                        "$$ $$II. All ε-productions can be removed from any context-free grammar by suitable\n" +
                        "transformations" +
                        "$$ $$III. The language generated by a context-free grammar all of whose productions\n" +
                        "are of the form X → w or X → wY (where, w is a string of terminals and Y is\n" +
                        "a non-terminal), is always regular" +
                        "$$ $$IV. The derivation trees of strings generated by a context-free grammar in\n" +
                        "Chomsky Normal Form are always binary trees",
                "I, II, III and IV",
                "II, III and IV only",
                "I, III and IV only",
                "I, II and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "50", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the following:$$ $$ " +
                        MyTable(4, 4, getText(4, "E.", "Checking that identifiers are\n" +
                                        "declared before their use", "P.", "L={$a^nb^mc^nd^m$ |n ≥ 1,m ≥ 1|}",
                                "F.", "Number of formal parameters in\n" +
                                        "the declaration of a function\n" +
                                        "agrees with the number of actual\n" +
                                        "parameters in use of that function", "Q.", "X→XbX|XcX |dXf |g",
                                "G", "Arithmetic expressions with\n" +
                                        "matched pairs of parentheses", "R.", "L ={wcw|w ∈(a|b)*", "H.", "Palindromes", "S.", "X→bXb|cXc|ε", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "",
                "E − P, F − R, G − Q, H − S",
                "E − R, F − P, G − S, H − Q",
                "E − R, F − P, G − Q, H − S",
                "E − P, F − R, G − S, H − Q"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "51", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("P.<br/> <img src='"+path+"qno-52.png'/>$$ $$" +
                        "Q.<br/> <img src='"+path+"qno-52-1.png'/>" +
                        "$$ $$R.<br/> <img src='"+path+"qno-52-2.png'/>" +
                        "$$ $$S.<br/> <img src='"+path+"qno-52-3.png'/>" +
                        "$$ $$1. ε + 0(01* 1 + 00)* 01*" +
                        "<br/>2. ε + 0(10* 1 + 00)* 0" +
                        "<br/>3. ε + 0(10* 1 + 10)* 1" +
                        "<br/>4. ε + 0(10* 1 + 10)* 10*$$ $$" +
                        "",
                "P - 2, Q - 1, R - 3, S - 4",
                "P - 1, Q - 3, R - 2, S - 4",
                "P - 1, Q - 2, R - 3, S - 4",
                "P - 3, Q - 2, R - 1, S - 4"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "52", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following are regular sets?$$ $$" +
                        "I. {$a^nb^{2m}|n ≥ 0,m ≥ 0$}" +
                        "$$ $$II. {$a^nb^{m}|n = 2m$}" +
                        "$$ $$III. {$a^nb^{m}|n ≠ m$}" +
                        "$$ $$IV. {xcy|x,y∈{a,b}*}",
                "I and IV only",
                "I and III only",
                "I only",
                "IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "53", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following are true?$$ $$" +
                        "I. A programming language which does not permit global variables of any kind\n" +
                        "and has no nesting of procedures/functions, but permits recursion can be\n" +
                        "implemented with static storage allocation" +
                        "$$ $$II. Multi-level access link (or display) arrangement is needed to arrange\n" +
                        "activation records only if the programming language being implemented has\n" +
                        "nesting of procedures/functions" +
                        "$$ $$III. Recursion in programming languages cannot be implemented with dynamic\n" +
                        "storage allocation" +
                        "$$ $$IV. Nesting procedures/functions and recursion require a dynamic heap\n" +
                        "allocation scheme and cannot be implemented with a stack-based allocation\n" +
                        "scheme for activation records" +
                        "$$ $$V. Programming languages which permit a function to return a function as its\n" +
                        "result cannot be implemented with a stack-based storage allocation scheme\n" +
                        "for activation records",
                "II and V only",
                "I, III and IV only",
                "I, II and V only",
                "II, III and V only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "54", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An LALR(1) parser for a grammar G can have shift-reduce (S-R) conflicts if and\n" +
                        "only if",
                "The SLR(1) parser for G has S-R conflicts",
                "The LR(1) parser for G has S-R conflicts",
                "The LR(0) parser for G has S-R conflicts",
                "The LALR(1) parser for G has reduce-reduce conflicts"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "55", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the slow start phase of the TCP congestion control algorithm, the size of the\n" +
                        "congestion window",
                "does not increase",
                "increases linearly",
                "increases quadratically",
                "increases exponentially"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "56", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If a class B network on the Internet has a subnet mask of 255.255.248.0, what is\n" +
                        "the maximum number of hosts per subnet?",
                "1022",
                "1023",
                "2046",
                "2047"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "57", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A computer on a 10Mbps network is regulated by a token bucket. The token\n" +
                        "bucket is filled at a rate of 2Mbps. It is initially filled to capacity with 16Megabits.\n" +
                        "What is the maximum duration for which the computer can transmit at the full\n" +
                        "10Mbps?",
                "1.6 seconds",
                "2 seconds",
                "5 seconds",
                "8 seconds"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "58", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A client process P needs to make a TCP connection to a server process S.\n" +
                        "Consider the following situation: the server process S executes a socket (), a\n" +
                        "bind () and a listen () system call in that order, following which it is preempted.\n" +
                        "Subsequently, the client process P executes a socket () system call followed by\n" +
                        "connect () system call to connect to the server process S. The server process has\n" +
                        "not executed any accept () system call. Which one of the following events could\n" +
                        "take place?",
                "connect () system call returns successfully",
                "connect () system call blocks",
                "connect () system call returns an error",
                "connect () system call results in a core dump"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "59", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is printed by the following C program?$$ $$" +
                        getProgram(year + "/prog2008-qno-60.txt") + "",
                "18",
                "19",
                "21",
                "22"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "60", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the correct option to fill ? 1 and ? 2 so that the program below prints an\n" +
                        "input string in reverse order. Assume that the input string is terminated by a\n" +
                        "newline character.$$ $$" +
                        getProgram(year + "/prog2008-qno-61.txt") + "",
                " ?1 is (getchar() != ’\\n’)<br/> " +
                        "  ?2 is getchar(c);",
                " ?1 is (c = getchar() ) != ’\\n’)<br/>" +
                        "  ?2 is getchar(c);",
                " ?1 is (c != ’\\n’)<br/>" +
                        "  ?2 is putchar(c);",
                " ?1 is ((c = getchar()) != ’\\n’)<br/>" +
                        "  ?2 is putchar(c);"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "61", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following C function takes a single-linked list of integers as a parameter and rearranges the " +
                        "elements of the list. The function is called with the list containing the integers 1, 2, 3, 4, 5, 6, 7 in the " +
                        "given order. What will be the contents of the list after the function completes execution?" +
                        "$$ $$" + getProgram(year + "/prog2008-qno-62.txt"),
                "1,2,3,4,5,6,7",
                "2,1,4,3,6,5,7",
                "1,3,2,5,4,7,6",
                "2,3,4,5,6,7,1"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "62", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The P and V operations on counting semaphores, where s is a counting semaphore, are defined as follows:$$ $$" +
                        getProgram(year + "/prog2008-qno-63-1.txt") +
                        "$$ $$Assume that $P_b$ and $V_b$ the wait and signal operations on binary semaphores are provided. Two binary semaphores $X_b$ and $Y_b$ are used to implement the semaphore operations P(s) and V(s) as follows:" +
                        getProgram(year + "/prog2008-qno-63-2.txt") + "$$ $$The initial values of $X_b$ and $Y_b$ are respectively",
                "0 and 0",
                "0 and 1",
                "1 and 0",
                "1 and 1"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "63",os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements about synchronous and asynchronous I/O is\n" +
                        "NOT true?",
                "An ISR is invoked on completion of I/O in synchronous I/O but not in\n" +
                        "asynchronous I/O",
                "In both synchronous and asynchronous I/O, an ISR (Interrupt Service\n" +
                        "Routine) is invoked after completion of the I/O",
                "A process making a synchronous I/O call waits until I/O is complete, but a\n" +
                        "process making an asynchronous I/O call does not wait for completion of the\n" +
                        "I/O",
                "In the case of synchronous I/O, the process waiting for the completion of I/O\n" +
                        "is woken up by the ISR that is invoked after the completion of I/O"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "64", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is NOT true of deadlock prevention and deadlock\n" +
                        "avoidance schemes?",
                "In deadlock prevention, the request for resources is always granted if the\n" +
                        "resulting state is safe",
                "In deadlock avoidance, the request for resources is always granted if the\n" +
                        "result state is safe",
                "Deadlock avoidance is less restrictive than deadlock prevention",
                "Deadlock avoidance requires knowledge of resource requirements a priori"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "65", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A process executes the following code$$ $$" +
                        "for (i = 0; i < n; i + +) for ( );$$ $$The total number of child processes created is",
                "$n$",
                "$2^n − 1$",
                "$2^n$",
                "$2^{n+1}-1$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "66", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A processor uses 36 bit physical addresses and 32 bit virtual addresses, with a\n" +
                        "page frame size of 4 Kbytes. Each page table entry is of size 4 bytes. A three\n" +
                        "level page table is used for virtual to physical address translation, where the\n" +
                        "virtual address is used as follows" +
                        "$$ $$ - Bits 30-31 are used to index into the first level page table" +
                        "$$ $$ - Bits 21-29 are used to index into the second level page table" +
                        "$$ $$ - Bits 12-20 are used to index into the third level page table, and" +
                        "$$ $$ - Bits 0-11 are used as offset within the page" +
                        "$$ $$The number of bits required for addressing the next level page table (or page\n" +
                        "frame) in the page table entry of the first, second and third level page tables are\n" +
                        "respectively",
                "20, 20 and 20",
                "24, 24 and 24",
                "24, 24 and 20",
                "25, 25 and 24"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "67", os, marks, year, explanation, false);
        this.addQuestion(q);



        Q = getQuestion(getstring("Let R and S be two relations with the following schema$$ $$" +
                        "R (<U>P</U>,<U>Q</U>,R1,R2,R3)" +
                        "$$ $$S (<U>P</U>,<U>Q</U>,S1,S2)$$ $$" +
                        "Where {P, Q} is the key for both schemas. Which of the following queries are\n" +
                        "equivalent?$$ $$" +
                        "I.  $∏_P$(R ▷◁ S)" +
                        "<br/> II. $∏_P(R)$ ▷◁ $∏_P(S)$ " +
                        "<br/> III. $∏_P (∏_{P,Q}$(R) ∩ $∏_{P,Q}$(S))" +
                        "<br/> IV. $∏_P (∏_{P,Q}$(R)$-(∏_{P,Q}$(R)$-∏_{P,Q}$(S)))",
                "Only I and II",
                "Only I and III",
                "Only I, II and III",
                "Only I, III and IV"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "68", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following relational schemes for a library database:$$ $$" +
                        "Book (Title, Author, Catalog_no, Publisher, Year, Price)" +
                        "$$ $$Collection (Title,Author,Catalog_ no)" +
                        "$$ $$with in the following functional dependencies:" +
                        "$$ $$I. Title Author → Catalog_no" +
                        "$$ $$II. Catalog_no → Title Author Publisher Year" +
                        "$$ $$III. Publisher Title Year → Price" +
                        "$$ $$Assume {Author, Title} is the key for both schemes. Which of the following\n" +
                        "statements is true?$$ $$",
                " Both Book and Collection are in BCNF",
                " Both Book and Collection are in 3NF only",
                " Book is in 2NF and Collection is in 3NF",
                " Both Book and Collection are in 2NF only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "69", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a file of 16384 records. Each record is 32 bytes long and its key field is\n" +
                        "of size 6 bytes. The file is ordered on a non-key field, and the file organization is\n" +
                        "unspanned. The file is stored in a file system with block size 1024 bytes, and the\n" +
                        "size of a block pointer is 10 bytes. If the secondary index is built on the key field\n" +
                        "of the file, and a multi-level index scheme is used to store the secondary index,\n" +
                        "the number of first-level and second-level blocks in the multi-level index are\n" +
                        "respectively",
                "8 and 0",
                "128 and 6",
                "256 and 4",
                "512 and 5"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "70", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 71,72 & 73 : </B>$$ $$Consider a machine with a 2-way set associative data cache of size 64Kbytes and\n" +
                        "block size 16bytes. The cache is managed using 32 bit virtual addresses and the\n" +
                        "page size is 4Kbyts. A program to be run on this machine begins as follows:" +
                        getProgram(year + "/prog2008-qno-71.txt") + "$$ $$The size of double is 8 Bytes. Array ARR is located in memory starting at the\n" +
                        "beginning of virtual page 0xFF000 and stored in row major order. The cache is\n" +
                        "initially empty and no pre-fetching is done. The only data memory references\n" +
                        "made by the program are those to array ARR" +
                        "$$ $$The total size of the tags in the cache directory is",
                "32Kbits",
                "34Kbits",
                "64Kbits",
                "68Kbits"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "71", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 71,72 & 73 : </B>$$ $$Consider a machine with a 2-way set associative data cache of size 64Kbytes and\n" +
                        "block size 16bytes. The cache is managed using 32 bit virtual addresses and the\n" +
                        "page size is 4Kbyts. A program to be run on this machine begins as follows:" +
                        getProgram(year + "/prog2008-qno-71.txt") + "$$ $$The size of double is 8 Bytes. Array ARR is located in memory starting at the\n" +
                        "beginning of virtual page 0xFF000 and stored in row major order. The cache is\n" +
                        "initially empty and no pre-fetching is done. The only data memory references\n" +
                        "made by the program are those to array ARR" +
                        "$$ $$Which of the following array elements has the same cache index as ARR[0][0]?",
                "ARR [0] [4]",
                "ARR [4] [0]",
                "ARR [0] [5]",
                "ARR [5] [0]"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "72", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 71,72 & 73 : </B>$$ $$Consider a machine with a 2-way set associative data cache of size 64Kbytes and\n" +
                        "block size 16bytes. The cache is managed using 32 bit virtual addresses and the\n" +
                        "page size is 4Kbyts. A program to be run on this machine begins as follows:" +
                        getProgram(year + "/prog2008-qno-71.txt") + "$$ $$The size of double is 8 Bytes. Array ARR is located in memory starting at the\n" +
                        "beginning of virtual page 0xFF000 and stored in row major order. The cache is\n" +
                        "initially empty and no pre-fetching is done. The only data memory references\n" +
                        "made by the program are those to array ARR" +
                        "$$ $$The cache hit ratio for this initialization loop is",
                "0%",
                "25%",
                "50%",
                "75%"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "73", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 74 & 75 : </B>$$ $$Consider the following C functions:" +
                        getProgram(year + "/prog2008-qno-74.txt") +
                        "$$ $$The running time of f1 (n) and f2 (n) are",
                "$Θ(n)$ and $Θ(n)$ ",
                "$Θ(2^n)$ and $Θ(n)$ ",
                "$Θ(n)$ and $Θ(2^n)$ ",
                " $Θ(2^n)$ and $Θ(2^n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "74", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 74 & 75 : </B>$$ $$Consider the following C functions:" +
                        getProgram(year + "/prog2008-qno-74.txt") +
                        "$$ $$F1 (8) and f2 (8) return the values",
                " 1661 and 1640 ",
                " 59 and 59 ",
                " 1640 and 1640 ",
                " 1640 and 1661"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "75", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 76 & 77 : </B>$$ $$Delayed branching can help in the handling of control hazards" +
                        "$$ $$For all delayed conditional branch instructions, irrespective of whether the\n" +
                        "condition evaluates to true or false",
                " The instruction following the conditional branch instruction in memory is\n" +
                        "executed ",
                " The first instruction in the fall through path is executed ",
                " The first instruction in the taken path is executed ",
                " The branch takes longer to execute than any other instruction"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "76", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 76 & 77 : </B>$$ $$Delayed branching can help in the handling of control hazards" +
                        "$$ $$The following code is to run on a pipelined processor with one branch delay slot:" +
                        " $$ $$I1: ADD R2←R7+R8" +
                        " $$ $$I2 : SUB R4← R5-R6" +
                        " $$ $$I3 : ADD R1← R2+R3" +
                        " $$ $$I4 : STORE Memory [R4]←R1" +
                        "$$ $$BRANCH to Label if R1== 0$$ $$Which of the instructions I1, I2, I3 or I4 can legitimately occupy the delay slot without any other program modification?",
                "I1", "I2", "I3", "I4"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "77", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 78 & 79 : </B>$$ $$Let $X_n$ denote the number of binary strings of length n that contain no\n" +
                        "consecutive 0s." +
                        "$$ $$Which of the following recurrences does $X_n$ satisfy?",
                "$X_n$ = $2X_{n-1}$",
                "$X_n$ = $X_{⌊n/2⌋}$ + 1",
                "$X_n$ = $X_{⌊n/2⌋}$ + $n$",
                "$X_n$ = $X_{n-1}$ + $X_{n-2}$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "78", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 78 & 79 : </B>$$ $$Let $X_n$ denote the number of binary strings of length n that contain no\n" +
                        "consecutive 0s." +
                        "$$ $$The value of $X_5$ is",
                "5",
                "7",
                "8",
                "16"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "79", m, marks, year, explanation, false);
        this.addQuestion(q);



        Q = getQuestion(getstring("<B>Linked Question 80 & 81 : </B>$$ $$The subset-sum problem is defined as follows." +
                        " Given a set of n positive integers, $S = {a_1 ,a_2 ,a_3 ,...,a_n}$ and positive integer W, " +
                        "is there a subset of S whose elements sum to W? A dynamic program for solving this problem " +
                        "uses a 2-dimensional Boolean array X, with n rows and W+1 columns. <br/>X[i, j],1 ≤ i ≤ n, 0 ≤ j ≤ W, " +
                        "is TRUE if and only if there is a subset of ${a_1 ,a_2 ,...,a_i}$ whose elements sum to j." +
                        "$$ $$ Which of the following is valid for $2 ≤ i ≤ n$ and $a_i ≤ j ≤ W?$",
                "X[i, j] = X[i - 1, j] ∨ X[i, j - $a_i$]",
                "X[i, j] = X[i - 1, j] ∨ X[i - 1, j - $a_i$]",
                "X[i, j] = X[i - 1, j] ∧ X[i, j - $a_i$]",
                "X[i, j] = X[i - 1, j] ∧ X[i -1, j - $a_i$]"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "80", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 80 & 81 : </B>$$ $$The subset-sum problem is defined as follows." +
                        " Given a set of n positive integers, $S = {a_1 ,a_2 ,a_3 ,...,a_n}$ and positive integer W, is " +
                        "there a subset of S whose elements sum to W? A dynamic program for solving this problem uses a" +
                        " 2-dimensional Boolean array X, with n rows and W+1 columns.<br/> X[i, j],1 ≤ i ≤ n, 0 ≤ j ≤ W, is TRUE if and only if there is a subset of ${a_1 ,a_2 ,...,a_i}$ whose elements sum to j." +
                        "$$ $$ Which entry of the array X, if TRUE, implies that there is a subset whose\n" +
                        "elements sum to W?",
                "X[1, W]",
                "X[n, 0]",
                "X[n, W]",
                "X[n-1, n]"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "81", algo, marks, year, explanation, false);
        this.addQuestion(q);
// image question
        Q = getQuestion(getstring("<B>Linked Question 82 & 83 : </B>$$ $$" +
                        "Consider the following ER diagram.$$ $$" +
                        "<img src='"+path+"qno-82.png'/>" +
                        "$$ $$The minimum number of tables needed to represent M, N, P, R1, R2 is$$ $$",
                "2",
                "3",
                "4",
                "5"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "82", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 82 & 83 : </B>$$ $$" +
                        "Consider the following ER diagram.$$ $$" +
                        "<img src='"+path+"qno-82.png'/>" +
                        "$$ $$Which of the following is a correct attribute set for one of the tables for the\n" +
                        "correct answer to the above question?$$ $$",
                "{M1,M2,M3,P1}",
                "{M1,P1,N1,N2}",
                "{M1,P1,N1}",
                "{M1,P1}"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "83", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 84 & 85 : </B>$$ $$Consider the following C program that attempts to locate an element x " +
                        "in an array Y[] using binary search. The program is erroneous." +
                        getProgram(year+"/prog2008-qno-84.txt")+"On which of the following contents of Y and x does the program fail?",
                "Y is [1 2 3 4 5 6 7 8 9 10] and x < 10",
                "Y is [1 3 5 7 9 11 13 15 17 19] and x < 1",
                "Y is [2 2 2 2 2 2 2 2 2 2] and x > 2",
                "Y is [2 4 6 8 10 12 14 16 18 20] and 2 < x < 20 and x is even"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "84", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 84 & 85 : </B>$$ $$Consider the following C program that attempts to locate an " +
                        "element x in an array Y[] using binary search. The program is erroneous." +
                        getProgram(year+"/prog2008-qno-84.txt")+"Consider the data given in above question, the correction needed in the program to make it work properly is",
                "Change line 6 to: if (Y[k] < x) i = k + 1; else j = k-1;",
                "Change line 6 to: if (Y[k] < x) i = k - 1; else j = k+1;",
                "Change line 6 to: if (Y[k] < = x) i = k; else j = k;",
                "Change line 7 to: } while ((Y[k] == x) && (i < j));"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "85", ds, marks, year, explanation, false);
        this.addQuestion(q);

    }



    //**** 2009 questions starts *****//




    private void addQuestions2009() {
        year = "2009";
        path = "file:///android_asset/2009/";
        marks="1";

        Q = getQuestion(getstring("Which one of the following in NOT necessarily a property of a Group?", "Commutativity",
                "Associativity", "Existence of inverse for every element", "Existence of identity"));
        q = new Question(Q, "A", "1", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the chromatic number of an n-vertex simple connected graph which doesn't" +
                        " contain any odd length cycle? Assume n$>=$2.",
                "2", "3", "n-1", "n"));
        q = new Question(Q, "A", "2", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is TRUE for any simple connected undirected graph with more than 2 vertices?",
                "No two vertices have the same degree.",
                "At least two vertices have the same degree.",
                "At least three vertices have the same degree.",
                "All vertices have the same degree."));
        q = new Question(Q, "B", "3", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the binary relation R = {(x, y), (x, z), (z, x), (z, y)} on the set {x, y, z}. Which one of the following is TRUE?",
                "R is symmetric but NOT antisymmetric",
                "R is NOT symmetric but antisymmetric",
                "R is both symmetric and antisymmetric", "R is neither symmetric nor antisymmetric"));
        q = new Question(Q, "D", "4", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("$(1217)_8$ is equivalent to",
                "$(1217)_{16}$", "$(028F)_{16}$", "$(2297)_{10}$", "$(0B17)_{16}$"));
        q = new Question(Q, "B", "5", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the minimum number of gates required to implement the Boolean function (AB+C) if we have to use only 2-input NOR gates?",
                "2", "3", "4", "5"));
        q = new Question(Q, "B", "6", digital, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("How many 32K x 1 RAM chips are needed to provide a memory capacity of 256K- bytes?",
                "8", "32", "64", "128"));
        q = new Question(Q, "C", "7", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A CPU generally handles an interrupt by executing an interrupt service routine",
                "As soon as an interrupt is raised",
                "By checking the interrupt register at the end of fetch cycle.",
                "By checking the interrupt register after finishing the execution of the current instruction.",
                "By checking the interrupt register at fixed time intervals."));
        q = new Question(Q, "C", "8", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In which one of the following page replacement policies, Belady’s anomaly may " +
                        "occur?",
                "FIFO", "Optimal", "LRU", "MRU"));
        q = new Question(Q, "A", "9", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The essential content(s) in each entry of a page table is / are",
                "Virtual page number", "Page frame number",
                "Both virtual page number and page frame number", "Access right information"));
        q = new Question(Q, "B", "10", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the number of swaps required to sort n elements using selection sort, in" +
                        "the worst case?",
                "$θ(n)$", "$θ(n log n)$", "$θ(n^2)$", "$θ(n^2 log n)$"));
        q = new Question(Q, "A", "11", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("S -> aSa|bSb|a|b; The language generated by the above grammar over the alphabet {a,b} is the set of",
                "All palindromes", "All odd length palindromes.",
                "Strings that begin and end with the same symbol",
                "All even length palindromes"));
        q = new Question(Q, "B", "12", toc,marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statement(s)is / are correct regarding Bellman-Ford shortest path algorithm?$$ $$" +
                        "P: Always finds a negative weighted cycle, if one exists.$$ $$" +
                        "Q: Finds whether any negative weighted cycle is reachable from the source. ",
                "P Only", "Q Only", "Both P and Q", "Neither P nor Q"));
        q = new Question(Q, "B", "13", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $π_A$ be a problem that belongs to the class NP. Then which one of the" +
                        "following is TRUE?",
                "There is no polynomial time algorithm for $π_A$",
                "If $π_A$ can be solved deterministically in polynomial time, then P = NP.",
                "If $π_A$ is NP-hard, then it is NP-complete.",
                "$π_A$ may be undecidable."));
        q = new Question(Q, "C", "14", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following languages over the alphabet {0,1} is described by the\n" +
                        "regular expression: $(0+1)^*0(0+1)^*0(0+1)^*?$",
                "The set of all strings containing the substring 00.",
                "The set of all strings containing at most two 0’s.",
                "The set of all strings containing at least two 0’s.",
                "The set of all strings that begin and end with either 0 or 1."));
        q = new Question(Q, "C", "15", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is FALSE?",
                "There is unique minimal DFA for every regular language",
                "Every NFA can be converted to an equivalent PDA.",
                "Complement of every context-free language is recursive.",
                "Every nondeterministic PDA can be converted to an equivalent deterministic" +
                        "PDA."));
        q = new Question(Q, "D", "16", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Match all items in Group 1 with correct options from those given in Group 2.$$ $$" +
                        MyTable(5, 2, getText(2, "Group 1", "Group 2", "P. Regular expression", "1. Syntax analysis",
                                "Q. Pushdown automata", "2. Code generation", "R. Dataflow analysis", "3. Lexical analysis",
                                "S. Register allocation", "4. Code optimization", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) + "",
                "P-4. Q-1, R-2, S-3",
                "P-3, Q-1, R-4, S-2",
                "P-3, Q-4, R-1, S-2",
                "P-2, Q-1, R-4, S-3"));
        q = new Question(Q, "B", "17", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the program below:" + getProgram("prog2009-qno-18.c") + "The value printed is",
                "6",
                "8",
                "14",
                "15"));
        q = new Question(Q, "B", "18", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The coupling between different modules of a software is categorized as follows:" +
                        "$$ $$I. Content coupling$$ $$II. Common coupling$$ $$" +
                        "III. Control coupling $$ $$IV. Stamp coupling$$ $$V. Data coupling $$ $$" +
                        "Coupling between modules can be ranked in the order of strongest (least desirable) to weakest (most desirable) as follows:",
                "I-II-III-IV-V", "V-IV-III-II-I", "I-III-V -II-IV", "IV-II-V-III-I"));
        q = new Question(Q, "A", "19", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the HTML table definition given below:$$ $$" +
                        ""+ getProgram("prog2009-qno-20.txt")+""+
                        "$$ $$The number of rows in each column and the number of columns in each row are:$$ $$",
                "(2,2,3) and (2,3,2)", "(2,2,3) and (2,2,3)",
                "(2,3,2) and (2,3,2)", "(2,3,2) and (2,2,3)"));
        q = new Question(Q, "C", "20", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An unbalanced dice (with 6 faces, numbered from 1 to 6) is thrown. The" +
                        "probability that the face value is odd is 90% of the probability that the face value" +
                        "is even. The probability of getting any even numbered face is the same." +
                        "If the probability that the face is even given that it is greater than 3 is 0.75," +
                        "which one of the following options is closest to the probability that the face value" +
                        "exceeds 3?",
                "0.453", "0.468", "0.485", "0.492"));
        q = new Question(Q, "B", "21", m, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("For the composition table of a cyclic group shown below$$ $$" +
                        MyTable(5, 5, getText(5, " * ", " a ", " b ", " c ", "d", "a", "a", "b", "c", "d", "b", "b", "a", "d", "c", "c", "c", "d", "b", "a", "d", "d", "c", "a", "b", "", "", "", "", ""), true, true) + "Which one of the following choices is correct?",
                "a, b are generators", "b, c are generators",
                "c, d are generators", "d, a are generators"));
        q = new Question(Q, "C", "22", m, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is the most appropriate logical formula to represent\n" +
                        "the statement? “Gold and silver ornaments are precious”.\n" +
                        "The following notations are used:$$ $$G(x): x is a gold ornament" +
                        "$$ $$S(x): x is a silver ornament$$ $$P(x): x is precious",
                "∀x(P(x)→(G(x)∧S(x)))", "∀x((G(x)∧S(x))→P(x))",
                "∃x((G(x)∧S(x))→P(x)", "∀x((G(x)∨S(x))→P(x))"));
        q = new Question(Q, "D", "23", m, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The binary operation □ is defined as follows$$ $$" +
                        MyTable(5, 3, getText(3, "P", "Q", "P□Q", "T", "T", "T", "T", "F", "T", "F", "T", "F", "F", "F", "T", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) + "Which one of the following is equivalent to P∨Q?",
                "¬Q□¬P", "P□¬Q",
                "¬P□Q", "¬P□¬Q"));
        q = new Question(Q, "B", "24", digital, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("$∫↖{π\\/4}↙{0}(1-tan x)/(1+tan x) dx$ evaluates to$$ $$",
                "0", "1",
                "ln 2", "1/2 ln 2"));
        q = new Question(Q, "D", "25", m, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following well-formed formulae:" +
                        "$$ $$I. ¬∀x(P (x))$$ $$" + "<br/>II. ¬∃x(P(x))" +
                        "" +
                        "<br/>III. ¬∃x(¬P(x))$$ $$" + "<br/>IV. ¬∃x(¬P(x))<br/>" +
                        "Which of the above are equivalent?$$ $$",
                "I and III",
                "I and IV", "II and III", "II and IV"));
        q = new Question(Q, "B", "26", m, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the following state table of an FSM with two states A and B, one input and\n" +
                        "one output:" + MyTable(9, 6, getLargeText(6, "Present State A", "Present State B", "Input", "Next State A", "Next State B", "Output", "0", "0", "0", "0", "0", "1", "0", "1", "0", "1", "0", "0", "1", "0", "0", "0", "1", "0", "1", "1", "0", "1", "0", "0", "0", "0", "1", "0", "1", "0", "0", "1", "1", "0", "0", "1", "1", "0", "1", "0", "1", "1", "1", "1", "1", "0", "0", "1", "", ""), true, false) +
                        "If the initial state is A = 0, B=0, what is the minimum length of an input string " +
                        "which will take the machine to the state A=0, B=1 with Output=1?",
                "3", "4",
                "5", "6"));
        q = new Question(Q, "A", "27", toc, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a 4 stage pipeline processor. The number of cycles needed by the four\n" +
                        "instructions I1, I2, I3, I4 in stages S1, S2, S3, S4 is shown below:" + MyTable(5, 5, getText(5, "", "S1", "S2", "S3", "S4", "I1", "2", "1", "1", "1", "I2", "1", "3", "2", "2", "I3", "2", "1", "1", "3", "I4", "1", "2", "2", "2", "", "", "", "", ""), true, true) +
                        "What is the number of cycles needed to execute the following loop?$$ $$" +
                        "For (i=1 to 2)$$ $$ {I1; I2; I3; I4;}",
                "16", "23",
                "28", "30"));
        q = new Question(Q, "B", "28", co, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a 4-way set associative cache (initially empty) with total 16 cache" +
                        "blocks. The main memory consists of 256 blocks and the request for memory" +
                        "blocks is in the following order:$$ $$" +
                        "0, 255, 1, 4, 3, 8, 133, 159, 216, 129, 63, 8, 48, 32, 73, 92, 155." +
                        "Which one of the following memory block will NOT be in cache if LRU replacement" +
                        "policy is used?",
                "3", "8", "129", "216"));
        q = new Question(Q, "D", "29", co, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a system with 4 types of resources R1(3units), R2(2units), R3(3" +
                        "units), R4 (2 units). A non-preemptive resource allocation policy is used. At any " +
                        "given instance, a request is not entertained if it cannot be completely satisfied." +
                        "Three processes P1, P2, P3 request the sources as follows if executed " +
                        "independently.$$ $$<B>Process P1: </B>$$ $$" +

                        "t=0: requests 2 units of R2</br> " +
                        "t=1: requests 1 unit of R3 </br>" +
                        "t=3: requests 2 units of R1 </br>" +
                        "t=5: releases 1 unit of R2</br> " +
                        "and 1 unit of R1. </br>" +
                        "t=7: releases 1 unit of R3</br> " +
                        "t=8: requests 2 units of R4</br> " +
                        "t=10: Finishes$$ $$<B>Process P2: </B> $$ $$" +
                        "t=0: requests 2 units of R3 </br>" +
                        "t=2: requests 1 unit of R4</br> " +
                        "t=4: requests 1 unit of R1 </br>" +
                        "t=6: releases 1 unit of R3 </br>" +
                        "t=8: Finishes$$ $$<B>Process P3: </B>$$ $$" +
                        "t=0: requests 1 unit of R4</br> " +
                        "t=2: requests 2 units of R1 </br>" +
                        "t=5: releases 2 units of R1</br> " +
                        "t=7: requests 1 unit of R2 </br>" +
                        "t=8: requests 1 unit of R3 </br>" +
                        "t=9: Finishes$$ $$" +
                        "Which one of the following statements is TRUE if all three processes run" +
                        "concurrently starting at time t=0?$$ $$",
                "All processes will finish without any deadlock",
                "Only P1 and P2 will be in deadlock.",
                "Only P1 and P3 will be in a deadlock.",
                "All three processes will be in deadlock."));
        q = new Question(Q, "A", "30", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a disk system with 100 cylinders. The requests to access the cylinders " +
                        "occur in following sequence:$$ $$4, 34, 10, 7, 19, 73, 2, 15, 6, 20$$ $$" +
                        "Assuming that the head is currently at cylinder 50, what is the time taken to " +
                        "satisfy all requests if it takes 1ms to move from one cylinder to adjacent one and " +
                        "shortest seek time first policy is used?",
                "95ms", "119ms", "233ms", "276ms"));
        q = new Question(Q, "B", "31", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the following process state transition diagram for a uniprocessor system,\n" +
                        "assume that there are always some processes in the ready state:" +
                        "$$ $$<img src='"+path+"qno-32.png'/>$$ $$" +
                        "Now consider the following statements:" +
                        "$$ $$I. If a process makes a transition D, it would result in another process making\n" +
                        "transition A immediately.$$ $$" +
                        "II. A process P2 in blocked state can make transition E while another process P1\n" +
                        "is in running state.$$ $$" +
                        "III. The OS uses preemptive scheduling.$$ $$" +
                        "IV. The OS uses non-preemptive scheduling.<br/>" +
                        "Which of the above statements are TRUE?$$ $$",
                "I and II",
                "I and III",
                "II and III",
                "II and IV"));
        q = new Question(Q, "C", "32", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The enter_CS() and leave_CS() functions to implement critical section of a process are realized using test-and-set instruction as follows:" +
                        getProgram("prog2009-qno-33.c") + "In the above solution, X is a memory location associated with the CS and is initialized to 0. Now consider the following statements: $$ $$I. The above solution to CS problem is deadlock-free $$ $$II. The solution is starvation free. $$ $$III. The processes enter CS in FIFO order. $$ $$IV More than one process can enter CS at the same time.$$ $$ Which of the above statements is TRUE?",
                "I only",
                "I and II",
                "II and III", "IV only"));
        q = new Question(Q, "A", "33", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A multilevel page table is preferred in comparison to a single level page table for translating virtual address to physical address because",
                "It reduces the memory access time to read or write a memory location.",
                "It helps to reduce the size of page table needed to implement the virtual address space of a process.",
                "It is required by the translation look a side buffer.",
                "It helps to reduce the number of page faults in page replacement algorithms."));
        q = new Question(Q, "B", "34", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The running time of an algorithm is represented by the following recurrence relation:$$ $$" +
                        "$T(n) =  \\{\\table\\n,\\n<3;\\T(n/3)+cn,\\otherwise$ $$ $$" +
                        "Which one of the following represents the time complexity of the algorithm?",
                "$θ(n)$",
                "$θ(n log n)$",
                "$θ(n^2)$",
                "$θ(n^2 log n)$"));
        q = new Question(Q, "A", "35", algo, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The keys 12, 18, 13, 2, 3, 23, 5 and 15 are inserted into an initially empty hash" +
                        "table of length 10 using open addressing with hash function h(k) = k mod 10 and" +
                        "linear probing. What is the resultant hash table?",
                MyTable(10, 2, getText(2, "0", "", "1", "", "2", "2", "3", "23", "4", "", "5", "15", "6", "", "7", "", "8", "18", "9", "", "", "", "", "", "", "", "", "", "", ""), false, false),
                MyTable(10, 2, getText(2, "0", "", "1", "", "2", "12", "3", "13", "4", "", "5", "5", "6", "", "7", "", "8", "18", "9", "", "", "", "", "", "", "", "", "", "", ""), false, false),
                MyTable(10, 2, getText(2, "0", "", "1", "", "2", "12", "3", "13", "4", "2", "5", "3", "6", "23", "7", "5", "8", "18", "9", "15", "", "", "", "", "", "", "", "", "", ""), false, false),
                MyTable(10, 2, getText(2, "0", "", "1", "", "2", "12,2", "3", "13,3,23", "4", "", "5", "5,15", "6", "", "7", "", "8", "18", "9", "", "", "", "", "", "", "", "", "", "", ""), false, false)));
        q = new Question(Q, "C", "36", ds, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the maximum height of any AVL-tree with 7 nodes? Assume that the\n" +
                        "height of a tree with a single node is 0.",
                "2", "3", "4", "5"));
        q = new Question(Q, "B", "37", ds, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following graph:$$ $$" +
                        "<img src='"+path+"qno-38.png'/>" +
                        "$$ $$Which one of the following is NOT the sequence of edges added to the minimum\n" +
                        "spanning tree using Kruskal’s algorithm?$$ $$",
                "(b,e) (e,f) (a,c) (b,c) (f,g) (c,d)",
                "(b,e) (e,f) (a,c) (f,g) (b,c) (c,d)",
                "(b,e) (a,c) (e,f) (b,c) (f,g) (c,d)",
                "(b,e) (e,f) (b,c) (a,c) (f,g) (c,d)"));
        q = new Question(Q, "D", "38", algo, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In quick sort, for sorting n elements, the $(n/4)^{th}$ smallest element is selected as\n" +
                        "pivot using an $O(n)$ time algorithm. What is the worst case time complexity of the\n" +
                        "quick sort?",
                "$θ(n)$", "$θ(n log n)$", "$θ(n^2)$", "$θ(n^2 log n)$"));
        q = new Question(Q, "B", "39", algo, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L = L_1 ∩ L_2$ , where $L_1$ and $L_2$ are languages as defined below:" +
                        "$$ $$ $L_1 = {a^m b^m c a^n b^m  | m, n ≥ 0 }$ $$ $$" +
                        "$L_2 = {a^i b^j c^k | i, j, k ≥ 0 }$ $$ $$Then L is",
                "Not recursive",
                "Regular",
                "Context free but not regular",
                "Recursively enumerable but not context free."));
        q = new Question(Q, "C", "40", toc, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("$$ $$<img src='"+path+"qno-41.png'/>" +
                        "$$ $$The above DFA accepts the set of all strings over {0,1} that",
                "begin either with 0 or 1",
                "end with 0",
                "end with 00",
                "contain the substring 00"));
        q = new Question(Q, "C", "41", toc, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are TRUE?$$ $$" +
                        "I There exist parsing algorithms for some programming languages whose\n" +
                        "complexities are less than $θ(n^3).$ $$ $$" +
                        "II A programming language which allows recursion can be implemented with\n" +
                        "static storage allocation.$$ $$" +
                        "III No L-attributed definition can be evaluated in the framework of bottom-up\n" +
                        "parsing.$$ $$" +
                        "IV Code improving transformations can be performed at both source language\n" +
                        "and intermediate code level.",
                "I and II", "I and IV ", "III and IV", "I, III and IV"));
        q = new Question(Q, "C", "42", com, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider two transactions $T_1$ and $T_2$, and four schedules $S_1, S_2, S_3, S_4$ of $T_1$ and $T_2$\n" +
                        "as given below:$$ $$" +
                        "$T_1:R_1[X]W_1[X]W_1[Y]$ $$ $$" +
                        "$T_2:R_2[X]R_2[Y]W_2[Y]$ $$ $$" +
                        "$S_1:R_1[X]R_2[X]R_2[Y]W_1[X]W_1[Y]W_2[Y]$ $$ $$" +
                        "$S_2 : R_1[X] R_2[X] R_2[Y] W_1[X] W_2[Y] W_1[Y]$ $$ $$" +
                        "$S_3 : R_1[X] W_1[X] R_2[X] W_1[Y] R_2[Y] W_2[Y]$ $$ $$" +
                        "$S_1 : R_2[X] R_2[Y]R_1[X]W_1[X] W_1[Y] W_2[Y]$ $$ $$" +
                        "Which of the above schedules are conflict-serializable?",
                "$S_1$ and $S_2$", "$S_2$ and $S_3$", "$S_3$ only", "$S_4$ only"));
        q = new Question(Q, "B", "43", dbms, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following key values are inserted into a B+ - tree in which order of the\n" +
                        "internal nodes is 3, and that of the leaf nodes is 2, in the sequence given below.\n" +
                        "The order of internal nodes is the maximum number of tree pointers in each\n" +
                        "node, and the order of leaf nodes is the maximum number of data items that can\n" +
                        "be stored in it. The B+ - tree is initially empty.10, 3, 6, 8, 4, 2, 1$$ $$The maximum number of times leaf nodes would get split up as a result of these\n" +
                        "insertions is",
                "2", "3", "4", "5"));
        q = new Question(Q, "B", "44", dbms, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let R and S be relational schemes such that R = {a, b, c}and S = {c}.Now consider\n" +
                        "the following queries on the database:$$ $$" +
                        "I.$π_{R-S}(r)-π_{R-S}(π_{R-S}(r)×s-π_{R-S,s}(r))$ $$ $$" +
                        "II.${t|t∈π_{R-S}(r)∧∀u∈s(∃v∈r(u=v[s]∧t=v[R-S]))}$ $$ $$" +
                        "III.${t|t∈π_{R-S}(r)∧∀v∈s(∃v∈r(u=v[s]∧t=v[R-S]))}$ $$ $$" +
                        "IV. Select R.a, R.b</br>" +
                        "From R,S</br>" +
                        "Where R.c=S.c$$ $$" +
                        "Which of the above queries are equivalent?",
                "I and II", "I and III", "II and IV", "III and IV"));
        q = new Question(Q, "D", "45", dbms, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the RSA public key cryptosystem, the private and public keys are (e,n) and " +
                "(d,n) respectively, where n=p*q and p and q are large primes. Besides, n is " +
                "public and p and q are private. Let M be an integer such that 0&lt;M&lt;n and " +
                "$ϕ(n) = (p − 1) (q − 1).$ Now consider the following equations.$$ $$" +
                "I.$M'=M^e mod n,$ </br> $M = (M')^dmod n$ $$ $$" +
                "II.$ed = 1mod n$ $$ $$" + "III.$ed = 1mod ϕ (n)$ $$ $$" + "IV.$M'= M^e mod ϕ(n),$ </br> $M = (M')^d mod ϕ(n)$ $$ $$" +
                "Which of the above equations correctly represent RSA cryptosystem?", "I and II", "I and III", "II and IV", "III and IV"));
        q = new Question(Q, "B", "46", cn, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("While opening a TCP connection, the initial sequence number is to be derived " +
                        "using a time-of-day (ToD) clock that keeps running even when the host is down." +
                        "The low order 32 bits of the counter of the ToD clock is to be used for the initial " +
                        "sequence numbers. The clock counter increments once per millisecond. The maximum packet lifetime is given to be 64s.$$ $$" +
                        "Which one of the choices given below is closest to the minimum permissible rate " +
                        "at which sequence numbers used for packets of a connection can increase?",
                "0.015/s", "0.064/s", "0.135/s", "0.327/s"));
        q = new Question(Q, "B", "47", cn, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G(x) be the generator polynomial used for CRC checking. What is the " +
                        "condition that should be satisfied by G(x) to detect odd number of bits in error?",
                "G(x) contains more than two terms",
                "G(x) does not divide $1+x^k,$ for any k not exceeding the frame length",
                "1+x is a factor of G(x)",
                "G(x) has an odd number of terms."));
        q = new Question(Q, "C", "48", cn, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are TRUE?$$ $$" +
                        "I The context diagram should depict the system as a single bubble.$$ $$" +
                        "II External entities should be identified clearly at all levels of DFDs.$$ $$" +
                        "III Control information should not be represented in a DFD.$$ $$" +
                        "IV A data store can be connected either to another data store or to an external " +
                        "entity.",
                "II and III", "II and III", "I and III", "I, II and III"));
        q = new Question(Q, "C", "49", oth, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following statements about the cyclomatic complexity of the control " +
                        "flow graph of a program module. Which of these are TRUE?$$ $$" +
                        "I. The cyclomatic complexity of a module is equal to the maximum number of " +
                        "linearly independent circuits in the graph.$$ $$" +
                        "II. The cyclomatic complexity of a module is the number of decisions in the " +
                        "module plus one, where a decision is effectively any conditional statement in " +
                        "the module.$$ $$" +
                        "III. The cyclomatic complexity can also be used as a number of linearly " +
                        "independent paths that should be tested during path coverage testing.",
                "I and II", "II and III", "I and III ", "I, II and III"));
        q = new Question(Q, "B", "50", oth, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 51 & 52 :</B> $$ $$A hard disk has 63 sectors per track, 10 platters each with 2 recording surfaces " +
                        "and 1000 cylinders. The address of a sector is given as a triple c,h,s , where c " +
                        "is the cylinder number, h is the surface number and s is the sector number. Thus," +
                        "the $0^{th}$ sector is addressed as 0,0,0 , the $1^{st}$ sector as 0,0,1 , and so on $$ $$The address <400, 16, 29> corresponds to sector number:",
                "505035", "505036", "505037", "505038"));
        q = new Question(Q, "C", "51", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 51 & 52 :</B> $$ $$A hard disk has 63 sectors per track, 10 platters each with 2 recording surfaces " +
                        "and 1000 cylinders. The address of a sector is given as a triple c,h,s , where c " +
                        "is the cylinder number, h is the surface number and s is the sector number. Thus," +
                        "the $0^{th}$ sector is addressed as 0,0,0 , the $1^{st}$ sector as 0,0,1 , and so on $$ $$The address of the $1039^{th}$ sector is",
                "(0,15,31)", "(0,16,30)", "(0,16,31)", "(0,17,31)"));
        q = new Question(Q, "C", "52", os, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 53 & 54 :</B> $$ $$A sub-sequence of a given sequence is just the given sequence with some " +
                        "elements (possibly none or all) left out. We are given two sequences X[m] and " +
                        "Y[n] of lengths m and n, respectively, with indexes of X and Y starting from 0.$$ $$We wish to find the length of the longest common sub-sequence (LCS) of X[m] " +
                        "and Y[n] as l(m,n), where an incomplete recursive definition for the function l(i,j) " +
                        "to compute the length of the LCS of X[m] and Y[n] is given below:$$ $$" +
                        "l (i, j) = 0, if either i=0 or j=0$$ $$" +
                        "= expr1, if i,j>0 and X [i-1]=Y[j-1]$$ $$" +
                        "= expr2, if i,j>0 and X [i-1]=Y[j-1]$$ $$Which one of the following options is correct?",
                "expr1 = l (i − 1, j) + 1",
                "expr1 = l (i, j − 1)",
                "expr2 = max (l (i − 1, j), l (i,j-1))",
                "expr2 = max (l (i − 1, j − 1), l (i,j))"));
        q = new Question(Q, "C", "53", algo, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 53 & 54 :</B> $$ $$A sub-sequence of a given sequence is just the given sequence with some " +
                        "elements (possibly none or all) left out. We are given two sequences X[m] and " +
                        "Y[n] of lengths m and n, respectively, with indexes of X and Y starting from 0.$$ $$" +
                        "The values of l(i,j) could be obtained by dynamic programming based on the " +
                        "correct recursive definition of l(i,j) of the form given above, using an array " +
                        "L[M,N], where M = m+1 and N=n+1, such that L[i,j] = l(i,j).$$ $$" +
                        "Which one of the following statements would be TRUE regarding the dynamic " +
                        "programming solution for the recursive definition of l(i,j)?",
                "All elements L should be initialized to 0 for the values of l(i,j) to be properly " +
                        "computed.",
                "The values of l(i,j) may be computed in a row major order or column major " +
                        "order of L(M,N).",
                "The values of l(i,j) cannot be computed in either row major order or column " +
                        "major order of L(M,N).",
                "L[p,q] needs to be computed before L[r,s] if either p&lt;r or q&lt;s."));
        q = new Question(Q, "B", "54", algo, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 55 & 56 :</B> $$ $$" +
                        "Consider the following relational schema:$$ $$" +
                        "Suppliers(sid:integer, sname:string, city:string, street:string)$$ $$" +
                        "Parts(pid:integer, pname:string, color:string)$$ $$" +
                        "Catalog(sid:integer, pid:integer, cost:real)$$ $$" +
                        "Consider the following relational query on the above database:" +
                        "$$ $$SELECT S.sname<br/>" +
                        "FROM Suppliers S<br/>" +
                        "WHERE S.sid NOT IN (SELECT C.sid<br/>" +
                        "FROM Catalog C<br/>" +
                        "WHERE C.pid NOT (SELECT P.pid<br/>" +
                        "FROM Parts P<br/>" +
                        "WHERE P.color<> 'blue'))" +
                        "$$ $$Assume that relations corresponding to the above schema are not empty. Which\n" +
                        "one of the following is the correct interpretation of the above query?",
                " Find the names of all suppliers who have supplied a non-blue part.",
                " Find the names of all suppliers who have not supplied a non-blue part.",
                " Find the names of all suppliers who have supplied only blue parts.",
                " Find the names of all suppliers who have not supplied only blue parts."));
        q = new Question(Q, "A", "55", dbms, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 55 & 56 :</B> $$ $$" +
                        "Consider the following relational schema:$$ $$" +
                        "Suppliers(sid:integer, sname:string, city:string, street:string)$$ $$" +
                        "Parts(pid:integer, pname:string, color:string)$$ $$" +
                        "Catalog(sid:integer, pid:integer, cost:real)$$ $$" +
                        "Consider the following relational query on the above database:" +
                        "$$ $$SELECT S.sname<br/>" +
                        "FROM Suppliers S<br/>" +
                        "WHERE S.sid NOT IN (SELECT C.sid<br/>" +
                        "FROM Catalog C<br/>" +
                        "WHERE C.pid NOT (SELECT P.pid<br/>" +
                        "FROM Parts P<br/>" +
                        "WHERE P.color<> 'blue'))" +
                        "$$ $$Assume that, in the suppliers relation above, each supplier and each street within " +
                        "a city has a unique name, and (sname, city) forms a candidate key. No other " +
                        "functional dependencies are implied other than those implied by primary and " +
                        "candidate keys. Which one of the following is TRUE about the above schema?",
                "The schema is in BCNF", "The schema is in 3NF but not in BCNF",
                "The schema is in 2NF but not in 3NF", "The schema is not in 2NF"));
        q = new Question(Q, "A", "56", dbms, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 57 & 58 :</B> $$ $$" +
                "Frames of 1000 bits are sent over a $10^6$ bps duplex link between two hosts. The " +
                "propagation time is 25ms. Frames are to be transmitted into this link to " +
                "maximally pack them in transit (within the link).$$ $$" +
                "What is the minimum number of bits (l) that will be required to represent the " +
                "sequence numbers distinctly? Assume that no time gap needs to be given " +
                "between transmission of two frames.", "l=2", "l=3", "l=4", "l=5"));
        q = new Question(Q, "A", "57", cn, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 57 & 58 :</B> $$ $$" +
                "Frames of 1000 bits are sent over a $10^6$ bps duplex link between two hosts. The " +
                "propagation time is 25ms. Frames are to be transmitted into this link to " +
                "maximally pack them in transit (within the link).$$ $$" +
                "Suppose that the sliding window protocol is used with the sender window size of " +
                "$2^l,$ where l is the number of bits identified in the earlier part and " +
                "acknowledgements are always piggy backed. After sending $2^l$ frames, what is the " +
                "minimum time the sender will have to wait before starting transmission of the " +
                "next frame? (Identify the closest choice ignoring the frame processing time.)", "16ms", "18ms", "20ms", "22ms"));
        q = new Question(Q, "B", "58", cn, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 59 & 60 :</B> $$ $$" +
                        "Consider a binary max-heap implemented using an array.$$ $$Which one of the following array represents a binary max-heap?",
                "{25,12,16,13,10,8,14}", "{25,14,13,16,10,8,12}", "{25,14,16,13,10,8,12}", "{25,14,12,13,10,8,16}"));
        q = new Question(Q, "C", "59", algo, "2", year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B> Linked Question 59 & 60 :</B> $$ $$" +
                        "Consider a binary max-heap implemented using an array$$ $$What is the content of the array after two delete operations on the correct " +
                        "answer to the previous question?",
                "{14,13,12,10,8}", "{14,12,13,8,10}", "{14,13,8,12,10}", "{14,13,12,8,10}"));
        q = new Question(Q, "D", "60", algo, "2", year, explanation, false);
        this.addQuestion(q);
    }



    //**** 2010 questions starts *****//


    private void addQuestions2010() {

        year = "2010";
        path = "file:///android_asset/2010/";
        marks="1";
        Q = getQuestion(getstring("Let G = (V,E) be a graph. Define ξ(G) = $∑↙d i_d$ x d, where $i_d$ is the number of vertices of degree d in G. If S and T are two different trees with ξ(S) = ξ(T),then",
                "|S| = 2|T|",
                "|S| = |T|-1",
                "|S| = |T|",
                "|S| = |T|+1"));
        q = new Question(Q, "C", "1", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Newton-Raphson method is used to compute a root of the equation $x^2-13=0$ with 3.5 as the initial value. The approximation after one iteration is",
                "3.575", "3.676", "3.667", "3.607"));
        q = new Question(Q, "D", "2", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the possible number of reflexive relations on a set of 5 elements?",
                "$2^{10}$", "$2^{15}$", "$2^{20}$", "$2^{25}$"));
        q = new Question(Q, "C", "3",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the set $S = \\{1, ω, ω^2\\},$ where $ω$ and $ω^2$ are cube roots of unity. " +
                        "If * denotes the multiplication operation, the structure (S, *) forms",
                "A group", "A ring", "An integral domain", "A field"));
        q = new Question(Q, "A", "4",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the value of${Lim}↙{n->∞}(1-1/n)^{2n} ?$",
                "0", "$e^{-2}$", "$e^{-1/2}$", "1"));
        q = new Question(Q, "B", "5",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The minterm expansion of $f(P, Q, R) = PQ + QR↖{-} + PR↖{-}$ is",
                "m2 + m4 + m6 + m7",
                "m0 + m1 + m3 + m5",
                "m0 + m1 + m6 + m7",
                "m2 + m3 + m4 + m5"));
        q = new Question(Q, "A", "6", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A main memory unit with a capacity of 4 megabytes is built using 1M x 1-bit DRAM chips. " +
                        "Each DRAM chip has 1K rows of cells with 1K cells in each row. The time taken for a single" +
                        " refresh operation is 100 nanoseconds.The time required to perform one refresh operation on " +
                        "all the cells in the memory unit is:",
                "100 nanoseconds", "$100*2^{10}$ nanoseconds",
                "$100*2^{20}$ nanoseconds", "$3200*2^{20}$ nanoseconds"));
        q = new Question(Q, "D", "7",  co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("P is a 16-bit signed integer. The 2's complement representation of P is $(F87B)_16$.The 2's complement representation of 8*P",
                "$(C3D8)_{16}$", "$(187B)_{16}$",
                "$(F878)_{16}$", "$(987B)_{16}$"));
        q = new Question(Q, "A", "8",  digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The Boolean expression for the output 'f' of the multiplexer shown below is$$ $$<img src='" + path + "qno-9.png'/>",
                "$\\ov{P ⊕ Q ⊕ R}$", "$P ⊕ Q ⊕ R$",
                "$P + Q + R$", "$\\ov{P + Q + R}$"));
        q = new Question(Q, "B", "9",  digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a binary tree with n nodes, every node has an odd number of descendants." +
                        "Every node is considered to be its own descendant. What is the number of nodes" +
                        "in the tree that have exactly one child?",
                "0", "1", "$(n-1)/2$", "$n-1$"));
        q = new Question(Q, "A", "10",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What does the following program print?$$ $$" + getProgram("prog2010-qno-10.c"),
                "22", "21",
                "01", "02"));
        q = new Question(Q, "D", "11",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Two alternative packages A and B are available for " +
                        " processing a database having $10^k$ records.Package A " +
                        " requires 0.0001n2 time units and package B requires " +
                        " 10nlog10n time units to process n records.What is the smallest value " +
                        " of k for which package B will be preferred over A?",
                "12", "10", "6", "5"));
        q = new Question(Q, "C", "12",  cn, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Which data structure in a compiler is used for managing information about" +
                        "variables and their attributes?",
                "Abstract syntax tree", "Symbol table", "Semantic stack", "Parse table"));
        q = new Question(Q, "B", "13", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which languages necessarily need heap allocation in the runtime environment?",
                "Those that support recursion", "Those that use dynamic scoping",
                "Those that allow dynamic data structures",
                "Those that use global variables"));
        q = new Question(Q, "C", "14",  com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("One of the header fields in an IP datagram is the Time to Live (TTL) field. Which" +
                        " of the following statements best explains the need for this field?",
                "It can be used to prioritize packets",
                "It can be used to reduce delays", "It can be used to optimize throughput",
                "It can be used to prevent packet looping"));
        q = new Question(Q, "D", "15",  cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is not a client server application?",
                "Internet chat", "Web browsing", "E-mail", "Ping"));
        q = new Question(Q, "D", "16",  cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let L1 be a recursive language. Let L2 and L3 be languages that are recursively" +
                        " enumerable but not recursive. Which of the following statements is not" +
                        " necessarily true?",
                "L2 – L1 is recursively enumerable",
                "L1 – L3 is recursively enumerable",
                "L2 ∩ L1 is recursively enumerable", "L2 ∪ L1 is recursively enumerable"));
        q = new Question(Q, "B", "17",  toc, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a $B^+$-tree in which the maximum number of keys in a node is 5. What is" +
                        "the minimum number of keys in any non-root node?",
                "1", "2", "3", "4"));
        q = new Question(Q, "B", "18",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A relational schema for a train reservation database is given below" +
                        " Passenger (Pid, Pname, Age)" +
                        "Reservation (Pid, Class, Tid)" +
                        "$$ $$Table :Passenger" +
                        MyTable(5, 3, getText(3, "Pid", "Pname", "Age", "0", "Sachin", "65", "1", "Rahul", "66", "2", "Sourav", "67", "3", "Anil", "69", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$Table :Reservation" + MyTable(7, 3, getText(3, "Pid", "Class", "Tid", "0", "'AC'", "8200", "1", "'AC'", "8201", "2", "'SC'", "8201", "5", "'AC'", "8203", "1", "'SC'", "8204", "3", "'AC'", "8202", "", "", "", "", "", "", "", "", ""), true, false) + "" +
                        "What Pids are returned by the following SQL query for the above instance of the" +
                        "tables?$$ $$" +
                        "SELECT Pid$$ $$" +
                        "FROM Reservation$$ $$" +
                        "WHERE Class = 'AC' AND$$ $$" +
                        "EXISTS (SELECT *$$ $$" +
                        "FROM Passenger$$ $$" +
                        "WHERE age >65 AND$$ $$" +
                        "Passenger.Pid = Reservation.Pid)$$ $$",
                "1,0",
                "1,2",
                "1,3", "1,5"));
        q = new Question(Q, "C", "19",  dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following concurrency control protocols ensure both conflict" +
                        " serializability and freedom from deadlock?$$ $$" +
                        "I. 2-phase locking$$ $$" +
                        "II. Time-stamp ordering",
                "I only", "II only", "Both I and II", "Neither I nor II"));
        q = new Question(Q, "B", "20", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The cyclomatic complexity of each of the modules A and B shown below is 10." +
                        " What is the cyclomatic complexity of the sequential integration shown on the below?$$ $$" +
                        "<img src='" + path + "qno-21.png'/>"
                ,
                "19",
                "21",
                "20", "10"));
        q = new Question(Q, "A", "21",  oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the appropriate pairing of items in the two columns listing various" +
                        " activities encountered in a software life cycle?$$ $$" +
                        MyTable(4, 2, getText(2, "P. Requirements Capture", "1. Module Development and Integration",
                                "Q. Design", "2. Domain Analysis", "R. Implementation",
                                "3. Structural and Behavioral Modeling", "S. Maintenance",
                                "4. Performance Tuning", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false),
                "P-3, Q-2,R-4,S-1",
                "P-2, Q-3,R-1,S-4",
                "P-3, Q-2,R-1,S-4", "P-2, Q-3,R-4,S-1"));
        q = new Question(Q, "B", "22", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the methods used by processes P1 and P2 for accessing their critical" +
                        " sections whenever needed, as given below. The initial values of shared boolean" +
                        " variables S1 and S2 are randomly assigned." +
                        MyTable(2, 2, getText(2, "Method used by PI", "Method used by P2",
                                "while (S1 = = S2) ;$$ $$" +
                                        "Critical Section$$ $$" +
                                        "S1 = S2;", "while (S1 != S2) ;$$ $$" +
                                        "Critical Section$$ $$" +
                                        "S2 = not (S1);", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) + "Which one of the following statements describes the properties achieved?",
                "Mutual exclusion but not progress",
                "Progress but not mutual exclusion",
                "Neither mutual exclusion nor progress", "Both mutual exclusion and progress"));
        q = new Question(Q, "A", "23", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A system uses FIFO policy for page replacement. It has 4 page frames with no" +
                        " pages loaded to begin with. The system first accesses 100 distinct pages in some" +
                        " order and then accesses the same 100 pages but now in the reverse order. How" +
                        " many page faults will occur?",
                "196", "192", "197", "195"));
        q = new Question(Q, "A", "24",  os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are true?$$ $$" +
                        "I. Shortest remaining time first scheduling may cause starvation$$ $$" +
                        "II. Preemptive scheduling may cause starvation$$ $$" +
                        "III. Round robin is better than FCFS in terms of response time",
                "I only", "I and III only", "II and III only", "I, II and III"));
        q = new Question(Q, "D", "25", os, marks, year, explanation, false);
        this.addQuestion(q);

        //Q. No. 26 – 55 Carry Two Marks Each
        marks="2";

        Q = getQuestion(getstring("Consider a company that assembles computers. The probability of a faulty" +
                        " assembly of any computer is p. The company therefore subjects each" +
                        " computer to a testing process. This testing process gives the correct result for" +
                        " any computer with a probability of q. What is the probability of a computer" +
                        " being declared faulty?",
                "pq + (1 - p)(1 - q)",
                "(1 - q) p", "(1 - p) q", "pq"));
        q = new Question(Q, "D", "26", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the probability that divisor of $10^99$ is a multiple of $10^96$?",
                "1/625", "4/625", "12/625", "16/625"));
        q = new Question(Q, "A", "27",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The degree sequence of a simple graph is the sequence of the degrees of the" +
                        " nodes in the graph in decreasing order. Which of the following sequences can not" +
                        " be the degree sequence of any graph?$$ $$" +
                        "7, 6, 5, 4, 4, 3, 2, 1$$ $$" +
                        "6, 6, 6, 6, 3, 3, 2, 2$$ $$" +
                        "7, 6, 6, 4, 4, 3, 2, 2$$ $$" +
                        "8, 7, 7, 6, 4, 2, 1, 1",
                "I and II", "III and IV",
                "IV only", "II and IV"));
        q = new Question(Q, "D", "28",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following matrix $$ $$$A=[\\table \\2,\\3;\\x,\\y]$" +
                        " If the eigenvalues of A are 4 and 8, then",
                "x=4, y=10",
                "x=5, y=8",
                "x=-3, y=9", "x=-4, y=10"));
        q = new Question(Q, "D", "29", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose the predicate $F(x, y, t)$ is used to represent the statement that person " +
                        "x can fool person y at time t. which one of the statements below expresses best the meaning" +
                        " of the formula $∀x∃y∃t(¬F(x, y, t))?$",
                " Everyone can fool some person at some time",
                " No one can fool everyone all the time",
                " Everyone cannot fool some person all the time",
                " No one can fool some person at some time"));
        q = new Question(Q, "B", "30", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the Boolean expression for the output f of the combinational logic circuit\n" +
                        " of NOR gates given below?" +
                        "$$ $$<img src='"+path+"qno-31.png'/>",
                "$\\ov{Q+R}$",
                "$\\ov{P+Q}$",
                "$\\ov{P+R}$",
                "$\\ov{P+Q+R}$"));
        q = new Question(Q, "A", "31",  digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the sequential circuit shown below, if the initial value of the output $Q_1Q_0$ is 00,\n" +
                        " what are the next four values of $Q_1Q_0?$" +
                        "$$ $$<img src='"+path+"qno-32.png'/>$$ $$",
                "11,10,01,00",
                "10,11,01,00",
                "10,00,01,11",
                "11,10,00,01"));
        q = new Question(Q, "A", "32",digital, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A 5-stage pipelined processor has Instruction Fetch(IF),Instruction Decode(ID),Operand Fetch(OF),Perform Operation(PO)and Write Operand(WO)stages.The IF,ID,OF and WO stages take 1 clock cycle each for any instruction.The PO stage takes 1 clock cycle for ADD and SUB instructions,3 clock cycles for MUL instruction,and 6 clock cycles for DIV instruction respectively.Operand forwarding is used in the pipeline.What is the number of clock cycles needed to execute the following sequence of instructions?" +
                        MyTable(5, 2, getText(2, "Instruction ", "Meaning of instruction",
                                "I0 :MUL R2 ,R0 ,R1", "R2 ← R0 *R1",
                                "I1 :DIV R5 ,R3 ,R4  ", "R5 ← R3/R4",
                                "I2 :ADD R2 ,R5 ,R2", "R2 ← R5+R2",
                                "I3 :SUB R5 ,R2 ,R6", "R5 ← R2-R6", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false),
                "13",
                "15",
                "17", "19"));
        q = new Question(Q, "C", "33",  co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The weight of a sequence $a_0, a_1, ..., a_{n-1}$ of real numbers is defined " +
                        "as $a_0+a_1/2+...+ a_{n-1}/2^{n-1}$. A subsequence of a sequence is obtained by deleting " +
                        "some elements from the sequence, keeping the order of the remaining elements the same. " +
                        "Let X denote the maximum possible weight of a subsequence of $a_0, a_1, ...,a_{n-1}$  Then X is equal to",
                "max(Y, $a_0$+Y)",
                "max(Y, $a_0$+Y/2)",
                "max(Y, $a_0$+2Y)", "$a_0$+Y/2"));
        q = new Question(Q, "A", "34",  algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the value printed by the following C program?" + getProgram("prog2010-qno-35.c"),
                "-9",
                "5",
                "15", "19"));
        q = new Question(Q, "C", "35",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following C function takes a simply-linked list as input argument. It modifies the list by moving the last element to the front of the list and returns the modified list. Some part of the code is left blank." + getProgram("prog2010-qno-36.c") + "Choose the correct alternative to replace the blank line.",
                "q = NULL; p->next = head; head = p;",
                "q->next = NULL; head = p; p->next = head;",
                "head = p; p->next = q; q->next = NULL;", "q->next = NULL; p->next = head; head = p;"));
        q = new Question(Q, "D", "36",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The program below uses six temporary variables a, b, c, d, e, f." + MyTable(10, 1, getText(1, "a = 1", "b = 10", "c = 20", "d = a+b",
                "e = c+d", "f = c+e", "b = c+e", "e = b+f", "d = 5+e", "return d+f", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "Assuming that all operations take their operands from registers, what is the minimum number " +
                        "of registers needed to execute this program without spilling?",
                "2",
                "3",
                "4", "6"));
        q = new Question(Q, "B", "37",  com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The grammar S → aSa | bS | c is",
                "LL(1) but not LR(1)",
                "LR(1)but not LR(1)",
                "Both LL(1)and LR(1)", "Neither LL(1)nor LR(1)"));
        q = new Question(Q, "C", "38",  com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let L={w ∈ $(0 + 1)^*$|w has even number of 1's}, i.e. L is the set of all bit strings with even number of 1's. Which one of the regular expression below represents L?",
                "$(0^*10^*1)^*$",
                "$0^*(10^*10^*)^*$",
                "$0^*(10^*1^*)^*0^*$", "$0^*1(10^*1)^*10^*$"));
        q = new Question(Q, "B", "39",  toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the languages " +
                        "<br/>$L_1 = {0^i1^j | i != j}.$ <br/> $L_2 = {0^i1^j | i = j}.$ <br/> " +
                        "$L_3 = {0^i1^j | i = 2j+1}.$ <br/> $L_4 = {0^i1^j | i != 2j}.$" +
                        "$$ $$Which one of the following statements is true?",
                "Only $L_2$ is context free",
                "Only $L_2$ and $L_3$ are context free",
                "Only $L_1$ and $L_2$ are context free",
                "All are context free"));
        q = new Question(Q, "D", "40",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let w be any string of length n is $\\{0,1\\}^*.$ " +
                        "Let L be the set of all substrings of w. What is the minimum number " +
                        "of states in a non-deterministic finite automaton that accepts L?",
                "$n-1$", "$n$", "$n+1$", "$2^{n-1}$"));
        q = new Question(Q, "C", "41",  toc, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following schedule for transactions T1, T2 and T3" +
                        MyTable(9, 3, getText(3, "T1", "T2", "T3", "Read(X)", "", "", "", "Read(Y)", "", "", "", "Read(Y)", "", "Write(Y)", "", "Write(X)", "", "", "", "", "Write(X)", "", "Read(X)", "", "", "Write(X)", "", "", "", ""), true, false) + "Which one of the schedules below is the correct serialization of the above?",
                "T1→T3→T2",
                "T2→T1→T3",
                "T2→T3→T1", "T3→T1→T2"));
        q = new Question(Q, "A", "42",  dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following functional dependencies hold for relations " +
                        "$$ $$R(A, B, C) and S(B, D, E)\n" +
                        "<br/>B → A,\n" +
                        "<br/>A → C\n" +
                        "$$ $$The relation R contains 200 tuples and the relation S contains 100 tuples. What is\n" +
                        "the maximum number of tuples possible in the natural join R ▷◁ S?",
                "100",
                "200",
                "300",
                "2000"));
        q = new Question(Q, "A", "43",  dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following program is to be tested for statement coverage:" + getProgram("prog2010-qno-44.c") + "$$ $$" +
                        "The test cases T1, T2, T3 and T4 given below are expressed in terms of the properties satisfied " +
                        "by the values of variables a, b, c and d. The exact values are not given. " +
                        "$$ $$T1 : a, b, c and d are all equal $$ $$T2 : a, b, c and d are all distinct " +
                        "$$ $$T3 : a = b and c != d $$ $$T4 : a != b and c = d " +
                        "$$ $$Which of the test suites given below ensures coverage of statements S1, S2, S3 and S4?",
                "T1, T2, T3", "T2, T4", "T3, T4", "T1, T2, T4"));
        q = new Question(Q, "D", "44", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following program consists of 3 concurrent processes and 3 binary semaphores.The semaphores are initialized as S0 = 1, S1 = 0, S2 = 0." +
                        MyTable(2, 3, getText(3, "Process P0", "Process P1", "Process P2", "while (true) {$$ $$" +
                                "wait (S0);$$ $$" +
                                "print ‘0’$$ $$" +
                                "release (S1);$$ $$" +
                                "release (S2);$$ $$" +
                                "}", "wait (S1);$$ $$" +
                                "Release (S0);", "wait (S2);$$ $$" +
                                "release (S0);", "", "Read(Y)", "", "", "", "Read(Y)", "", "Write(Y)", "", "Write(X)", "", "", "", "", "Write(X)", "", "Read(X)", "", "", "Write(X)", "", "", "", ""), true, false) + "How many times will process P0 print ‘0’?",
                "At least twice",
                "Exactly twice",
                "Exactly thrice", "Exactly once"));
        q = new Question(Q, "A", "45",  os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A system has n resources R0,...,Rn-1,and k processes P0,....Pk-1.The implementation of" +
                        " the resource request logic of each process Pi is as follows:" +
                        getProgram("prog2010-qno-46.c") + "In which one of the following situations is a deadlock possible?",
                "n=40, k=26",
                "n=21, k=12",
                "n=20, k=10", "n=41, k=19"));
        q = new Question(Q, "B", "46",  os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose computers A and B have IP addresses 10.105.1.113 and 10.105.1.91" +
                        " respectively and they both use the same netmask N. Which of the values of N " +
                        "given below should not be used if A and B should belong to the same network?",
                "255.255.255.0", "255.255.255.128", "255.255.255.192",
                "255.255.255.224"));
        q = new Question(Q, "D", "47", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49:</B>$$ $$" +
                        "A computer system has an L1 cache, an L2 cache, and a main memory unit\n" +
                        "connected as shown below. The block size in L1 cache is 4 words. The block size\n" +
                        "in L2 cache is 16 words. The memory access times are 2 nanoseconds.\n" +
                        "20 nanoseconds and 200 nanoseconds for L1 cache, L2 cache and main memory\n" +
                        "unit respectively." +
                        "$$ $$<img src='"+path+"qno-48.png'/>" +
                        "$$ $$When there is a miss in L1 cache and a hit in L2 cache, a block is transferred\n" +
                        "from L2 cache to L1 cache. What is the time taken for this transfer?",
                "2 nanoseconds",
                "20 nanoseconds",
                "22 nanoseconds",
                "88 nanoseconds"));
        q = new Question(Q, "D", "48", co, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 :</B>$$ $$" +
                        "A computer system has an L1 cache, an L2 cache, and a main memory unit\n" +
                        "connected as shown below. The block size in L1 cache is 4 words. The block size\n" +
                        "in L2 cache is 16 words. The memory access times are 2 nanoseconds.\n" +
                        "20 nanoseconds and 200 nanoseconds for L1 cache, L2 cache and main memory\n" +
                        "unit respectively." +
                        "$$ $$<img src='"+path+"qno-48.png'/>" +
                        " $$ $$When there is a miss in both L1 cache and L2 cache, first a block is transferred\n" +
                        "from main memory to L2 cache, and then a block is transferred from L2 cache to\n" +
                        "L1 cache. What is the total time taken for these transfers?",
                "222 nanoseconds", "888 nanoseconds",
                "902 nanoseconds", "968 nanoseconds"));
        q = new Question(Q, "D", "49",  co, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 :</B>$$ $$" +
                        "Consider a complete undirected graph with vertex set {0, 1, 2, 3, 4}. Entry $W_{i,j}$ in" +
                        "the matrix W below is the weight of the edge {i, j}.$$ $$$W=[\\table \\0,\\1,\\8,\\1,4;\\1,\\0,\\12,\\4,\\9;\\8,\\12,\\0,\\7,\\3;\\1,\\4,\\7,\\0,\\2;\\4,\\9,\\3,\\2,\\0]$$$ $$" +
                        "What is the minimum possible weight of a spanning tree T in this graph such that" +
                        "vertex 0 is a leaf node in the tree T?",
                "7",
                "8",
                "9", "10"));
        q = new Question(Q, "D", "50", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 :</B>$$ $$" +
                        "Consider a complete undirected graph with vertex set {0, 1, 2, 3, 4}. Entry $W_{i,j}$ in" +
                        "the matrix W below is the weight of the edge {i, j}.$$ $$$W=[\\table \\0,\\1,\\8,\\1,4;\\1,\\0,\\12,\\4,\\9;\\8,\\12,\\0,\\7,\\3;\\1,\\4,\\7,\\0,\\2;\\4,\\9,\\3,\\2,\\0]$$$ $$" +
                        "What is the minimum possible weight of a path P from vertex 1 to vertex 2 in this" +
                        "graph such that P contains at most 3 edges?",
                "7",
                "8",
                "9", "10"));
        q = new Question(Q, "B", "51",  m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 52 & 53 :</B>$$ $$A hash table of length 10 uses open addressing with hash function h(k)=k" +
                        "mod 10, and linear probing. After inserting 6 values into an empty hash table," +
                        "the table is as shown below"
                        + MyTable(10, 2, getText(2, "0", "", "1", "", "2", "42", "3", "23", "4", "34", "5", "52", "6", "46", "7", "33", "8", "", "9", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "$$ $$Which one of the following choices gives a possible order in which the key values" +
                        "could have been inserted in the table?",
                "46, 42, 34, 52, 23, 33",
                "34, 42, 23, 52, 33, 46",
                "46, 34, 42, 23, 52, 33", "42, 46, 33, 23, 34, 52"));
        q = new Question(Q, "C", "52",  ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 52 & 53 :</B>$$ $$A hash table of length 10 uses open addressing with hash function h(k)=k" +
                        "mod 10, and linear probing. After inserting 6 values into an empty hash table," +
                        "the table is as shown below"
                        + MyTable(10, 2, getText(2, "0", "", "1", "", "2", "42", "3", "23", "4", "34", "5", "52", "6", "46", "7", "33", "8", "", "9", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "$$ $$How many different insertion sequences of the key values using the same hash" +
                        "function and linear probing will result in the hash table shown above?",
                "10",
                "20",
                "30", "40"));
        q = new Question(Q, "C", "53",  ds, marks,year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 54 & 55 :</B>$$ $$" +
                        "Consider a network with 6 routers R1 to R6 connected with links having\n" +
                        "weights as shown in the following diagram" +
                        "$$ $$<img src='"+path+"qno-54.png'/>" +
                        "$$ $$All the routers use the distance vector based routing algorithm to update their\n" +
                        "routing tables. Each router starts with its routing table initialized to contain an\n" +
                        "entry for each neighbour with the weight of the respective connecting link.\n" +
                        "After all the routing tables stabilize, how many links in the network will never\n" +
                        "be used for carrying any data?",
                "4",
                "3",
                "2",
                "1"));
        q = new Question(Q, "C", "54",  cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 54 & 55 :</B>$$ $$" +
                        "Consider a network with 6 routers R1 to R6 connected with links having\n" +
                        "weights as shown in the following diagram" +
                        "$$ $$<img src='"+path+"qno-54.png'/>" +
                        "$$ $$Suppose the weights of all unused links in the previous question are changed\n" +
                        "to 2 and the distance vector algorithm is used again until all routing tables\n" +
                        "stabilize. How many links will now remain unused?",
                "0",
                "1",
                "2",
                "3"));
        q = new Question(Q, "B", "55",  cn, marks, year, explanation, false);
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("Choose the most appropriate word from the options given below to the complete" +
                        "the following sentence:" +
                        "His rather casual remarks on politics ___________ his lack of seriousness about" +
                        "the subject.",
                "masked", "belied", "betrayed", "suppressed"));
        q = new Question(Q, "C", "56",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following options is closest in meaning to the word Circuitous.",
                "cyclic", "indirect", "confusing", "crooked"));
        q = new Question(Q, "B", "57",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate word from the options given below to complete the" +
                        "following sentence:" +
                        "If we manage to ____________ our natural resources, we would leave a better" +
                        "planet for our children.",
                "uphold", "restrain", "cherish", "conserve"));
        q = new Question(Q, "D", "58",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("25 persons are in a room. 15 of them play hockey, 17 of them play football and" +
                        "10 of them play both hockey and football. Then the number of persons playing" +
                        "neither hockey nor football is:",
                "2", "17", "13", "3"));
        q = new Question(Q, "D", "59",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The question below consists of a pair of related words followed by four pairs of\n" +
                        "words. Select the pair that best expresses the relation in the original pair.\n" +
                        "<B>Unemployed: Worker</B>",
                "fallow: land", "unaware: sleeper", "wit: jester", "renovated: house"));
        q = new Question(Q, "A", "60",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("If 137+276=435 how much is 731+672?",
                "534", "1403", "1623", "1513"));
        q = new Question(Q, "C", "61",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Hari (H), Gita (G), Irfan (I) and Saira (S) are siblings (i.e. brothers and sisters)." +
                        "All were born on $1^{st}$ january. The age difference between any two successive" +
                        "siblings (that is born one after another) is less than 3 years. Given the following" +
                        "facts:$$ $$" +
                        "i. Hari’s age + Gita’s age > Irfan’s age + Saira’s age$$ $$" +
                        "ii. The age difference between Gita and Saira is 1 year. However Gita is not the$$ $$" +
                        "oldest and Saira is not the youngest.$$ $$" +
                        "iii. There are no twins.$$ $$In what order were they born (oldest first)?",
                "HSIG", "SGHI", "IGSH", "IHSG"));
        q = new Question(Q, "B", "62",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Modern warfare has changed from large scale clashes of armies to suppression of\n" +
                        "civilian populations. Chemical agents that do their work silently appear to be\n" +
                        "suited to such warfare; and regretfully, there exist people in military\n" +
                        "establishments who think that chemical agents are useful tools for their cause.\n" +
                        "Which of the following statements best sums up the meaning of the above passage:",
                "Modern warfare has resulted in civil strife.",
                "Chemical agents are useful in modern warfare.",
                "Use of chemical agents in warfare would be undesirable",
                "People in military establishments like to use chemical agents in war."));
        q = new Question(Q, "D", "63", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("5 skilled workers can build a wall in 20days: 8 semi-skilled workers can build a wall" +
                        "in 25 days; 10 unskilled workers can build a wall in 30days. If a team has 2 skilled, 6" +
                        "semi-skilled and 5 unskilled workers, how long will it take to build the wall?",
                "20", "18", "16", "15"));
        q = new Question(Q, "D", "64",  apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given digits 2,2,3,3,4,4,4,4 how many distinct 4 digit numbers greater than 3000" +
                        "can be formed?",
                "50", "51", "52", "54"));
        q = new Question(Q, "B", "65",  apti, marks, year, explanation, false);
        this.addQuestion(q);

    }


    //**** 2011 questions starts *****//



    private void addQuestions2011() {

        year = "2011";
        marks = "1";
        path = "file:///android_asset/2011/";

        Q = getQuestion(getstring("The simplified SOP (Sum Of Product) form of the boolean expression " +
                        "$(P + \\ov{Q} + \\ov{R})$ . $(P + \\ov{Q} + R)$ . $(P + Q + \\ov{R})$ is" +
                        "",
                "$(\\ov{P}.Q + \\ov{R})$",
                "$(P + \\ov{Q}.\\ov{R})$",
                "$(\\ov{P}.Q + R)$",
                "$(P.Q + R)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "1", digital, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Which one of the following circuits is NOT equivalent to a 2-input XNOR\n" +
                        "(exclusive NOR) gate?",
                "<br/><img src='" + path + "qno-2.png'/>",
                "<br/><img src='" + path + "qno-2-1.png'/>",
                "<br/><img src='" + path + "qno-2-2.png'/>",
                "<br/><img src='" + path + "qno-2-3.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "2", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The minimum number of D flip-flops needed to design a mod-258 counter is.",
                "9",
                "8",
                "512",
                "258"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "3", digital, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("A thread is usually defined as a \"light weight process\" because an operating system (OS) maintains smaller data structures for a thread than for a process. In relation to this, which of the following is TRUE?",
                "On per-thread basis, the OS maintains only CPU register state",
                "The OS does not maintain a separate stack for each thread",
                "On per-thread basis, the OS does not maintain virtual memory state",
                "On per-thread basis, the OS maintains only scheduling and accounting information"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "4", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("K4 and Q3 are graphs with the following structures$$ $$" +
                        "<img src='" + path + "qno-5.png'/>" +
                        "$$ $$Which one of the following statements is TRUE in relation to these graphs?",
                "K4 is planar while Q3 is not",
                "Both K4 and Q3 are planar",
                "Q3 is planar while K4 is not",
                "Neither K4 not Q3 is planar"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "5", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If the difference between expectation of the square of a random variable $(E[X^2])$ and the square of " +
                        "the expectation of the random variable $(E[X^2])$ is denoted by R, then?\n",
                "R = 0",
                "R < 0",
                "R ≥ 0",
                "R > 0"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "6", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The lexical analysis for a modern computer language such as Java needs the power of " +
                        "which one of the following machine models in a necessary and sufficient sense?",
                "Finite state automata",
                "Deterministic pushdown automata",
                "Non-Deterministic pushdown automata",
                "Turing Machine"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "7", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let the page fault service time be 10ms in a computer with average memory access time " +
                        "being 20ns. If one page fault is generated for every $10^6$ memory accesses, what is the effective " +
                        "access time for the memory?",
                "21ns",
                "30ns",
                "23ns",
                "35ns"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "8", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a hypothetical processor with an instruction of type LW R1, 20(R2), " +
                        "which during execution reads a 32-bit word from memory and stores it in a 32-bit register R1. " +
                        "The effective address of the memory location is obtained by the addition of a constant 20 and " +
                        "the contents of register R2. Which of the following best reflects the addressing mode implemented" +
                        " by this instruction for operand in memory?",
                "Immediate Addressing",
                "Register Addressing",
                "Register Indirect Scaled Addressing",
                "Base Indexed Addressing"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "9", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What does the following fragment of C-program print?" +
                        getProgram(year + "/prog2011-qno-22.txt"),
                "GATE2011",
                "E2011",
                "2011",
                "011"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "10", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A max-heap is a heap where the value of each parent is greater than or equal to\n" +
                        "the value of its children. Which of the following is a max-heap?",
                "<br/><img src='" + path + "qno-11-1.png'/>",
                "<br/><img src='" + path + "qno-11-2.png'/>",
                "<br/><img src='" + path + "qno-11-3.png'/>",
                "<br/><img src='" + path + "qno-11-4.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "11", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An algorithm to find the length of the longest monotonically increasing sequence of numbers " +
                        "in an array $A[0:n-1]$ is given below. Let $L_i$ denote the length of the longest monotonically increasing sequence starting at index i in the array" +
                        "$$ $$Initialize $L_{n-1}$ =1$$ $$For all i such that 0 ≤ i ≤ n − 2" +
                        "$\\{\\table \\1+L_{i+1},\\if A[i] < A[i+1];1,\\Otherwise$" +
                        "$$ $$Finally the length of the longest monotonically increasing sequence is\n" +
                        "$Max (L_0,L_1,....,L_{n-1}).$ Which of the following statements is TRUE?",
                "The algorithm uses dynamic programming paradigm",
                "The algorithm has a linear complexity and uses branch and bound paradigm",
                "The algorithm has a non-linear polynomial complexity and uses branch and\n" +
                        "bound paradigm",
                "The algorithm uses divide and conquer paradigm."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "12",algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let P be a regular language and Q be a context free language such that Q ⊆ P.\n" +
                        "(For example, let P be the language represented by the regular expression p*q*\n" +
                        "and Q be $p^n q^n$ |n ∈ N ). Then which of the following is ALWAYS regular?",
                "P ∩ Q",
                "P $-$ Q",
                "∑* $-$ P",
                "∑* $-$ Q"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "13", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a compiler, keywords of a language are recognized during",
                "parsing of the program",
                "the code generation",
                "the lexical analysis of the program",
                "dataflow analysis"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "14",com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A layer-4 firewall (a device that can look at all protocol headers up to the transport layer) CANNOT",
                "block entire HTTP traffic during 9:00PM and 5 :0OAM",
                "block all ICMP traffic",
                "stop incoming traffic from a specific IP address but allow outgoing traffic to the same IP address",
                "block TCP traffic from a specific user on a multi-user system during 9:00PM and 5:00AM"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "15",cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If two fair coins are flipped and at least one of the outcomes is known to be a head, what is the probability that both outcomes are heads?",
                "$1/3$",
                "$1/4$",
                "$1/2$",
                "$2/3$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "16", m, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Consider different activities related to email." +
                        "$$ $$m1: Send an email from a mail client to a mail server\n" +
                        "$$ $$m2: Download an email from mailbox server to a mail client\n" +
                        "$$ $$m3: Checking email in a web browser\n" +
                        "$$ $$Which is the application level protocol used in each activity? ",
                "ml: HTTP m2: SMTP m3: POP",
                "ml: SMTP m2: FTP m3: HTTP",
                "ml: SMTP m2: POP m3: HTTP",
                "ml: POP m2: SMTP m3: IMAP"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "17", cn, marks, year, explanation, false);
        this.addQuestion(q);



        Q = getQuestion(getstring("A company needs to develop a strategy for software product development for which it has a choice of two programming languages L1 and L2. The number of lines of code (LOC) developed using L2 is estimated to be twice the LOC developed with Ll. The product will have to be maintained for five years. Various parameters for the company are given in the table below.$$ $$" +
                        MyTable(5, 3, getText(3, "Parameter", "Language L1", "Language L2", "Man years needed for development",
                                "LOC/10000", "LOC/10000", "Development cost per man year", "Rs. 10,00,000",
                                "Rs. 7,50,000", "Maintenance time", "5 years", "5 years", "Cost of maintenance per year",
                                "Rs. 1,00,000", "Rs. 50,000", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$Total cost of the project includes cost of development and maintenance. What is the LOC for L1 for which the cost of the project using L1 is equal to the cost of the project using L2?",
                "4000",
                "5000",
                "4333",
                "4667"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "18", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let the time taken to switch between user and kernel modes of execution be $t_1$ " +
                        "while the time taken to switch between two processes be $t_2.$ Which of the following is TRUE?",
                "$t_1 > t_2$",
                "$t_1 = t_2$",
                "$t_1 < t_2$",
                "nothing can be said about the relation between $t_1$ and $t_2$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "19", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A company needs to develop digital signal processing software for one of its newest inventions. " +
                        "The software is expected to have 40000 lines of code. The company needs to determine the effort in " +
                        "person-months needed to develop this software using the basic COCOMO model. The multiplicative factor " +
                        "for this model is given as 2.8 for the software development on embedded systems, while the exponentiation " +
                        "factor is given as 1.20. What is the estimated effort in person-months?",
                "234.25",
                "932.50",
                "287.80",
                "122.40"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "20", oth, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Which of the following pairs have DIFFERENT expressive power?",
                "Deterministic finite automata(DFA) and Non-deterministic finite automata(NFA)",
                "Deterministic push down automata(DPDA)and Non-deterministic push down automata(NPDA)",
                "Deterministic single-tape Turing machine and Non-deterministic single-tape Turing machine",
                "Single-tape Turing machine and multi-tape Turing machine"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "21", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("HTML(Hypertext Markup Language) has language elements which permit certain " +
                        "actions other than describing the structure of the web document. Which one of the following " +
                        "actions is NOT supported by pure HTML (without any server or client side scripting)pages?",
                "Embed web objects from different sites into the same page",
                "Refresh the page automatically after a specified interval",
                "Automatically redirect to another page upon download",
                "Display the client time as part of the page"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "22", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is NOT desired in a good Software Requirement Specifications (SRS) document?",
                "Functional Requirements",
                "Non-Functional Requirements",
                "Goals of Implementation",
                "Algorithms for Software Implementation"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "23", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A computer handles several interrupt sources of which the following are relevant for this question." +
                        "$$ $$- Interrupt from CPU temperature sensor" +
                        "<br/>- Interrupt from Mouse" +
                        "<br/>- Interrupt from Keyboard" +
                        "<br/>- Interrupt from Hard Disk" +
                        "$$ $$Which one of these will be handled at the HIGHEST priority?$$ $$",
                "Interrupt from Hard Disk",
                "Interrupt from Mouse",
                "Interrupt from Keyboard",
                "Interrupt from CPU temperature sensor"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "24", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a relational table with a single record for each registered student with the following attributes." +
                        "$$ $$1. Registration_Num: Unique registration number\n" +
                        "   of each registered student\n" +
                        "$$ $$2. UID: Unique identity number, unique at the \n" +
                        "   national level for each citizen\n" +
                        "$$ $$3. BankAccount_Num: Unique account number at\n" +
                        "   the bank. A student can have multiple accounts\n" +
                        "   or join accounts. This attribute stores the \n" +
                        "   primary account number.\n" +
                        "$$ $$4. Name: Name of the student\n" +
                        "$$ $$5. Hostel_Room: Room number of the hostel " +
                        "$$ $$Which one of the following option is INCORRECT?",
                "BankAccount_Num is candidate key",
                "Registration_Num can be a primary key",
                "UID is candidate key if all students are from the same country",
                "If S is a superkey such that S ∩ UID is NULL then S ∪ UID is also a superkey"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "25", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("Which of the given options provides the increasing order of asymptotic\n" +
                        " complexity of functions $f_1,f_2,f_3$ and $f_4?$" +
                        "$$ $$ $f_1(n)=2^n;$ <br/>$f_2(n)=n^{3\\/2};$ <br/>" +
                        "$f_3(n)=n\\ log_2\\ n;$ <br/> $f_4(n)=n^{log_2n};$ $$ $$",
                "$f_3, f_2, f_4,f_1$",
                "$f_3, f_2, f_1,f_4$",
                "$f_2, f_3, f_1,f_4$",
                "$f_2, f_3, f_4,f_1$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "26", algo, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Four matrices $M_1, M_2, M_3$ and $M_4$ of dimensions p×q, q×r, r×s and s×t respectively can be multiplied is several" +
                        " ways with different number of total scalar multiplications. For example, when multiplied as $((M_1 × M_2) × (M_3 × M_4)),$ the total number " +
                        "of multiplications is pqr + rst + prt. When multiplied as $(((M_1 × M_2) × M_3) × M_4),$ the total number of scalar multiplications is " +
                        "pqr + prs + pst. If p = 10, q = 100, r = 20, s = 5 and t = 80, then the number of scalar multiplications needed is:",
                "248000",
                "44000",
                "19000",
                "25000"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "27", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a relational table r with sufficient number of records, having attributes" +
                        "$$ $$ $A_1, A_2,…, A_n$ and let 1 ≤ p ≤ n. Two queries $Q_1$ and $Q_2$ are given below." +
                        "$$ $$ $Q_1: ∏_{{A_1}....{A_n}}$ $(σ_{A_P=c}(r))$ where c is a const" +
                        "$$ $$ $ Q_2: ∏_{{A_1}....{A_n}}$ $(σ_{c_1 ≤ A_P ≤ c_2}(r))$ where $c_1$ and $c_2$ are constants" +
                        "$$ $$The database can be configured to do ordered indexing on $A_P$ or hashing on $A_P.$\n" +
                        "Which of the following statements is TRUE?",
                "Ordered indexing will always outperform hashing for both queries",
                "Hashing will always outperform ordered indexing for both queries",
                "Hashing will outperform ordered indexing on $Q_1,$ but not on $Q_2$",
                "Hashing will outperform ordered indexing on $Q_2,$ but not on $Q_1.$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "28", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the matrix as given below." +
                        "$[\\table \\1,\\2,3;\\0,\\4,\\7;\\0,\\0,\\3]$" +
                        "Which one of the following provides the CORRECT values of eigenvalues of the\n" +
                        "matrix?",
                "1, 4, 3",
                "3, 7, 3",
                "7, 3, 2",
                "1, 2, 3"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "29", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider an instruction pipeline with four stages (S1, S2, S3 and S4) each with\n" +
                        "combinational circuit only. The pipeline registers are required between each stage\n" +
                        "and at the end of the last stage. Delays for the stages and for the pipeline\n" +
                        "registers are as given in the figure." +
                        "$$ $$<img src='"+path+"qno-30.png'/>" +
                        "$$ $$What is the approximate speed up of the pipeline in steady state under ideal\n" +
                        "conditions when compared to the corresponding non-pipeline implementation?$$ $$",
                "4.0",
                "2.5",
                "1.1",
                "3.0"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "30", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Definition of a language L with alphabet {a} is given as following" +
                        "$$ $$ $L= {a^{nk}|k > 0,$ and n is a positive integer constant}" +
                        "$$ $$ What is the minimum number of states needed in a DFA to recognize L? ",
                "$k + 1$",
                "$n + 1$",
                "$2^{n+1}$",
                "$2^{k+1}$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "31", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An 8KB direct mapped write-back cache is organized as multiple blocks, each of\n" +
                        "size 32-bytes. The processor generates 32-bit addresses. The cache controller\n" +
                        "maintains the tag information for each cache block comprising of the following." +
                        "$$ $$1 Valid bit\n" +
                        "$$ $$1 Modified bit" +
                        "" +
                        "$$ $$As many bits as the minimum needed to identify the memory block mapped in\n" +
                        "the cache." +
                        "What is the total size of memory needed at the cache controller to store metadata\n" +
                        "(tags) for the cache?",
                "4864 bits",
                "6144 bits",
                "6656 bits",
                "5376 bits"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An application loads 100 libraries at startup. Loading each library requires exactly\n" +
                        "one disk access. The seek time of the disk to a random location is given as 10ms.\n" +
                        "Rotational speed of disk is 6000rpm. If all 100 libraries are loaded from random\n" +
                        "locations on the disk, how long does it take to load all libraries? (The time to\n" +
                        "transfer data from the disk block once the head has been positioned at the start\n" +
                        "of the block may be neglected)",
                "0.50s",
                "1.50s",
                "1.25s",
                "1.00s"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "33", co, marks, year, explanation, false);
        this.addQuestion(q);
/*   empty    */
        Q = getQuestion(getstring("A deterministic finite automation (DFA)D with alphabet Σ = {a,b} is given below" +
                        "$$ $$<img src='"+path+"qno-34-1.png'/>" +
                        "$$ $$Which of the following finite state machines is a valid minimal DFA which accepts\n" +
                        "the same language as D?$$ $$",
                "<br/><img src='"+path+"qno-34-5.png'/>",
                "<br/><img src='"+path+"qno-34-2.png'/>",
                "<br/><img src='"+path+"qno-34-3.png'/>",
                "<br/><img src='"+path+"qno-34-4.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "34", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following is comment written for a C function" +
                        getProgram(year+"/prog2011-qno-35.txt")+"" +
                        "$$ $$A software test engineer is assigned the job of doing black box testing. He comes\n" +
                        "up with the following test cases, many of which are redundant." +
                        "$$ $$"+MyCustomTable2011()+"$$ $$Which one of the following options provide the set of non-redundant tests using\n" +
                        "equivalence class partitioning approach from input perspective for black box\n" +
                        "testing?",
                "T1,T2,T3,T6",
                "T1,T3,T4,T5",
                "T2,T4,T5,T6",
                "T2,T3,T4,T5"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "35", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Database table by name Loan_Records is given below.$$ $$" +
                        MyTable(4,3,getText(3,"Borrower","Bank_Manager","Loan_ Amount","Ramesh","Sunderajan","10000.00","Suresh","Ramgopal","5000.00","Mahesh","Sunderajan","7000.00","","","","","","","","","","","","","","","","","",""),true,false)+
                        "$$ $$What is the output of the following SQL query?" +
                        getProgram(year+"/prog2011-qno-36.txt")+"",
                "3",
                "9",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "36", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider two binary operators ' ↑ ' and ' ↓ ' with the precedence of operator ↓\n" +
                        "being lower than that of the operator ↑ . Operator ↑ is right associative while\n" +
                        "operator ↓, is left associative. Which one of the following represents the parse\n" +
                        "tree for expression (7 ↓ 3 ↑ 4 ↑ 3 ↓ 2)?",
                "<br/><img src='"+path+"qno-37-1.png'/>",
                "<br/><img src='"+path+"qno-37-2.png'/>",
                "<br/><img src='"+path+"qno-37-3.png'/>",
                "<br/><img src='"+path+"qno-37-4.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "37", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring(" Consider the language L1,L2,L3 as given below." +
                        " $$ $$L1={$0^{p}1^{q}$ | p,q ∈ N}" +
                        " $$ $$L2={$0^{p}1^{q}$ | p,q ∈ N and p=q} " +
                        "$$ $$L3={$0^{p}1^{q}0^{r} $ | p,q,r ∈ N and p=q=r} " +
                        "$$ $$Which of the following statements is NOT TRUE?",
                "Push Down Automata (PDA) can be used to recognize L1 and L2",
                "L1 is a regular language",
                "All the three languages are context free",
                "Turing machine can be used to recognize all the three languages"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "38", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring(" On a non-pipelined sequential processor, a program segment, which is a part of\n" +
                        "the interrupt service routine, is given to transfer 500 bytes from an I/O device to\n" +
                        "memory.$$ $$" +
                        getProgram(year+"/prog2011-qno-39.txt")+
                        "$$ $$Assume that each statement in this program is equivalent to machine instruction which takes one clock " +
                        "cycle to execute if it is a non-load/store instruction. The load-store instructions take two clock cycles to execute. " +
                        "The designer of the system also has an alternate approach of using DMA controller to implement the same transfer. " +
                        "The DMA controller requires 20 clock cycles for initialization and other overheads. Each DMA transfer cycle takes " +
                        "two clock cycles to transfer one byte of data from the device to the memory. What is the approximate speedup when the " +
                        "DMA controller based design is used in place of the interrupt driven program based input-output?",
                "3.4",
                "4.4",
                "5.1",
                "6.7"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "39", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("We are given a set of n distinct elements and an unlabeled binary tree with n\n" +
                        "nodes. In how many ways can we populate the tree with the given set so that it\n" +
                        "becomes a binary search tree?",
                "0",
                "1",
                "n!",
                "${1/{n+1}}.^{2n}C_n$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "40", ds, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("Which one of the following options is CORRECT given three positive integers x, y\n" +
                        "and z, and a predicate" +
                        "$$ $$P (x) = ¬(x = 1) ∧ ∀y (∃z (x = y * z) ⇒ (y = x) ∨ (y = 1)) ",
                "P(x) being true means that x is a prime number",
                "P(x) being true means that x is a number other than 1",
                "P(x) is always true irrespective of the value of x",
                "P(x) being true means that x has exactly two factors other than 1 and x"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "41", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given i = $√{−1},$ what will be the evaluation of the definite integral" +
                        "$$ $$ $∫↙0↖{π/2}{cos x+ i sin x}/{cos x - i sin x} dx?$",
                "0",
                "2",
                "-i",
                "i"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "42", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a database table T containing two columns X and Y each of type integer.\n" +
                        "After the creation of the table, one record (X= 1, Y=l) is inserted in the table.\n" +
                        "Let MX and MY denote the respective maximum values of X and Y among all\n" +
                        "records in the table at any point in time. Using MX and MY, new records are\n" +
                        "inserted in the table 128 times with X and Y values being MX+1, 2*MY+1\n" +
                        "respectively. It may be noted that each time after the insertion, values of MX and\n" +
                        "MY change.\n" +
                        "What will be the output of the following SQL query after the steps mentioned\n" +
                        "above are carried out?" +
                        "$$ $$SELECT Y FROM T WHERE X=7;",
                "127",
                "255",
                "129",
                "257"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "43", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a finite sequence of random values $X = [x_1,x_2,...x_n].$ Let $μ_x$ be the mean\n" +
                        "and $σ_x$ be the standard deviation of X .Let another finite sequence Y of equal\n" +
                        "length be derived from this as $y_i = a* x_i + b,$ where a and b are positive\n" +
                        "constants. Let $μ_y$ be the mean and $σ_y$ be the standard deviation of this\n" +
                        "sequence. Which one of the following statements is INCORRECT?",
                "Index position of mode of X in X is the same as the index position of mode of Y\n" +
                        "in Y.",
                "Index position of median of X in X is the same as the index position of median\n" +
                        "of Y in Y.",
                "$μ_y =$ a$μ_x$ + b",
                "$σ_y=$ a$σ_x$ + b"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "44", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A deck of 5 cards (each carrying a distinct number from 1 to 5) is shuffled\n" +
                        "thoroughly. Two cards are then removed one at a time from the deck. What is\n" +
                        "the probability that the two cards are selected with the number on the first card\n" +
                        "being one higher than the number on the second card?",
                "$1/5$",
                "$4/{25}$",
                "$1/4$",
                "$2/5$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "45", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following table of arrival time and burst time for three processes P0,\n" +
                        "P1 and P2.$$ $$" +
                        MyTable(4, 3,getText(3,"Process","Arrival time","Burst Time","P0","0 ms","9 ms","P1","1 ms","4 ms","P2","2 ms","9 ms","","","","","","","","","","","","","","","","","",""),true,false) +
                        "$$ $$The pre-emptive shortest job first scheduling algorithm is used. Scheduling is\n" +
                        "carried out only at arrival or completion of processes. What is the average\n" +
                        "waiting time for the three processes?",
                "5.0 ms",
                "4.33 ms",
                "6.33 ms",
                "7.33 ms"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "46", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring(" Consider evaluating the following expression tree on a machine with load-store\n" +
                        "architecture in which memory can be accessed only through load and store\n" +
                        "instructions. The variables a, b, c, d and e are initially stored in memory. The\n" +
                        "binary operators used in this expression tree can be evaluated by the machine\n" +
                        "only when the operands are in registers. The instructions produce result only in a\n" +
                        "register. If no intermediate results can be stored in memory, what is the\n" +
                        "minimum number of registers needed to evaluate this expression?" +
                        "$$ $$<img src='"+path+"qno-47.png'/>",
                "2",
                "9",
                "5",
                "3"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "47", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 : </B>$$ $$Consider the following recursive C function that takes two arguments" +
                        "$$ $$" +
                        getProgram(year+"/prog2011-qno-48.txt")+"$$ $$" +
                        "What is the return value of the function foo when it is called as foo (513, 2)?",
                "9",
                "8",
                "5",
                "2"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "48", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 : </B>$$ $$Consider the following recursive C function that takes two arguments" +
                        "$$ $$" +
                        getProgram(year+"/prog2011-qno-48.txt")+"$$ $$" +
                        "What is the return value of the function foo when it is called as foo (345, 10)?",
                "345",
                "12",
                "5",
                "3"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "49", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 : </B>$$ $$Consider the following circuit involving three D-type flip-flops used in a certain\n" +
                        "type of counter configuration." +
                        "$$ $$<img src='"+path+"qno-50.png'/>" +
                        "$$ $$If all the flip-flops were reset to 0 at power on, what is the total number of\n" +
                        "distinct outputs (states) represented by PQR generated by the counter?",
                "3",
                "4",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "50", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 : </B>$$ $$Consider the following circuit involving three D-type flip-flops used in a certain\n" +
                        "type of counter configuration." +
                        "$$ $$<img src='"+path+"qno-50.png'/>" +
                        "$$ $$If at some instance prior to the occurrence of the clock edge, P. Q and R have a\n" +
                        "value 0, 1 and 0 respectively, what shall be the value of PQR after the clock\n" +
                        "edge?",
                "000",
                "001",
                "010",
                "011"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "51", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An undirected graph G(V,E) contains n ( n >2 ) nodes named  $ v_1 , v_2 ,....v_n .$ Two\n" +
                        "nodes $ v_i , v_j$ are connected if and only if 0 < i − j ≤ 2. Each edge $ (v_i ,v_j)$ is\n" +
                        "assigned a weight i + j. A sample graph with n = 4 is shown below" +
                        "$$ $$<img src='"+path+"qno-52.png'/>" +
                        "$$ $$What will be the cost of the minimum spanning tree (MST) of such a graph with n\n" +
                        "nodes?",
                "$1/{12}(11n^2-5n)$",
                "$n^2-n+1$",
                "$6n-11$",
                "$2n+1$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "52",algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An undirected graph G(V,E) contains n ( n >2 ) nodes named  $ v_1 , v_2 ,....v_n .$ Two\n" +
                        "nodes $ v_i , v_j$ are connected if and only if 0 < i − j ≤ 2. Each edge $ (v_i ,v_j)$ is\n" +
                        "assigned a weight i + j. A sample graph with n = 4 is shown below" +
                        "$$ $$<img src='"+path+"qno-52.png'/>" +
                        "$$ $$The length of the path from $v_5$ to $v_6$ in the MST of previous question with $n = 10$\n" +
                        "is",
                "$11$",
                "$25$",
                "$31$",
                "$41$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "53", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a network with five nodes, N1 to N5, as shown below" +
                        "$$ $$<img src='"+path+"qno-54.png'/>" +
                        "$$ $$The net work uses a Distance Vector Routing protocol. Once the routes have\n" +
                        "stabilized, the distance vectors at different nodes are as following" +
                        "$$ $$" +
                        "N1: (0,1,7,8,4)\n" +
                        "<br/>N2 : (1,0,6,7,3)\n" +
                        "<br/>N3: (7,6,0,2,6)\n" +
                        "<br/>N4 : (8,7,2,0,4)\n" +
                        "<br/>N5 : (4,3,6, 4,0)" +
                        "$$ $$Each distance vector is the distance of the best known path at that instance to\n" +
                        "nodes, N1 to N5, where the distance to itself is 0. Also, all links are symmetric\n" +
                        "and the cost is identical in both directions. In each round, all nodes exchange\n" +
                        "their distance vectors with their respective neighbors. Then all nodes update their\n" +
                        "distance vectors. In between two rounds, any change in cost of a link will cause\n" +
                        "the two incident nodes to change only that entry in their distance vectors" +
                        "$$ $$The cost of link N2-N3 reduces to 2 in (both directions). After the next round of\n" +
                        "updates, what will be the new distance vector at node, N3?",
                "(3, 2, 0, 2, 5)",
                "(3, 2, 0, 2, 6)",
                "(7, 2, 0, 2, 5)",
                "(7, 2, 0, 2, 6)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "54", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a network with five nodes, N1 to N5, as shown below" +
                        "$$ $$<img src='"+path+"qno-54.png'/>" +
                        "$$ $$The net work uses a Distance Vector Routing protocol. Once the routes have\n" +
                        "stabilized, the distance vectors at different nodes are as following" +
                        "$$ $$" +
                        "N1: (0,1,7,8,4)\n" +
                        "<br/>N2 : (1,0,6,7,3)\n" +
                        "<br/>N3: (7,6,0,2,6)\n" +
                        "<br/>N4 : (8,7,2,0,4)\n" +
                        "<br/>N5 : (4,3,6, 4,0)" +
                        "$$ $$Each distance vector is the distance of the best known path at that instance to\n" +
                        "nodes, N1 to N5, where the distance to itself is 0. Also, all links are symmetric\n" +
                        "and the cost is identical in both directions. In each round, all nodes exchange\n" +
                        "their distance vectors with their respective neighbors. Then all nodes update their\n" +
                        "distance vectors. In between two rounds, any change in cost of a link will cause\n" +
                        "the two incident nodes to change only that entry in their distance vectors" +
                        "$$ $$After the update in the previous question, the link N1-N2 goes down. N2 will\n" +
                        "reflect this change immediately in its distance vector as cost, ∞ . After the NEXT\n" +
                        "ROUND of update, what will be the cost to N1 in the distance vector of N3?",
                "3",
                "9",
                "10",
                "∞"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "55", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("If Log (P) = (1/2)Log (Q) = (1/3) Log (R), then which of the following options is\n" +
                        "TRUE?",
                "$P^2 = Q^3R^2$",
                "$Q^2 = PR$",
                "$Q^2 = R^3 P$",
                "$R = P^2 Q^2$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "56", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate word(s) from the options given below to complete\n" +
                        "the following sentence." +
                        "$$ $$<B>I  contemplated________Singapore for my vacation but decided against\n" +
                        "it.</B>",
                "To visit",
                "having to visit",
                "visiting",
                "for a visit"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "57", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate word from the options given below to complete the\n" +
                        "following sentence." +
                        "$$ $$<B>If you are trying to make a strong impression on your audience, you\n" +
                        "cannot do so by being understated, tentative or_____________.</B>",
                "Hyperbolic",
                "Restrained",
                "Argumentative",
                "Indifferent"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "58", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the word from the options given below that is most nearly opposite in\n" +
                        "meaning to the given word: Amalgamate",
                "Merge",
                "Split",
                "Collect",
                "Separate"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "59", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following options is the closest in the meaning to the word below:\n" +
                        "Inexplicable",
                "Incomprehensible",
                "Indelible",
                "Inextricable",
                "Infallible"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "60", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("P, Q, R and S are four types of dangerous microbes recently found in a human\n" +
                        "habitat. The area of each circle with its diameter printed in brackets represents\n" +
                        "the growth of a single microbe surviving human immunity system within 24 hours\n" +
                        "of entering the body. The danger to human beings varies proportionately with the\n" +
                        "toxicity, potency and growth attributed to a microbe shown in the figure\n" +
                        "below" +
                        "$$ $$<img src='"+path+"qno-61.png'/>" +
                        "$$ $$A pharmaceutical company is contemplating the development of a vaccine\n" +
                        "against the most dangerous microbe. Which microbe should the company target\n" +
                        "in its first attempt?",
                "P",
                "Q",
                "R",
                "S"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "61", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The variable cost (V) of manufacturing a product varies according to the equation\n" +
                        "V= 4q, where q is the quantity produced. The fixed cost (F) of production of same\n" +
                        "product reduces with q according to the equation F = 100/q. How many units\n" +
                        "should be produced to minimize the total cost (V+F)?",
                "5",
                "4",
                "7",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "62", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A transporter receives the same number of orders each day. Currently, he has\n" +
                        "some pending orders (backlog) to be shipped. If he uses 7 trucks, then at the\n" +
                        "end of the 4th day he can clear all the orders. Alternatively, if he uses only 3\n" +
                        "trucks, then all the orders are cleared at the end of the 10th day. What is the\n" +
                        "minimum number of trucks required so that there will be no pending order at the\n" +
                        "end of the 5th day?",
                "4",
                "5",
                "6",
                "7"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "63", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A container originally contains 10 litres of pure spirit. From this container 1 litre\n" +
                        "of spirit is replaced with 1 litre of water. Subsequently, 1 litre of the mixture is\n" +
                        "again replaced with 1 litre of water and this process is repeated one more time.\n" +
                        "How much spirit is now left in the container?",
                "7.58 litres",
                "7.84 litres",
                "7 litres",
                "7.29 litres"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "64", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Few school curricula include a unit on how to deal with bereavement and\n" +
                        "grief, and yet all students at some point in their lives suffer from losses\n" +
                        "through death and parting.</B>\n" +
                        "Based on the above passage which topic would not be included in a unit on\n" +
                        "bereavement?",
                "how to write a letter of condolence",
                "what emotional stages are passed through in the healing process",
                "what the leading causes of death are",
                "how to give support to a grieving friend"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "65", apti, marks, year, explanation, false);
        this.addQuestion(q);

    }


    //**** 2012 questions starts *****//


    private void addQuestions2012() {

        year = "2012";
        marks = "1";
        path="file:///android_asset/2012/";

        Q = getQuestion(getstring("Which of the following problems are decidable?"+
                        "$$ $$Does a given program ever produce an output?"+
                        "$$ $$If L is context-free language, then, is $\\ov{L}$ also context-free?"+
                        "$$ $$If L is regular language, then, is $\\ov{L}$ also regular?"+
                        "$$ $$If L is recursive language, then, is $\\ov{L}$ also recursive?$$ $$",
                "1,2,3,4",
                "1,2",
                "2,3,4",
                "3,4"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "1", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the language L $-$ {ab, aa, baa}, which of the following strings are in L*?"+
                        "$$ $$abaabaaabaa"+
                        "$$ $$aaaabaaaa"+
                        "$$ $$baaaaabaaaab"+
                        "$$ $$baaaaabaa$$ $$",
                "1,2 and 3",
                "2,3 and 4",
                "1,2 and 4",
                "1,3 and 4"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "2", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the IPv4 addressing format, the number of networks allowed under Class C addresses is",
                "$2^{14}$",
                "$2^7$",
                "$2^{21}$",
                "$2^{24}$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "3", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following transport layer protocols is used to support electronic mail?",
                "SMTP",
                "IP",
                "TCP",
                "UDP"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "4", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a random variable X that takes values $+ 1$ and $- 1$ with probability 0.5 each. The\n" +
                        "values of the cumulative distribution function F(x) at x = $- 1$ and $+ 1$ are",
                "0 and 0.5",
                "0 and 1",
                "0.5 and 1",
                "0.25 and 0.75"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "5",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Register renaming is done is pipelined processors",
                "as an alternative to register allocation at compile time",
                "for efficient access to function parameters and local variables",
                "to handle certain kinds of hazards",
                "as part of address translation"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "6", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The amount of ROM needed to implement a 4 bit multiplier is",
                "64 bits",
                "128 bits",
                "1 Kbits",
                "2 Kbits"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "7", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let W(n) and A(n) denote respectively, the worst case and average case running time of an\n" +
                        "algorithm executed on an input of size n. Which of the following is ALWAYS TRUE?",
                "A(n) = Ω(W(n))",
                "A(n) = Θ(W(n))",
                "A(n) = O(W(n))",
                "A(n) = o(W(n))"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "8", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a simple undirected planar graph on 10 vertices with 15 edges. If G is a connected\n" +
                        "graph, then the number of bounded faces in any embedding of G on the plane is equal to",
                "3",
                "4",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "9", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The recurrence relation capturing the optimal execution time of the Towers of Hanoi problem\n" +
                        "with n discs is",
                "T(n) = 2T(n − 2) + 2",
                "T(n) = 2T(n − 1) + n",
                "T(n) = 2T(n / 2) + 1",
                "T(n) = 2T(n − 1) + 1"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "10", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are TRUE about an SQL query?" +
                        "$$ $$P: An SQL query can contain a HAVING clause even if it does not have a\n" +
                        "GROUP BY clause" +
                        "$$ $$Q: An SQL query can contain a HAVING clause only if it has GROUP BY\n" +
                        "clause" +
                        "$$ $$R : All attributes used in the GROUP BY clause must appear in the SELECT\n" +
                        "clause" +
                        "$$ $$S : Not all attributes used in the GROUP BY clause need to appear in the\n" +
                        "SELECT clause",
                "P and R",
                "P and S",
                "Q and R",
                "Q and S"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "11", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the basic ER and relational models, which of the following is INCORRECT?",
                "An attribute of an entity can have more than one value",
                "An attribute of an entity can be composite",
                "In a row of a relational table, an attribute can have more than one value",
                "In a row of a relational table, an attribute can have exactly one value or a NULL value"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "12", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the complement of the language accepted by the NFA shown below?" +
                        "Assume ∑ ={a} and e is the empty string.$$ $$" +
                        "<img src='"+path+"qno-13.png'/> ",
                "∅",
                "{ε}",
                "a*",
                "{a,ε}"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "13", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the correct translation of the following statement into mathematical logic?\n" +
                        "“Some real numbers are rational”",
                "∃x (real(x) ∨ rational (x))",
                "∀x (real(x) → rational (x))",
                "∃x (real(x) ∧ rational (x))",
                "∃x (rational(x) → real (x))"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "14", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let A be the 2 x 2 matrix with elements $a_{11} = a_{12} = a_{21}= + 1$ and $a_{22}$ = $-1.$ Then the eigen values\n" +
                        "of the matrix $A^19$ are",
                "$1024$ and $-1024$",
                "$1024 √2$ and $−1024 √2$",
                "$4 √2$ and − 4 √2",
                "$512 √2$ and $− 512 √2$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "15", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The protocol data unit (PDU) for the application layer in the Internet stack is",
                "Segment",
                "Datagram",
                "Message",
                "Frame"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "16", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the function f(x) = sin(x) in the interval x∈[π / 4,7π / 4]. The number and location\n" +
                        "(s) of the local minima of this function are",
                "One, at π / 2",
                "One, at 3π / 2",
                "Two, at π / 2 and 3π / 2",
                "Two, at π / 4 and 3π / 2"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "17", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A process executes the code" +
                        "$$ $$fork ();" +
                        "$$ $$fork ();" +
                        "$$ $$fork ();" +
                        "$$ $$The total number of child processes created is",
                "3",
                "4",
                "7",
                "8"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "18", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The decimal value 0.5 in IEEE single precision floating point representation has",
                "fraction bits of 000…000 and exponent value of 0",
                "fraction bits of 000…000 and exponent value of -1",
                "fraction bits of 100…000 and exponent value of 0",
                "no exact representation"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "19", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The truth table$$ $$" +
                        MyTable(5,3,getText(3,"X","Y","f(X,Y)","0","0","0","0","1","0","1","0","1","1","1","1","","","","","","","","","","","","","","",""), true,false)+
                        "$$ $$represents the Boolean function",
                "X",
                "X$+$Y",
                "X⊕Y",
                "Y"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "20", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The worst case running time to search for an element in a balanced binary search tree with\n" +
                        "$n2^n$ elements is",
                "$Θ(n log n)$",
                "$Θ (n2^n)$",
                "$Θ(n)$",
                "$Θ(log n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "21", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Assuming P $≠$ NP, which of the following is TRUE?",
                "NP-complete = NP",
                "NP-complete ∩ P = ∅",
                "NP-hard = NP",
                "P = NP-complete"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "22", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What will be the output of the following C program segment?" +
                        getProgram(year+"/prog2012-qno-23.txt")+"",
                " No choice",
                " Choice A",
                " Choice A              \n" +
                        "$$ $$  Choice B No choice",
                " Program gives no output as it is erroneous"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "23", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is TRUE?",
                "Every relation is 3NF is also in BCNF",
                "A relation R is in 3NF if every non-prime attribute of R is fully functionally dependent on\n" +
                        "every key of R",
                "Every relation in BCNF is also in 3NF",
                "No relation can be in both BCNF and 3NF"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "24", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following logical inferences." +
                        "$$ $$ $I_1$ : If it rains then the cricket match will not be played.\n" +
                        "$$ $$The cricket match was played.\n" +
                        "$$ $$Inference: There was no rain." +
                        "$$ $$ $I_2$ : If it rains then the cricket match will not be played.\n" +
                        "$$ $$It did not rain.\n" +
                        "$$ $$Inference: The cricket match was played" +
                        "$$ $$Which of the following is TRUE?",
                "Both $I_1$ and $I_2$ are correct inferences",
                "$I_1$ is correct but $I_2$ is not a correct inference",
                "$I_1$ is not correct but $I_2$ is a correct inference",
                "Both $I_1$ and $I_2$ are not correct inferences"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "25", m, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("Consider the set of strings on {0,1} in which, every substring of 3 symbols has at most two\n" +
                        "zeros. For example, 001110 and 011001 are in the language, but 100010 is not. All strings of\n" +
                        "length less than 3 are also in the language. A partially completed DFA that accepts this\n" +
                        "language is shown below." +
                        "<img src='"+path+"qno-26.png'/>" +
                        "$$ $$<img src='"+path+"qno-26-1.png'/>" +
                        "$$ $$The missing arcs in the DFA are$$ $$",
                MyTable(5,6,getText(6,"","00","01","10","11","q","00","1","0","","","","01","","","","1","","10","0","","","","","11","","","0","",""), true,false),
                MyTable(5,6,getText(6,"","00","01","10","11","q","00","","0","","","1","01","","1","","","","10","","","","0","","11","","0","","",""), true,false),
                MyTable(5,6,getText(6,"","00","01","10","11","q","00","","1","","","0","01","","1","","","","10","","","0","","","11","","0","","",""), true,false),
                MyTable(5,6,getText(6,"","00","01","10","11","q","00","","1","","","0","01","","","","1","","10","0","","","","","11","","","0","",""), true,false)));
        explanation = getExplaination("");
        q = new Question(Q, "D", "26",toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The height of a tree is defined as the number of edges on the longest path in the tree. The\n" +
                        "function shown in the pseudocode below is invoked as height (root) to compute the height of\n" +
                        "a binary tree rooted at the tree pointer root." +
                        getProgram(year+"/prog2012-qno-27.txt")+
                        "The appropriate expressions for the two boxes B1 and B2 are$$ $$",
                " B1: (1+height(n → right))" +
                        "<br/>B2: (1+max(h1,h2))",
                " B1: (1+height(n → right))" +
                        "<br/>B2: (1+max(h1,h2))",
                " B1: (1+height(n → right))" +
                        "<br/>B2: (1+max(h1,h2))",
                "B1: (1+height(n → right))" +
                        "<br/>B2: (1+max(h1,h2))"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "27", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider an instance of TCP’s Additive Increase Multiplicative decrease (AIMD) algorithm\n" +
                        "where the window size at the start of the slow start phase is 2 MSS and the threshold at the\n" +
                        "start of the first transmission is 8 MSS. Assume that a timeout occurs during the fifth\n" +
                        "transmission. Find the congestion window size at the end of the tenth transmission.",
                "8MSS",
                "14MSS",
                "7MSS",
                "12MSS"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "28", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a source computer (S) transmitting a file of size $10^6$ bits to a destination computer\n" +
                        "(D) over a network of two routers $(R_1$ and $R_2)$ and three links $(L_1, L_2,$ and $L_3). L_1$ connects S\n" +
                        "to $R_1; L_2$ connects $R_1$ to $R_2;$ and $L_3$ connects $R_2$ to D. Let each link be of length 100km.\n" +
                        "Assume signals travel over each line at a speed of $10^8$ meters per second. Assume that the\n" +
                        "link bandwidth on each link is 1 Mbps. Let the file be broken down into 1000 packets each of\n" +
                        "size 1000 bits. Find the total sum of transmission and propagation delays in transmitting the\n" +
                        "file from S to D?",
                " 1005ms",
                " 1010ms",
                " 3000ms",
                " 3003ms"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "29", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose $R_1$ (<U>A</U>, B) and $R_2$ (<U>C</U>, D) are two relation schemas. Let $r_1$ and $r_2$ be the\n" +
                        "corresponding relation instances. B is a foreign key that refers to C in $R_2.$ If data in $r_1$ and $r_2$\n" +
                        "satisfy referential integrity constrains, which of the following is ALWAYS TRUE?",
                " $Π_{B}(r_1)-Π_{C}(r_2)$ = ∅",
                " $Π_{C}(r_2)-Π_{B}(r_1)$ = ∅",
                " $Π_{B}(r_1)=Π_{C}(r_2)$",
                " $Π_{B}(r_1)-Π_{C}(r_2)$ ≠ ∅"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "30", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the virtual page reference string" +
                        "$$ $$1,2,3,2,4,1,3,2,4,1" +
                        "$$ $$on a demand paged virtual memory system running on a computer system that has main\n" +
                        "memory size of 3 page frames which are initially empty. Let LRU, FIFO and OPTIMAL\n" +
                        "denote the number of page faults under the corresponding page replacement policy. Then",
                " OPTIMAL < LRU < FIFO",
                " OPTIMAL < FIFO < LRU",
                " OPTIMAL = LRU",
                " OPTIMAL = FIFO"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "31", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A file system with 300 GByte disk uses a file descriptor with 8 direct block addresses, 1\n" +
                        "indirect block address and 1 doubly indirect block address. The size of each disk block is 128\n" +
                        "Bytes and the size of each disk block address is 8 Bytes. The maximum possible file size in\n" +
                        "this file system is",
                "3 KBytes",
                "35 KBytes",
                "280 KBytes",
                "dependent on the size of the disk"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "32", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the directed graph shown in the figure below. There are multiple shortest paths\n" +
                        "between vertices S and T. Which one will be reported by Dijkstra’s shortest path algorithm?\n" +
                        "Assume that, in any iteration, the shortest path to a vertex v is updated only when a strictly\n" +
                        "shorter path to v is discovered.$$ $$" +
                        "<img src='"+path+"qno-33.png'/>",
                "SDT",
                "SBDT",
                "SACDT",
                "SACET"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "33", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A list of n strings, each of length n, is sorted into lexicographic order using the merge-sort\n" +
                        "algorithm. The worst case running time of this computation is",
                " $O (n\\ log\\ n)$",
                " $O (n^2\\ log\\ n)$",
                " $O (n^2 + log\\ n)$",
                " $O (n^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "34", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a complete undirected graph on 6 vertices. If vertices of G are labeled, then the\n" +
                        "number of distinct cycles of length 4 in G is equal to",
                " 15",
                " 30",
                " 90",
                " 360"));
        explanation = getExplaination("");
        q = new Question(Q, "No Correct Option", "35", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("How many onto (or surjective) functions are there from an n-element (n ≥ 2) set to a 2-\n" +
                        "element set?",
                "$2^n$",
                "$2^n-1$",
                "$2^n-2$",
                "$2(2^n-2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "36", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the program given below, in a block-structured pseudo-language with lexical\n" +
                        "scoping and nesting of procedures permitted." +
                        getProgram(year+"/prog2012-qno-37.txt")+
                        "Consider the calling chain: Main → A1 → A2 → A21 → A1\n" +
                        "The correct set of activation records along with their access links is given by",
                "<br/><img src='"+path+"qno-37-1.png'/>",
                "<br/><img src='"+path+"qno-37-2.png'/>",
                "<br/><img src='"+path+"qno-37-3.png'/>",
                "<br/><img src='"+path+"qno-37-4.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "37", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose a circular queue of capacity (n – 1) elements is implemented with an array of n\n" +
                        "elements. Assume that the insertion and deletion operations are carried out using REAR and\n" +
                        "FRONT as array index variables, respectively. Initially, REAR = FRONT = 0. The conditions\n" +
                        "to detect queue full and queue empty are $$ $$",
                "full: (REAR+1) mod n==FRONT  <br/>empty: REAR ==FRONT",
                "full:(REAR+1)mod n==FRONT    <br/>empty: (FRONT+1)mod n==REAR",
                "full: REAR==FRONT  <br/>empty: (REAR+1) mod n ==FRONT",
                "full:(FRONT+1)mod n==REAR   <br/>empty: REAR ==FRONT"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "38", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An Internet Service Provider (ISP) has the following chunk of CIDR-based IP addresses\n" +
                        "available with it: 245.248.128.0/20. The ISP wants to give half of this chunk of addresses to\n" +
                        "Organization A, and a quarter to Organization B, while retaining the remaining with itself.\n" +
                        "Which of the following is a valid allocation of address to A and B?",
                "245.248.136.0/21 and 245.248.128.0/22",
                "245.248.128.0/21 and 245.248.128.0/22",
                "245.248.132.0/22 and 245.248.132.0/21",
                "245.248.136.0/24 and 245.248.132.0/21"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "39", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose a fair six-sided die is rolled once. If the value on the die is 1, 2, or 3, the die is rolled\n" +
                        "a second time. What is the probability that the sum total of values that turn up is at least 6?",
                "$10/21$",
                "$5/12$",
                "$2/3$",
                "$1/6$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "40", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Fetch_And_Add (X, i) is an atomic Read-Modify-Write instruction that reads the value of\n" +
                        "memory location X, increments it by the value i, and returns the old value of X. It is used in\n" +
                        "the pseudocode shown below to implement a busy-wait lock. L is an unsigned integer shared\n" +
                        "variable initialized to 0. The value of 0 corresponds to lock being available, while any nonzero\n" +
                        "value corresponds to the lock being not available.$$ $$" +
                        getProgram(year+"/prog2012-qno-41.txt")+"$$ $$This implementation",
                "fails as L can overflow",
                "fails as L can take on a non-zero value when the lock is actually available",
                "works correctly but may starve some processes",
                "works correctly without starvation"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "41", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the 3 process, P1, P2 and P3 shown in the table.$$ $$" +
                        MyTable(4,3,getText(3,"Process","Arrival time","Time units Required","P1","0","5","P2","1","7","P3","3","4","","","","","","","","","","","","","","","","","",""),true,false)+
                        "$$ $$The completion order of the 3 processes under the policies FCFS and RR2 (round robin\n" +
                        "scheduling with CPU quantum of 2 time units) are",
                "FCFS: P1, P2, P3 RR2: P1, P2, P3",
                "FCFS: P1, P3, P2 RR2: P1, P3, P2",
                "FCFS: P1, P2, P3 RR2: P1, P3, P2",
                "FCFS: P1, P3, P2 RR2: P1, P2, P3"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "42", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the minimal form of the Karnaugh map shown below? Assume that X denotes a don’t\n" +
                        "care term" +
                        MyTable(5, 5,getText(5,"cd↓ \\ ab→","00","01","11","10","00","1","X","X","1","01","X","","","1","11","","","","","10","1","","","X","","","","",""),true,true)+"",
                "$\\ov{b}\\ \\ov{d}$",
                "$\\ov{b}$ $\\ov{d}+\\ov{b}$ $\\ov{c}$",
                "$\\ov{b}$ $\\ov{d}+a\\ov{bc}d$",
                "$\\ov{b}$ $\\ov{d}+$ $\\ov{b}\\ \\ov{c}+\\ov{c}$ $\\ov{d}$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "43", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a weighted graph with edge weights greater than one and G’ be the graph\n" +
                        "constructed by squaring the weights of edges in G. Let T and T’ be the minimum spanning\n" +
                        "trees of G and G’ respectively, with total weights t and t’. Which of the following statements\n" +
                        "is TRUE?",
                "T’ = T with total weight $t’$ = $t^2$",
                "T’ = T with total weight $t’$ < $t^2$",
                "T’ ≠ T but total weight $t’$ = $t^2$",
                "None of these"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "44", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The bisection method is applied to compute a zero of the " +
                        "function $f(x) = x^4 -x^3 - x^2 – 4$ in the\n" +
                        "interval [1,9]. The method converges to a solution after ______ iterations.",
                "1",
                "3",
                "5",
                "7"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "45", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following graph is isomorphic to" +
                        "$$ $$<img src='"+path+"qno-46.png'/>",
                "<br/><img src='"+path+"qno-46-1.png'/>",
                "<br/><img src='"+path+"qno-46-2.png'/>",
                "<br/><img src='"+path+"qno-46-3.png'/>",
                "<br/><img src='"+path+"qno-46-4.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "46", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following transactions with data items P and Q initialized to zero:" +
                        getProgram(year+"/prog2012-qno-47.txt")+
                        "Any non-serial interleaving of $T_1$ and $T_2$ for concurrent execution leads to",
                "a serializable schedule",
                "a schedule that is not conflict serializable",
                "a conflict serializable schedule",
                "a schedule for which precedence graph cannot be drawn"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "47", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 :</B>$$ $$Consider the following relations A, B and C:" +
                        "$$ $$Table A$$ $$"+MyTable(4,3,getText(3,"Id"," Name "," Age ","12","Arun","60","15","Shreya","24","99","Rohit","11","","","","","","","","","","","","","","","","","",""),true,false)+
                        "$$ $$Table B$$ $$"+ MyTable(5,3,getText(3,"Id"," Name "," Age ","15","Shreya","24","25","Hari","40","98","Rohit","20","99","Rohit","11","","","","","","","","","","","","","","",""),true,false)
                        +"$$ $$Table C$$ $$"+MyTable(3,3,getText(3,"Id"," Phone "," Area ","10","2200","02","99","2100","01","","","","","","","","","","","","","","","","","","","","",""),true,false)+
                        "$$ $$How many tuples does the result of the following SQL query contain?" +
                        getProgram(year+"/prog2012-qno-48.txt")+"",
                "4",
                "3",
                "0",
                "1"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "48", dbms, marks, year, explanation,false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 :</B>$$ $$Consider the following relations A, B and C:" +
                        "$$ $$Table A$$ $$"+MyTable(4,3,getText(3,"Id"," Name "," Age ","12","Arun","60","15","Shreya","24","99","Rohit","11","","","","","","","","","","","","","","","","","",""),true,false)+
                        "$$ $$Table B$$ $$"+ MyTable(4,3,getText(3,"Id"," Name "," Age ","15","Shreya","24","25","Hari","40","98","Rohit","20","99","Rohit","11","","","","","","","","","","","","","","",""),true,false)
                        +"$$ $$Table C$$ $$"+MyTable(3,3,getText(3,"Id"," Phone "," Area ","10","2200","02","99","2100","01","","","","","","","","","","","","","","","","","","","","",""),true,false)+
                        "$$ $$How many tuples does the result of the following relational algebra expression contain?\n" +
                        "Assume that the schema of A ∪ B is the same as that of A." +
                        "$$ $$(A ∪ B) $▷◁_{A.Id > 40\\ \\v\\ C.Id > 15}$ C)",
                "7",
                "4",
                "5",
                "9"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "49", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 :</B>$$ $$Consider the following C code segment:" +
                        getProgram(year+"/prog2012-qno-50.txt")+
                        "$$ $$What output will be generated by the given code segment if :\n" +
                        "$$ $$Line 1 is replaced by auto int a = 1;\n" +
                        "$$ $$Line 2 is replaced by register int a = 2;" +
                        "",
                "$\\table \\3,\\1;\\4,\\1;\\4,\\2$",
                "$\\table \\4,\\2;\\6,\\1;\\6,\\1$",
                "$\\table \\4,\\2;\\6,\\2;\\2,\\0$",
                "$\\table \\4,\\2;\\4,\\2;\\2,\\0$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "50", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 :</B>$$ $$Consider the following C code segment:" +
                        getProgram(year+"/prog2012-qno-50.txt")+
                        "$$ $$What output will be generated by the given code segment?" +
                        "",
                "$\\table \\3,\\1;\\4,\\1;\\4,\\2$",
                "$\\table \\4,\\2;\\6,\\1;\\6,\\1$",
                "$\\table \\4,\\2;\\6,\\2;\\2,\\0$",
                "$\\table \\3,\\1;\\5,\\2;\\5,\\2$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "51", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 52 & 53 :</B>$$ $$A computer has a 256 KByte, 4-way set associative, write back data cache with block size of\n" +
                        "32 Bytes. The processor sends 32 bit addresses to the cache controller. Each cache tag\n" +
                        "directory entry contains, in addition to address tag, 2 valid bits, 1 modified bit and 1\n" +
                        "replacement bit" +
                        "$$ $$The number of bits in the tag field of an address is",
                "11",
                "14",
                "16",
                "27"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "52", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 52 & 53 :</B>$$ $$A computer has a 256 KByte, 4-way set associative, write back data cache with block size of\n" +
                        "32 Bytes. The processor sends 32 bit addresses to the cache controller. Each cache tag\n" +
                        "directory entry contains, in addition to address tag, 2 valid bits, 1 modified bit and 1\n" +
                        "replacement bit" +
                        "$$ $$The size of the cache tag directory is",
                "160 Kbits",
                "136 Kbits",
                "40 Kbits",
                "32 Kbits"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "53", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 54 & 55 :</B>$$ $$For the grammar below, a partial LL(1) parsing table is also presented along with the\n" +
                        "grammar. Entries that need to be filled are indicated as E1, E2, and E3. ε is the empty\n" +
                        "string, \\$ indicates end of input, and | separates alternate right hand sides of productions." +
                        "$$ $$S → aAbB | bAaB | ε\n" +
                        "<br/>A → S\n" +
                        "<br/>B → S" +"$$ $$"+
                        MyTable(4,4,getText(4,"","a","b","\\$","S","E1","E2","S → ε","A","A → S","A → S","error","B","B → S","B → S","E3","","","","","","","","","","","","","",""),true,true)+
                        "$$ $$The First and Follow sets for the non-terminals A and B are$$ $$",
                " FIRST(A) = {a, b, ε } = FIRST (B)\n" +
                        " <br/>FOLLOW(A) = {a, b}\n" +
                        " <br/>FOLLOW(B) = {a, b, \\$}",
                " FIRST(A) = {a, b, \\$}\n" +
                        " <br/>FIRST(B) = {a, b, ε }\n" +
                        " <br/>FOLLOW(A) = {a, b}\n" +
                        " <br/>FOLLOW(B) ={\\$}",
                " FIRST(A) = {a, b, ε } = FIRST(B)\n" +
                        " <br/>FIRST(A) = {a, b}\n" +
                        " <br/>FOLLOW(B) = ∅",
                " FIRST(A) = {a, b} = FIRST(B)\n" +
                        " <br/>FIRST(A) = {a, b}\n" +
                        " <br/>FOLLOW(B) ={a, b}"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "54", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 54 & 55 :</B>$$ $$For the grammar below, a partial LL(1) parsing table is also presented along with the\n" +
                        "grammar. Entries that need to be filled are indicated as E1, E2, and E3. ε is the empty\n" +
                        "string, \\$ indicates end of input, and | separates alternate right hand sides of productions." +
                        "$$ $$S → aAbB | bAaB | ε\n" +
                        "<br/>A → S\n" +
                        "<br/>B → S" +"$$ $$"+
                        MyTable(4,4,getText(4,"","a","b","\\$","S","E1","E2","S → ε","A","A → S","A → S","error","B","B → S","B → S","E3","","","","","","","","","","","","","",""),true,true)+
                        "$$ $$The appropriate entries for E1, E2, and E3 are$$ $$",
                " E1: S→aAbB, A→S\n" +
                        " <br/>E2: S→bAaB, B→S\n" +
                        " " +
                        " <br/>E3: B→S ",
                " E1: S→aAbB, S→ε" +
                        "<br/>E2: S→bAaB, S→ε" +
                        "<br/>E3: S→ε ",
                " E1: S→aAbB, S→ε\n" +
                        " <br/>E2: S→bAaB, S→ε\n" +
                        " <br/>E3: B→S ",
                " E1: A→S, S→ε\n" +
                        " <br/>E2: B→S, S→ε\n" +
                        " <br/>E3: B→S"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "55", com, marks, year, explanation, false);
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("The cost function for a product in a firm is given by $5q^2 ,$ where q is the amount of\n" +
                        "production. The firm can sell the product at a market price of Rs.50 per unit. The number of\n" +
                        "units to be produced by the firm such that the profit is maximized is" +
                        "",
                "5",
                "10",
                "15",
                "25"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "56", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate alternative from the options given below to complete the\n" +
                        "following sentence:" +
                        "$$ $$<B>Suresh’s dog is the one ________ was hurt in the stampede.</B>",
                "that",
                "which",
                "who",
                "whom"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "57", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the grammatically INCORRECT sentence",
                "They gave us the money back less the service charges of Three Hundred rupees.",
                "This country's expenditure is not less than that of Bangladesh.",
                "The committee initially asked for a funding of Fifty Lakh rupees, but later settled for a\n" +
                        "lesser sum.",
                "This country's expenditure on educational reforms is very less"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "58", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following options is the closest in meaning to the word given below?\n" +
                        "Mitigate",
                "Diminish",
                "Divulge",
                "Dedicate",
                "Denote"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "59", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate alternative from the options given below to complete the\n" +
                        "following sentence:" +
                        "<B>Despite several __________ the mission succeeded in its attempt to resolve the conflict.</B>",
                "attempts",
                "setbacks",
                "meetings",
                "delegations"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "60", apti, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("Wanted Temporary, Part-time persons for the post of Field Interviewer to conduct personal\n" +
                        "interviews to collect and collate economic data. Requirements: High School-pass, must be\n" +
                        "available for Day, Evening and Saturday work. Transportation paid, expenses reimbursed.\n" +
                        "Which one of the following is the best inference from the above advertisement?",
                "Gender-discriminatory",
                "Xenophobic",
                "Not designed to make the post attractive",
                "Not gender-discriminatory"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "61", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the sequence of terms, AD CG FK JP, the next term is",
                "OV",
                "OW",
                "PV",
                "PW"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "62",apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following assertions are CORRECT?"+
                        "$$ $$P: Adding 7 to each entry in a list adds 7 to the mean of the list\n" +
                        "$$ $$Q: Adding 7 to each entry in a list adds 7 to the standard deviation of the list" +
                        "$$ $$R: Doubling each entry in a list doubles the mean of the list" +
                        "$$ $$S: Doubling each entry in a list leaves the standard deviation of the list unchanged$$ $$",
                "P, Q",
                "Q, R",
                "P, R",
                "R, S"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "63", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("An automobile plant contracted to buy shock absorbers from two suppliers X and Y. X supplies\n" +
                        "60% and Y supplies 40% of the shock absorbers. All shock absorbers are subjected to a quality test.\n" +
                        "The ones that pass the quality test are considered reliable Of X's shock absorbers, 96% are reliable.\n" +
                        "Of Y's shock absorbers, 72% are reliable.\n" +
                        "The probability that a randomly chosen shock absorber, which is found to be reliable, is made by Y is",
                "0.288",
                "0.334",
                "0.667",
                "0.720"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "64",apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A political party orders an arch for the entrance to the ground in which the annual convention is\n" +
                        "being held. The profile of the arch follows the equation $y = 2x − 0.1x^2$  where y is the height of\n" +
                        "the arch in meters. The maximum possible height of the arch is",
                "8 meters",
                "10 meters",
                "12 meters",
                "14 meters"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "65", apti, marks, year, explanation, false);
        this.addQuestion(q);

    }




    //**** 2013 questions starts *****//


    private void addQuestions2013() {

        year = "2013";
        marks = "1";
        path = "file:///android_asset/2013/";

        Q = getQuestion(getstring("Consider an undirected random graph of eight vertices. The probability that there is an edge\n" +
                        "between a pair of vertices is ½. What is the expected number of unordered cycles of length\n" +
                        "three?",
                "$1/8$",
                "$1$",
                "$7$",
                "$8$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "1", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements is/are TRUE for undirected graphs?" +
                        "$$ $$P: Number of odd degree vertices is even.\n" +
                        "<br/>Q: Sum of degrees of all vertices is even.",
                "P only",
                "Q only",
                "Both P and Q",
                "Neither P nor Q"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "2", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Function f is known at the following points:" +
                        "$$ $$"+
                        MyTable(12,2,getText(2,"$x$","$f(x)$","0","0","0.3","0.09","0.6","0.36","0.9","0.81","1.2","1.44","1.5","2.25","1.8","3.24","2.1","4.41","2.4","5.76","2.7","7.29","3.0","9.00","","","","","",""),true,false)+
                        "$$ $$ The value of $∫↖3↙0 f(x)$ dx computed using the trapezoidal rule is",
                "8.983",
                "9.003",
                "9.017",
                "9.045"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "3", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following functions is continuous at x = 3 ?",
                "$f(x)=\\{\\table 2,if\\ x = 3;x-1,if\\ x > 3;{{x+3}/3},if\\ x < 3$",
                "$f(x)=\\{\\table 4,if\\ x = 3;8-x,if\\ x ≠ 3$",
                "$f(x)=\\{\\table x + 3,if\\ x ≤ 3;x-4,if x > 3$",
                "$f(x)=\\{\\table 1/{x^3-27},if\\ x ≠ 3$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "4", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following expressions does NOT represent exclusive NOR of x and y?",
                "xy + x' y'",
                "x ⊕ y'",
                "x' ⊕ y",
                "x' ⊕ y'"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "5", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In a k-way set associative cache, the cache is divided into v sets, each of which consists of k\n" +
                        "lines. The lines of a set are placed in sequence one after another. The lines in set s are\n" +
                        "sequenced before the lines in set (s+1). The main memory blocks are numbered 0 onwards.\n" +
                        "The main memory block numbered j must be mapped to any one of the cache lines from",
                "( j mod v)*k to ( j mod v)*k + (k −1)",
                "( j mod v) to ( j mod v) + (k −1)",
                "( j mod k) to ( j mod k) + (v −1)",
                "( j mod k)* v to ( j mod k)* v + (v −1)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "6", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the time complexity of Bellman-Ford single-source shortest path algorithm on a\n" +
                        "complete graph of n vertices?",
                "$Θ(n^2)$",
                "$Θ(n^2 log n)$",
                "$Θ(n^3)$",
                "$Θ(n^3 log n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "7", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are TRUE?" +
                        "$$ $$ (1) The problem of determining whether there exists a cycle in an undirected graph is in P.\n" +
                        " $$ $$(2) The problem of determining whether there exists a cycle in an undirected graph is in NP.\n" +
                        " $$ $$(3) If a problem A is NP-Complete, there exists a non-deterministic polynomial time\n" +
                        "algorithm to solve A.$$ $$",
                "1,2 and 3",
                "1 and 2 only",
                "2 and 3 only",
                "1 and 3 only"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "8",algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements is/are FALSE?" +
                        "$$ $$(1) For every non-deterministic Turing machine, there exists an equivalent deterministic\n" +
                        "Turing machine.\n" +
                        "$$ $$(2) Turing recognizable languages are closed under union and complementation.\n" +
                        "$$ $$(3) Turing decidable languages are closed under intersection and complementation\n" +
                        "$$ $$(4) Turing recognizable languages are closed under union and intersection.",
                "1 and 4 only",
                "1 and 3 only",
                "2 only",
                "3 only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "9", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Three concurrent processes X, Y, and Z execute three different code segments that access and\n" +
                        "update certain shared variables. " +
                        "<br/>Process X executes the P operation (i.e., wait) on semaphores\n" +
                        "a, b and c; " +
                        "<br/>process Y executes the P operation on semaphores b, c and d; " +
                        "<br/>process Z executes\n" +
                        "the P operation on semaphores c, d, and a before entering the respective code segments. " +
                        "$$ $$After\n" +
                        "completing the execution of its code segment, each process invokes the V operation (i.e.,\n" +
                        "signal) on its three semaphores. " +
                        "<br/>All semaphores are binary semaphores initialized to one.\n" +
                        "$$ $$Which one of the following represents a deadlock-free order of invoking the P operations by\n" +
                        "the processes?$$ $$",
                "X:P(a)P(b)P(c) Y:P(b)P(c)P(d) Z: P(c)P(d)P(a)",
                "X:P(b)P(a)P(c) Y:P(b)P(c)P(d) Z: P(a)P(c)P(d)",
                "X:P(b)P(a)P(c) Y:P(c)P(b)P(d) Z: P(a)P(c)P(d)",
                "X:P(a)P(b)P(c) Y:P(c)P(b)P(d) Z: P(c)P(d)P(a)"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "10", os, marks, year, explanation, false);
        this.addQuestion(q);


        Q = getQuestion(getstring("An index is clustered, if",
                " it is on a set of fields that form a candidate key",
                " it is on a set of fields that include the primary key",
                " the data records of the file are organized in the same order as the data entries of the index",
                " the data records of the file are organized not in the same order as the data entries of the\n" +
                        "index"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "11", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Assume that source S and destination D are connected through two intermediate routers\n" +
                        "labeled R. Determine how many times each packet has to visit the network layer and the data\n" +
                        "link layer during a transmission from S to D." +
                        "<img src='"+path+"qno-12.png'/>",
                "Network layer – 4 times and Data link layer-4 times",
                "Network layer – 4 times and Data link layer-3 times",
                "Network layer – 4 times and Data link layer-6 times",
                "Network layer – 2 times and Data link layer-6 times"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "12",cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The transport layer protocols used for real time multimedia, file transfer, DNS and\n" +
                        "email, respectively are",
                "TCP, UDP, UDP and TCP",
                "UDP, TCP, TCP and UDP",
                "UDP, TCP, UDP and TCP",
                "TCP, UDP, TCP and UDP"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "13", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Using public key cryptography, X adds a digital signature σ to message M, encrypts < M,\n" +
                        "σ >, and sends it to Y, where it is decrypted. Which one of the following sequences of keys is\n" +
                        "used for the operations?",
                "Encryption: X’s private key followed by Y’s private key; Decryption: X’s public key\n" +
                        "followed by Y’s public key",
                "Encryption: X’s private key followed by Y’s public key; Decryption: X’s public key\n" +
                        "followed by Y’s private key",
                "Encryption: X’s public key followed by Y’s private key; Decryption: Y’s public key\n" +
                        "followed by X’s private key",
                "Encryption: X’s private key followed by Y’s public key; Decryption: Y’s private key\n" +
                        "followed by X’s public key"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "14", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the problem domains in Group I with the solution technologies in Group II." +
                        "$$ $$" +
                        MyTable(5, 2,getText(2,"Group I","Group II","(p) Services oriented computing","(1) Interoperability",
                                "(q) Heterogeneous communicating systems","(2) BPMN","(R) Information representation",
                                "(3) Publish-find bind","(S) Process description","(4) XML","","","","","","","","","","","","","","","","","","","",""),true,false),
                "P – 1, Q – 2, R – 3, S – 4",
                "P – 3, Q – 4, R – 2, S – 1",
                "P – 3, Q – 1, R – 4, S – 2",
                "P – 4, Q – 3, R – 2, S – 1"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "15", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A scheduling algorithm assigns priority proportional to the waiting time of a process. Every\n" +
                        "process starts with priority zero(the lowest priority). " +
                        "<br/>The scheduler re-evaluates the process\n" +
                        "priorities every T time units and decides the next process to schedule. Which one of the\n" +
                        "following is TRUE if the processes have no I/O operations and all arrive at time zero?",
                "This algorithm is equivalent to the first-come-first-serve algorithm",
                "This algorithm is equivalent to the round-robin algorithm",
                "This algorithm is equivalent to the shortest-job-first algorithm",
                "This algorithm is equivalent to the shortest-remaining-time-first algorithm"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "16", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the maximum number of reduce moves that can be taken by a bottom-up parser for a\n" +
                        "grammar with no epsilon- and unit-production (i.e., of type A→∈ and A→a) to parse a\n" +
                        "string with n tokens?",
                "$n/2$",
                "$n-1$",
                "$2n-1$",
                "$2^n$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "17", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the languages $L_1 = Φ$ and $L_2 = {a}.$ " +
                        "Which one of the following represents $L_1L_2*∪L_1*$?",
                "{ ∈ }",
                "Φ",
                "a*",
                "{ ε,a }"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "18", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is the tightest upper bound that represents the time complexity of\n" +
                        "inserting an object into a binary search tree of n nodes?",
                "O(1)",
                "O(log n)",
                "O(n)",
                "O(n log n)"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "19", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is the tightest upper bound that represents the number of swaps\n" +
                        "required to sort n numbers using selection sort?",
                "$O(log n)$",
                "$O(n)$",
                "$O(n log n)$",
                "$O(n^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "20", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In the following truth table, V = 1 if and only if the input is valid.$$ $$" +
                        MyHeadingTable(7,3,8 ,getLargeText(7, "", "Inputs", "Outputs", "", "", "", "", "$D_0$", "$D_1$", "$D_2$", "$D_3$", "$X_0$", "$X_1$", "V", "0", "0", "0", "0", "X", "X", "0", "1", "0", "0", "0", "0", "0", "1", "X", "1","0","0","0","1","1","X","X","1","0","1","0","1","X","X","X","1","1","1","1","","","","","","","")) +
                        "$$ $$What function does the truth table represent?",
                "Priority encoder",
                "Decoder",
                "Multiplexer",
                "Demultiplexer"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "21", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The smallest integer than can be represented by an 8-bit number in 2’s complement form is",
                "-256",
                "-128",
                "-127",
                "0"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "22", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following does NOT equal" +
                        "$|\\table 1,x,x^2;1,y,y^2;1,z,z^2|?$",
                "$|\\table 1,x\\ (x+1),x+1;1,y\\ (y+1),y+1;1,z\\ (z+1),z+1|$",
                "$|\\table 1,x+1,x^2+1;1,y+1,y^2+1;1,z+1,z^2+1|$",
                "$|\\table 0,x-y,x^2-y^2;0,y-z,y^2-z^2;1,z,z^2|$",
                "$|\\table 2,x+y,x^2+y^2;2,y+z,y^2+z^2;1,z,z^2|$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "23", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose p is number of cars per minute passing through a certain road junction between 5PM" +
                        " and 6PM, and p has a Poisson distribution with mean 3. What is the probability of\n" +
                        "observing fewer than 3 cars during any given minute in this interval?",
                "$8/(2e^3)$",
                "$9/(2e^3)$",
                "$17/(2e^3)$",
                "$26/(2e^3)$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "24",m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A binary operation ⊕ on a set of integers is defined as  $x ⊕ y = x^2 + y^2 .$ Which one of the\n" +
                        "following statements is TRUE about⊕?",
                "Commutative but not associative",
                "Both commutative and associative",
                "Associative but not commutative",
                "Neither commutative nor associative"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "25", digital, marks, year, explanation, false);
        this.addQuestion(q);


        marks="2";


        Q = getQuestion(getstring("Which one of the following is NOT logically equivalent to " +
                        "$$ $$¬∃x (∀y(α) ∧ ∀z (β))?$$ $$",
                "∀x (∃z (¬β) → ∀y (α))",
                "∀x (∀z (β) → ∃y (¬α))",
                "∀x (∀y (α) → ∃z (¬β))",
                "∀x (∃y (¬α) → ∃z (¬β))"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "26", digital, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A RAM chip has a capacity of 1024 words of 8 bits each (1K×8) . The number of 2×4\n" +
                        "decoders with enable line needed to construct a 16K×16 RAM from 1K×8 RAM is",
                "4",
                "5",
                "6",
                "7"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "27", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider an instruction pipeline with five stages without any branch prediction: Fetch\n" +
                        "Instruction (FI), Decode Instruction (DI), Fetch Operand (FO), Execute Instruction (EI) and\n" +
                        "Write Operand (WO). The stage delays for FI, DI, FO, EI and WO are 5 ns, 7 ns, 10 ns, 8 ns\n" +
                        "and 6 ns, respectively. There are intermediate storage buffers after each stage and the delay of\n" +
                        "each buffer is 1 ns. A program consisting of 12 instructions  $I_1 , I_2 , I_3 ,......I_{12}$ is executed in this\n" +
                        "pipelined processor. Instruction $I_4$ is the only branch instruction and its branch target is $I_9 .$ If\n" +
                        "the branch is taken during the execution of this program, the time (in ns) needed to complete\n" +
                        "the program is",
                "132",
                "165",
                "176",
                "328"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "28", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following operation along with Enqueue and Dequeue operations on queues,\n" +
                        "where k is a global parameter" +
                        getProgram(year+"/prog2013-qno-29.txt")+
                        "What is the worst case time complexity of a sequence of n queue operations on an initially\n" +
                        "empty queue?",
                "$Θ(n)$",
                "$Θ(n+k)$",
                "$Θ(nk)$",
                "$Θ(n^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "29", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The preorder traversal sequence of a binary search tree is 30, 20, 10, 15, 25, 23, 39, 35, 42.\n" +
                        "Which one of the following is the postorder traversal sequence of the same tree?",
                "10,20,15,23,25,35,42,39,30",
                "15,10,25,23,20,42,35,39,30",
                "15,20,10,23,25,42,35,39,30",
                "15,10,23,25,20,35,42,39,30"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "30", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the return value of f (p,p) if the value of p is initialized to 5 before the call? Note\n" +
                        "that the first parameter is passed by reference, whereas the second parameter is passed by\n" +
                        "value." +
                        getProgram(year+"/prog2013-qno-31.txt")+
                        "$$ $$",
                "3024",
                "6561",
                "55440",
                "161051"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "31", ds, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is/are undecidable?" +
                        "$$ $$1. G is a CFG. Is L(G) =Φ?\n" +
                        "<br/>2. G is a CFG. IS L(G) = Σ*?\n" +
                        "<br/>3. M is a Turning machine. Is L(M) regular?\n" +
                        "<br/>4. A is a DFA and N is a NFA. Is L(A) = L(N)?",
                "3 only",
                "3 and 4 only",
                "1, 2 and 3 only",
                "2 and 3 only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following two sets of LR(1) items of an LR(1) grammar" +
                        " $$ $$X → c.X, c/d" +
                        " <br/> X → .cX, c/d" +
                        " <br/>  X → .d, c/d" +
                        " <br/><br/>  X → c.X, \\$" +
                        " <br/>  X → .cX, \\$" +
                        " <br/>  X → .d, \\$" +
                        "$$ $$Which of the following statements related to merging of the two sets in the corresponding LALR parser is/are FALSE?" +
                        "$$ $$1. Cannot be merged since look aheads are different.\n" +
                        "<br/>2. Can be merged but will result in S-R conflict.\n" +
                        "<br/>3. Can be merged but will result in R-R conflict.\n" +
                        "<br/>4. Cannot be merged since goto on c will lead to two different sets.",
                "3 only",
                "3 and 4 only",
                "1, 2 and 3 only",
                "2 and 3 only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "33", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A certain computation generates two arrays a and b such that a[i]=f(i)" +
                        " for 0 ≤ i < n and b[i]=g(a[i]) for 0 ≤ i < n. Suppose this computation is " +
                        "decomposed into two concurrent processes X and Y such that X computes the array a and " +
                        "Y computes the array b. The processes employ two binary semaphores R and S, both initialized to zero. " +
                        "The array a is shared by the two processes. The structures of the processes are shown below." +
                        "$$ $$Process X:" +
                        getProgram(year+"/prog2013-qno-34-1.txt")+"" +
                        "Process Y:"+
                        getProgram(year+"/prog2013-qno-34-2.txt")+"" +
                        "Which one of the following represents the CORRECT implementations of ExitX and EntryY?" +
                        "",
                getProgram(year+"/prog2013-qno-34-3.txt"),
                getProgram(year+"/prog2013-qno-34-4.txt"),
                getProgram(year+"/prog2013-qno-34-5.txt"),
                getProgram(year+"/prog2013-qno-34-6.txt")));
        explanation = getExplaination("");
        q = new Question(Q, "C", "34", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The following figure represents access graphs of two modules M1 and M2. " +
                        "The filled circles represent methods and the unfilled circles represent attributes. " +
                        "If method m is moved to module M2 keeping the attributes where they are, what can we say about the average " +
                        "cohesion and coupling between modules in the system of two modules?" +
                        "$$ $$<img src='"+path+"qno-35.png'/>$$ $$",
                "There is no change",
                "Average cohesion goes up but coupling is reduced",
                "Average cohesion goes down and coupling also reduces",
                "Average cohesion and coupling increase"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "35", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("In an IPv4 datagram, the M bit is 0, the value of HLEN is 10, the value of total length is 400\n" +
                        "and the fragment offset value is 300. The position of the datagram, the sequence numbers of\n" +
                        "the first and the last bytes of the payload, respectively are",
                "Last fragment, 2400 and 2789",
                "First fragment, 2400 and 2759",
                "Last fragment, 2400 and 2759",
                "Middle fragment, 300 and 689"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "36", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Determine the maximum length of cable (in km) for transmitting data at a rate of 500 Mbps in\n" +
                        "an Ethernet LAN with frames of size 10,000 bits. Assume the signal speed in the cable to be\n" +
                        "2,00,000 km/s",
                "1",
                "2",
                "2.5",
                "5"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "37", cn, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following relational schema." +
                        "$$ $$Students(<U>rollno: integer,</U> sname: string)\n" +
                        " $$ $$   Courses(<U>courseno: integer,</U> cname: string)\n" +
                        " $$ $$   Registration(<U>rollno: integer, courseno: integer,</U> percent: real)" +
                        "Which of the following queries are equivalent to this query in English?" +
                        "$$ $$\"Find the distinct names of all students who score \n" +
                        "       more than 90% in the course numbered 107\"$$ $$" +
                        "(I) SELECT DISTINCT S.sname\n" +
                        "<br/>  FROM Students as S, Registration as R\n" +
                        "<br/>  WHERE R.rollno=S.rollno AND R.Courseno=107 AND R.percent>90\n" +
                        "$$ $$(II) $Π_{sname} σ_{courseno = 107 ∧ percent > 90}$ (Registration ▷◁ Students)) \n" +
                        "$$ $$(III) { T | ∃S∈ Students, ∃R∈ Registration (S.rollno = R.rollno ∧\n" +
                        "R.courseno =107 ∧ R.percent > 90 ∧ T.sname = S.name) }\n" +
                        "$$ $$(IV){ <$S_N>| ∃S_R∃R_P$ $( < S_R , S_N > ∈ Students$ ∧ $< S_R ,107,R_P >$ ∈Registration ∧$ R_P$ > 90) }" +
                        "$$ $$",
                "I, II, III and IV",
                "I, II and III only",
                "I, II and IV only",
                "II, III and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "38", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A shared variable x, initialized to zero, is operated on by four concurrent processes W, X, Y, Z as\n" +
                        "follows. Each of the processes W and X reads x from memory, increments by one, stores it to\n" +
                        "memory, and then terminates. Each of the processes Y and Z reads x from memory, decrements by\n" +
                        "two, stores it to memory, and then terminates. Each process before reading x invokes the P\n" +
                        "operation (i.e., wait) on a counting semaphore S and invokes the V operation (i.e., signal) on the\n" +
                        "semaphore S after storing x to memory. Semaphore S is initialized to two. What is the maximum\n" +
                        "possible value of x after all processes complete execution?",
                "-2",
                "-1",
                "1",
                "2"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "39", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the DFA given below." +
                        "$$ $$<img src='"+path+"qno-40.png'/>$$ $$Which of the following are FALSE?" +
                        "" +
                        "$$ $$1. Complement of L(A) is context-free.\n" +
                        "<br/><br/>2. L(A) = L((11*0+0)(0 + 1)*0*1*)\n" +
                        "<br/><br/>3. For the language accepted by A, A is the minimal DFA.\n" +
                        "<br/><br/>4. A accepts all strings over {0, 1} of length at least 2. " +
                        "$$ $$",
                "1 and 3 only",
                "2 and 4 only",
                "2 and 3 only",
                "3 and 4 only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "40", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following languages" +
                        "$$ $$$L_1=\\{0^p1^q0^r|p,q,r ≥ 0 \\}$" +
                        "<br/>$L_1=\\{0^p1^q0^r|p,q,r ≥ 0,\\  p ≠ r \\}$" +
                        "$$ $$Which one of the following statements is FALSE?",
                "$L_2$ is context–free.",
                "$L_1$ ∩ $L_2$ is context-free.",
                "Complement of $L_2$ is recursive.",
                "Complement of $L_1$ is context-free but not regular."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "41", toc, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following function:$$ $$" +
                        getProgram(year+"/prog2013-qno-42.txt")+"",
                "$Θ(n^2)$",
                "$Θ(n^2 log n)$",
                "$Θ(n^3)$",
                "$Θ(n^3 log n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "42", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of elements that can be sorted in Θ(log n) time using heap sort is",
                "$Θ(1)$",
                "$Θ(√{log}\\ n)$",
                "$Θ({log\\ n}/{log\\ log\\ n})$",
                "$Θ(log\\ n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "43", algo, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a hard disk with 16 recording surfaces (0-15) having 16384 cylinders (0-16383)" +
                        " and each cylinder contains 64 sectors (0-63). Data storage capacity in each sector is 512 bytes. Data are organized cylinder-wise and the " +
                        "addressing format is < cylinder no., surface no., sector no. > . A file of size 42797 KB is stored in the disk " +
                        "and the starting disk location of the file is < 1200, 9, 40 >." +
                        " What is the cylinder number of the last sector of the file, if it is stored in a contiguous manner?",
                "1281",
                "1282",
                "1283",
                "1284"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "44", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following sequence of micro-operations." +
                        "$$ $$MBR ← PC \n" +
                        "  <br/>   MAR ← X  \n" +
                        "  <br/>   PC ← Y  \n" +
                        "  <br/>   Memory ← MBR" +
                        "$$ $$Which one of the following is a possible operation performed by this sequence?",
                "Instruction fetch",
                "Operand fetch",
                "Conditional branch",
                "Initiation of interrupt service"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "45", co, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The line graph L(G) of a simple graph G is defined as follows:\n" +
                        "$$ $$• There is exactly one vertex v(e) in L(G) for each edge e in G.\n" +
                        "$$ $$• For any two edges e and e’ in G, L(G) has an edge between v(e) and v(e’), if and only if e\n" +
                        "and e’ are incident with the same vertex in G.\n" +
                        "$$ $$Which of the following statements is/are TRUE?\n" +
                        "$$ $$P.  The line graph of a cycle is a cycle.\n" +
                        "<br/>Q.  The line graph of a clique is a clique.\n" +
                        "<br/>R.  The line graph of a planar graph is planar.\n" +
                        "<br/>S.  The line graph of a tree is a tree.",
                "P only",
                "P and R only",
                "R only",
                "P, Q and S only"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "46", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the logical translation of the following statement?\n" +
                        "$$ $$“None of my friends are perfect.”",
                "∃x (F(x) ∧ ¬P(x))",
                "∃x (¬F(x) ∧ P(x))",
                "∃x (¬F(x) ∧ ¬P(x))",
                "¬∃x (F(x) ∧ P(x))"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "47", m, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 :</B>$$ $$The procedure given below is required to find and replace certain characters inside an input\n" +
                        "character string supplied in array A. The characters to be replaced are supplied in array oldc,\n" +
                        "while their respective replacement characters are supplied in array newc. Array A has a fixed\n" +
                        "length of five characters, while arrays oldc and newc contain three characters each. However, the\n" +
                        "procedure is flawed$$ $$" +
                        getProgram(year+"/prog2013-qno-48.txt")+
                        "$$ $$The procedure is tested with the following four test cases$$ $$" +
                        "$$ $$(1) oldc = \"abc\", newc = \"dab\" " +
                        "<br/>(2) oldc = \"cde\", newc = \"bcd\" " +
                        "<br/>(3) oldc = \"bca\", newc = \"cda\" " +
                        "<br/>(4) oldc = \"abc\", newc = \"bac\"" +
                        "$$ $$The tester now tests the program on all input strings of length five consisting of characters ‘a’, ‘b’, ‘c’, ‘d’ and ‘e’ with duplicates allowed." +
                        " If the tester carries out this testing with the four test cases given above, how many test cases will be able to capture the flaw?",
                "Only one",
                "Only two",
                "Only three",
                "All four"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "48", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 48 & 49 :</B>$$ $$The procedure given below is required to find and replace certain characters inside an input\n" +
                        "character string supplied in array A. The characters to be replaced are supplied in array oldc,\n" +
                        "while their respective replacement characters are supplied in array newc. Array A has a fixed\n" +
                        "length of five characters, while arrays oldc and newc contain three characters each. However, the\n" +
                        "procedure is flawed$$ $$" +
                        getProgram(year+"/prog2013-qno-48.txt")+
                        "$$ $$The procedure is tested with the following four test cases$$ $$" +
                        "$$ $$(1) oldc = \"abc\", newc = \"dab\" " +
                        "<br/>(2) oldc = \"cde\", newc = \"bcd\" " +
                        "<br/>(3) oldc = \"bca\", newc = \"cda\" " +
                        "<br/>(4) oldc = \"abc\", newc = \"bac\"" +
                        "$$ $$if array A is made to hold the string “abcde”, which of the above four test cases will be successful in exposing the flaw in this procedure?",
                "None",
                "2 only",
                "3 and 4 only",
                "4 only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "49", oth, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 :</B>$$ $$The following code segment is executed on a processor which allows only register operands in its instructions." +
                        " Each instruction can have atmost two source operands and one destination operand. " +
                        "Assume that all variables are dead after this code segment.$$ $$" +
                        getProgram(year+"/prog2013-qno-50.txt")+
                        "$$ $$Suppose the instruction set architecture of the processor has only two registers. " +
                        "The only allowed compiler optimization is code motion, which moves statements from one " +
                        "place to another while preserving correctness. What is the minimum number of " +
                        "spills to memory in the compiled code?",
                "0",
                "1",
                "2",
                "3"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "50", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 50 & 51 :</B>$$ $$The following code segment is executed on a processor which allows only register operands in its instructions." +
                        " Each instruction can have atmost two source operands and one destination operand. " +
                        "Assume that all variables are dead after this code segment.$$ $$" +
                        getProgram(year+"/prog2013-qno-50.txt")+
                        "$$ $$What is the minimum number of registers needed in the instruction set architecture of the\n" +
                        "processor to compile this code segment without any spill to memory? Do not apply any\n" +
                        "optimization other than optimizing register allocation",
                "3",
                "4",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "51", com, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 52 & 53 :</B>$$ $$Relation R has eight attributes ABCDEFGH. " +
                        "Fields of R contain only atomic values. " +
                        "$$ $$F = {CH → G, A → BC, B → CFH, E → A, F → EG} " +
                        "is a set of functional dependencies (FDs) so that F+ is exactly the set of FDs that hold for R." +
                        "$$ $$ How many candidate keys does the relation R have?",
                "3",
                "4",
                "5",
                "6"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "52", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 52 & 53 :</B>$$ $$Relation R has eight attributes ABCDEFGH. " +
                        "Fields of R contain only atomic values. " +
                        "$$ $$F = {CH → G, A → BC, B → CFH, E → A, F → EG} " +
                        "is a set of functional dependencies (FDs) so that F+ is exactly the set of FDs that hold for R." +
                        "$$ $$ The relation R is",
                "in INF, but not in 2NF",
                "in 2NF, but not in 3NF",
                "in 3NF, but not in BCNF",
                "in BCNF"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "53", dbms, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 54 & 55 :</B>$$ $$A computer uses 46-bit virtual address, 32-bit physical address, " +
                        "and a three-level paged page table organization. The page table base register stores " +
                        "the base address of the first-level table $(T_1),$ which occupies exactly one page. " +
                        "Each entry of $T_1$ stores the base address of a page of the second-level table $(T_2).$ " +
                        "Each entry of $T_2$ stores the base address of a page of the third-level table $(T_3).$ " +
                        "Each entry of $T_3$ stores a page table entry (PTE). The PTE is 32 bits in size. " +
                        "The processor used in the computer has a 1 MB 16-way set associative virtually " +
                        "indexed physically tagged cache. The cache block size is 64 bytes. " +
                        "$$ $$What is the size of a page in KB in this computer?",
                "2",
                "4",
                "8",
                "16"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "54", os, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("<B>Linked Question 54 & 55 :</B>$$ $$A computer uses 46-bit virtual address, 32-bit physical address, " +
                        "and a three-level paged page table organization. The page table base register stores " +
                        "the base address of the first-level table $(T_1),$ which occupies exactly one page. " +
                        "Each entry of $T_1$ stores the base address of a page of the second-level table $(T_2).$ " +
                        "Each entry of $T_2$ stores the base address of a page of the third-level table $(T_3).$ " +
                        "Each entry of $T_3$ stores a page table entry (PTE). The PTE is 32 bits in size. " +
                        "The processor used in the computer has a 1 MB 16-way set associative virtually " +
                        "indexed physically tagged cache. The cache block size is 64 bytes. " +
                        "$$ $$What is the minimum number of page colours needed to guarantee that no two synonyms map to\n" +
                        "different sets in the processor cache of this computer?",
                "2",
                "4",
                "8",
                "16"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "55", os, marks, year, explanation, false);
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("Complete the sentence:\n" +
                        "Universalism is to particularism as diffuseness is to ________",
                "specificity",
                "neutrality",
                "generality",
                "adaptation"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "56", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Were you a bird, you ___________ in the sky.",
                "would fly",
                "shall fly",
                "should fly",
                "shall have flown"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "57", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following options is the closest in meaning to the word given below?\n" +
                        "$$ $$<B>Nadir$$ $$</B>",
                "Highest",
                "Lowest",
                "Medium",
                "Integration"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "58", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the grammatically INCORRECT sentence:",
                "He is of Asian origin",
                "They belonged to Africa",
                "She is an European",
                "They migrated from India to Australia"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "59", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("What will be the maximum sum of 44, 42, 40, ... ?",
                "502",
                "504",
                "506",
                "500"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "60", apti, marks, year, explanation, false);
        this.addQuestion(q);

        marks="2";


        Q = getQuestion(getstring("Out of all the 2-digit integers between 1 and 100, a 2-digit number has to be selected at\n" +
                        "random. What is the probability that the selected number is not divisible by 7?",
                "13/90",
                "12/90",
                "78/90",
                "77/90"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "61", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("A tourist covers half of his journey by train at 60 km/h, half of the remainder by bus at 30\n" +
                        "km/h and the rest by cycle at 10 km/h. The average of the tourist in km/h during his entire\n" +
                        "journey is",
                "36",
                "30",
                "24",
                "18"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "62", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("Find the sum of the expression" +
                        "$$ $$ $1/{√1+√2}$ + $1/{√2+√3}$ + $1/{√3+√4}$ + ....... + $1/{√80+√81}$ $$ $$",
                "7",
                "8",
                "9",
                "10"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "63", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("The current erection cost of a structure is Rs. 13,200. If the labour wages per day increase by\n" +
                        "$1/5$ of the current wages and the working hours decrease by $1/24$ of the current period, then\n" +
                        "the new cost of erection in Rs. is",
                "16,500",
                "15,180",
                "11,000",
                "10,120"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "64", apti, marks, year, explanation, false);
        this.addQuestion(q);

        Q = getQuestion(getstring("After several defeats in wars, Robert Bruce went in exile and wanted to commit suicide. Just\n" +
                        "before committing suicide, he came across a spider attempting tirelessly to have its net. Time\n" +
                        "and again, the spider failed but that did not deter it to refrain from making attempts. Such\n" +
                        "attempts by the spider made Bruce curious. Thus, Bruce started observing the nearimpossible\n" +
                        "goal of the spider to have the net. Ultimately, the spider succeeded in having its\n" +
                        "net despite several failures. Such act of the spider encouraged Bruce not to commit suicide.\n" +
                        "And then, Bruce went back again and won many a battle, and the rest is history." +
                        "$$ $$Which one of the following assertions is best supported by the above information?",
                "Failure is the pillar of success",
                "Honesty is the best policy",
                "Life begins and ends with adventures",
                "No adversity justifies giving up hope"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "65", apti, marks, year, explanation, false);
        this.addQuestion(q);
    }



    //**** 2014-1 questions starts *****//



    private void addQuestions2014() {

        //year = "2014-1";
        //marks = "1";
        //path = "file:///android_asset/2014-1/";

        Q = getQuestion(getstring("Which of the following options is the closest in meaning to the phrase underlined in the\n" +
                        "sentence below?" +
                        "$$ $$It is fascinating to see life forms <U>cope with</U> varied environmental conditions",
                "Adopt to",
                "Adapt to",
                "Adept in",
                "Accept with"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "1", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate word from the options given below to complete the following\n" +
                        "sentence.\n" +
                        "$$ $$He could not understand the judges awarding her the first prize, because he thought that her\n" +
                        "performance was quite ___________________.",
                "Superb",
                "Medium",
                "Mediocre",
                "Exhilarating"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "2", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In a press meet on the recent scam, the minister said, “The buck stops here”. What did the\n" +
                        "minister convey by the statement?",
                "He wants all the money",
                "He will return the money",
                "He will assume final responsibility",
                "He will resist all enquiries"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "3", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If $(z+1/z)^2=98,$ compute $(z^2+1/z^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "96", "4", m, marks, year, explanation, "1");
        this.addQuestion(q);


        Q = getQuestion(getstring("The roots of $ax^2 + bx + c = 0$ are real and positive a, b and c are real. Then $ax^2 + b|x|+ c = 0$\n" +
                        "has",
                "No roots",
                "2 real roots",
                "3 real roots",
                "4 real roots"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "5", m, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("The Palghat Gap (or Palakkad Gap), a region about 30 km wide in the southern part of the\n" +
                        "Western Ghats in India, is lower than the hilly terrain to its north and south. The exact\n" +
                        "reasons for the formation of this gap are not clear. It results in the neighbouring regions of\n" +
                        "Tamil Nadu getting more rainfall from the South West monsoon and the neighbouring\n" +
                        "regions of Kerala having higher summer temperatures." +
                        "$$ $$What can be inferred from this passage?",
                "The Palghat gap is caused by high rainfall and high temperatures in southern Tamil Nadu\n" +
                        "and Kerala",
                "The regions in Tamil Nadu and Kerala that are near the Palghat Gap are low–lying",
                "The low terrain of the Palghat Gap has a significant impact on weather patterns in\n" +
                        "neighbouring parts of Tamil Nadu and Kerala",
                "Higher summer temperatures result in higher rainfall near the Palghat Gap area"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "6", apti, marks, year, explanation, "0");
        this.addQuestion(q);


        Q = getQuestion(getstring("Geneticists say that they are very close to confirming the genetic roots of psychiatric illnesses\n" +
                        "such as depression and schizophrenia, and consequently, that doctors will be able to eradicate\n" +
                        "these diseases through early identification and gene therapy." +
                        "$$ $$On which of the following assumptions does the statement above rely?",
                "Strategies are now available for eliminating psychiatric illnesses",
                "Certain psychiatric illnesses have a genetic basis",
                "All human diseases can be traced back to genes and how they are expressed",
                "In the future, genetics will become the only relevant field for identifying psychiatric\n" +
                        "illnesses"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Round–trip tickets to a tourist destination are eligible for a discount of 10% on the total fare.\n" +
                "In addition, groups of 4 or more get a discount of 5% on the total fare. If the one way single\n" +
                "person fare is Rs 100, a group of 5 tourists purchasing round–trip tickets will be charged Rs ___________."));
        explanation = getExplaination("");
        q = new Question(Q, "850", "8", apti, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("In a survey, 300 respondents were asked whether they own a vehicle or not. If yes, they were\n" +
                "further asked to mention whether they own a car or scooter or both. Their responses are\n" +
                "tabulated below. What percent of respondents do not own a scooter?" +
                MyCustomTable2014_1(9) +
                "$$ $$"));
        explanation = getExplaination("");
        q = new Question(Q, "48", "9",apti, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("When a point inside of a tetrahedron (a solid with four triangular surfaces) is connected by\n" +
                "straight lines to its corners, how many (new) internal planes are created with these lines?\n" +
                "_______________________$$ $$"));

        explanation = getExplaination("");
        q = new Question(Q, "6", "10", apti, marks, year, explanation, "1");
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("Consider the statement\n" +
                        "$$ $$“Not all that glitters is gold” \n" +
                        "Predicate glitters(x) is true if x glitters and predicate gold(x) is true if x is gold. " +
                        "Which one of the following logical formulae represents the above statement?",
                "∀x; glitters (x) ⇒ ¬gold (x)",
                "∀x; gold (x) ⇒ glitters (x)",
                "∃x; gold (x) ∧ ¬glitters (x)",
                "∃x; glitters (x) ∧ ¬gold (x)"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "11", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose you break a stick of unit length at a point chosen uniformly at random. Then the\n" +
                "expected length of the shorter stick is ________ .$$ $$"));
        explanation = getExplaination("");
        q = new Question(Q, "0.24 to 0.27", "12", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G=(V,E) be a directed graph where V is the set of vertices and E the set of edges. " +
                        "Then which one of the following graphs has the same strongly connected components as G ?",
                "$G_1$ = $(V,E_1)$ where $E_1$ = { (u,v) | (u,v)∉E }",
                "$G_2$ = $(V,E_2)$ where $E_2$ = { (u,v) | (u,v)∉E }",
                "$G_3$ = $(V,E_3)$ where $E_2$ = { (u,v)| there is a path of length ≤ 2 from u to v in E }",
                "$G_4$ = $(V_4,E)$ where $V_4$ is the set of vertices in G which are not isolated"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "13", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following system of equations:" +
                "$$ $$" +
                "3x + 2y = 1\n" +
                "<br/>4x + 7z = 1\n" +
                "<br/>x + y + z = 3\n" +
                "<br/>x - 2y + 7z = 0" +
                "$$ $$The number of solutions for this system is __________________"));
        explanation = getExplaination("");
        q = new Question(Q, "1", "14", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The value of the dot product of the eigenvectors corresponding to any pair of different eigen\n" +
                "values of a 4-by-4 symmetric positive definite matrix is ______________."));
        explanation = getExplaination("");
        q = new Question(Q, "0", "15", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let the function" +
                        "$$ $$ $|\\table \\sin θ,\\cos θ,tan θ;\\sin(π/6),\\cos(π/6),\\tan(π/6);\\sin (π/3),\\cos (π/3),\\tan (π/3)|$ " +
                        "$$ $$ where θ = ∈ $[π/6,π/2]$ and f '(θ) denote the derivative of f with respect to θ . Which of the\n" +
                        "following statement is / are TRUE?" +
                        "$$ $$(I) There exists θ ∈$(π/6,π/3)$such that f '(θ) = 0 ." +
                        "<br/>(II) There exists θ ∈$(π/6,π/3)$such that f '(θ) ≠ 0 .",
                "I only",
                "II only",
                "Both I and II",
                "Neither I nor II"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "16", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following Boolean expression for F: $$ $$" +
                        "$ F(P,Q,R,S) = PQ + \\ov{P}QR + \\ov{P}Q\\ov{R}S $" +
                        "$$ $$The minimal sum-of products form of F is",
                "$PQ+ QR + QS$",
                "$P +Q + R + S$",
                "$\\ov{P} +\\ov{Q} +\\ov {R} + \\ov{S}$",
                "$\\ov{P}R + \\ov{PR}S + P$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "17", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The base (or radix) of the number system such that the following equation holds\n" +
                "is____________.$$ $$ ${312}/{20} = 13.1$"));
        explanation = getExplaination("");
        q = new Question(Q, "5", "18", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A machine has a 32-bit architecture, with 1-word long instructions. It has 64 registers, each of\n" +
                "which is 32 bits long. It needs to support 45 instructions, which have an immediate operand\n" +
                "in addition to two register operands. Assuming that the immediate operand is an unsigned\n" +
                "integer, the maximum value of the immediate operand is ____________."));
        explanation = getExplaination("");
        q = new Question(Q, "16383", "19", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following program in C language:" +
                        getProgram("2014-1"+"/prog2014-1-qno-20.txt")+
                        "$$ $$Which one of the following statements is TRUE?",
                "Compilation fails.",
                "Execution results in a run-time error.",
                "On execution, the value printed is 5 more than the address of variable i.",
                "On execution, the value printed is 5 more than the integer value entered."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "20", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a graph with n vertices and m edges. What is the tightest upper bound on the\n" +
                        "running time of Depth First Search on G, when G is represented as an adjacency matrix?",
                "$θ(n)$",
                "$θ(n+m)$",
                "$θ(n^2)$",
                "$θ(m^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "21", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider rooted n node binary tree represented using pointers. The best upper bound on the\n" +
                "time required to determine the number of sub trees having exactly 4 nodes is  $0 (n^a log^b n) .$\n" +
                "Then the value of a + 10b is_______"));
        explanation = getExplaination("");
        q = new Question(Q, "1", "22", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the directed graph given below.$$ $$" +
                        "<img src='"+path+"qno-23.png'/>" +
                        "$$ $$Which one of the following is TRUE?",
                "The graph does not have any topological ordering",
                "Both PQRS and SRQP are topological orderings",
                "Both PSRQ and SPRQ are topological orderings.",
                "PSRQ is the only topological ordering."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "23", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let P be a quick sort program to sort numbers in ascending order using the first element as\n" +
                        "the pivot. Let $t_1$ and $t_2$ and $t_2$ be the number of comparisons made by P for the inputs [1 2 3 4\n" +
                        "5] and [4 1 5 3 2] respectively. Which one of the following holds?",
                "$t_1$ = 5",
                "$t_1$ < $t_2$",
                "$t_1$ > $t_2$",
                "$t_1$ = $t_2$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "24", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is TRUE?" +
                        "$$ $$",
                "The language L = { $a^n b^n$ | n ≥ 0 } is regular.",
                "The language L= { $a^n$ | n is prime } is regular.",
                "The language L= {w|w has 3k + 1b's for some k ∈ N with ∑ = {a,b}} is regular.",
                "The language L= { ww|w ∈ $∑^*$ with ∑ = {0,1}} is regular."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "25", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the finite automaton in the following figure." +
                        "$$ $$" +
                        "<img src='"+path+"qno-26.png'/>" +
                        "$$ $$What is the set of reachable states for the input string 0011?",
                "{$q_0,q_1,q_2$}",
                "{$q_0,q_1$}",
                "{$q_0,q_1,q_2,q_4$}",
                "{$q_3$}"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "26", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is FALSE?",
                "A basic block is a sequence of instructions where control enters the sequence at the\n" +
                        "beginning and exits at the end.",
                "Available expression analysis can be used for common subexpression elimination",
                "Live variable analysis can be used for dead code eliminatio",
                "x = 4*5 $⇒$ x = 20 is an example of common subexpression elimination"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "27", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the following$$ $$" +
                        MyTable(4,2,getText(2,"(1) Waterfall model","(a) Specifications can be developed","(2) Evolutionary model","(b) Requirements compromises are inevitable",
                                "(3) Component based software","(c) Explicit recognition of risk",
                                "(4) Spiral development","(d) Inflexible partitioning of the project into stages","","","","","","","","","","","","","","","","","","","","","",""), false,false)+
                        "",
                "1-a, 2-b, 3-c, 4-d",
                "1-d, 2-a, 3-b, 4-c",
                "1-d, 2-b, 3-a, 4-c",
                "1-c, 2-a, 3-b, 4-d"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "28", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose a disk has 201 cylinders, numbered from 0 to 200. At some time the disk arm is at\n" +
                "cylinder 100, and there is a queue of disk access requests for cylinders 30, 85, 90, 100, 105,\n" +
                "110, 135 and 145. If Shortest-Seek Time First (SSTF) is being used for scheduling the disk\n" +
                "access, the request for cylinder 90 is serviced after servicing ____________ number of\n" +
                "requests."));
        explanation = getExplaination("");
        q = new Question(Q, "3", "29", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is FALSE?",
                "User level threads are not scheduled by the kernel.",
                "When a user level thread is blocked, all other threads of its process are blocked.",
                "Context switching between user level threads is faster than context switching between\n" +
                        "kernel level threads.",
                "Kernel level threads cannot share the code segment."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "30", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relation scheme R = {E, F, G, H, I, J, K, L, M, M} and the set of functional dependencies " +
                        "$$ $${{E, F} → {G}, {F} → {I, J}, {E, H} → {K, L}, K → {M}, L → {N} on R. What is the key for R?",
                "{E, F}",
                "{E, F, H}",
                "{E, F, H, K, L}",
                "{E}"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "31", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the following statements:" +
                        getProgram("2014-1"+"/prog2014-1-qno-32.txt")+
                        "$$ $$Which one of the following statements is CORRECT?",
                "S1 is TRUE and S2 is FALSE.",
                "Both S1 and S2 are TRUE.",
                "S1 is FALSE and S2 and TRUE.",
                "Both S1 and S2 are FALSE."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following three statements about link state and distance vector routing protocols, " +
                        "for a large network with 500 network nodes and 4000 links." +
                        "$$ $$" +
                        "[S1] The computational overhead in link state protocols \n" +
                        "     is higher than in distance vector protocols.\n" +
                        "$$ $$[S2] A distance vector protocol (with split horizon) \n" +
                        "     avoids persistent routing loops, but not a link\n" +
                        "     state protocol.\n" +
                        "$$ $$[S3] After a topology change, a link state protocol \n" +
                        "     will converge faster than a distance vector\n" +
                        "     protocol.$$ $$",
                "S1, S2, and S3 are all true.",
                "S1, S2, and S3 are all false.",
                "S1 and S2 are true, but S3 is false",
                "S1 and S3 are true, but S2 is false"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "33", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following are used to " +
                        "generate a message digest by the network security protocols?" +
                        "$$ $$(P) RSA \n" +
                        "<br/>(Q) SHA-1 \n" +
                        "<br/>(R) DES \n" +
                        "<br/>(S) MD5",
                "P and R only",
                "Q and R only",
                "Q and S only",
                "R and S only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "34", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Identify the correct order in which the following actions" +
                        " take place in an interaction between a web browser and a web server." +
                        "$$ $$1. The web browser requests a webpage using HTTP.\n" +
                        "$$ $$2. The web browser establishes a TCP connection \n" +
                        "   with the web server.\n" +
                        "$$ $$3. The web server sends the requested webpage \n" +
                        "   using HTTP.\n" +
                        "$$ $$4. The web browser resolves the domain name \n" +
                        "   using DNS.$$ $$",
                "4,2,1,3",
                "1,2,3,4",
                "4,1,2,3",
                "2,4,1,3"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "35", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("Consider a token ring network with a length of 2km having 10 stations including a\n" +
                "monitoring station. The propagation speed of the signal is 2 x $10^8$ m/s and the token\n" +
                "transmission time is ignored. If each station is allowed to hold the token for 2 μsec, the\n" +
                "minimum time for which the monitoring station should wait (in μsec) before assuming that\n" +
                "the token is lost is _______."));
        explanation = getExplaination("");
        q = new Question(Q, "28μs to 30μs", "36", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let the size of congestion window of a TCP connection be 32 KB when a timeout occurs.\n" +
                "The round trip time of the connection is 100 msec and the maximum segment size used is\n" +
                "2kB. The time taken (in msec) by the TCP connection to get back to 32KB congestion\n" +
                "window is ______"));
        explanation = getExplaination("");
        q = new Question(Q, "1100 to 1300", "37", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a selective repeat sliding window protocol that uses a frame size of 1 KB to send\n" +
                "data on a 1.5 Mbps link with a one-way latency of 50 msec. To achieve a link utilization of\n" +
                "60%, the minimum number of bits required to represent the sequence number field is\n" +
                "________."));
        explanation = getExplaination("");
        q = new Question(Q, "5", "38",cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following four schedules due to three transactions (indicted by the subscript)\n" +
                        "using read and write on a data item x, denoted r (x) and w (x) respectively. Which one of\n" +
                        "them is conflict serializable?",
                "$r_1 (x) ; r_2 (x) ; w_1 (x) ; r_3(x) ; w_2 (x)$",
                "$r_2 (x) ; r_1 (x) ; w_2 (x) ; r_3(x) ; w_1 (x)$",
                "$r_3 (x) ; r_2 (x) ; r_1 (x) ; w_2(x) ; w_1 (x)$",
                "$r_2 (x) ; w_2 (x) ; r_3 (x) ; r_1(x) ; w_1 (x)$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "39", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the following two statements:" +
                        "$$ $$S1: Every table with two single-valued attributes is in 1NF, 2NF, 3NF and BCNF\n" +
                        "$$ $$S2 : AB → C, D → E, E → C is a minimal cover for the set of functional\n" +
                        "dependencies AB → C, D → E, AB → E,E → C" +
                        "$$ $$Which one of the following is CORRECT?$$ $$",
                "S1 is TRUE and S2 is FALSE.",
                "Both S1 and S2 are TRUE.",
                "S1 is FALSE and S2 is TRUE.",
                "Both S1 and S2 are FALSE."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "40", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("An operating system uses the Banker’s algorithm for deadlock avoidance when managing the\n" +
                        "allocation of three resource types X, Y, and Z to three processes P0, P1, and P2. The table\n" +
                        "given below presents the current system state. Here, the Allocation matrix shows the current\n" +
                        "number of resources of each type allocated to each process and the Max matrix shows the\n" +
                        "maximum number of resources of each type required by each process during its execution.$$ $$" +
                        MyCustomTable2014_1(31)+
                        "$$ $$There are 3 units of type X, 2 units of type Y and 2 units of type Z still available. The system\n" +
                        "is currently in a safe state. Consider the following independent requests for additional\n" +
                        "resources in the current state:" +
                        "$$ $$REQ1: P0 requests 0 units of X, 0 units of Y and 2 units of Z\n" +
                        "<br/>REQ2: P1 requests 2 units of X, 0 units of Y and 0 units of Z" +
                        "$$ $$Which one of the following is TRUE?",
                "Only REQ1 can be permitted.",
                "Only REQ2 can be permitted.",
                "Both REQ1 and REQ2 can be permitted.",
                "Neither REQ1 nor REQ2 can be permitted."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "41", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following set of processes that need to be scheduled on a single CPU. All the\n" +
                "times are given in milliseconds$$ $$" +
                MyTable(6,3,getText(3,"Process Name","Arrival Time","Execution Time","A","0","6","B","3","2","C","5","4","D","7","6","E","10","3","","","","","","","","","","","",""), true,true)+
                "Using the shortest remaining time first scheduling algorithm, the average process turnaround\n" +
                "time (in msec) is ____________________."));
        explanation = getExplaination("");
        q = new Question(Q, "7.2 to 7.2", "42", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Assume that there are 3 page frames which are initially empty. If the page reference string 1,\n" +
                "2, 3, 4, 2, 1, 5, 3, 2, 4, 6, the number of page faults using the optimal replacement policy is\n" +
                "___________"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "7", "43", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A canonical set of items is given below" +
                        "$$ $$S → L. > R\n" +
                        "<br/>Q → R." +
                        "$$ $$On input symbol < the set has",
                "a shift-reduce conflict and a reduce-reduce conflict.",
                "a shift-reduce conflict but not a reduce-reduce conflict.",
                "a reduce-reduce conflict but not a shift-reduce conflict.",
                "neither a shift-reduce nor a reduce-reduce conflict."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "44",com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L$ be a language and $\\ov{L}$ be its complement." +
                        " Which one of the following is NOT a viable possibility?",
                "Neither $L$ nor $\\ov{L}$ is recursively enumerable (r.e.).",
                "One of $L$ and $\\ov{L}$ is r.e. but not recursive; the other is not r.e.",
                "Both $L$ and $\\ov{L}$ are r.e. but not recursive.",
                "Both $L$ and $\\ov{L}$ are recursive."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "45", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the regular expressions given below represent the following DFA?" +
                        "$$ $$ <img src='"+path+"qno-46.png'/>" +
                        "$$ $$I) 0*1(1+00*1)*\n" +
                        "<br/>II) 0*1*1+11*0*1\n" +
                        "<br/>III) (0+1)*1 " ,
                "I and II only",
                "I and III only",
                "II and III only",
                "I, II, and III"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "46", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("There are 5 bags labelled 1 to 5. All the coins in a given bag have the same weight. Some\n" +
                "bags have coins of weight 10 gm, others have coins of weight 11 gm. I pick 1, 2, 4, 8, 16\n" +
                "coins respectively from bags 1 to 5. Their total weight comes out to 323 gm. Then the product\n" +
                "of the labels of the bags having 11 gm coins is ________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "12", "47", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose a polynomial time algorithm is discovered that correctly computes the largest clique\n" +
                        "in a given graph. In this scenario, which one of the following represents the correct Venn\n" +
                        "diagram of the complexity classes P, NP and NP Complete (NPC)?" ,
                "<br/><img src='"+path+"qno-48-1.png'/>",
                "<br/><img src='"+path+"qno-48-2.png'/>",
                "<br/><img src='"+path+"qno-48-3.png'/>",
                "<br/><img src='"+path+"qno-48-4.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "48", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The minimum number of comparisons required to find the minimum and the maximum of\n" +
                "100 numbers is ___________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "148", "49", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a hash table with 9 slots. The hash function is h(k) = k mod 9. The collisions are\n" +
                        "resolved by chaining. The following 9 keys are inserted in the order: 5, 28, 19, 15, 20, 33, 12,\n" +
                        "17, 10. The maximum, minimum, and average chain lengths in the hash table, respectively,\n" +
                        "are",
                "3, 0, and 1",
                "3, 3, and 3",
                "4, 0, and 1",
                "3, 0, and 2"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "50", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C function in which size is the number of elements in the array E: " +
                        "The value returned by the function MyX is the$$ $$" +
                        getProgram("2014-1"+"/prog2014-1-qno-51.txt")+
                        "$$ $$The value returned by the function MyX is the" ,
                "maximum possible sum of elements in any sub-array of array E.",
                "maximum element in any sub-array of array E.",
                "sum of the maximum elements in all possible sub-arrays of array E.",
                "the sum of all the elements in the array E."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "51", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following pseudo code. " +
                        "What is the total number of multiplications to be performed?" +
                        getProgram("2014-1"+"/prog2014-1-qno-52.txt")+"",
                "Half of the product of the 3 consecutive integers.",
                "One-third of the product of the 3 consecutive integers.",
                "One-sixth of the product of the 3 consecutive integers.",
                "None of the above."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "52", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a 6-stage instruction pipeline, where all stages are perfectly balanced. Assume that\n" +
                "there is no cycle-time overhead of pipelining. When an application is executing on this 6-\n" +
                "stage pipeline, the speedup achieved with respect to non-pipelined execution if 25% of the\n" +
                "instructions incur 2 pipeline stall cycles is ______________________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "4", "53", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("An access sequence of cache block addresses is of length N and contains n unique block\n" +
                        "addresses. The number of unique block addresses between two consecutive accesses to the\n" +
                        "same block address is bounded above K. What is the miss ratio if the access sequence is\n" +
                        "passed through a cache of associativity A ³ k exercising least-recently-used replacement\n" +
                        "policy?",
                "$n/N$",
                "$l/N$",
                "$1/A$",
                "$k/n$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "54", co, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the 4-to-1 multiplexer with two lines S1 and S0 given below." +
                        "$$ $$<img src='"+path+"qno-55.png'/>" +
                        "$$ $$The minimal sum of-products form of the Boolean expression for the output F of the\n" +
                        "multiplexer is",
                "$\\ov{P}Q+ QR + P\\ov{Q}R$",
                "$\\ov{P}Q + \\ov{P}Q\\ov{R} + PQ\\ov{R} + P\\ov{Q}R$",
                "$\\ov{P}QR + \\ov{P}Q\\ov{R} + Q\\ov{R} + P\\ov{Q}R$",
                "$PQ\\ov{R}$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "55", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The function f(x) = x sin x satisfies the following equation. f\"(x) + f(x) +t cosx = 0. The value\n" +
                "of t is______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "-2 to -2", "56", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A function f(x) is continuous the interval [0,2]. It is known that f(0) = f(2) = -1 and f(1) = 1.\n" +
                        "Which one of the following statements must be true?",
                "There exists a y in the interval (0,1) such that f(y) = f(y + 1)",
                "For every y in the interval (0,1), f(y) = f(2 - y)",
                "The maximum value of the function in the interval (0.2) is 1",
                "There exists a y in the interval (0,1) such that f(y) =f(2 – y)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "57", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("For fair six-sided dice are rolled. The probability that the sum of the results being 22 is" +
                "$X/{1296}.$ The value of X is _________"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "10", "58", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A pennant is a sequence of numbers, each number being 1 or 2. An n-pennant is a sequence\n" +
                "of numbers with sum equal to n. For example, (1,1,2) is a 4-pennant. The set of all possible 1-\n" +
                "pennants is {(1)}, the set of all possible 2-pennants is {(2), (1,1)}and the set of all 3-pennants\n" +
                "is {(2,1), (1,1,1), (1,2)}. Note that the pennant (1,2) is not the same as the pennant (2,1). The\n" +
                "number of 10- pennants is ______________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "89", "59", m , marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let S denote the set of all functions $f: \\{0,1\\}^4 ->$ {0,1}. " +
                "Denote by N the number of functions from S to the set {0,1}. The value of $log_2\\ log_2N$ is ______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "16", "60", m , marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider an undirected graph G where self-loops are not allowed. " +
                "The vertex set of G is {(i, j): 1 ≤ i ≤ 12, 1 ≤ j ≤ 12}. There is an edge between (a, b) and (c, d) if |a − c| ≤ 1 and " +
                "|b − d| ≤ 1. The number of edges in this graph is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "506", "61", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("An ordered n-tuple $(d_1, d_2, … , d_n)$ with $d_1 ≥ d_2 ≥ .... ≥ d_n$ " +
                        "is called graphic if there exists a simple undirected graph with n vertices " +
                        "having degrees $d_1, d_2, .... , d_n$ respectively. Which of the following 6-tuples is NOT graphic?",
                "(1, 1, 1, 1, 1, 1)",
                "(2, 2, 2, 2, 2, 2)",
                "(3, 3, 3, 1, 0, 0)",
                "(3, 2, 1, 1, 1, 0)"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "62", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following propositional logic formulas is TRUE when exactly two of p, q,\n" +
                        "and r are TRUE?",
                "((p↔q)∧ r) ∨ (p ∧ q∧ ~ r)",
                "(~ (p↔q)∧ r) ∨ (p ∧ q∧ ~ r)",
                "((p→q)∧ r) ∨ (p ∧ q∧ ~ r)",
                "(~ (p↔q)∧ r) ∧ (p ∧ q∧ ~ r)"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "63", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the following schema:" +
                        "$$ $$employees(emp-id, first-name, last-name, hire-date, dept-id, salary)\n" +
                        "     $$ $$departments(dept-id, dept-name, manager-id, location-id) " +
                        "$$ $$You want to display the last names and hire dates of all latest hires in their " +
                        "respective departments in the location ID 1700. You issue the following query:$$ $$" +
                        getProgram("2014-1"+"/prog2014-1-qno-64.txt")+
                        "$$ $$What is the outcome?$$ $$",
                "It executes but does not give the correct result.",
                "It executes and gives the correct result.",
                "It generates an error because of pairwise comparison.",
                "It generates an error because the GROUP BY clause cannot be used with table joins in a subquery"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "64", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider two processors $P_1$ and $P_2$ executing the same instruction set. Assume that under\n" +
                "identical conditions, for the same input, a program running on $P_2$ takes 25% less time but\n" +
                "incurs 20% more CPI (clock cycles per instruction) as compared to the program running on\n" +
                "$P_1.$ If the clock frequency of $P_1$ is 1GHz, then the clock frequency of $P_2$ (in GHz) is" +
                "_________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "1.6 to 1.6", "65", co, marks, year, explanation, "1");
        this.addQuestion(q);

    }




    //**** 2014-2  questions starts *****//

    private void addQuestions2014_2() {

        //year = "2014-2";
        //marks = "1";
        //path = "file:///android_asset/2014-2/";

        Q = getQuestion(getstring("Choose the most appropriate phrase from the options given below to complete the following\n" +
                        "sentence." +
                        "$$ $$India is a post-colonial country because",
                "it was a former British colony",
                "Indian Information Technology professionals have colonized the world",
                "India does not follow any colonial practices",
                "India has helped other countries gain freedom"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "1", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Who ___________ was coming to see us this evening?",
                "you said",
                "did you say",
                "did you say that",
                "had you said"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "2", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the columns.$$ $$" +
                        MyTable(5, 2,getText(2,"Column 1","Column 2","(1)eradicate","(P)misrepresent","(2)distort","(Q)soak completely","(3)saturate","(R)use","(4)utilize","(S)destroy utterly","","","","","","","","","","","","","","","","","","","",""), true,false)
                        +"$$ $$" ,
                "1:S, 2:P, 3:Q, 4:R",
                "1:P, 2:Q, 3:R, 4:S",
                "1:Q, 2:R, 3:S, 4:P",
                "1:S, 2:P, 3:R, 4:Q"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "3", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the average of all multiples of 10 from 2 to 198?",
                "90",
                "100",
                "110",
                "120"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "4",m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The value of $√{12 + √{12 + √{12 + ....}}}$ is" +
                        "" ,
                "3.464",
                "3.932",
                "4.000",
                "4.444"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "5", m, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("The old city of Koenigsberg, which had a German majority population before World War 2,\n" +
                        "is now called Kaliningrad. After the events of the war, Kaliningrad is now a Russian territory\n" +
                        "and has a predominantly Russian population. It is bordered by the Baltic Sea on the north and\n" +
                        "the countries of Poland to the south and west and Lithuania to the east respectively. Which of\n" +
                        "the statements below can be inferred from this passage?",
                "Kaliningrad was historically Russian in its ethnic make up",
                "Kaliningrad is a part of Russia despite it not being contiguous with the rest of Russia",
                "Koenigsberg was renamed Kaliningrad, as that was its original Russian name",
                "Poland and Lithuania are on the route from Kaliningrad to the rest of Russia"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "6", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of people diagnosed with dengue fever (contracted from the bite of a mosquito)\n" +
                        "in north India is twice the number diagnosed last year. Municipal authorities have concluded\n" +
                        "that measures to control the mosquito population have failed in this region." +
                        "$$ $$Which one of the following statements, if true, does not contradict this conclusion?" +
                        "$$ $$",
                "A high proportion of the affected population has returned from neighbouring countries\n" +
                        "where dengue is prevalent",
                "More cases of dengue are now reported because of an increase in the Municipal Office’s\n" +
                        "administrative efficiency",
                "Many more cases of dengue are being diagnosed this year since the introduction of a new\n" +
                        "and effective diagnostic test",
                "The number of people with malarial fever (also contracted from mosquito bites) has\n" +
                        "increased this year"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If x is real and $|x^2 − 2x + 3| = 11,$ then possible values of $|−x^3 + x^2 − x|$ include",
                "2, 4",
                "2, 14",
                "4, 52",
                "14, 52"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "8", m, marks, year, explanation,"0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The ratio of male to female students in a college for five years is plotted in the following line\n" +
                "graph. If the number of female students doubled in 2009, by what percent did the number of\n" +
                "male students increase in 2009?" +
                "$$ $$" +
                "<img src='"+path+"qno-9.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "140", "9", apti, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("At what time between 6 a.m. and 7 a.m will the minute hand and hour hand of a clock make\n" +
                        "an angle closest to 60°?",
                "6: 22 a. m.",
                "6:27 a.m.",
                "6: 38 a.m.",
                "6:45 a.m."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "10", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("The security system at an IT office is composed of 10 computers of which exactly four are\n" +
                "working. To check whether the system is functional, the officials inspect four of the\n" +
                "computers picked at random (without replacement). The system is deemed functional if at\n" +
                "least three of the four computers inspected are working. Let the probability that the system is\n" +
                "deemed functional be denoted by p Then 100p= _____________."));
        explanation = getExplaination("");
        q = new Question(Q, "11.85 to 11.95", "11", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Each of the nine words in the sentence <B>”The quick brown fox jumps over the lazy og”</B> is\n" +
                "written on a separate piece of paper. These nine pieces of paper are kept in a box. One of the\n" +
                "pieces is drawn at random from the box. The expected length of the word drawn is\n" +
                "_____________. (The answer should be rounded to one decimal place."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "3.8 to 3.9", "12", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The maximum number of edges in a bipartite graph on 12 vertices is __________________________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "36", "13", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("If the matrix A is such that" +
                " $ A = [\\table 2;-4;7][\\table 1,9,5]$" +
                " $$ $$Then the determinant of A is equal to ________."));
        explanation = getExplaination("");
        q = new Question(Q, "0", "14", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A non-zero polynomial f(x) of degree 3 has roots " +
                        "at x = 1, x = 2 and x = 3. Which one of the following must be TRUE?",
                "f(0)f(4) < 0",
                "f(0)f(4) > 0",
                "f(0) + f(4) < 0",
                "f(0) + f(4) > 0"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "15", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The dual of a Boolean function $f(x_1, x_2, … , x_n, +, . , ′ ),$ " +
                        "written as $F^D,$ is the same expression as that of $F$ with + and . swapped. $F$ is said to be self-dual if $F = F^D.$" +
                        " The number of self-dual functions with n Boolean variables is",
                "$2^n$",
                "$2^{n-1}$",
                "$2^{2^n}$",
                "$2^{2^{n-1}}$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "16", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $k = 2^n.$ A circuit is built by giving the output of an" +
                        " $n-bit$ binary counter as input to an $n-to-2^n$ bit decoder. This circuit is equivalent to a",
                "k-bit binary up counter.",
                "k-bit binary down counter.",
                "k-bit ring counter.",
                "k-bit Johnson counter."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "17", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the equation $(123)_5$ = $(x8)_y$ with x and y as unknown." +
                " The number of possible solutions is _______ ."));
        explanation = getExplaination("");
        q = new Question(Q, "3", "18", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A 4-way set-associative cache memory unit with a capacity of 16 KB is built using a block\n" +
                "size of 8 words. The word length is 32 bits. The size of the physical address space is 4 GB.\n" +
                "The number of bits for the TAG field is _______ ."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "20", "19", co, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the function func shown below:" +
                "$$ $$" +
                getProgram("2014-2"+"/prog2014-2-qno-20.txt") +"$$ $$" +
                "The value returned by func(435)is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "9", "20", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose n and p are unsigned int variables in a C program. We wish to set p to\n" +
                        "$^nC_3 .$ If n is\n" +
                        "large, which one of the following statements is most likely to set p correctly?",
                "p = n * (n-1) * (n-2) / 6;",
                "p = n * (n-1) / 2 * (n-2) / 3;",
                "p = n * (n-1) / 3 * (n-2) / 2;",
                "p = n * (n-1) * (n-2) / 6.0;"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "21", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A priority queue is implemented as a Max-Heap. Initially, it has 5 elements. The level-order\n" +
                        "traversal of the heap is: 10, 8, 5, 3, 2. Two new elements 1 and 7 are inserted into the heap in\n" +
                        "that order. The level-order traversal of the heap after the insertion of the elements is:",
                "10, 8, 7, 3, 2, 1, 5",
                "10, 8, 7, 2, 3, 1, 5",
                "10, 8, 7, 1, 2, 3, 5",
                "10, 8, 7, 5, 3, 2, 1"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "22", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following correctly determines the solution of the recurrence relation with\n" +
                        " $T(1)$ = 1?" +
                        "$$ $$$T(n) = |2T(n/2) + Log\\ n$ ",
                "$θ(n)$",
                "$θ(n\\ log\\ n)$",
                "$θ(n^2)$",
                "$θ(log\\ n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "23", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the tree arcs of a BFS traversal from a source node W in an unweighted, connected,\n" +
                        "undirected graph. The tree T formed by the tree arcs is a data structure for computing",
                "the shortest path between every pair of vertices.",
                "the shortest path from W to every vertex in the graph.",
                "the shortest paths from W to only those nodes that are leaves of T.",
                "the longest path in the graph."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "24", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If$L_1 = \\{a^n | n ≥ 0\\}$ and $L_2 = \\{ b^n | n ≥ 0\\},$ Consider" +
                        "$$ $$(I) $L_1.L_2$ is a regular language" +
                        "<br/>(II) $L_1 . L_2 = \\{ a^n b^n | n ≥0 \\}$" +
                        "$$ $$Which one of the following is CORRECT?",
                "Only (I)",
                "Only (II)",
                "Both (I) and (II)",
                "Neither (I) nor (II)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "25", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $A ≤_m B$ denotes that language $A$ is mapping reducible (also known as many-to-one reducible) " +
                        "to language $B.$ Which one of the following is FALSE?",
                "If $A ≤_m B$ and $B$ is recursive then $A$ is recursive.",
                "If $A ≤_m B$ and $A$ is undecidable then $B$ is undecidable.",
                "If $A ≤_m B$ and $B$ is recursively enumerable then $A$ is recursively enumerable.",
                "If $A ≤_m B$ and $B$ is not recursively enumerable then $A$ is not recursively enumerable."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "26", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the grammar defined by the following production rules, with two operators ∗ and +" +
                        "$$ $$" +
                        "S --> T * P \n" +
                        " <br/>   T --> U | T * U\n" +
                        " <br/>   P --> Q + P | Q\n" +
                        " <br/>   Q --> Id\n" +
                        " <br/>   U --> Id" +
                        "$$ $$Which one of the following is TRUE?$$ $$",
                "+ is left associative, while ∗ is right associative",
                "+ is right associative, while ∗ is left associative",
                "Both + and ∗ are right associative",
                "Both + and ∗ are left associative"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "27", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is NOT performed during compilation?",
                "Dynamic memory allocation",
                "Type checking",
                "Symbol table management",
                "Inline expansion"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "28", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is TRUE?",
                "The requirements document also describes how the requirements that are listed in the document are implemented efficiently.",
                "Consistency and completeness of functional requirements are always achieved in practice.",
                "Prototyping is a method of requirements validation.",
                "Requirements review is carried out to find the errors in system design."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "29", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A FAT (file allocation table) based file system is being used and the total overhead of each entry in the FAT is 4 bytes in size." +
                " Given a $100$ x $10^6$ bytes disk on which the file system is stored and " +
                "data block size is $10^3$ bytes, the maximum size of a file that can be stored on this disk in units of $10^6$ bytes is ____________."));
        explanation = getExplaination("");
        q = new Question(Q, "99.55 to 99.65", "30",os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The maximum number of superkeys for the relation " +
                "schema R(E,F,G,H) with E as the key is _________. "));
        explanation = getExplaination("");
        q = new Question(Q, "8", "31", dbms, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given an instance of the STUDENTS relation as shown below:" +
                "$$ $$" +
                MyTable(6,5,getText(5,"Student ID","StudentName","Student Email","Student Age","CPI","2345","Shankar","Shankar@math","X","9.4","1287","Swati","swati@ee","19","9.5","7853","Shankar","Shankar@cse","19","9.4","9876","Swati","swati@mech","18","9.3","8765","Ganesh","ganesh@civil","19","8.7"), true,false)
                +"$$ $$For (StudentName, StudentAge) to be a key for this instance, the value X should NOT be\n" +
                "equal to____________."));
        explanation = getExplaination("");
        q = new Question(Q, "19", "32", dbms, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is TRUE about the interior gateway routing protocols – Routing\n" +
                        "Information Protocol (RIP) and Open Shortest Path First (OSPF)?",
                "RILP uses distance vector routing and OSPF uses link state routing",
                "OSPF uses distance vector routing and RIP uses link state routing",
                "Both RIP and OSPF use link state routing",
                "Both RIP and OSPF use distance vector routing"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "33", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following socket API functions converts an unconnected active TCP socket\n" +
                        "into a passive socket?",
                "connect",
                "bind",
                "listen",
                "accept"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "34", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the diagram shown below, L1 is an Ethernet LAN and L2 is a Token-Ring LAN. An IP\n" +
                "packet originates from sender S and traverses to R, as shown. The links within each ISP and\n" +
                "across the two ISPs, are all point-to-point’ optical links. The initial value of the TTL field is\n" +
                "32. The maximum possible value of the TTL field when R receives the datagram is\n" +
                "____________." +
                "$$ $$<img src='"+path+"qno-35.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "26", "35",cn, marks, year, explanation, "1");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("Consider the store and forward packet switched network given below. Assume that the\n" +
                        "bandwidth of each link is $10^6$ bytes / sec. A user on host A sends a file of size $10^3$ bytes to\n" +
                        "host B through routers R1 and R2 in three different ways. In the first case a single packet\n" +
                        "containing the complete file is transmitted from A to B. In the second case, the file is split\n" +
                        "into 10 equal parts, and these packets are transmitted from A to B. In the third case, the file is\n" +
                        "split into 20 equal parts and these packets are sent from A to B. Each packet contains 100\n" +
                        "bytes of header information along with the user data. Consider only transmission time and\n" +
                        "ignore processing, queuing and propagation delays. Also assume that there are no errors\n" +
                        "during transmission. Let T1, T2 and T3 be the times taken to transmit the file in the first,\n" +
                        "second and third case respectively. Which one of the following is CORRECT?" +
                        "$$ $$<img src='"+path+"qno-36.png'/>",
                "T1 < T2 < T3",
                "T1 > T2 > T3",
                "T2 = T3, T3 < T1",
                "T1 = T3, T3 > T2"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "36", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("An IP machine Q has a path to another IP machine H via three IP routers R1, R2, and R3.\n" +
                        "$$ $$Q—R1—R2—R3—H\n" +
                        "$$ $$H acts as an HTTP server, and Q connects to H via HTTP and downloads a file. Session layer\n" +
                        "encryption is used, with DES as the shared key encryption protocol. Consider the following\n" +
                        "four pieces of information:" +
                        "$$ $$" +
                        "[I1] The URL of the file downloaded by Q\n" +
                        "<br/>[I2] The TCP port numbers at Q and H\n" +
                        "<br/>[I3] The IP addresses of Q and H\n" +
                        "<br/>[I4] The link layer addresses of Q and H" +
                        "$$ $$Which of I1, I2, I3, and I4 can an intruder learn through sniffing at R2 alone?$$ $$",
                "Only I1 and I2",
                "Only I1",
                "Only I2 and I3",
                "Only I3 and I4"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "37", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A graphical HTML browser resident at a network client machine Q accesses a static HTML\n" +
                        "webpage from a HTTP server S. The static HTML page has exactly one static embedded\n" +
                        "image which is also at S. Assuming no caching, which one of the following is correct about\n" +
                        "the HTML webpage loading (including the embedded image)?",
                "Q needs to send at least 2 HTTP requests to S, each necessarily in a separate TCP\n" +
                        "connection to server S",
                "Q needs to send at least 2 HTTP requests to S, but a single TCP connection to server S is\n" +
                        "sufficient",
                "A single HTTP request from Q to S is sufficient, and a single TCP connection between Q\n" +
                        "and S is necessary for this",
                "A single HTTP request from Q to S is sufficient, and this is possible without any TCP\n" +
                        "connection between Q and S"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "38", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following schedule S of transactions T1, T2, T3, T4:" +
                        "$$ $$" +
                        MyTable(6, 4,getText(4,"T1","T2","T3","T4","","Reads[X]","","","","","Writes[X]<br/>Commit","","Writes[X]<br/>Commit","","","","","Writes[X]<br/>Reads[Z]<br/>Commit","","","","","","Reads[X]<br/>Reads[Y]<br/>Commit","","","","","",""),true,false)+
                        "$$ $$Which one of the following statements is CORRECT?$$ $$" +
                        "",
                "S is conflict-serializable but not recoverable",
                "S is conflict-serializable but is recoverable",
                "S is both conflict-serializable and recoverable",
                "S is neither conflict-serializable nor is it recoverable"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "39", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a join (relation algebra) between relations r(R)and s(S) using the nested loop\n" +
                        "method. There are 3 buffers each of size equal to disk block size, out of which one buffer is\n" +
                        "reserved for intermediate results. Assuming size(r(R)) < size(s(S)), the join will have fewer\n" +
                        "number of disk block accesses if $$ $$",
                "relation r(R) is in the outer loop.",
                "relation s(S) is in the outer loop.",
                "join selection factor between r(R) and s(S) is more than 0.5.",
                "join selection factor between r(R) and s(S) is less than 0.5."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "40", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the procedure below for the Producer-Consumer problem which uses semaphores:" +
                        getProgram("2014-2"+"/prog2014-2-qno-41.txt")+

                        "$$ $$"+
                        getProgram("2014-2"+"/prog2014-2-qno-41-2.txt")+
                        "$$ $$Which one of the following is TRUE?$$ $$",
                "S is conflict-serializable but not recoverable",
                "S is conflict-serializable but is recoverable",
                "S is both conflict-serializable and recoverable",
                "S is neither conflict-serializable nor is it recoverable"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "41", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Three processes A, B and C each execute a loop of 100 iterations. In each iteration of the\n" +
                "loop, a process performs a single computation that requires $t_c$ CPU milliseconds and then\n" +
                "initiates a single I/O operation that lasts for $t_{io}$ milliseconds. It is assumed that the computer\n" +
                "where the processes execute has sufficient number of I/O devices and the OS of the computer\n" +
                "assigns different I/O devices to each process. Also, the scheduling overhead of the OS is\n" +
                "negligible. The processes have the following characteristics:$$ $$" +
                MyTable(4, 3,getText(3,"Process id","$t_c$","$t_{io}$","A","100ms","500ms","B","350ms","500ms","C","200ms","500ms","","","","","","","","","","","","","","","","","",""),true,false)
                +"$$ $$The processes A, B, and C are started at times 0, 5 and 10 milliseconds respectively, in a pure\n" +
                "time sharing system (round robin scheduling) that uses a time slice of 50 milliseconds. The\n" +
                "time in milliseconds at which process C would complete its first I/O operation is\n" +
                "___________."));
        explanation = getExplaination("");
        q = new Question(Q, "1000", "42", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A computer has twenty physical page frames which contain pages numbered 101 through\n" +
                        "120. Now a program accesses the pages numbered 1, 2, …, 100 in that order, and repeats the\n" +
                        "access sequence THRICE. Which one of the following page replacement policies experiences\n" +
                        "the same number of page faults as the optimal page replacement policy for this program?",
                "Least-recently-used",
                "First-in-first-out",
                "Last-in-first-out",
                "Most-recently-used"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "43", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("For a C program accessing X[i] [j] [k], the following intermediate code is generated by a\n" +
                        "compiler. Assume that the size of an integer is 32 bits and the size of a character is 8 bits.\n" +
                        "$$ $$t0 = i * 1024\n" +
                        "<br/>t1 = j * 32\n" +
                        "<br/>t2 = k * 4\n" +
                        "<br/>t3 = t1 + t0\n" +
                        "<br/>t4 = t3 + t2\n" +
                        "<br/>t5 = X[t4]\n" +
                        "$$ $$Which one of the following statements about the source code for the C program is\n" +
                        "CORRECT?$$ $$",
                "X is declared as “int X[32] [32] [8]”.",
                "X is declared as “int X[4] [1024] [32]”.",
                "X is declared as “char X[4] [32] [8]”.",
                "X is declared as “char X[32] [16] [2]”."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "44", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let < M > be the encoding of a Turing machine as a string over ∑ = {0,1} . Let L = { < M > | M\n" +
                        "is a Turning machine that accepts a string of length 2014}. Then, L is",
                "decidable and recursively enumerable",
                "undecidable but recursively enumerable",
                "undecidable and not recursively enumerable",
                "decidable but not recursively enumerable"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "45", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L_1$ = { w ∈{ 0,1 }* |w has at least as many occurrences of (110)’s as (011)’s}. Let\n" +
                        "$L_2$ = { w ∈{ 0,1 }* | w has at least as many occurrence of (000)’s as (111)’s}. Which one of the\n" +
                        "following is TRUE?",
                "$L_1$ is regular but not $L_2$",
                "$L_2$ is regular but not $L_1$",
                "Both $L_1$ and $L_2$ are regular",
                "Neither $L_1$ nor $L_2$ are regular"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "46", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider two strings $A = \"qpqrr\"$ and $B = \"pqprqrp\".$ Let x be the length of the longest\n" +
                "common subsequence (not necessarily contiguous) between A and B and let y be the number\n" +
                "of such longest common subsequences between A and B. Then x + 10y = ______."));
        explanation = getExplaination("");
        q = new Question(Q, "34", "47", algo, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose P, Q, R, S, T are sorted sequences having lengths 20, 24, 30, 35, 50 respectively.\n" +
                "They are to be merged into a single sequence by merging together two sequences at a time.\n" +
                "The number of comparisons that will be needed in the worst case by the optimal algorithm for\n" +
                "doing this is _______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "358", "48",algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the expression tree shown. Each leaf represents a numerical value, which can either\n" +
                "be 0 or 1. Over all possible choices of the values at the leaves, the maximum possible value\n" +
                "of the expression represented by the tree is _______.$$ $$" +
                "<img src='"+path+"qno-49.png'/> "));
        explanation = getExplaination("");
        q = new Question(Q, "6", "49", ds, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following function" +
                getProgram("2014-2"+"/prog2014-2-qno-50.txt")+
                "$$ $$Give a value q (to 2 decimals) such that f(q) will return q:_____."));
        explanation = getExplaination("");
        q = new Question(Q, "1.72 to 1.74", "50", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose a stack implementation supports an instruction REVERSE, which reverses the order\n" +
                        "of elements on the stack, in addition to the PUSH and POP instructions. Which one of the\n" +
                        "following statements is TRUE with respect to this modified stack?",
                "A queue cannot be implemented using this stack.",
                "A queue can be implemented where ENQUEUE takes a single instruction and\n" +
                        "DEQUEUE takes a sequence of two instructions.",
                "A queue can be implemented where ENQUEUE takes a sequence of three instructions\n" +
                        "and DEQUEUE takes a single instruction.",
                "A queue can be implemented where both ENQUEUE and DEQUEUE take a single\n" +
                        "instruction each."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "51", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the C function given below $$ $$" +
                        getProgram("2014-2"+"/prog2014-2-qno-52.txt")+
                        "$$ $$Which one of the following is TRUE?$$ $$",
                "The function returns 0 for all values of j.",
                "The function prints the string something for all values of j.",
                "The function returns 0 when j = 50.",
                "The function will exhaust the runtime stack or run into an infinite loop when j = 50."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "52", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In designing a computer’s cache system, the cache block (or cache line) size is an important\n" +
                        "Parameter. Which one of the following statements is correct in this context?",
                "A smaller block size implies better spatial locality",
                "A smaller block size implies a smaller cache tag and hence lower cache tag overhead",
                "A smaller block size implies a larger cache tag and hence lower cache hit time",
                "A smaller block size incurs a lower cache miss penalty"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "53", co, marks, year, explanation,"0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If the associativity of a processor cache is doubled while keeping the capacity and block size\n" +
                        "unchanged, which one of the following is guaranteed to be NOT affected?",
                "Width of tag comparator",
                "Width of set index decoder",
                "Width of way selection multiplexor",
                "Width of processor to main memory data bus"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "54", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The value of a float type variable is represented using the single-precision 32-bit floating\n" +
                        "point format of IEEE-754 standard that uses 1 bit for sign, 8 bits for biased exponent and 23\n" +
                        "bits for mantissa. A float type variable X is assigned the decimal value of −14.25. The\n" +
                        "representation of X in hexadecimal notation is",
                "C1640000H",
                "416C0000H",
                "41640000H",
                "C16C0000H"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "55", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the Newton-Raphson method, an initial guess of $x_0 = 2$ is made and the sequence\n" +
                        " $x_0 ,x_1 ,x_2 ...$ is obtained for the function\n" +
                        "$$ $$ $ 0.75x^3 − 2x^2 − 2x + 4 = 0$\n" +
                        "$$ $$Consider the statements\n" +
                        "<br/>(I) $x_3$ = 0 .\n" +
                        "<br/>(II) The method converges to a solution in a finite number of iterations.\n" +
                        "$$ $$Which of the following is TRUE?$$ $$",
                "Only I",
                "Only II",
                "Both I and II",
                "Neither I nor II"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "56", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The product of the non-zero eigenvalues of the matrix" +
                "$$ $$ $[\\table 1,0,0,0,1 ; 0,1,1,1,0 ; 0,1,1,1,0 ; 0,1,1,1,0 ; 1,0,0,0,1]$" +
                "$$ $$is_______. "));
        explanation = getExplaination("");
        q = new Question(Q, "6", "57", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The probability that a given positive integer lying between 1 and 100 (both inclusive) is NOT\n" +
                "divisible by 2, 3 or 5 is ______ ."));
        explanation = getExplaination("");
        q = new Question(Q, "0.259 to 0.261", "58",m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of distinct positive integral factors of 2014 is ______________"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "8", "59", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following relation on subsets of the set S of integers between 1 and 2014. For\n" +
                        "two distinct subsets U and V of S we say U < V if the minimum element in the symmetric\n" +
                        "difference of the two sets is in U.\n" +
                        "$$ $$Consider the following two statements:\n" +
                        "$$ $$S1: There is a subset of S that is larger than every other subset.\n" +
                        "$$ $$S2: There is a subset of S that is smaller than every other subset.\n" +
                        "$$ $$Which one of the following is CORRECT?$$ $$",
                "Both S1 and S2 are true",
                "S1 is true and S2 is false",
                "S2 is true and S1 is false",
                "Neither S1 nor S2 is true"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "60", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A cycle on $n$ vertices is isomorphic to its complement. The value of $n$ is _____."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "5", "61", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of distinct minimum spanning trees for the weighted graph below is" +
                "$$ $$<img src='"+path+"qno-62.png'/>" +
                ""));
        explanation = getExplaination("");
        q = new Question(Q, "6", "62", algo, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following Boolean expressions is NOT a tautology?",
                "((a → b) ∧ (b → c)) →(a → c)",
                "(a ↔ c)→(~ b→(a ∧ c))",
                "(a ∧ b ∧ c)→(c ∧ a )",
                "a →(b → a)"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "63", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("SQL allows duplicate tuples in relations, and correspondingly defines the multiplicity of\n" +
                        "tuples in the result of joins. Which one of the following queries always gives the same answer\n" +
                        "as the nested query shown below:" +
                        "$$ $$Select * from R where a in (select S. a from S)$$ $$",
                "Select R. * from R, S where R. a=S. a",
                "Select distinct R. * from R,S where R. a=S. a",
                "Select R. * from R, (select distinct a from S) as S1 where R. a=S1.a",
                "Select R. * from R, S where R.a = S. a and is unique R"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "64", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a main memory system that consists of 8 memory modules attached to the system\n" +
                "bus, which is one word wide. When a write request is made, the bus is occupied for 100\n" +
                "nanoseconds (ns) by the data, address, and control signals. During the same 100 ns, and for\n" +
                "500 ns thereafter, the addressed memory module executes one cycle accepting and storing the\n" +
                "data. The (internal) operation of different memory modules may overlap in time, but only one\n" +
                "request can be on the bus at any time. The maximum number of stores (of one word each)\n" +
                "that can be initiated in 1 millisecond is ____________"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "10000", "65", co, marks, year, explanation, "1");
        this.addQuestion(q);


    }




    //**** 2014-3 questions starts *****//

    private void addQuestions2014_3() {

        //year = "2014-3";
        //marks = "1";
        //path = "file:///android_asset/2014-3/";

        Q = getQuestion(getstring("(I)<U>While trying to collect</U> an envelope (II)<U> from under the table</U>,  (III) <U> Mr. X fell down and</U>" +
                        "  (IV) <U>was losing consciousness.</U>" +
                        "$$ $$Which one of the above underlined parts of the sentence is NOT appropriate?",
                "I",
                "II",
                "III",
                "IV"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "1", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If she _______________ how to calibrate the instrument, she _______________ done the\n" +
                        "experiment.",
                "knows, will have",
                "knew, had",
                "had known, could have",
                "should have known, would have"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "2", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the word that is opposite in meaning to the word “coherent”.",
                "sticky",
                "well-connected",
                "rambling",
                "friendly"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "3", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which number does not belong in the series below?" +
                        "$$ $$2, 5, 10, 17, 26, 37, 50, 64",
                "17",
                "37",
                "64",
                "26"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "4", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The table below has question-wise data on the performance of students in an examination.\n" +
                        "The marks for each question are also listed. There is no negative or partial marking in the\n" +
                        "examination.$$ $$" +
                        MyTable(4, 5, getText(5, "Q.No", "Marks", "Answered Correctly", "Answered Wrongly", "Not Attempted", "1", "2", "21", "17", "6", "2", "3", "15", "27", "2", "3", "2", "23", "18", "3", "", "", "", "", "", "", "", "", "", ""), true, false)
                        +
                        "$$ $$What is the average of the marks obtained by the class in the examination?",
                "1.34",
                "1.74",
                "3.02",
                "3.91"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "5",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks ="2";

        Q = getQuestion(getstring("A dance programme is scheduled for 10.00 a.m. Some students are participating in the\n" +
                        "programme and they need to come an hour earlier than the start of the event. These students\n" +
                        "should be accompanied by a parent. Other students and parents should come in time for the\n" +
                        "programme. The instruction you think that is appropriate for this is",
                "Students should come at 9.00 a.m. and parents should come at 10.00 a.m.",
                "Participating students should come at 9.00 a.m. accompanied by a parent, and other\n" +
                        "parents and students should come by 10.00 a.m.",
                "Students who are not participating should come by 10.00 a.m. and they should not bring\n" +
                        "their parents. Participating students should come at 9.00 a.m.",
                "Participating students should come before 9.00 a.m. Parents who accompany them should\n" +
                        "come at 9.00 a.m. All others should come at 10.00 a.m."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "6", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("By the beginning of the $20^{th}$ century, several hypotheses were being proposed, suggesting a\n" +
                        "paradigm shift in our understanding of the universe. However, the clinching evidence was\n" +
                        "provided by experimental measurements of the position of a star which was directly behind\n" +
                        "our sun." +
                        "$$ $$Which of the following inference(s) may be drawn from the above passage?" +
                        "$$ $$(i) Our understanding of the universe changes based on the positions of stars\n" +
                        "<br/>(ii) Paradigm shifts usually occur at the beginning of centuries\n" +
                        "<br/>(iii) Stars are important objects in the universe\n" +
                        "<br/>(iv) Experimental evidence was important in confirming this paradigm shift",
                "(i), (ii) and (iv)",
                "(iii) only",
                "(i) and (iv)",
                "(iv) only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The Gross Domestic Product (GDP) in Rupees grew at 7% during 2012-2013. For\n" +
                        "international comparison, the GDP is compared in US Dollars (USD) after conversion based\n" +
                        "on the market exchange rate. During the period 2012-2013 the exchange rate for the USD\n" +
                        "increased from Rs. 50/ USD to Rs. 60/ USD. India’s GDP in USD during the period 2012-\n" +
                        "2013",
                "increased by 5 %",
                "decreased by 13%",
                "decreased by 20%",
                "decreased by 11%"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "8", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("He ratio of male to female students in a college for five years is plotted in the following line\n" +
                        "graph. If the number of female students in 2011 and 2012 is equal, what is the ratio of male\n" +
                        "students in 2012 to male students in 2011?$$ $$" +
                        "<img src='"+"file:///android_asset/2014-2/"+"qno-9.png'/>",
                "1:1" ,
                "2:1" ,
                "1.5:1" ,
                "2.5:1"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "9",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the equation: $(7526)_8 - (Y)_8 = (4364)_8 ,$ where $(X)_N$ stands for X to the base N. Find\n" +
                        "Y.",
                "1634",
                "1737",
                "3142",
                "3162"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "10", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        marks = "1";

        Q = getQuestion(getstring("Consider the following statements:" +
                        "$$ $$P: Good mobile phones are not cheap\n" +
                        "<br/>Q: Cheap mobile phones are not good" +
                        "$$ $$L: P implies Q\n" +
                        "<br/>M: Q implies P\n" +
                        "<br/>N: P is equivalent to Q" +
                        "$$ $$Which one of the following about L, M, and N is CORRECT?",
                "Only L is TRUE.",
                "Only M is TRUE.",
                "Only N is TRUE.",
                "L, M and N are TRUE."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "11", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $X$ and $Y$ be finite sets and $f: X → Y$ be a function." +
                        " Which one of the following statements is TRUE? ",
                "For any subsets A and B of $X,$ $|f (A ∪ B)| = |f (A)| + |f (B)|$" ,
                "For any subsets A and B of $X,$ $f (A ∩ B) =f (A) ∩ f (B)$" ,
                "For any subsets A and B of $X,$ $|f (A ∩ B)| =min\\{ |f (A)| , |f (B)| \\}$" ,
                "For any subsets S and T of $Y,$ $ f^{-1}(S ∩ T) = f^{-1}(S) ∩ f^{-1}(T)$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "12", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a group with 15 elements. Let L be a subgroup of G. It is known that L ≠ G and that\n" +
                "the size of L is at least 4. The size of L is _______."));
        explanation = getExplaination("");
        q = new Question(Q, "5", "13", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following statements is TRUE about every n × n matrix with only real\n" +
                        "eigenvalues?",
                "If the trace of the matrix is positive and the determinant of the matrix is negative, at least\n" +
                        "one of its eigenvalues is negative.",
                "If the trace of the matrix is positive, all its eigenvalues are positive.",
                "If the determinant of the matrix is positive, all its eigenvalues are positive.",
                "If the product of the trace and determinant of the matrix is positive, all its eigenvalues are\n" +
                        "positive."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "14", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If $V_1$ and $V_2$ are 4-dimensional subspaces of a 6-dimensional vector space V, then the smallest\n" +
                "possible dimension of $ V_1 ∩ V_2 $ is _______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "2", "15", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("If $∫↙0↖{2x}|x\\ sin\\ x|$ dx = kπ,then the value of k is equal to _______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "4", "16", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following minterm expression for F." +
                        "$$ $$F(P,Q,R,S) = ∑ 0, 2, 5, 7, 8, 10, 13, 15" +
                        "$$ $$The minterms 2, 7, 8 and 13 are ‘do not care terms. The minimal sum of-products form for F\n" +
                        "is$$ $$",
                "$Q\\ \\ov{S} + \\ov{Q}\\ S$" ,
                "$\\ov{Q}\\ \\ov{S} + Q\\ S$" ,
                "$\\ov{Q}\\ \\ov{R}\\ \\ov{S} + \\ov{Q} R \\ov{S} + Q\\ov{R}\\ S + Q\\ R\\ S$" ,
                "$\\ov{P}\\ \\ov{Q}\\ \\ov{S} + \\ov{P}QS + P\\ Q\\ S + P\\ \\ov{Q}\\ \\ov{S}$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "17", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following combinational function block involving four Boolean variables x, y, a,\n" +
                        "b where x, a, b are inputs and y is the output.$$ $$" +
                        getProgram("2014-3"+"/prog2014-3-qno-18.txt")+
                        "$$ $$Which one of the following digital logic blocks is the most suitable for implementing this\n" +
                        "function?",
                "Full adder" ,
                "Priority encoder" ,
                "Multiplexor" ,
                "Flip-flop"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "18", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following processors (ns stands for nanoseconds).\n" +
                        "Assume that the pipeline registers have zero latency.\n" +
                        "$$ $$P1: Four-stage pipeline with stage latencies 1 ns, 2 ns, 2 ns, 1 ns.\n" +
                        "<br/>P2: Four-stage pipeline with stage latencies 1 ns, 1.5 ns, 1.5 ns, 1.5 ns.\n" +
                        "<br/>P3: Five-stage pipeline with stage latencies 0.5 ns, 1 ns, 1 ns, 0.6 ns, 1 ns.\n" +
                        "<br/>P4: Five-stage pipeline with stage latencies 0.5 ns, 0.5 ns, 1 ns, 1 ns, 1.1 ns.\n" +
                        "$$ $$Which processor has the highest peak clock frequency?",
                "P1",
                "P2",
                "P3",
                "P4"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "19", co, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let A be a square matrix of size n x n. " +
                        "Consider the following program. What is the expected output?" +
                        getProgram("2014-3"+"/prog2014-3-qno-20.txt")+
                        "",
                "The matrix A itself" ,
                "Transpose of matrix A" ,
                "Adding 100 to the upper diagonal elements and subtracting 100 from diagonal elements of A" ,
                "None of the above"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "20", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The minimum number of arithmetic operations required to evaluate the polynomial\n" +
                " $P (X) = X^5 + 4X^3 + 6x + 5$ for a given value of X, using only one temporary variable is\n" +
                "_______."));
        explanation = getExplaination("");
        q = new Question(Q, "7", "21", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following rooted tree with the vertex labelled P as the root" +
                        "$$ $$<img src='"+path+"qno-22.png'/>" +
                        "$$ $$The order in which the nodes are visited during an in-order traversal of the tree is$$ $$",
                "SQPTRWUV" ,
                "SQPTUWRV" ,
                "SQPTWUVR" ,
                "SQPTRUWV"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "22", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose depth first search is executed on the graph below starting at some unknown vertex.\n" +
                "Assume that a recursive call to visit a vertex is made only after first checking that the vertex\n" +
                "has not been visited earlier. Then the maximum possible recursion depth (including the initial\n" +
                "call) is _________." +
                "$$ $$ <img src='"+path+"qno-23.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "19", "23", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("You have an array of n elements. Suppose you implement quick sort by always choosing the\n" +
                        "central element of the array as the pivot. Then the tightest upper bound for the worst case\n" +
                        "performance is",
                "$O(n^2)$",
                "$O(n\\ log\\ n)$",
                "$Θ(n\\ log\\ n)$",
                "$O(n^3)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "24", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The length of the shortest string NOT in the language (over Σ = {a,b}) of the following\n" +
                "regular expression is _________. a*b* (ba)* a*"));
        explanation = getExplaination("");
        q = new Question(Q, "3", "25", toc, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let Σ be a finite non-empty alphabet and let  $2Σ^*$ be the power set of $Σ^* .$ Which one of the\n" +
                        "following is TRUE?",
                "Both $2Σ^*$ and $Σ^*$ are countable",
                "$2Σ^*$ is countable $Σ^*$ is uncountable",
                "$2Σ^*$ is uncountable and $Σ^*$ is countable",
                "Both $2Σ^*$ and $Σ^*$ are uncountable"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "26", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("One of the purposes of using intermediate code in compilers is to",
                "make parsing and semantic analysis simpler",
                "improve error recovery and error reporting",
                "increase the chances of reusing the machine-independent code optimizer in other\n" +
                        "compliers.",
                "improve the register allocation."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "27", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following statements are CORRECT?\n" +
                        "$$ $$1) Static allocation of all data areas by a compiler makes it impossible to implement\n" +
                        "recursion.\n" +
                        "$$ $$2) Automatic garbage collection is essential to implement recursion.\n" +
                        "$$ $$3) Dynamic allocation of activation records is essential to implement recursion.\n" +
                        "$$ $$4) Both heap and stack are essential to implement recursion.$$ $$",
                "1 and 2 only",
                "2 and 3 only",
                "3 and 4 only",
                "1 and 3 only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "28", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the context of modular software design, which one of the following combinations is\n" +
                        "desirable?",
                "High cohesion and high coupling",
                "High cohesion and low coupling",
                "Low cohesion and high coupling",
                "Low cohesion and low coupling"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "29", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A system uses 3 page frames for storing process pages in main memory. It uses the Least\n" +
                "Recently Used (LRU) page replacement policy. Assume that all the page frames are initially\n" +
                "empty. What is the total number of page faults that will occur while processing the page\n" +
                "reference string given below?" +
                "$$ $$4, 7, 6, 1, 7, 6, 1, 2, 7, 2"));
        explanation = getExplaination("");
        q = new Question(Q, "6", "30", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("What is the optimized version of the relation algebra expression $π_{A_1}( π_{A_2}(σ_{F1}(σ_{F2} (r)))),$ where\n" +
                        "$A_1, A_2$ are sets of attributes in r with $A1 ⊂ A2$ and F1, F2 are Boolean expressions based on\n" +
                        "the attributes in r?",
                "$π_{A_1}(σ( F1 ∧ F2) (r))$",
                "$π_{A_1}(σ( F1 ∨ F2) (r))$",
                "$π_{A_2}(σ( F1 ∧ F2) (r))$",
                "$π_{A_2}(σ( F1 ∨ F2) (r))$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "31", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A prime attribute of a relation scheme R is an attribute that appears",
                "in all candidate keys of R.",
                "in some candidate key of R.",
                "in a foreign keys of R.",
                "only in the primary key of R."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "32", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the following pairs of OSI protocol layer/sub-layer and its functionality, the\n" +
                        "INCORRECT pair is",
                "Network layer and Routing",
                "Data Link Layer and Bit synchronization",
                "Transport layer and End-to-end process communication",
                "Medium Access Control sub-layer and Channel sharing"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "33", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A bit-stuffing based framing protocol uses an 8-bit delimiter pattern of 01111110. If the\n" +
                        "output bit-string after stuffing is 01111100101, then the input bit-string is",
                "0111110100",
                "0111110101",
                "0111111101",
                "0111111111"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "34", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Host A (on TCP/IP v4 network A) sends an IP datagram D to host B (also on TCP/IP V4\n" +
                        "network B). Assume that no error occurred during the transmission of D. When D reaches B,\n" +
                        "which of the following IP header field(s) may be different from that of the original datagram\n" +
                        "D?" +
                        "$$ $$(i) TTL " +
                        "<br/>(ii) Checksum " +
                        "<br/>(iii) Fragment Offset$$ $$",
                "(i) only",
                "(i) and (ii) only",
                "(ii) and (iii) only",
                "(i), (ii) and (iii)"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "35", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("An IP router implementing Classless Inter-domain routing (CIDR) receives a packet with\n" +
                "address 131.23.151.76. The router’s routing table has the following entries:$$ $$" +
                MyTable(5, 2, getText(2, "Prefix", "Output Interface Identifier", "131.16.00/12", "3", "131.28.0.0/14", "5", "131.19.0.0/16", "2", "131.22.0.0/15", "1", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false)
                + "$$ $$The identifier of the output interface on which this packet will be forwarded is _____."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "1", "36", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Every host in an IPv4 network has a 1-second resolution real-time clock with battery backup.\n" +
                "Each host needs to generate up to 1000 unique identifiers per second. Assume that each host\n" +
                "has a globally unique IPv4 address. Design a 50-bit globally unique ID for this purpose. After\n" +
                "what period (in seconds) will the identifiers generated by a host wrap around?"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "256", "37", cn, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("An IP router with a Maximum Transmission Unit (MTU) of 1500 bytes has received an IP\n" +
                        "packet of size 4404 bytes with an IP header of length 20 bytes. The values of the relevant\n" +
                        "fields in the header of the third IP fragment generated by the router for this packet are",
                "MF bit: 0, Datagram Length: 1444; Offset: 370",
                "MF bit: 1, Datagram Length: 1424; Offset: 185",
                "MF bit: 1, Datagram Length: 1500; Offset: 370",
                "MF bit: 0, Datagram Length: 1424; Offset: 2960"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "38", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the transactions T1, T2, and T3 and the schedules S1 and S2 given below." +
                        "$$ $$T1 : r1 (X) ; r1 (z) ; w1 (X) ; w1 (z)\n" +
                        "$$ $$T2 : r2 (X) ; r2 (z) ; w2 (z)\n" +
                        "$$ $$T3 : r3 (X) ; r3 (X) ; w3 (Y)\n" +
                        "$$ $$S1 : r1(X); r3(Y); r3(X); r2(Y); r2(Z); w3(Y); w2(Z); r1(Z); w1(X); w1(Z)\n" +
                        "$$ $$S2 : r1(X); r3(Y); r2(Y); r3(X); r1(Z); r2(Z); w3(Y); w1(X); w2(Z); w1(Z)" +
                        "$$ $$Which one of the following statements about the schedules is TRUE?$$ $$",
                "Only S1 is conflict-serializable.",
                "Only S2 is conflict-serializable.",
                "Both S1 and S2 are conflict-serializable.",
                "Neither S1 nor S2 is conflict-serializable."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "39", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relational schema given below, " +
                        "where eId of the relation dependent is a foreign key referring to empId of " +
                        "the relation employee. Assume that every employee has at least one associated" +
                        " dependent in the dependent relation." +
                        "$$ $$employee (<U>empId</U>, empName, empAge)\n" +
                        "<br/>dependent(<U>depId</U>, eId, depName, depAge) " +
                        "$$ $$Consider the following relational algebra query:" +
                        "$$ $$ $∏_{empId}(employee)$ $-∏_{empId}(employee\\ ▷◁\\ (empId=eID)$ ∧ $(empAge ≤ depAge)dependent)$" +
                        "$$ $$The above query evaluates to the set of empIds of employees whose age is greater than that of$$ $$",
                "some dependent.",
                "all dependents.",
                "some of his/her dependents.",
                "all of his/her dependents"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "40", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A system contains three programs and each requires three tape units for its operation. The\n" +
                "minimum number of tape units which the system must have such that deadlocks never arise\n" +
                "is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "7", "41", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("An operating system uses shortest remaining time first scheduling algorithm for pre-emptive\n" +
                "scheduling of processes. Consider the following set of processes with their arrival times and\n" +
                "CPU burst times (in milliseconds):" +
                MyTable(4, 3,getText(3,"Process","Arrival Time","Burst Time","P1","0","12","P2","2","4","P3","3","6","P4","8","5","","","","","","","","","","","","","","",""), true,false)+
                "$$ $$The average waiting time (in milliseconds) of the processes is _________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "5.5", "42", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a paging hardware with a TLB. Assume that the entire page table and all the pages\n" +
                "are in the physical memory. It takes 10 milliseconds to search the TLB and 80 milliseconds to\n" +
                "access the physical memory. If the TLB hit ratio is 0.6, the effective memory access time (in\n" +
                "milliseconds) is _________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "122", "43", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the basic block given below." +
                        "$$ $$" +
                        " a = b + c\n" +
                        "<br/> c = a + d\n" +
                        "<br/> d = b + c\n" +
                        "<br/> e = d + b\n" +
                        "<br/> a = e + b" +
                        "$$ $$The minimum number of nodes and edges present in the DAG representation of the above\n" +
                        "basic block respectively are$$ $$",
                "6 and 6",
                "8 and 10",
                "9 and 12",
                "4 and 4"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "44", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following problems is undecidable?",
                "Deciding if a given context-free grammar is ambiguous.",
                "Deciding if a given string is generated by a given context-free grammar.",
                "Deciding if the language generated by a given context-free grammar is empty.",
                "Deciding if the language generated by a given context-free grammar is finite."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "45", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following languages over the alphabet ∑ = {0,1,c}" +
                        "$$ $$ $L_1 = \\{0^n1^n|n ≥ 0 \\}$" +
                        "<br/>$L_2 = \\{wcw^r|w ∈ \\{0,1\\}^*\\}$" +
                        "<br/>$L_3 = \\{ww^r|w ∈ \\{0,1\\}^*\\}$" +
                        "$$ $$Here $w^r$ is the reverse of the string $w.$ Which of these languages are deterministic Context free\n" +
                        "languages?$$ $$",
                "None of the languages",
                "Only $L_1$",
                "Only $L_1$ and $L_2$",
                "All the three languages"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "46", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose you want to move from 0 to 100 on the number line. In each step, you either move\n" +
                "right by a unit distance or you take a shortcut. A shortcut is simply a pre-specified pair of\n" +
                "integers i,j with\n" +
                "i < j. Given a shortcut i, j if you are at position i on the number line, you may directly move\n" +
                "to j. Suppose T(k) denotes the smallest number of steps needed to move from k to 100.\n" +
                "suppose further that there is at most 1 shortcut involving any number, and in particular from 9\n" +
                "there is a shortcut to 15. Let y and z be such that T(9) = 1 + min(T(y), T(z)). Then the value\n" +
                "of the product yz is_______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "150", "47", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the decision problem 2CNFSAT defined as follows:\n" +
                        "$$ $${ φ | φ is a satisfiable propositional formula in CNF with at most two literal per clause }" +
                        "$$ $$ For example , $φ = (x_1 ∨ x_2) ∧ (x_1 ∨ \\ov{x_3}) ∧ (x_2 ∨ x_4)$ is a Boolean formula and it is in 2CNFSAT." +
                        "The decision problem 2CNFSAT is ",
                "NP-Complete.",
                "solvable in polynomial time by reduction to directed graph reachability.",
                "solvable in constant time since any input instance is satisfiable.",
                "NP-hard, but not NP-complete."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "48", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose we have a balanced binary search tree T holding n numbers. We are given two\n" +
                "numbers L and H and wish to sum up all the numbers in T that lie between L and H. Suppose\n" +
                "there are m such numbers in T. If the tightest upper bound on the time to compute the sum is\n" +
                "$O( n^a\\ log^b\\ n + m^c\\ log^d\\ n ) ,$ the value of a + 10b + 100c + 1000d is _______."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "110", "49", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a hash table with 100 slots. Collisions are resolved using chaining. Assuming\n" +
                        "simple uniform hashing, what is the probability that the first 3 slots are unfilled after the first\n" +
                        "3 insertions?",
                "$(97 × 97 × 97)/100^3$",
                "$(99 × 98 × 97)/100^3$",
                "$(97 × 96 × 95)/100^3$",
                "$(97 × 96 × 95)/(3! × 100^3)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "50", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the pseudocode given below. The function DoSomething() " +
                        "takes as argument a pointer to the root of an arbitrary " +
                        "tree represented by the leftMostChild-rightSibling representation. " +
                        "Each node of the tree is of type treeNode.$$ $$" +
                        getProgram("2014-3"+"/prog2014-3-qno-51.txt")+
                        "$$ $$When the pointer to the root of a tree is passed as the argument " +
                        "to DoSomething, the value returned by the function corresponds to the",

                "number of internal nodes in the tree.",
                "height of the tree.",
                "number of nodes without a right sibling in the tree.",
                "number of leaf nodes in the tree"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "51", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the C function given below. " +
                        "Assume that the array listA contains n ( > 0) elements, sorted in ascending order.$$ $$" +
                        getProgram("2014-3"+"/prog2014-3-qno-52.txt")+
                        "$$ $$Which one of the following statements about " +
                        "the function ProcessArray is CORRECT?",
                "It will run into an infinite loop when x is not in listA.",
                "It is an implementation of binary search.",
                "It will always find the maximum element in listA.",
                "It will return −1 even when x is present in listA."));
        explanation = getExplaination("");
        q = new Question(Q, "B", "52", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("An instruction pipeline has five stages, namely, instruction fetch (IF), instruction decode and\n" +
                "register fetch (ID/RF), instruction execution (EX), memory access (MEM), and register write\n" +
                "back (WB) with stage latencies 1 ns, 2.2 ns, 2 ns, 1 ns, and 0.75 ns, respectively (ns stands for\n" +
                "nanoseconds). To gain in terms of frequency, the designers have decided to split the ID/RF\n" +
                "stage into three stages (ID, RF1, RF2) each of latency ${2.2}/3 ns.$ Also, the EX stage is split into\n" +
                "two stages (EX1, EX2) each of latency 1 ns. The new design has a total of eight pipeline\n" +
                "stages. A program has 20% branch instructions which execute in the EX stage and produce\n" +
                "the next instruction pointer at the end of the EX stage in the old design and at the end of the\n" +
                "EX2 stage in the new design. The IF stage stalls after fetching a branch instruction until the\n" +
                "next instruction pointer is computed. All instructions other than the branch instruction have\n" +
                "an average CPI of one in both the designs. The execution times of this program on the old and\n" +
                "the new design are P and Q nanoseconds, respectively. The value of P/Q is __________"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "1.53 to 1.56", "53", co, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The memory access time is 1 nanosecond for a read operation with a hit in cache, 5\n" +
                "nanoseconds for a read operation with a miss in cache, 2 nanoseconds for a write operation\n" +
                "with a hit in cache and 10 nanoseconds for a write operation with a miss in cache. Execution\n" +
                "of a sequence of instructions involves 100 instruction fetch operations, 60 memory operand\n" +
                "read operations and 40 memory operand write operations. The cache hit-ratio is 0.9. The\n" +
                "average memory access time (in nanoseconds) in executing the sequence of instructions is\n" +
                "__________."));
        explanation = getExplaination("");
        q = new Question(Q, "1.65 to 1.69", "54", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("$$ $$<img src='"+path+"qno-55.png'/>" +
                        "The above synchronous sequential circuit built using JK flip-flops is initialized with\n" +
                        "$Q_2Q_1Q_0 = 000.$ The state sequence for this circuit for the next 3 clock cycles is" +
                        "",
                "001, 010, 011",
                "111, 110, 101",
                "100, 110, 111",
                "100, 011, 001"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "55", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("With respect to the numerical evaluation of the definite integral," +
                        "$$ $$ $K= ∫↙a↖b x^2$ dx,where a and b\n" +
                        "are given, which of the following statements is/are TRUE?" +
                        "$$ $$(I) The value of K obtained using the trapezoidal rule is always greater than or equal to the\n" +
                        "exact value of the definite integral.\n" +
                        "$$ $$(II) The value of K obtained using the Simpson’s rule is always equal to the exact value of\n" +
                        "the definite integral.$$ $$",
                "I only",
                "II only",
                "Both I and II",
                "Neither I nor II"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "56", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The value of the integral given below is" +
                        "$$ $$ $∫↙0↖π x^2\\ cos\\ x\\ dx$",
                "-2π",
                "π",
                "-π",
                "2π"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "57", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let S be a sample space and two mutually exclusive events A and B be such that A ∪ B = S.\n" +
                "If P(.) denotes the probability of the event, the maximum value of P(A)P(B) is ______"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "0.25", "58", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the set of all functions f :{0,1,...,2014} → {0,1...,2014} such that f (f (i)) = i, for\n" +
                        "0 ≤ i ≤ 2014 . Consider the following statements." +
                        "$$ $$P. For each such function it must be the case that for every i, f(i) = i,\n" +
                        "$$ $$Q. For each such function it must be the case that for some i,f(i) = i,\n" +
                        "$$ $$R. Each such function must be onto." +
                        "$$ $$Which one of the following is CORRECT?$$ $$",
                "P, Q and R are true",
                "Only Q and R are true",
                "Only P and Q are true",
                "Only R is true"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "59", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("There are two elements x, y in a group (G,∗) such that every element " +
                "in the group can be written as a product of some number of x's and y's in some order. " +
                "It is known that" +
                "$$ $$ x ∗ x = y ∗ y = x ∗ y ∗ x ∗ y = y ∗ x ∗ y ∗ x = e" +
                "$$ $$where e is the identity element. The maximum number of elements in such a group is __________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "4", "60", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("If G is a forest with n vertices and k connected components, how many edges does G have?",
                "$⌊n/k⌋$",
                "$⌈n/k⌉$",
                "$n-k$",
                "$n-k+1$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "61", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let δ denote the minimum degree of a vertex in a graph. For all planar graphs " +
                        "on n vertices with δ ≥ 3, which one of the following is TRUE?",
                "In any planar embedding, the number of faces is at least $n/2 + 2$",
                "In any planar embedding, the number of faces is less than $n/2 + 2$",
                "There is a planar embedding in which the number of faces is less than $n/2 + 2$",
                "There is a planar embedding in which the number of faces is at most $n/(δ+1)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "62", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The CORECT formula for the sentence, “not all rainy days are cold” is",
                "∀d (Rainy(d) ∧ ~ Cold(d))",
                "∀d (~ Rainy(d) → Cold(d))",
                "∃d (~ Rainy(d) → Cold(d))",
                "∃d (Rainy(d) ∧ ~ Cold(d))"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "63", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following relational schema:" +
                        "$$ $$Employee (<U>empId</U>, empName, empDept )\n" +
                        "<br/>Customer (<U>custId</U>,custName, salesRepId, rating)" +
                        "$$ $$SalesRepId is a foreign key referring to empId of the employee relation. Assume that each\n" +
                        "employee makes a sale to at least one customer. What does the following query return?" +
                        getProgram("2014-3"+"/prog2014-3-qno-64.txt")+
                        "",
                "Names of all the employees with at least one of their customers having a ‘GOOD’ rating.",
                "Names of all the employees with at most one of their customers having a ‘GOOD’ rating.",
                "Names of all the employees with none of their customers having a ‘GOOD’ rating.",
                "Names of all the employees with all their customers having a ‘GOOD’ rating."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "64", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let ⊕ denote the Exclusive OR (XOR) operation. Let ‘1’ and ‘0’ denote the binary constants. Consider " +
                        "the following Boolean expression for F over two variables P and Q:" +
                        "$$ $$F(P, Q) = ( ( 1 ⊕ P) ⊕ (P ⊕ Q) ) ⊕ ( (P ⊕ Q) ⊕ (Q ⊕ 0) ) " +
                        "$$ $$The equivalent expression for F is",
                "$P + Q$",
                "$\\ov{P + Q}$",
                "$P ⊕ Q$",
                "$\\ov{P ⊕ Q}$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "65", digital, marks, year, explanation, "0");
        this.addQuestion(q);

    }




    //**** 2015-1 questions starts *****//


    private void addQuestions2015() {

        // year = "2015-1";
        // marks = "1";
        //path = "file:///android_asset/2015-1/";

        Q = getQuestion(getstring("Didn't you buy _________ when you went shopping?",
                "any paper",
                "much paper",
                "no paper",
                "a few paper"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "1", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following combinations is incorrect?",
                "Acquiescence – Submission",
                "Wheedle – Roundabout",
                "Flippancy – Lightness",
                "Profligate – Extravagant"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "2", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given set A = {2, 3, 4, 5} and Set B = {11, 12, 13, 14, 15}, two numbers are randomly selected, one\n" +
                        "from each set. What is probability that the sum of the two numbers equals 16?",
                "0.20",
                "0.25",
                "0.30",
                "0.33"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "3", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following options is the closest in meaning to the sentence below?\n" +
                        "$$ $$She enjoyed herself immensely at the party.",
                "She had a terrible time at the party.",
                "She had a horrible time at the party.",
                "She had a terrific time at the party",
                "She had a terrifying time at the party"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "4", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Based on the given statements, select the most appropriate option to solve the given question.\n" +
                        "If two floors in a certain building are 9 feet apart, how many steps are there in a set of stairs that\n" +
                        "extends from the first floor to the second floor of the building?\n" +
                        "$$ $$Statements:" +
                        "<br/>(I) Each step is $3/4$ foot high.\n" +
                        "<br/>(II) Each step is 1 foot wide.",
                "Statement I alone is sufficient, but statement II alone is not sufficient.",
                "Statement II alone is sufficient, but statement I alone is not sufficient.",
                "Both statements together are sufficient, but neither statement alone is sufficient.",
                "Statement I and II together are not sufficient."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "5", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks ="2";


        Q = getQuestion(getstring("The pie chart below has the breakup of the number of students from different departments in an"+
                "engineering college for the year 2012. The proportion of male to female students in each\n" +
                "department is 5:4. There are 40 males in Electrical Engineering. What is the difference between\n" +
                "numbers of female students in the Civil department and the female students in the Mechanical\n" +
                "department?" +
                "$$ $$<img src='"+path+"qno-6.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "32", "6", apti, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Select the alternative meaning of the underlined part of the sentence.\n" +
                        "$$ $$The chain snatchers took to their heels when the police party arrived.",
                "took shelter in a thick jungle",
                "open indiscriminate fire",
                "took to flight",
                "unconditionally surrendered"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);



        Q = getQuestion(getstring("The probabilities that a student passes in Mathmatics, Physics and Chemistry are m,p, and c\n" +
                        "respectively. Of these subjects, the student has 75% chance of passing in at least one, a 50%\n" +
                        "chance of passing in at least two and a 40% chance of passing in exactly two. Following relations\n" +
                        "are drawn in m, p, c:" +
                        "$$ $$(I) p + m + c = ${27}/{20}$\n" +
                        "<br/>(II) p + m + c = ${13}/{20}$\n" +
                        "<br/>(III) (p) × (m) × (c) = $1/{10}$",
                "Only relation I is true",
                "Only relation II is true",
                "Relations II and III are true.",
                "Relations I and III are true."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "8", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The given statement is followed by some courses of action. Assuming the statement to be true,\n" +
                        "decide the correct option.\n" +
                        "$$ $$Statement:" +
                        "$$ $$There has been a significant drop in the water level in the lakes supplying water to the city.\n" +
                        "Course of action:\n" +
                        "$$ $$(I) The water supply authority should impose a partial cut in supply to tackle the situation.\n" +
                        "$$ $$(II) The government should appeal to all the residents through mass media for minimal\n" +
                        "use of water.$$ $$" +
                        "(III) The government should ban the water supply in lower areas.$$ $$",
                "Statements I and II follow.",
                "Statements I and III follow",
                "Statements II and III follow.",
                "All statements follow."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "9", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of students in a class who have answered correctly, wrongly, or not attempted each\n" +
                        "question in an exam, are listed in the table below. The marks for each question are also listed.\n" +
                        "There is no negative or partial marking.$$ $$" +

                        MyTable(6, 5, getText(5, "Q No", "Marks", "Answered Correctly", "Answered Wrongly", "Not Attempted", "1", "2", "21", "17", "6", "2", "3", "15", "27", "2", "3", "1", "11", "29", "4", "4", "2", "23", "18", "3", "5", "5", "31", "12", "1"), true, false) +
                        "$$ $$What is the average of the marks obtained by the class in the examination?",
                "2.290",
                "2.970",
                "6.795",
                "8.795"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "10", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("Which one of the following is True at any valid state in shift-reduce parsing?",
                "Viable prefixes appear only at the bottom of the stack and not inside",
                "Viable prefixes appear only at the top of the stack and not inside",
                "The stack contains only a set of viable prefixes",
                "The stack never contains viable prefixes"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "11", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the following$$ $$" +
                        MyTable(5, 2, getText(2, "List - I", "List – II", "(A) Condition coverage", "(1) Black-box testing", "(B) Equivalence class partitioning", "(2) System testing", "(C) Volume testing", "(3) White-box testing", "(D) Alpha testing", "(4) Performance testing", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "",
                "A-2, B-3, C-1, D-4",
                "A-3, B-4, C-2, D-1",
                "A-3, B-1, C-4, D-2",
                "A-3, B-1, C-2, D-4"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "12",oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("For computers based on three-address instruction formats, each address field can be used to\n" +
                        "specify which of the following:" +
                        "$$ $$S1: A memory operand\n" +
                        "<br/>S2: A processor register\n" +
                        "<br/>S3: An implied accumulator register",
                "Either S1 or S2",
                "Either S2 or S3",
                "Only S2 and S3",
                "All of S1, S2 and S3"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "13",co, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is the recurrence equation for the worst case time complexity of the\n" +
                        "Quicksort algorithm for sorting n (≥ 2) numbers? In the recurrence equations given in the options\n" +
                        "below, c is a constant.",
                "T(n) = 2T (n/2) + cn",
                "T(n) = T(n – 1) + T(1) + cn",
                "T(n) = 2T (n – 2) + cn",
                "T(n) = T(n/2) + cn"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "14", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("For any two languages $L_1$ and $L_2$ such that $L_1$ is context free and $L_2$ is recursively enumerable but\n" +
                        "not recursive, which of the following is/are necessarily true?" +
                        "$$ $$I.  $\\ov{L_1}$ (complement of ${L_1}$) is recursive\n" +
                        "<br/>II.  $\\ov{L_2}$ (complement of ${L_2}$) is recursive\n" +
                        "<br/>III.  $\\ov{L_1}$ is context-free\n" +
                        "<br/>IV.  $\\ov{L_1} ∪ L_2$ is recursively enumerable$$ $$",
                "I only",
                "III only",
                "III and IV only",
                "I and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "15", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose two hosts use a TCP connection to transfer a large file." +
                        " Which of the following statements is/are FALSE with respect to the TCP connection?" +
                        "$$ $$I. If the sequence number of a segment is m, then the sequence number of the subsequent segment is always m+1. " +
                        "$$ $$II. If the estimated round trip time at any given point of time is t sec, the value of the retransmission timeout is always set to greater than or equal to t sec. " +
                        "$$ $$III. The size of the advertised window never changes during the course of the TCP connection. " +
                        "$$ $$IV. The number of unacknowledged bytes at the sender is always less than or equal to the advertised window",
                "III only",
                "I and III only",
                "I and IV only",
                "II and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "16", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The following two functions P1 and P2 that share a variable" +
                " B with an initial value of 2 execute concurrently.$$ $$" +
                getProgram("2015-1"+"/prog2015-1-qno-17.txt")+
                "$$ $$The number of distinct values " +
                "that B can possibly take after the execution is"));
        explanation = getExplaination("");
        q = new Question(Q, "3", "17", os, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a 4 bit Johnson counter with an initial value of 0000. The counting sequence of this\n" +
                        "counter is",
                "0, 1, 3, 7, 15, 14, 12, 8, 0",
                "0, 1, 3, 5, 7, 9, 11, 13, 15, 0",
                "0, 2, 4, 6, 8, 10, 12, 14, 0",
                "0, 8, 12, 14, 15, 7, 3, 1, 0"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "18", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following fields of an IP header is NOT modified by a typical IP router?",
                "Checksum",
                "Source address",
                "Time to Live (TTL)",
                "Length"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "19", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Select operation in SQL is equivalent to",
                "the selection operation in relational algebra",
                "the selection operation in relational algebra, except that SELECT in SQL retains duplicates",
                "the projection operation in relational algebra",
                "the projection operation in relational algebra, except that SELECT in SQL retains duplicates"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "20", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the LU decomposition of the matrix $[\\table 2,2;4,9],$if the diagonal elements of U are both 1, then the\n" +
                "lower diagonal entry $l_{22}$ of L is ___________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "5", "21", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the following" +
                        "$$ $$" +
                        MyTable(5, 2, getText(2, "List-I", "List-II", "(P) Prim‟s algorithm for minimum spanning tree", "(i) Backtracking", "(Q) Floyd-Warshall algorithm for all pairs shortest paths", "(ii) Greedy method", "(R) Mergesort", "(iii) Dynamic programming", "(S) Hamiltonian circuit", "(iv) Divide and conquer", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "",
                "P-iii, Q-ii, R-iv, S-i",
                "P-i, Q-ii, R-iv, S-iii",
                "P-ii, Q-iii, R-iv, S-i",
                "P-ii, Q-i, R-iii, S-iv"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "22", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The output of the following C program is __________." +
                "$$ $$" +
                getProgram("2015-1"+"/prog2015-1-qno-23.txt")));
        explanation = getExplaination("");
        q = new Question(Q, "5", "23", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("$lim_{x→∞}x^{1\\/x}$",
                "∞",
                "0",
                "1",
                "Not defined"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "24", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("For a set A, the power set of A is denoted by $2^A.$ If A = {5, {6}, {7}}, which of the following\n" +
                        "options are True?" +
                        "$$ $$ 1. $∅ ∈ 2^A$" +
                        "<br/>2. $∅ ⊆ 2^A$" +
                        "<br/>3. {5,(6)} $∈ 2^A$" +
                        "<br/>4. {5,(6)} $⊆ 2^A$",
                "1 and 3 only",
                "2 and 3 only",
                "1, 2 and 3 only",
                "1, 2 and 4 only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "25", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a system with byte-addressable memory, 32 bit logical addresses, 4 kilobyte page size\n" +
                "and page table entries of 4 bytes each. The size of the page table in the system in megabytes is\n" +
                "___________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "4", "26", os, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A file is organized so that the ordering of data records is the same as or close to the ordering of\n" +
                        "data entries in some index. Then that index is called",
                "Dense",
                "Sparse",
                "Clustered",
                "Unclustered"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "27", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("What are the worst-case complexities of insertion and deletion of a key in a binary search tree?",
                "θ(log n) for both insertion and deletion",
                "θ(n) for both insertion and deletion",
                "θ(n) for insertion and θ(log n) for deletion",
                "θ(log n) for insertion and θ(n) for deletion"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "28", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose that everyone in a group of N people wants to communicate secretly with the N–1 others\n" +
                        "using symmetric key cryptographic system. The communication between any two persons should\n" +
                        "not be decodable by the others in the group. The number of keys required in the system as a\n" +
                        "whole to satisfy the confidentiality requirement is",
                "$2N$",
                "$N(N – 1)$",
                "${N(N – 1)}/2$",
                "$(N – 1)^2$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "29", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is Not equivalent to p ↔ q?",
                "(￢p ∨ q) ∧ (p ∨ ￢q)",
                "(￢p ∨ q) ∧ (q → p)",
                "(￢p ∧ q) ∨ (p ∧ ￢q)",
                "(￢p ∧ ￢q) ∨ (p ∧ q)"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "30", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is/are correct inorder traversal sequence(s) of binary search tree(s)?" +
                        "$$ $$1. 3, 5, 7, 8, 15, 19, 25 " +
                        "<br/>2. 5, 8, 9, 12, 10, 15, 25" +
                        "<br/>3. 2, 7, 10, 8, 14, 16, 20 " +
                        "<br/>4. 4, 6, 7, 9, 18, 20, 25" +
                        "$$ $$",
                "1 and 4 only",
                "2 and 3 only",
                "2 and 4 only",
                "2 only"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "31", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In one of the pairs of protocols given below, both the protocols can use multiple TCP connections\n" +
                        "between the same client and the server. Which one is that?",
                "HTTP, FTP",
                "HTTP, TELNET",
                "FTP, SMTP",
                "HTTP, SMTP"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of following statements is/are FALSE?" +
                        "$$ $$I. XML overcomes the limitations in HTML to support a structured way of organizing content.\n" +
                        "$$ $$II. XML specification is not case sensitive while HTML specification is case sensitive.\n" +
                        "$$ $$III. XML supports user defined tags while HTML uses pre-defined tags.\n" +
                        "$$ $$VI. XML tags need not be closed while HTML tags must be closed$$ $$",
                "II only",
                "I only",
                "II and IV only",
                "III and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "33", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If $g(x)=1-x$ and $h(x)=x/{x-1}$, then ${g(h(x))}/{h(g(x))}$ is:",
                "${h(x)}/{g(x)}$",
                "${-1}/{x}$",
                "${g(x)}/{h(x)}$",
                "${x}/{(1-x)^2}$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "34", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The height of a tree is the length of the longest root-to-leaf path in it. The maximum and\n" +
                        "minimum number of nodes in a binary tree of height 5 are",
                "63 and 6, respectively",
                "64 and 5, respectively",
                "32 and 6, respectively",
                "31 and 5, respectively"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "35", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("What is the output of the following C code? Assume that the address of x is 2000 (in decimal) and an integer requires four bytes of memory." +
                        "$$ $$" +
                        getProgram("2015-1"+"/prog2015-1-qno-36.txt")
                        +"",
                "2036, 2036, 2036",
                "2012,4,2204",
                "2036,10,10",
                "2012,4,6"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "36", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("$$ $$<img src='"+path+"qno-37.png'/>$$ $$" +
                "<img src='"+path+"qno-37-1.png'/>" +
                "$$ $$Consider the DFAs M and N given above. The number of states in a minimal DFA that accepts\n" +
                "the language L(M) ∩ L(N) is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "1", "37", toc, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a non-pipelined processor with a clock rate of 2.5 gigahertz and average cycles per\n" +
                "instruction of four. The same processor is upgraded to a pipelined processor with five stages; but\n" +
                "due to the internal pipeline delay, the clock speed is reduced to 2 gigahertz. Assume that there are\n" +
                "no stalls in the pipeline. The speed up achieved in this pipelined processor is __________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "3.20 to 3.29", "38", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The least number of temporary variables required to create a three-address code in static single\n" +
                "assignment form for the expression $q + r\\/3 + s – t * 5 + u * v\\/w$ is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "3", "39", com, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose L = {p, q, r, s, t} is a lattice represented by the following Hasse diagram:$$ $$" +
                        "<img src='"+path+"qno-40.png'/>" +
                        "$$ $$For any xy ∈ L, not necessarily distinct, x ∨ y and x ∧ y are join and meet of x, y respectively.\n" +
                        "Let $L^3$ = {(x,y,z): x, y, z ∈ L} be the set of all ordered triplets of the elements of L. Let pr be the\n" +
                        "probability that an element (x,y,z) ∈ $L^3$ chosen equiprobably satisfies x ∨ (y ∧ z) = (x ∨ y)\n" +
                        "∧" +
                        "(x ∨ z). Then",
                "pr = 0",
                "pr = 1",
                "0 < pr ≤ 1/5",
                "1/5 < pr < 1"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "40", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the NPDA < Q = {$q_0, q_1, q_2$}, Σ = {0, 1}, Γ = {0, 1, ⊥ }, δ, $q_0,$ ⊥ , F = {$q_2$} >, where (as\n" +
                        "per usual convention) Q is the set of states, Σ is the input alphabet, Γ is stack alphabet, δ is the\n" +
                        "state transition function, $q_0$ is the initial state, ⊥ is the initial stack symbol, and F is the set of\n" +
                        "accepting states, The state transition is as follows" +
                        "$$ $$<img src='"+path+"qno-41.png'/>" +
                        "$$ $$Which one of the following sequences must follow the string 101100 so that the\n" +
                        "overall string is accepted by the automaton?$$ $$",
                "10110",
                "10010",
                "01010",
                "01001"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "41", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following pseudo code, where x and y are positive integers." +
                        "$$ $$" +
                        getProgram("2015-1"+"/prog2015-1-qno-42.txt")+
                        "$$ $$The post condition that needs to be satisfied after the program terminates is",
                "{ r = qx + y ∧ r < y }",
                "{ x = qy + r ∧ r < y }",
                "{ y = qx + r ∧ 0 < r < y }",
                "{ q + 1 < r – y ∧ y > 0 }"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "42", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("An algorithm performs $(log\\ N)^{1/2}$ find operations, N insert operations, $(log\\ N)^{1/2}$ delete operations,\n" +
                        "and $(log\\ N)^{1/2}$ decrease-key operations on a set of data items with keys drawn from a linearly\n" +
                        "ordered set. For a delete operation, a pointer is provided to the record that must be deleted.\n" +
                        "For the decrease-key operation, a pointer is provided to the record that has its key decreased.\n" +
                        "Which one of the following data structures is the most suited for the algorithm to use, if the goal\n" +
                        "is to achieve the best total asymptotic complexity considering all the operations?",
                "Unsorted array",
                "Min-heap",
                "Sorted array",
                "Sorted doubly linked list"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "43", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a max heap, represented by the array: 40, 30, 20, 10, 15, 16, 17, 8, 4." +
                        "" +
                        MyTable(10, 2, getText(2, "Array Index", "Value", "1", "40", "2", "30", "3", "20", "4", "10", "5", "15", "6", "16", "7", "17", "8", "8", "9", "4", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$Now consider that a value 35 is inserted into this heap. After insertion, the new heap is",
                "40, 30, 20, 10, 15, 16, 17, 8, 4, 35",
                "40, 35, 20, 10, 30, 16, 17, 8, 4, 15",
                "40, 30, 20, 10, 35, 16, 17, 8, 4, 15",
                "40, 35, 20, 10, 15, 16, 17, 8, 4, 30"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "44", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following 2 × 2 matrix A where two elements are unknown and are marked by a and\n" +
                        "b. The eigen values of this matrix are –1 and 7. What are the values of a and b?" +
                        "$$ $$ A=$(\\table 1,4;b,a)$",
                "a = 6, b = 4",
                "a = 4, b = 6",
                "a = 3, b = 5",
                "a = 5, b = 3"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "45", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G = (V, E) be a simple undirected graph, and s be a particular vertex in it called the source.\n" +
                        "For x ∈ V, let d(x) denote the shortest distance in G from s to x. A breadth first search (BFS) is\n" +
                        "performed starting at s. Let T be the resultant BFS tree. If (u, v) is an edge of G that is not in T,\n" +
                        "then which one of the following CANNOT be the value of d(u) – d(v)?",
                "-1",
                "0",
                "1",
                "2"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "46", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The binary operator ≠ is defined by the following truth table:" +
                        MyTable(4, 3, getText(3, "p", "q", "p ≠ q", "0", "0", "0", "1", "0", "1", "1", "1", "0", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false)
                        + "Which one of the following is true about the binary operator ≠ ?",
                "Both commutative and associative",
                "Commutative but not associative",
                "Not commutative but associative",
                "Neither commutative nor associative"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "47", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider an Entity-Relationship (ER) model in which entity sets $E_1$ and $E_2$ are connected by an\n" +
                "m : n relationship $R_{12},$ $E_1$ and $E_3$ are connected by a 1 : n (1 on the side of $E_1$ and n on the side of\n" +
                "$E_3$) relationship $R_{13}.$\n" +
                "$E_1$ has two single-valued attributes $a_{11}$ and $a_{12}$ of which $a_{11}$ is the key attribute. $E_2$ has two singlevalued\n" +
                "attributes $a_{21}$ and $a_{22}$ of which $a_{21}$ is the key attribute. $E_3$ has two single-valued attributes\n" +
                "$a_{31}$ and $a_{32}$ of which $a_{31}$ is the key attribute. The relationships do not have any attributes.\n" +
                "If a relational model is derived from the above ER model, then the minimum number of relations\n" +
                "that would be generated if all the relations are in 3NF is ___________."));
        explanation = getExplaination("");
        q = new Question(Q, "5", "48", dbms, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The graph shown below 8 edges with distinct integer edge weights. The minimum spanning tree\n" +
                "(MST) is of weight 36 and contains the edges: {(A, C), (B, C), (B, E), (E, F), (D, F)}. The edge\n" +
                "weights of only those edges which are in the MST are given in the figure shown below. The\n" +
                "minimum possible sum of weights of all 8 edges of this graph is ______________." +
                "$$ $$<img src='"+path+"qno-49.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "69", "49", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a disk pack with a seek time of 4 milliseconds and rotational speed of 10000 rotations\n" +
                "per minute (RPM). It has 600 sectors per track and each sector can store 512 bytes of data.\n" +
                "Consider a file stored in the disk. The file contains 2000 sectors. Assume that every sector access\n" +
                "necessitates a seek, and the average rotational latency for accessing each sector is half of the time\n" +
                "for one complete rotation. The total time (in milliseconds) needed to read the entire file is\n" +
                "_________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "14020", "50", co, marks, year, explanation, "1");
        this.addQuestion(q);


        Q = getQuestion(getstring("$∫↙{1\\/π}↖{2\\/π} {cos (1\\/x)}/{x^2}$ dx = _______________."));
        explanation = getExplaination("");
        q = new Question(Q, "-1", "51", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program segment." +
                "$$ $$" +
                getProgram("2015-1"+"/prog2015-1-qno-52.txt")
                +"" +
                "$$ $$The cyclomatic complexity of the program segment is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "5", "52", oth, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C function." +
                        "$$ $$" +
                        getProgram("2015-1"+"/prog2015-1-qno-53.txt")
                        +"" +
                        "$$ $$Which one of the following most closely " +
                        "approximates the return value of the function fun1?",
                "$n^3$",
                "$n(log\\ n)^2$",
                "$n\\ log\\ n$",
                "$n\\ log(log\\ n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "53", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $a_n$ represent the number of bit strings of length n containing two consecutive 1s. What is the\n" +
                        "recurrence relation for $a_n?$",
                "$a_{n–2} + a_{n–1} + 2^{n–2}$",
                "$a_{n–2} + 2a_{n–1} + 2^{n–2}$",
                "$2a_{n–2} + a_{n–1} + 2^{n–2}$",
                "$2a_{n–2} + 2a_{n–1} + 2^{n–2}$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "54", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A variable x is said to be live at a statement $S_i$ in a program if the following three conditions hold\n" +
                        "simultaneously:" +
                        "$$ $$" +
                        "1. There exists a statement $S_j$ that uses x\n" +
                        "$$ $$2. There is a path from $S_i$ to $S_j$ in the flow graph corresponding to the program\n" +
                        "$$ $$3. The path has no intervening assignment to x including at $S_i$ and $S_j$" +
                        "$$ $$<img src='"+path+"qno-55.png'/>" +
                        "$$ $$The variables which are live both at the statement in basic block 2 and at the statement in basic\n" +
                        "block 3 of the above control flow graph are$$ $$",
                "p, s, u",
                "r, s, u",
                "r, u",
                "q, v"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "55", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a uniprocessor system executing three tasks $T_1, T_2$ and $T_3,$ each of which is composed of\n" +
                "an infinite sequence of jobs (or instances) which arrive periodically at intervals of 3, 7 and 20\n" +
                "milliseconds, respectively. The priority of each task is the inverse of its period and the available\n" +
                "tasks are scheduled in order of priority, with the highest priority task scheduled first. Each\n" +
                "instance of $T_1, T_2$ and $T_3$ requires an execution time of 1, 2 and 4 milliseconds, respectively.\n" +
                "Given that all tasks initially arrive at the beginning of the 1st millisecond and task preemptions\n" +
                "are allowed, the first instance of $T_3$ completes its execution at the end of ______________\n" +
                "milliseconds."));
        explanation = getExplaination("");
        q = new Question(Q, "13", "56", co, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following relations:" +
                "$$ $$Student: " +
                MyTable(4,2,getText(2,"Roll. No","Student Name","1","Raj","2","Rohit","3","Raj","","","","","","","","","","","","","","","","","","","","","",""),true,false)
                +"$$ $$Performance: " +
                MyTable(7,3,getText(3,"Roll. No","Course","Marks","1","Math","80","1","English","70","2","Math","75","3","English","80","2","Physics","65","3","Math","80","","","","","","","","",""), true,false)+
                "$$ $$Consider the following SQL query.$$ $$" +
                "SELECT S. Student_Name, sum (P.Marks)\n" +
                "<br/>FROM Student S, Performance P\n" +
                "<br/>WHERE S. Roll_No =P.Roll_No\n" +
                "<br/>GROUP BY S.Student_Name\n" +
                "$$ $$The number of rows that will be returned by the SQL query is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "2", "57", dbms, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A positive edge-triggered D flip-flop is connected to a positive edge-triggered JK flipflop as\n" +
                        "follows. The Q output of the D flip-flop is connected to both the J and K inputs of the JK flipflop,\n" +
                        "while the Q output of the JK flip-flop is connected to the input of the D flip-flop. Initially,\n" +
                        "the output of the D flip-flop is set to logic one and the output of the JK flip-flop is cleared. Which\n" +
                        "one of the following is the bit sequence (including the initial state) generated at the Q output of\n" +
                        "the JK flip-flop when the flip-flops are connected to a free-running common clock? Assume that J\n" +
                        "= K = 1 is the toggle mode and J = K = 0 is the state-holding mode of the JK flip-flop. Both the\n" +
                        "flip-flops have non-zero propagation delays",
                "0110110...",
                "0100100...",
                "011101110...",
                "011001100..."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "58", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a connected planar graph with 10 vertices. If the number of edges on each face is three,\n" +
                "then the number of edges in G is _______________."));
        explanation = getExplaination("");
        q = new Question(Q, "24", "59", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a LAN with four nodes $S_1, S_2, S_3$ and $S_4.$ Time is divided into fixed-size slots, and a\n" +
                "node can begin its transmission only at the beginning of a slot. A collision is said to have\n" +
                "occurred if more than one node transmit in the same slot. The probabilities of generation of a\n" +
                "frame in a time slot by $S_1, S_2, S_3$ and $S_4$ are 0.1, 0.2, 0.3 and 0.4, respectively. The probability of\n" +
                "sending a frame in the first slot without any collision by any of these four stations is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "0.45 to 0.48", "60", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose the following disk request sequence (track numbers) for a disk with 100 tracks is given:\n" +
                "45, 20, 90, 10, 50, 60, 80, 25, 70. Assume that the initial position of the R/W head is on track 50.\n" +
                "The additional distance that will be traversed by the R/W head when the Shortest Seek Time First\n" +
                "(SSTF) algorithm is used compared to the SCAN (Elevator) algorithm (assuming that SCAN\n" +
                "algorithm moves towards 100 when it starts execution) is _________ tracks."));
        explanation = getExplaination("");
        q = new Question(Q, "10", "61", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose that the stop-and-wait protocol is used on a link with a bit rate of 64 kilobits per second\n" +
                "and 20 milliseconds propagation delay. Assume that the transmission time for the\n" +
                "acknowledgment and the processing time at nodes are negligible. Then the minimum frame size\n" +
                "in bytes to achieve a link utilization of at least 50% is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "320", "62", cn, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a main memory with five page frames and the following sequence of page references: 3,\n" +
                        "8, 2, 3, 9, 1, 6, 3, 8, 9, 3, 6, 2, 1, 3. Which one of the following is true with respect to page\n" +
                        "replacement policies First-In-First Out (FIFO) and Least Recently Used (LRU)?",
                "Both incur the same number of page faults",
                "FIFO incurs 2 more page faults than LRU",
                "LRU incurs 2 more page faults than FIFO",
                "FIFO incurs 1 more page faults than LRU"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "63", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the operations\n" +
                        "$$ $$ $f (X,Y,Z )$ = $X′YZ $+ $XY′+Y′Z′$ and $g (X,Y,Z )$ = $X′YZ + X′YZ′$ + XY\n" +
                        "$$ $$Which one of the following is correct?$$ $$",
                "Both $\\{f\\}$ and $\\{g\\}$ are functionally complete",
                "Only $\\{f\\}$ is functionally complete",
                "Only $\\{g\\}$ is functionally complete",
                "Neither $\\{f\\}$ nor $\\{g\\}$ is functionally complete"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "64", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("$$ $$ $∑↙{x=1}↖{99}{1}/{x(x+1)}$ = _____________."));
        explanation = getExplaination("");
        q = new Question(Q, "0.99", "65", m, marks, year, explanation, "1");
        this.addQuestion(q);


    }



    //**** 2015-2 questions starts *****//

    private void addQuestions2015_2() {

        // year = "2015-2";
        // marks = "1";
        // path = "file:///android_asset/2015-2/";

        Q = getQuestion(getstring("Based on the given statements, select the most appropriate option to solve the given question\n" +
                        "What will be the total weight of 10 poles each of same weight?" +
                        "$$ $$Statements\n" +
                        "<br/>(I) One fourth of the weight of a pole is 15kg.\n" +
                        "<br/>(II) The total weight of these poles is 160 kg more than the total weight of two poles",
                "Statement I alone is not sufficient",
                "Statement II alone is not sufficient",
                "Either I or II alone is sufficient",
                "Both statements I and II together are not sufficient."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "1",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a function $f(x) = 1-|x| on -1 ≤ x ≤ 1.$ The value of $x$ at which the function attains a\n" +
                        "maximum, and the maximum value of the function are.",
                "0, -1",
                "-1, 0",
                "0, 1",
                "-1, 2"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "2",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A generic term that include various items of clothing such as a skirt, a pair of trousers and a\n" +
                        "shirt is",
                "fabric",
                "textile",
                "fibre",
                "apparel"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "3",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the statement where underlined word is used correctly.",
                "The industrialist load a <U>personnel</U> jet.",
                "I write my experience in my <U>personnel</U> diary.",
                "All <U>personnel</U> are being given the day off.",
                "Being religious is a <U>personnel</U> aspect."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "4", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("We __________________ our friend‟s birthday and we ______________ how to make it up\n" +
                        "to him.",
                "Completely forgot - - - don‟t just know",
                "Forgot completely - - - don‟t just know",
                "Completely forgot - - - just don‟t know",
                "Forgot completely - - - just don‟t know"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "5",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("In a triangle PQR,PS is the angle bisector of ∠ QPR and ∠ QPS = $60^O.$" +
                        " What is the length of\n" +
                        "PS?$$ $$" +
                        "<img src='"+path+"qno-6.png'/>" +
                        "$$ $$",

                "$(q+r)/{qr}$",
                "${qr}/(q+r)$",
                "$√(q^2+r^2)$",
                "${(q+r)^2}/{qr}$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "6",apti, marks, year, explanation,"0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Out of the following four sentences, select the most suitable sentence with respect to grammar\n" +
                        "and usage.",
                "Since the report lacked needed information, it was of no use to them.",
                "The report was useless to them because there were no needed information in it.",
                "Since the report did not contain the needed information, it was not real useful to them",
                "Since the report lacked needed information, it would not had been useful to them."));
        explanation = getExplaination("");
        q = new Question(Q, "A", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If the list of letters, P,R,S,T,U is an arithmetic sequence, which of the following are also in\n" +
                        "arithmetic sequence?" +
                        "$$ $$ I . $2P, 2R, 2S, 2T, 2U$\n" +
                        "<br/>II . $P-3,R-3,S-3,T-3,U-3$\n" +
                        "<br/>III. $P^2 , R^2 , S^2 ,T^2 ,U^2$",
                "I only",
                "I and II",
                "II and III",
                "I and III"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "8", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If p, q, r, s are distinct integers such that:\n" +
                "$$ $$f(p, q, r, s) = max (p, q, r, s)\n" +
                "<br/>g(p, q, r, s) = min (p, q, r, s)\n" +
                "$$ $$h(p, q, r, s) = remainder of (p × q) / (r × s)  if (p × q) > (r × s) OR \n" +
                "                remainder of (r × s) / (p × q) if (r × s) > (p × q)" +
                "$$ $$Also a function fgh (p, q, r, s) =\n" +
                "                f(p, q, r, s) × g(p, q, r, s) × h(p, q, r, s)." +
                "$$ $$Also the same operation are valid with two variable functions \n" +
                "of the form f(p, q)." +
                "$$ $$What is the value of fg(h(2, 5, 7, 3), 4, 6, 8)?"));
        explanation = getExplaination("");
        q = new Question(Q, "1", "9",apti, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Four branches of a company are located at M.N.O and P. M is north of N at a distance of\n" +
                        "4km: P is south of O at a distance of 2 km: N is southeast of O by 1 km. What is the distance\n" +
                        "between M and P in km?",
                "5.34",
                "6.74",
                "28.5",
                "45.49"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "10",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("An unordered list contain n distinct elements. The number of comparisons to find an element\n" +
                        "in this list that is neither maximum nor minimum is",
                "Θ(n log n)",
                "Θ(n)",
                "Θ(log n)",
                "Θ(1)"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "11", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let R be the relation on the set of positive integers such that a aRb if and only if a and b are\n" +
                        "distinct and have a common divisor other than 1. $$ $$Which one of the following statements\n" +
                        "about R is true?$$ $$",
                "R is symmetric and reflexive but not transitive",
                "R is reflexive but not symmetric and not transitive",
                "R is transitive but not reflexive and not symmetric",
                "R is symmetric but not reflexive and not transitive"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "12",m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following transaction involving two bank account x and y.\n" +
                        "$$ $$read(x); x:=x–50; write(x); read(y); y:=y+50; write(y)\n" +
                        "$$ $$The constraint that the sum of the accounts x and y should remain constant is that of",
                "Atomicity",
                "Consistency",
                "Isolation",
                "Durability"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "13", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A binary tree T has 20 leaves. The number of nodes in T having two children is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "19", "14", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the basic COCOMO model where E is the effort applied in person-months, D is the\n" +
                        "development time in chronological months, KLOC is the estimated number of delivered lines\n" +
                        "of code (in thousands) and $a_b ,b_b , c_b ,d_b$ have their usual meanings. The basic COCOMO\n" +
                        "equations are of the form",
                "E = $a_b$ (KLOC) exp $(b_b),$ D = $c_b$ (E) exp $(d_b)$",
                "D = $a_b$ (KLOC) exp $(b_b),$ E = $c_b$ (D) exp $(d_b)$",
                "E = $a_b$ exp (b_b) ,D = $c_b$ (KLOC) exp $(d_b)$",
                "E = $a_b$ exp (D_b) ,D = $c_b$ (KLOC) exp $(b_b)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "15", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following two statements.\n" +
                        "$$ $$S1 : if a candidate is known to be corrupt, then he will not be elected\n" +
                        "$$ $$S2 : if a candidate is kind, he will be elected\n" +
                        "$$ $$Which one of the following statements follows from S1 and S2 per sound interference rules of\n" +
                        "logic?$$ $$",
                "If a person is known to corrupt, he is kind",
                "If a person is not known to be corrupt, he is not kind",
                "If a person is kind, he is not known to be corrupt",
                "If a person is not kind, he is not known to be corrupt"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "16", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Assume that for a certain processor, a read request takes 50 nanoseconds on a cache miss and\n" +
                "5 nanoseconds on a cache hit. Suppose while running a program, it was observed that 80% of\n" +
                "the processors read requests result in a cache hit. The average and access time in nanoseconds\n" +
                "is _______."));
        explanation = getExplaination("");
        q = new Question(Q, "14", "17",co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A system has 6 identical resources and N processes competing for them. Each process can\n" +
                        "request atmost 2 resources. Which one of the following values of N could lead to a deadlock?",
                "1",
                "2",
                "3",
                "4"));
        explanation = getExplaination("");
        q = new Question(Q, "Not Correct Option", "18", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a complete binary tree where the left and the right subtrees of the root are maxheaps.\n" +
                        "The lower bound for the number of operations to convert the tree to a heap is",
                "Ω$(log\\ n)$",
                "Ω$(n)$",
                "Ω$(n\\ log\\ n)$",
                "Ω$(n^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "19",algo, marks, year, explanation,"0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the context of abstract-syntax-tree (AST) and control-flow-graph (CFG), which one of the\n" +
                        "following is TRUE?",
                "In both AST and CFG, let node, $N_2$ be the successor of node $N_1.$ In the input program, the\n" +
                        "code corresponding to $N_2$ is present after the code corresponding in $N_1.$",
                "For any input program, neither AST nor CFG will contain a cycle",
                "The maximum number of successors of a node in an AST and a CFG depends on the\n" +
                        "input program",
                "Each node is AST and CFG corresponds to at most one statement in the input program"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "20",com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("With reference to the B+ tree index of order 1 shown below, the minimum number of nodes\n" +
                "(including the Root node) that must be fetched in order to satisfy the following query: “Get\n" +
                "all records with a search key greater than or equal to 7 and less than 15” is _________" +
                "$$ $$<img src='"+path+"qno-21.png'/> "));
        explanation = getExplaination("");
        q = new Question(Q, "6", "21",dbms, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A software requirements specification (SRS) document should avoid discussing which one of\n" +
                        "the following?",
                "User interface issues",
                "Non-functional requirements",
                "Design specification",
                "Interfaces with third party software"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "22",oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Identify the correct order in which a server process must invoke the function calls accept,\n" +
                        "bind, listen, and recv according to UNIX socket APL",
                "listen, accept, bind recv",
                "bind, listen, accept, recv",
                "bind, accept, listen, recv",
                "accept, listen, bind recv"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "23",cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The larger of the two eigen values of the matrix $[\\table 4,5;2,1]$ is _______"));
        explanation = getExplaination("");
        q = new Question(Q, "6", "24", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The cardinality of the power set of {0, 1, 2,.......10} is _________"));
        explanation = getExplaination("");
        q = new Question(Q, "2048", "25",m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following statements is NOT correct about HTTP cookies?",
                "A cookie is a piece of code that has the potential to compromise the security of an\n" +
                        "internet user",
                "A cookie gains entry to the user‟s work area through an HTTP header",
                "A cookie has an expiry date and time",
                "Cookies can be used to track the browsing pattern of a user at a particular site"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "26", cn , marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following function written in the C programming language." +
                        " The output of the above function on input “ABCD EFGH” is" +
                        "$$ $$" +
                        getProgram("2015-2"+"/prog2015-2-qno-27.txt")+
                        "",

                "ABCD EFGH",
                "ABCD",
                "HGFE DCBA",
                "DCBA"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "27", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A link has a transmission speed of $10^6 {bits}\\/sec.$ It uses data packets of size 1000 bytes each.\n" +
                "Assume that the acknowledgement has negligible transmission delay, and that its propagation\n" +
                "delay is the same as the data propagation delay. Also assume that the processing delays at the\n" +
                "nodes are negligible. The efficiency of the stop-and-wait protocol in this setup is exactly\n" +
                "25%. The value of the one-way propagation delay (in milliseconds) is ___________."));
        explanation = getExplaination("");
        q = new Question(Q, "12", "28", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The minimum number of JK flip-flops required to construct a synchronous counter with the\n" +
                "count sequence (0,0, 1, 1, 2, 2, 3, 3, 0, 0,…….) is ___________."));
        explanation = getExplaination("");
        q = new Question(Q, "2", "29", digital, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Match the following:$$ $$" +
                        "" +
                        MyTable(4, 2, getText(2, "(P) Lexical analysis", "(1) Graph coloring", "(Q) Parsing", "(2) DFA minimization", "(R) Register allocation", "(3) Post-order traversal", "(S) Expression evaluation", "(4) Production tree", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "",
                "P-2, Q-3, R-1, S-4",
                "P-2, Q-1, R-4, S-3",
                "P-2, Q-4, R-1, S-3",
                "P-2, Q-3, R-4, S-1"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "30", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider two decision problems $Q_1, Q_2$ such that $Q_1$ reduces in polynomial time to 3-SAT\n" +
                        "and 3 -SAT reduces in polynomial time to $Q_2.$ Then which one of following is consistent with\n" +
                        "the above statement?",
                "$Q_1$ is in NP, $Q_2$ in NP hard",
                "$Q_2$ is in NP, $Q_1$ is NP hard",
                "Both $Q_1$ and $Q_2$ are in NP",
                "Both $Q_1$ and $Q_2$ are NP hard"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "31", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A computer system implements a 40-bit virtual address, page size of 8 kilobytes, and a 128-\n" +
                "entry translation look-aside buffer (TLB) organized into 32 sets each having four ways.\n" +
                "Assume that the TLB tag does not store any process id. The minimum length of the TLB tag\n" +
                "in bits is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "22", "32", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C function." +
                "$$ $$" +
                getProgram("2015-2"+"/prog2015-2-qno-33.txt")+
                "$$ $$The return value of fun(5) is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "51", "33", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following statements" +
                        "$$ $$I. The complement of every Turing decidable language is Turing decidable\n" +
                        "$$ $$II. There exists some language which is in NP but is not turing decidable\n" +
                        "$$ $$III. If L is a language in NP, L is turing decidable" +
                        "$$ $$Which of the above statements is/are true?$$ $$",
                "Only II",
                "Only III",
                "Only I and II",
                "Only I and III"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "34", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of divisors of 2100 is _______."));
        explanation = getExplaination("");
        q = new Question(Q, "36", "35", m, marks, year, explanation, "1");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("In a connected graph, a bridge is an edge whose removal disconnects a graph. Which one of\n" +
                        "the following statements is true?",
                "A tree has no bridges",
                "A bridge cannot be part of a simple cycle",
                "Every edge of a clique with size ≥ 3 is a bridge (A clique is any compete sub graph of a\n" +
                        "graph)",
                "A graph with bridges cannot have a cycle"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "36", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider six memory partitions of sizes 200 KB, 400 KB, 600 KB, 500 KB, 300 KB and 250\n" +
                        "KB, where KB refers to kilobyte. These partitions need to be allotted to four processes of\n" +
                        "sizes 357 KB, 210KB, 468 KB and 491 KB in that order. If the best fit algorithm is used,\n" +
                        "which partitions are NOT allotted to any process?",
                "200KB and 300 KB",
                "200KB and 250 KB",
                "250KB and 300 KB",
                "300KB and 400 KB"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "37", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following assertions concerning code inspection and code walkthrough is\n" +
                        "true?",
                "Code inspection is carried out once the code has been unit tested",
                "Code inspection and code walkthrough are synonyms",
                "Adherence to coding standards is checked during code inspection",
                "Code walkthrough is usually carried out by an independent test team"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "38",oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given below are some algorithms, and some algorithm design paradigms.$$ $$" +
                        "" +
                        MyTable(6, 2, getText(2, "Column I", "Column II", "(1) Dijkstra‟s Shortest Path", "(i) Divide and Conquer", "(2) Floyd-Warshall algorithm to compute all pair shortest path", "(ii) Dynamic Progamming", "(3) Binary search on a sorted array", "(iii) Greedy design", "(4) Backtracking search on a graph", "(iv) Depth-first search", "", "(v) Breadth-first search", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$Match the above algorithms on the left to the corresponding design paradigm they follow.",
                "1-i, 2-iii, 3-i, 4-v",
                "1-iii, 2-iii, 3-i, 4-v",
                "1-iii, 2-ii, 3-i, 4-iv",
                "1-iii, 2-ii, 3-i, 4-v"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "39", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose you are provided with the following function declaration in the C programming\n" +
                        "language\n" +
                        "$$ $$int partition (int a [ ], int n);\n" +
                        "$$ $$The function treats the first element of a [ ] as a pivot, and rearranges the array so that all\n" +
                        "elements less than or equal to the pivot is in the left part of the array , and all elements greater\n" +
                        "than the pivot is in the right part. In addition, it moves the pivot so that the pivot is the last\n" +
                        "elements of the left part. The return value is the number of elements in the left part.\n" +
                        "$$ $$The following partially given function in the C programming language is used to find the $K^{th}$\n" +
                        "smallest element in an array a [ ] of size n using the partition function We assume k ≤ n ." +
                        "$$ $$" +
                        getProgram("2015-2"+"/prog2015-2-qno-40.txt") +
                        "$$ $$The missing argument lists are respectively$$ $$",

                "(a, left_end, k) and (a+left_end+1, n–left_end–1, k–left_end–1)",
                "(a, left_end, k) and (a, n–left_end–1, k–left_end–1)",
                "(a, left_end+1, N–left_end–1, k–left_end–1) and(a, left_end, k)",
                "(a, n–left_end–1, k–left_end–1) and (a, left_end, k)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "40", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a typical disk that rotates at 15000 rotations per minute (RPM) and has a transfer\n" +
                "rate of $50×10^6 {bytes}/sec.$ if the average seek time of the disk is twice the average rotational\n" +
                "delay and the controller‟s transfer time is 10 times the disk transfer time, the average time (in\n" +
                "milliseconds) to read or write a 512-byte sector of the disk is _____________."));
        explanation = getExplaination("");
        q = new Question(Q, "6.1 to 6.1", "41", co, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $f(x) = x^{-1/3}$ and A denote the area of the region bounded by $f(x)$ and the X-axis, when $x$\n" +
                        "varies from – 1 to 1. Which of the following statements is/are TRUE?" +
                        "$$ $$I. $f$ is continuous in [-1,1]" +
                        "<br/>II. $f$ is not bounded in [-1,1]" +
                        "<br/>III. A is nonzero and finite",
                "II only",
                "III only",
                "II and III only",
                "I, II and III"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "42", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the intermediate code given below." +
                        "$$ $$" +
                        getProgram("2015-2"+"/prog2015-2-qno-43.txt") +
                        "$$ $$The number of nodes and edges in the control-flow-graph constructed for the above code,\n" +
                        "respectively, are$$ $$",

                "5 and 7",
                "6 and 7",
                "5 and 5",
                "7 and 8"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "43",com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of min-terms after minimizing the following Boolean expression is _______." +
                "$$ $$[D'+AB'+A'C+AC'D+A'C'D]'"));
        explanation = getExplaination("");
        q = new Question(Q, "1", "44", digital, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of onto function (surjective function) from set X =\n" +
                "{1,2,3,4} to set Y ={a,b,c} is ______."));
        explanation = getExplaination("");
        q = new Question(Q, "36", "45", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider alphabet ∑ = {0, 1}, the null/empty string λ and the sets of strings " +
                        "$X_0, X_1$ and $X_2$ generated by the corresponding non-terminals of a regular grammar. " +
                        "$X_0, X_1$ and $X_2$ are related as follows:" +
                        "$$ $$" +
                        "$X_0 = 1 X_1$\n" +
                        "<br/>$X_1 = 0 X_1 + 1 X_2$\n" +
                        "<br/>$X_2 = 0 X_1$ + {λ}" +
                        "$$ $$Which one of the following choices precisely represents the strings in $X_0?$ $$ $$",

                "10 (0* + (10)*)1",
                "10 (0* + (10)*)*1",
                "1(0* + 10)*1",
                "10 (0 + 10)*1 + 110 (0 + 10)*1"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "46", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following languages is/are regular?" +
                        "$$ $$" +
                        "$L_1 :\\{ wxw^R |w,x$ $\\{a,b\\}*$ and $|w|,|x| > 0\\},$ $w^R$ is the reverse of string $w$" +
                        "<br/>$L_2 : \\{a^nb^m |m ≠ n$ and $m, n≥0\\}$\n" +
                        "<br/>$L_3 : \\{a^pb^qc^r | p, q, r ≥ 0\\}$  ",
                "$L_1$ and $L_3$ only",
                "$L_2$ only",
                "$L_2$ and $L_3$ only",
                "$L_3$ only"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "47", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a processor with byte-addressable memory. Assume that all registers, including\n" +
                        "Program Counter (PC) and Program Status Word (PSW), are of size 2 bytes. A stack in the\n" +
                        "main memory is implemented from memory location $(0100)_{16}$\n" +
                        " and it grows upward. The\n" +
                        "stack pointer (SP) points to the top element of the stack. The current value of SP is $(016E)_{16}$\n" +
                        ".\n" +
                        "The CALL instruction is of two words, the first word is the op-code and the second word is\n" +
                        "the starting address of the subroutine. ( oneword = 2bytes ) . The CALL instruction is\n" +
                        "implemented as follows:" +
                        "$$ $$= >  Store the current Vale of PC in the Stack\n" +
                        "<br/>= >  Store the value of PSW register in the stack\n" +
                        "<br/>= >  Load the starting address of the subroutine in PC" +
                        "$$ $$The content of PC just before the fetch of a CALL instruction is $(5FA0)_{16}.$ After execution of\n" +
                        "the CALL instruction, the value of the stack pointer is$$ $$",
                "$(016A)_{16}$",
                "$(016C)_{16}$",
                "$(0170)_{16}$",
                "$(0172)_{16}$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "48", co, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of states in the minimal deterministic finite automaton corresponding to the\n" +
                "regular expression (0+1)*(10) is __________"));
        explanation = getExplaination("");
        q = new Question(Q, "3 to 3", "49", toc, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Host A sends a UDP datagram containing 8880 bytes of user data to host B over an Ethernet\n" +
                        "LAN. Ethernet frames may carry data up to 1500 bytes (i.e. MTU = 1500 bytes). Size of UDP\n" +
                        "header is 8 bytes and size of IP heard is 20 bytes.There is no option field in IP header How\n" +
                        "many total number of IP fragments will be transmitted and what will be the contents of offset\n" +
                        "field in the last fragment?",
                "6 and 95",
                "6 and 7400",
                "7 and 1110",
                "7 and 8880"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "50", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following routing table at an IP router:" +
                        "$$ $$" +
                        MyTable(6, 3, getText(3, "Network No.", "Net Mask", "Next Hop", "128.96.170.0", "255.255.254.0", "Interface 0", "128.96.168.0", "255.255.254.0", "Interface 1", "128.96.166.0", "255.255.254.0", "R2", "128.96.164.0", "255.255.252.0", "R3", "0.0.0.0", "Default", "R4", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$For each IP address in Group I identify the correct choice of the next hop from Group II using\n" +
                        "the entries from the routing table above.$$ $$" +
                        MyTable(6, 2, getText(2, "Group I", "Group II", "(i) 128.96.171.92", "(a) Interface 0", "(ii) 128.96.167.151", "(b) Interface 1", "(iii) 128.96.163..151", "(c) R2", "(iv) 128.96.165.121", "(d) R3", "", "(e) R4", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false)
                        + "$$ $$",
                "i - a, ii - c, iii - e, iv - d",
                "i - a, ii - d, iii - b, iv - e",
                "i - b, ii - c, iii - d, iv - e",
                "i - b, ii - c, iii - e, iv - d"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "51", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider two relations R1(A, B) with the tuples (1, 5), (3, 7)" +
                        " and R1(A, C) = (1, 7), (4, 9). Assume that R(A,B,C) is the full natural outer join of" +
                        " R1 and R2. Consider the following tuples of the form (A,B,C)" +
                        "" +
                        getProgram("2015-2"+"/prog2015-2-qno-52.txt")+
                        "$$ $$Which one of the following statements is correct?$$ $$",
                "R contains a, b, e, f, g but not c, d",
                "R contains a, b, c, d, e, f, g",
                "R contains e, f, g but not a, b",
                "R contains e but not f, g"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "52", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a simple checkpointing protocol and the following set of operations in the log." +
                        "$$ $$" +
                        "(start, T4); (write, T4, y, 2, 3); (start, T1); (commit, T4); (write, T1, z, 5, 7);\n" +
                        "$$ $$(checkpoint);\n" +
                        "$$ $$(start, T2); (write, T2, x, 1, 9); (commit, T2); (start, T3); (write, T3, z, 7, 2);" +
                        " $$ $$If a crash happens now and the system tries to recover using both undo and redo operations," +
                        " what are the contents of the undo list and the redo list$$ $$",
                "Undo: T3, T1; Redo: T2",
                "Undo: T3, T1; Redo: T2, T4",
                "Undo: none; Redo: T2, T4, T3; T1",
                "Undo: T3, T1, T4; Redo: T2"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "53", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A computer system implements 8 kilobyte pages and a +32-bit physical address space. Each\n" +
                "page table entry contains a valid bit, a dirty bit, three permission bits, and the translation. If\n" +
                "the maximum size of the page table of a process is 24 megabytes, the length of the virtual\n" +
                "address supported by the system is _________ bits."));
        explanation = getExplaination("");
        q = new Question(Q, "36 to 36", "54", os, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following hash functions on integers will distribute keys most uniformly\n" +
                        "over 10 buckets numbered 0 to 9 for i ranging from 0 to 2020?",
                "h(i) =$i^2$ mod 10",
                "h(i) =$i^3$ mod 10",
                "h(i) = (11 ∗ $i^2$) mod 10",
                "h(i) = (12 ∗ $i$) mod 10"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "55", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Assume that the bandwidth for a TCP connection is 1048560 bits/sec. Let α be the value of\n" +
                        "RTT in milliseconds. (rounded off to the nearest integer) after which the TCP window scale\n" +
                        "option is needed. Let β be the maximum possible window size the window scale option.\n" +
                        "Then the values of α and β are",
                "63 milliseconds 65535 × $2^{14}$",
                "63 milliseconds 65535 × $2^{16}$",
                "500 milliseconds 65535 × $2^{14}$",
                "500 milliseconds 65535 × $2^{16}$"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "56", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A Young tableau is a 2D array of integers increasing from left to right and from top to bottom. " +
                "Any unfilled entries are marked with ∞, and hence there cannot be any entry to the right of, or below a ∞. " +
                "The following Young tableau consists of unique entries.$$ $$" +
                "" +
                MyTable(4,4,getText(4,"1","2","5","14","3","4","6","23","10","12","18","25","31","∞","∞","∞","","","","","","","","","","","","","",""), false,false)+
                "$$ $$When an element is removed from a Young tableau, other elements should be moved into its place so that the resulting table is" +
                " still a Young tableau (unfilled entries may be filled in with a ∞). The minimum number of entries (other than 1) to be shifted," +
                " to remove 1 from the given Young tableau is ____________"));
        explanation = getExplaination("");
        q = new Question(Q, "5 to 5", "57", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A half adder is implemented with XOR and AND gates. A full adder is implemented with two\n" +
                "half adders and one OR gate. The propagation delay of an XOR gate is twice that of an\n" +
                "AND/OR gate. The propagation delay of an AND/OR gate is 1.2 microseconds. A 4-bit\n" +
                "ripple-carry binary adder is implemented by using four full adders. The total propagation time\n" +
                "of this 4-bit binary adder in microseconds is ____________."));
        explanation = getExplaination("");
        q = new Question(Q, "19.1 to 19.3", "58", digital, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the sequence of machine instruction given below:$$ $$" +
                "MUL R5,R0,R1\n" +
                "<br/>DIV R6,R2,R3\n" +
                "<br/>ADD R7,R5,R6\n" +
                "<br/>SUB R8,R7,R4" +
                "$$ $$In the above sequence, R0 to R8 are general purpose registers. " +
                "In the instructions shown, the first register stores the result of the " +
                "operation performed on the second and the third registers. This sequence of " +
                "instructions is to be executed in a pipelined instruction processor with " +
                "the following 4 stages: $$ $$" +
                "(1) Instruction Fetch and Decode (IF), " +
                "<br/>(2) Operand Fetch (OF), " +
                "<br/>(3) Perform Operation (PO) and " +
                "<br/>(4) Write back the Result (WB)." +
                "$$ $$ The IF, OF and WB stages " +
                "take 1 clock cycle each for any instruction. The PO stage " +
                "takes 1 clock cycle for ADD or SUB instruction, 3 clock " +
                "cycles for MUL instruction and 5 clock cycles for DIV instruction." +
                " The pipelined processor uses operand forwarding from the PO stage " +
                "to the OF stage. The number of clock cycles taken for the execution" +
                " of the above sequence of instructions is ___________"
        ));
        explanation = getExplaination("");
        q = new Question(Q, "13", "59", co, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Perform the following operations on the matrix" +
                "$$ $$ $[\\table 3,4,45;7,9,105;13,2,195]$" +
                "$$ $$(i) Add the third row to the second row\n" +
                "<br/>(ii) Subtract the third column from the first column.\n" +
                "$$ $$The determinant of the resultant matrix is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "0", "60", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following well formed formulae is tautology?" +
                        "$$ $$",
                "∀x∃yR(x,y) ↔ ∃y∀xR(x,y)" ,
                "∀x[∃yR(x,y) → S(x,y)] → ∀x∃yS(x,y)" ,
                "[∀x∃yP(x,y) → R(x,y)] ↔[∀x∃y(￢P(x,y)∨R(x,y)]" ,
                "∀x∀yP(x,y) → ∀x∀yP(y,x)"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "61",m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A graph is self-complementary if it is isomorphic to its complement For all selfcomplementary\n" +
                        "graphs on n vertices, n is",
                "A multiple of 4",
                "Even",
                "Odd",
                "Congruent to 0 mod 4, or, 1 mod 4"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "62", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The secant method is used to find the root of an equation $f(x) = 0.$" +
                        " It is started from two distinct estimates $x_a$ and $x_b$ for the root. It is an iterative " +
                        "procedure involving linear interpolation to a root. The iteration stops if $f(x_b)$ is very" +
                        " small and then $x_b$ is the solution. The procedure is given below. Observe that there is " +
                        "an expression which is missing and is marked by? Which is the suitable expression that is " +
                        "to be put in place of? So that it follows all steps of the secant method? " +
                        "$$ $$Secant:" +
                        getProgram("2015-2"+"/prog2015-2-qno-63.txt")+
                        "",
                "$x_b – (f_b– f(x_a)) f_b/ (x_b – x_a)$" ,
                "$x_a– (f_a– f(x_a)) f_a/ (x_b – x_a)$" ,
                "$x_b – (f_b – x_a) f_b/ (x_b – f_b(x_a)$" ,
                "$x_a – (x_b – x_a) f_a/ (f_b – f(x_a))$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "63", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let X and Y denote the sets containing 2 and 20 distinct objects respectively and F denote the\n" +
                "set of all possible functions defined from X to Y. let f be randomly chosen from F .The\n" +
                "probability of f being one-to-one is _______."));
        explanation = getExplaination("");
        q = new Question(Q, "0.92 to 0.97", "64", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the C program below." +
                "$$ $$" +
                ""+
                getProgram("2015-2"+"/prog2015-2-qno-65.txt")
                + "$$ $$The value printed by the above program is _____________."));
        explanation = getExplaination("");
        q = new Question(Q, "-2", "65", ds, marks, year, explanation, "1");
        this.addQuestion(q);

    }




    //**** 2015-3 questions starts *****//

    private void addQuestions2015_3() {

        //year = "2015-3";
        //marks = "1";
        //path = "file:///android_asset/2015-3/";

        Q = getQuestion(getstring("Extreme focus on syllabus and studying for tests has become such a dominant concern of\n" +
                        "Indian students that they close their minds to anything _____ to the requirements of the exam",
                "related",
                "extraneous",
                "outside",
                "useful"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "1", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A function f(x) is linear and has a value of 29 at x = -2 and 39 at x = 3. Find its value at x = 5.",
                "59",
                "45",
                "43",
                "35"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "2", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The Tamil version of ________ John Abraham-starrer Madras café ________ cleared by the\n" +
                        "Censor Board with no cuts last week but the film’s distributors _________ no takers among\n" +
                        "the exhibitors for a release in Tamil Nadu _________ this Friday.",
                "Mr., was, found, on",
                "a, was, found, at",
                "the, was, found, on",
                "a, being, find at"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "3", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If ROAD is written as URDG, then SWAN should be written as:",
                "VXDQ",
                "VZDQ",
                "VZDP",
                "UXDQ"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "4", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Select the pair that best expresses a relationship similar to that expressed in the pair:\n" +
                        "Children: Pediatrician",
                "Adult: Orthopaedist",
                "Females: Gynaecologist",
                "Kidney: Nephrologist",
                "Skin: Dermatologist"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "5", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("The exports and imports (in crores of Rs.) of a country from the year 2000 to 2007 are given\n" +
                "in the following bar chart. In which year is the combined percentage increase in imports and\n" +
                "exports the highest?" +
                "$$ $$<img src='"+path+"qno-6.png'/>"));
        explanation = getExplaination("");
        q = new Question(Q, "2006 to 2006", "6", apti, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The head of a newly formed government desires to appoint five of the six selected members\n" +
                        "P,Q,R,S,T and U to portfolios of Home, Power, Defense, Telecom, and Finance. U does not\n" +
                        "want any portfolio if S gets one of the five. R wants either Home or Finance or no portfolio.\n" +
                        "Q says that if S gets either Power or Telecom, then she must get the other one. T insists on a\n" +
                        "portfolio if P gets one.\n" +
                        "$$ $$Which is the valid distribution of portfolios?",
                "P-Home, Q-Power, R-Defense, S-Telecom, T-Finance",
                "R-Home, S-Power, P-Defense, Q-Telecom, T-Finance",
                "P-Home, Q-Power, T-Defense, S-Telecom, U-Finance",
                "Q-Home, U-Power, T-Defense, R-Telecom, P-Finance"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Choose the most appropriate equation for the function drawn as a thick line, in the plot below." +
                        "$$ $$<img src='"+path+"qno-18.png'/>",
                "x = y − |y|",
                "x = −(y − |y| )",
                "x = y + |y|",
                "x = −(y + |y| )"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "8", apti, marks, year, explanation,"0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Most experts feel that in spite of possessing all the technical skills required to be a batsman of\n" +
                        "the highest order, he is unlikely to be so due to lack of requisite temperament. He was guilty\n" +
                        "of throwing away his wicket several times after working hard to lay a strong foundation. His\n" +
                        "critics pointed out that until he addressed this problem success at the highest level will\n" +
                        "continue to elude him.\n" +
                        "$$ $$Which of the statement (s) below is/are logically valid and can be inferred from the above\n" +
                        "passage?",
                "He was already a successful batsman at the highest level",
                "He has to improve his temperament in order to become a great batsman",
                "He failed to make many of his good starts count",
                "Improving his technical skills will guarantee success"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "9", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Alexander turned his attention towards India, since he had conquered Persia.\n" +
                        "Which one of the statements below is logically valid and can inferred from the above\n" +
                        "sentence?",
                "Alexander would not have turned his attention towards India had he not conquered\n" +
                        "Persia.",
                "Alexander was not ready to rest on his laurels, and wanted to march to India",
                "Alexander was completely in control of his army and could command it to move towards\n" +
                        "India",
                "Since Alexander’s kingdom extended to Indian borders after the conquest of Persia, he\n" +
                        "was keen to move further"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "10", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("In a room there are only two types of people, namely Type 1 and Type 2. Type 1 people\n" +
                        "always tell the truth and Type 2 people always lie. Your give a fair coin to a person in that\n" +
                        "room, without knowing which type he is from and tell him to loss it and hide the result from\n" +
                        "you till you ask for it. Upon asking, the person replies the following.\n" +
                        "$$ $$“The result of the toss is head if and only if I am telling the truth.”\n" +
                        "$$ $$Which of the following options are correct?$$ $$",
                "The result is head",
                "The result is tail",
                "If the person is of Type 2, then the result is tail",
                "If the person is of Type 1, then the result is tail"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "11", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the relation X(P,Q,R,S,T,U) with the following set of functional dependencies" +
                        "$$ $$F {\n" +
                        "<br/>{P,R} {S,T}\n" +
                        "<br/>{P,S,U} {Q,R}\n" +
                        "<br/>}" +
                        "$$ $$Which of the following is the trivial functional dependency in F+, where F+ is closure of F?",
                "{P,R} → {S,T}",
                "{P,R} → {R,T}",
                "{P,S} → {S}",
                "{P,S,U} → {Q}"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "12", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given a has table T with 25 slots that stores 2000 elements, the load factor α for T is\n" +
                "___________."));
        explanation = getExplaination("");
        q = new Question(Q, "80 to 80", "13", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a software project with the following information domain characteristics for\n" +
                "calculation of function point metric.\n" +
                "$$ $$Number of external inputs (I) = 30\n" +
                "<br/>Number of external outputs (O) = 60\n" +
                "<br/>Number of external inquiries (E) = 23\n" +
                "<br/>Number of files (F) = 08\n" +
                "<br/>Number of external interfaces (N) = 02" +
                "$$ $$It is given that the complexity weighting factors for I, O, E, F and N are 4,5,4,10 and 7,\n" +
                "respectively. It is also given that, out of fourteen value adjustment factors that influence the\n" +
                "development effort, four factors are not applicable, each of the other four factors have value\n" +
                "3, and each of the remaining factors have value 4. The computed value of function point\n" +
                "metric is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "612.0 to 612.1", "14", oth, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following statements." +
                        "$$ $$I. TCP connections are full duplex\n" +
                        "<br/>II. TCP has no option for selective acknowledgment\n" +
                        "<br/>III. TCP connections are message streams",
                "Only I is correct",
                "Only I and III are correct",
                "Only II and III are correct",
                "All of I, II and III are correct"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "15", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose U is the power set of the set S = {1,2,3,4,5,6}. For any T□U, let |T| denote the\n" +
                        "number of element in T and T' denote the complement of T. For any T,R □ U, let T\\R be the\n" +
                        "set of all elements in T which are not in R. Which one of the following is true?",
                "$∀X ∈$ ∪ $(|X|=|X'|)$",
                "$∃X ∈$ ∪ $∃Y∈$ ∪ $(|X|=5,|Y|=5$ and $X ∩ Y = φ$",
                "$∀X ∈$ ∪ $∀Y∈$ ∪ $(|X|=2,|Y|=3$ and $X$ \\ $Y$ = $φ$",
                "$∀X ∈$ ∪ $∀Y∈$ ∪ $( X \\\\ Y = Y' \\\\ X')$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "16", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Among simple LR (SLR), canonical LR, and look-ahead LR (LALR), which of the following\n" +
                        "pairs identify the method that is very easy to implement and the method that is the most\n" +
                        "powerful, in that order?",
                "SLR, LALR",
                "Canonical LR, LALR",
                "SLR, canonical LR",
                "LALR, canonical LR"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "17", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following array of elements." +
                        "$$ $$<89,19,50,17,12,15,2,5,7,11,6,9,100>" +
                        "$$ $$The minimum number of interchanges needed to convert it into a max-heap is",
                "4",
                "5",
                "2",
                "3"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "18", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The maximum number of processes that can be in Ready state for a computer system with n\n" +
                        "CPUs is",
                "$n$",
                "$n^2$",
                "$2^n$",
                "Independent of $n$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "19", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("While inserting the elements 71,65,84,69,67,83 in an empty binary search tree (BST) in the\n" +
                        "sequence shown, the element in the lowest level is",
                "65",
                "67",
                "69",
                "83"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "20", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Two processes X and Y need to access a critical section. Consider the following\n" +
                        "synchronization construct used by both the processes$$ $$" +
                        "$$ $$ <B>ProcessX:</B>" +
                        getProgram("2015-3"+"/prog2015-3-qno-21.txt")
                        + "$$ $$ <B>ProcessY:</B>" +
                        getProgram("2015-3"+"/prog2015-3-qno-21-2.txt")
                        +"$$ $$Here, varP and varQ are shared variables and both are initialized to false. Which one of the\n" +
                        "following statements is true?$$ $$",
                "The proposed solution prevents deadlock but fails to guarantee mutual exclusion",
                "The proposed solution guarantees mutual exclusion but fails to prevent deadlock",
                "The proposed solution guarantees mutual exclusion and prevents deadlock",
                "The proposed solution fails to prevent deadlock and fails to guarantee mutual exclusion"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "21", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let # be a binary operator defined as" +
                        "$$ $$X#Y = X'+ Y' where X and Y are Boolean variables." +
                        "$$ $$Consider the following two statements.\n" +
                        "<br/>(S1) (P # Q)# R = P # (Q # R)\n" +
                        "<br/>(S2) Q # R = R # Q\n" +
                        "$$ $$Which of the following is/are true for the Boolean variables P, Q and R?",
                "Only S1 is true",
                "Only S2 is true",
                "Both S1 and S2 are true",
                "Neither S1 nor S2 are true"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "22", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following relation\n" +
                        "$$ $$Cinema (theater, address, capacity)\n" +
                        "$$ $$Which of the following options will be needed at the end of the SQL query\n" +
                        "$$ $$SELECT P1. address\n" +
                        "<br/>FROM Cinema P1\n" +
                        "$$ $$Such that it always finds the addresses of theaters with maximum capacity?",
                "WHERE P1. Capacity > = All (select P2. Capacity from Cinema P2)",
                "WHERE P1. Capacity > = Any (select P2. Capacity from Cinema P2)",
                "WHERE P1. Capacity > = All (select max(P2. Capacity) from Cinema P2)",
                "WHERE P1. Capacity > = Any (select max (P2. Capacity) from Cinema P2)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "23", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The value of ${lim}↙{x→∞}(1+x^2) e^{-x}$ is:",
                "0",
                "$1/2$",
                "1",
                "∞"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "24", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program segment" +
                        "$$ $$" +
                        getProgram("2015-3"+"/prog2015-3-qno-25.txt")+
                        "$$ $$What will be printed by the program?$$ $$",
                "12",
                "120400",
                "1204",
                "1034"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "25", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The number of 4 digit numbers having their digits in non-decreasing order (from left to right)\n" +
                "constructed by using the digits belonging to the set {1,2,3} is _____ ."));
        explanation = getExplaination("");
        q = new Question(Q, "15 to 15", "26", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the matrix $[\\table 1,-1,2;0,1,0;1,2,1]$,one of " +
                        "the eigen values is 1. The eigen vectors corresponding to" +
                        "the eigen value 1 are",
                "{α(4,2,1)|α ≠ 0,α ∈ R}",
                "{α(-4,2,1)|α ≠ 0,α ∈ R}",
                "{α($√2$,0,1)|α ≠ 0,α ∈ R}",
                "{α($-√2$,0,1)|α ≠ 0,α ∈ R}"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "27", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a machine with byte addressable main memory of $20^{20}$ bytes, block size of 16 bytes\n" +
                        "and a direct mapped cache having $2^{12}$ cache lines. Let the address of two consecutive bytes in\n" +
                        "main memory be $(E201F)_{16}$ and $(E2020)_{16} .$ What are the tag and cache line address (in hex)\n" +
                        "for main memory address $(E201F)_{16}$?",
                "E, 201",
                "F, 201",
                "E, E20",
                "2, 01F"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "28", co, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the equality $∑↙{i=0}↖n i^3=X$ and the following choices for X" +
                        "$$ $$I. $ θ(n^4)$" +
                        "<br/>II. $ θ(n^5)$" +
                        "<br/>III. $O(n^5)$" +
                        "<br/>IV.  $Ω(n^3)$" +
                        "$$ $$The equality above remains correct if X is replaced by",
                "only I",
                "Only II",
                "I or III or IV but not II",
                "II or III or IV but not I"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "29", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The result evaluating the postfix expression 10 5 + 60 6/*8− is",
                "284",
                "213",
                "142",
                "71"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "30", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a CSMA/CD network that transmits data at a rate of 100 Mbps ($10^8$ bits second)\n" +
                        "over a 1 km(kilometer) cable with no repeaters. If the minimum frame size required for this\n" +
                        "network is 1250 bytes, what is the signal speed (km/sec) in the cable?",
                "8000",
                "10000",
                "16000",
                "20000"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "31", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a software program that is artificially seeded with 100 faults. While testing this\n" +
                "program, 159 faults are detected, out of which 75 faults are from those artificially seeded\n" +
                "faults. Assuming that both are and seeded faults are of same nature and have same\n" +
                "distribution, the estimated number of undetected real fault is _____ ."));
        explanation = getExplaination("");
        q = new Question(Q, "175 to 175", "32", os, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a binary tree T that has 200 leaf nodes. Then, the number of nodes in T that have\n" +
                "exactly two children are ____ ."));
        explanation = getExplaination("");
        q = new Question(Q, "199 to 199", "33", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("In a web server, ten Webpages are stores with the URLs of the form\n" +
                        "http:www.yourname.com/var.html; where, var is different number from 1 to 10 for each\n" +
                        "Webpage. Suppose, the client stores the Webpage with var = 1(say W1) in local machine\n" +
                        ",edits and then tests. Rest of the Webpages remains on the web server. W1 contains several\n" +
                        "relative URLs of the form “var.html” referring to the other webpages. Which one of the\n" +
                        "following statements needs to be added in W1, so that all the relative URLs in W1 refers to\n" +
                        "the appropriate Webpages on the web server?",
                "< ahref :\"http : / / www.yourname.com / \",href :\"...var.html\" >",
                "< base href :\"http : / / www.yourname.com / \" >",
                "< a href :\"http : / / www.yourname.com / \" >",
                "< base href :\"http : / / www.yourname.com / \", range :\"...var .html\" >"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "34", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $L$ be the language represented by the regular expression ∑*0011∑*where ∑ ={0,1}.\n" +
                        "What is the minimum number of states in a DFA that recognizes $\\ov{L}$ (complement of $L$)?",
                "4",
                "5",
                "6",
                "8"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "35", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("In for non-zero x, $af(x)+bf(1/x)=1/x=-25$ where a ≠ b then $∫↙1↖2 f(x)$ dx is",
                "$1/{a^2-b^2}[a(ln\\ 2-25)+{47b}/2]$",
                "$1/{a^2-b^2}[a(2ln\\ 2-25)-{47b}/2]$",
                "$1/{a^2-b^2}[a(2ln\\ 2-25)+{47b}/2]$",
                "$1/{a^2-b^2}[a(ln\\ 2-25)-{47b}/2]$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "36", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following grammar G" +
                        "$$ $$ S → F|H\n" +
                        "<br/>S → p|c\n" +
                        "<br/>S → d|c" +
                        "$$ $$where S, F, and H are non-terminal symbols, p, d, and c are terminal symbols. Which of the\n" +
                        "following statements(s) is/are correct?\n" +
                        "S1.LL(1) can parse all strings that are generated using grammar G\n" +
                        "S2: LR(1) can parse all strings that are generate using grammar G",
                "Only S1",
                "Only S2",
                "Both S1 and S2",
                "Neither S1 nor S2"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "37", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider three software items: Program –X, Control Flow Diagram of Program-Y and\n" +
                        "Control Flow Diagram of Program –Z as shown below" +
                        "$$ $$ Program -X:" +
                        getProgram("2015-3"+"/prog2015-3-qno-38.txt")+
                        "$$ $$Control Flow Diagram of Program - Y:" +
                        "$$ $$<img src='"+path+"qno-15.png'/>" +
                        "$$ $$Control Flow Diagramof Program- Z :$$ $$" +
                        "<img src='"+path+"qno-15-1.png'/>" +
                        "$$ $$The values of McCabe’s Cyclomatic complexity of Program –X, Program-Y, and Program-Z\n" +
                        "respectively are",
                "4,4,7" ,
                "3,4,7" ,
                "4,4,8" ,
                "4,3,8"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "38", oth, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following partial Schedule S involving two transactions T1 and T2. Only the\n" +
                        "read and write operations have been shown. The read operation on data item P is denoted by\n" +
                        "read(P) and the write operation on data item P is denoted by write(P)." +
                        "$$ $$" +
                        MyCustomTable2015_3() +
                        "$$ $$Suppose that the transaction T1 fails immediately after time instance 9. Which one of the\n" +
                        "following statements is correct?",
                "T2 must be aborted and then both T1 and T2 must be re-started to ensure transaction\n" +
                        "atomicity" ,
                "Schedule S is non-recoverable and cannot ensure transaction atomicity" ,
                "Only T2 must be aborted and then re-started to ensure transaction atomicity" ,
                "Schedule S is recoverable and can ensure atomicity and nothing else needs to be done"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "39", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a B+ tree in which the search Answer is 12 bytes long, block size is 1024 bytes,\n" +
                "record pointer is 10 bytes long and block pointer is 8 bytes long. The maximum number of\n" +
                "keys that can be accommodated in each non-leaf node of the tree is ____ ."));
        explanation = getExplaination("");
        q = new Question(Q, "50 to 50", "40", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose $X_i$ for i=1,2,3 ar independent and identically distributed random variables whose\n" +
                "probability mass functions are Pr $[X_i = 0]$ = Pr $[X_i =1]$ =1/ 2 for i =1,2,3. Define another\n" +
                "random variable Y = $X_1 X_2 ⊕ X_3$ , where ⊕ denotes XOR.Then Pr $[Y = 0 |X_3 = 0]$ = _____."));
        explanation = getExplaination("");
        q = new Question(Q, "0.73 to 0.76", "41", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Given the function F = P' + QR, where F is a function in three Boolean variables P,Q and R\n" +
                        "and P' =!P, consider the following statements" +
                        "$$ $$(S1)F= ∑ (4,5,6)\n" +
                        "<br/>(S2)F= ∑ (0,1,2,3,7)\n" +
                        "<br/>(S3)F= Π (4,5,6)\n" +
                        "<br/>(S4)F= Π (0,1,2,37)" +
                        "$$ $$Which of the following is true?$$ $$",
                "(S1)-False, (S2)-True, (S3)-True, (S4)-False",
                "(S1)-True, (S2)-False, (S3)-False, (S4)-True",
                "(S1)-False, (S2)-False, (S3)-True, (S4) True",
                "(S1)-False-True, (S2) True, (S3)-False, (S4)-False"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "42", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The total number of prime implicates of the function" +
                "$$ $$f (w,x, y,z) = ∑(0,2,4,5,6,10) is ____ ."));
        explanation = getExplaination("");
        q = new Question(Q, "3 to 3", "43", digital, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the equation $(43)_x$ = $(y3)_8$ where x and y are unknown. The number of possible\n" +
                "solution is _______ ."));
        explanation = getExplaination("");
        q = new Question(Q, "5 to 5", "44", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $f(n)=n$ and $g(n)= n^(1+sin\\ n)$, where n is a positive integer. Which of the following statement\n" +
                        "is/are correct?" +
                        "$$ $$I. $f(n) = 0(g(n))$\n" +
                        "II. $f(n)= Ω(g(n))$",
                "Only I",
                "Only II",
                "Both I and II",
                "Neither I nor II"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "45", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Suppose c = 〈c[0], ... , c[k – 1]〉 is an array of length k, " +
                "where all the entries are from the set {0, 1}. For any positive integers a and n, " +
                "consider the following pseudocode." +
                "$$ $$" +
                getProgram("2015-3" + "/prog2015-3-qno-46.txt")+
                "$$ $$If k = 4, c = 〈1, 0, 1, 1〉," +
                " a = 2 and n = 8, then the output of DOSOMETHING(c, a, n) is ____________."));
        explanation = getExplaination("");
        q = new Question(Q, "0 to 0", "46", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following recursive C function." +
                        "$$ $$" +
                        getProgram("2015-3"+"/prog2015-3-qno-47.txt")+
                        "$$ $$If get (6) function is being called in main () then how many times will the get () function be\n" +
                        "invoked before returning to the main ( ) ?",
                "15" ,
                "25" ,
                "35" ,
                "45"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "47", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Assume that a mergesort algorithm in the worst case takes 30 second for an input of size 64.\n" +
                        "Which of the following most closely approximates the maximum input size of a problem that\n" +
                        "can be solved in 6 minutes?",
                "256",
                "512",
                "1024",
                "2048"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "48", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following two C code segments. Y and X are one and two dimensional arrays of\n" +
                        "size n and n × n respectively, where 2 ≤ n ≤ 10. Assume that in both code segments, elements\n" +
                        "of Y are initialized to 0 and each element X[i] [j] of array X is initialized to i + j. Further\n" +
                        "assume that when stored in main memory all elements of X are in same main memory page\n" +
                        "frame." +
                        "$$ $$" +
                        "Code segment 1:\n" +
                        "<br/>//initialize element of Y to 0\n" +
                        "<br/>//initialize elements X[i] [j] of X to 1+j\n" +
                        "<br/><br/>For (i = 0; i < n; i++)\n" +
                        "<br/> \\ \\ Y[i] + = x[0] [i];\n" +
                        "<br/><br/>Code segment 2:\n" +
                        "<br/>//initialize elements of Y to 0\n" +
                        "<br/>//initialize elements X[i] [j] of X to 1+j\n" +
                        "<br/><br/>For (I = 0; i < n; i++)\n" +
                        "<br/> \\ \\ Y[i] + = x[i] [0];" +
                        "$$ $$Which of the following statements is/are correct?\n" +
                        "$$ $$S1: Final contents of array Y will be same in both code segments\n" +
                        "$$ $$S2: Elements of array X accessed inside the for loop shown in code segment 1 are contiguous\n" +
                        "in main memory\n" +
                        "$$ $$S3: Elements of array X accessed inside the for loop shown in code segment 2 are contiguous\n" +
                        "in main memory.$$ $$",
                "Only S2 is correct",
                "Only S3 is correct",
                "Only S1 and S2 are correct",
                "Only S1 and S3 are correct"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "49", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The velocity v (in kilometer/minute) of a motorbike which start from rest, is given at fixed\n" +
                "intervals of time t (in minutes as follows." +
                "$$ $$" +
                MyTable(11, 2, getText(2, "t", "v", "2", "10", "4", "18", "6", "25", "8", "29", "10", "32", "12", "20", "14", "11", "16", "5", "18", "2", "20", "0", "", "", "", "", "", "", "", ""), true, false) +
                "$$ $$The approximate distance (in kilometers) rounded to two places of decimals covered in 20\n" +
                "minutes using Simpson’s $1/3^{rd}$ rule is ________."));
        explanation = getExplaination("");
        q = new Question(Q, "309.30 to 309.40", "50", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program" +
                "$$ $$" +
                getProgram("2015-3"+"/prog2015-3-qno-51.txt")+
                "$$ $$The output of the program is __________."));
        explanation = getExplaination("");
        q = new Question(Q, "140 to 140", "51", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following policies for preventing deadlock in a system with mutually exclusive\n" +
                        "resources.\n" +
                        "$$ $$I. Processes should acquire all their resources at the beginning of execution. If any\n" +
                        "resources acquired so far are released.\n" +
                        "$$ $$II. The resources are numbered uniquely, and processes are allowed to request for resources\n" +
                        "only in increasing resource numbers.\n" +
                        "$$ $$III. The resources are numbered uniquely, and processes are allowed to request for resources\n" +
                        "only in decreasing resource numbers.\n" +
                        "$$ $$IV. The resources are numbered uniquely. A process is allowed to request only for a resource\n" +
                        "with resource number larger than its currently held resources.\n" +
                        "$$ $$When of the above policies can be used for preventing deadlock?$$ $$",
                "Any one of I and III but not II or IV",
                "Any one of I, III, and IV but not II",
                "Any one of II and III but not I or IV",
                "Any one of I, II, III, and IV"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "52", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a connected undirected graph of 100 vertices and 300 edges. The weight of a\n" +
                "minimum spanning tree of G is 500. When the weight of each edge of G is increased by five,\n" +
                "the weight of a minimum spanning tree becomes __________."));
        explanation = getExplaination("");
        q = new Question(Q, "995 to 995", "53", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("If the following system has non-trivial solution.\n" +
                        "$$ $$px + qy + rz = 0\n" +
                        "<br/>qx + ry + pz = 0\n" +
                        "<br/>rx + py + qz = 0,\n" +

                        "<br/> <br/>Then which one of the following options is TRUE? <br/>",
                "p − q + r = 0 or p = q = −r",
                "p + q − r = 0 or p = −q = r",
                "p + q + r = 0 or p = q = r",
                "p − q + r = 0 or p = −q = −r"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "54", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a network connected two systems located 8000 kilometers apart. The bandwidth of\n" +
                "the network is $500 × 10^6$ bits per second. The propagation speed of the media is $4 × 10^6$\n" +
                "meters per second. It is needed to design a Go-Back-N sliding window protocol for this\n" +
                "network. The average packet size is $10^7$ bits. The network is to be used to its full capacity.\n" +
                "Assume that processing delays at nodes are negligible. Then the minimum size in bits of the\n" +
                "sequence number field has to be ___________."));
        explanation = getExplaination("");
        q = new Question(Q, "8 to 8", "55", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Language $L_1$ is polynomial time reducible to language $L_2.$ Language $L_3$ is polynomial time\n" +
                        "reducible to $L_2,$ which in turn is polynomial time reducible to language $L_4.$ Which of the\n" +
                        "following is/are true?\n" +
                        "$$ $$I. if $L_4 ∈ P,$ then $L_2 ∈ P$\n" +
                        "<br/>II. if $L_1 ∈ P$ or $L_3 ∈ P,$ then $L_2 ∈ P$\n" +
                        "<br/>III. $L_1 ∈ P,$ if and only if $L_3 ∈ P$\n" +
                        "<br/>IV.  if $L_4 ∈ P,$ then $L_1 ∈ P$ and $L_3 ∈ P$",
                "II only",
                "III only",
                "I and IV only",
                "I only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "56", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following reservation table for a pipeline having three stages $S_1, S_2,$ and $S_3.$" +
                "$$ $$ Time →" +
                MyTable(4, 6, getText(6, "", "1", "2", "3", "4", "5", "$S_1$", "X", "", "", "", "X", "$S_2$", "", "X", "", "X", "", "$S_3$", "", "", "X", "", "", "", "", "", "", "", ""), true, true) +
                "$$ $$The minimum average latency (MAL) is ________."));
        explanation = getExplaination("");
        q = new Question(Q, "3 to 3", "57", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("In the network 200.20.11.144/27, the fourth octet (in decimal) of the last IP address of the\n" +
                "network which can be assigned to a host is ________."));
        explanation = getExplaination("");
        q = new Question(Q, "158 to 158", "58", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following languages are context-free?$$ $$" +
                        "$L_1=\\{a^mb^na^nb^m |m,n ≥ 1\\}$" +
                        "<br/>$L_2=\\{a^mb^na^mb^n |m,n ≥ 1\\}$" +
                        "<br/>$L_3=\\{a^mb^n |m=2n+1\\}$",
                "$L_1$ and $L_2$ only",
                "$L_1$ and $L_3$ only",
                "$L_2$ and $L_3$ only",
                "$L_3$ only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "59", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program" +
                "$$ $$" +
                getProgram("2015-3"+"/prog2015-3-qno-60.txt")+
                "$$ $$The number of times printf statement is executed is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "10 to 10", "60", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program." +
                "$$ $$" +
                getProgram("2015-3"+"/prog2015-3-qno-61.txt")+
                "$$ $$The output of the program is_________."));
        explanation = getExplaination("");
        q = new Question(Q, "230 to 230", "61", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following code sequence having five instructions $I_1$ to $I_5.$ Each of these\n" +
                        "instructions has the following format." +
                        "$$ $$ $OP R_i, R_j, R_k$" +
                        "$$ $$Where operation $OP$ is performed on contents of registers $R_j$ and $R_k$ and the results is stored\n" +
                        "in register $R_i.$" +
                        "$$ $$ " +
                        "$I_1$ :ADD R1, R2, R\n" +
                        "<br/>$I_2$ :MUL R7, R1, R3\n" +
                        "<br/>$I_3$ :SUB R4, R1, R5\n" +
                        "<br/>$I_4$ :ADD R3, R2, R4\n" +
                        "<br/>$I_5$ :MUL R7,R8, R9" +
                        "$$ $$Consider the following three statements.\n" +
                        "$$ $$S1: There is an anti-dependence between instructions $I_2$ and $I_5$\n" +
                        "$$ $$S2: There is an anti-dependence between instructions $I_2$ and $I_4$\n" +
                        "$$ $$S3: Within an instruction pipeline an anti-dependence always creates on or more stalls\n" +
                        "$$ $$Which one of above stamens is/are correct?$$ $$",
                "Only S1 is true",
                "Only S2 is true",
                "Only S1 and S3 are true",
                "Only S2 and S3 are true"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "62", co, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Two hosts are connected via a packet switch with $10^7$ bits per second links. Each link has a\n" +
                "propagation. Delay of 20 microseconds. The switch begins forwarding a packet 35\n" +
                "microseconds after it receives the same. If 1000 bits of data are to be transmitted between the\n" +
                "two hosts using a packet size of 5000 bits, the time elapsed between the transmission of the\n" +
                "first bit of data and the reception of the last of the data in microsecond is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "1575 to 1575", "63", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let R be a relation on the set of ordered pairs of positive integers such that ((p,q),(r,s)) ∈ R\n" +
                        "if and only if p − s = q − r. Which one of the following is true about R?",
                "Both reflexive and symmetric",
                "Reflexive but not symmetric",
                "Not reflexive but symmetric",
                "Neither reflexive nor symmetric"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "64", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("For the processes listed in the following table, which of the following scheduling schemes\n" +
                        "will the lowest average turnaround time?" +
                        "$$ $$" +
                        MyTable(5,3,getText(3,"Process","Arrival Time","Processing Time","A","0","3","B","1","6","C","4","4","D","6","2","","","","","","","","","","","","","","",""), true,false)+
                        "",
                "First Come First Serve",
                "Non-preemptive Shortest Job First",
                "Shortest Remaining Time",
                "Round Robin with Quantum value two"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "65", os, marks, year, explanation, "0");
        this.addQuestion(q);

    }



    //**** 2016-1 questions starts *****//
    private void addQuestions2016() {

        // year = "2016-1";
        // marks = "1";
        // path = "file:///android_asset/2016-1/";

        Q = getQuestion(getstring("Out of the following four sentences, select the most suitable sentence with respect to grammar and usage.",
                "I will not leave the place until the minister does not meet me.",
                "I will not leave the place until the minister doesn’t meet me.",
                "I will not leave the place until the minister meet me.",
                "I will not leave the place until the minister meets me."));
        explanation = getExplaination("");
        q = new Question(Q, "D", "1", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A rewording of something written or spoken is a ______________.",
                "paraphrase",
                "paradox",
                "paradigm",
                "paraffin"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "2", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Archimedes said, “Give me a lever long enough and a fulcrum on which " +
                        "to place it, and I will move the world.” The sentence above is an example of a ___________ statement.",
                "figurative",
                "collateral",
                "literal",
                "figurine"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "3", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If ‘relftaga’ means carefree, ‘otaga’ means careful and ‘fertaga’ means" +
                        " careless, which of the following could mean ‘aftercare’?",
                "zentaga",
                "tagafer",
                "tagazen",
                "relffer"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "4", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A cube is built using 64 cubic blocks of side one unit. After it is built," +
                        " one cubic block is removed from every corner of the cube. The resulting surface area" +
                        " of the body (in square units) after the removal is __________.",
                "56",
                "64",
                "72",
                "96"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "5", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("A shaving set company sells 4 different types of razors, " +
                        "Elegance, Smooth, Soft and Executive. Elegance sells at Rs. 48, Smooth at Rs. 63," +
                        " Soft at Rs. 78 and Executive at Rs. 173 per piece. The table below shows the numbers " +
                        "of each razor sold in each quarter of a year.$$ $$" +

                        MyTable(5, 5,getText(5,"Quarter / Product","Elegance","Smooth","Soft","Executive","Q1","27300","20009","17602","9999","Q2","25222","19392","18445","8942","Q3","28976","22429","19544","10234","Q4","21012","18229","16595","10109","","","","",""), true,false)+
                        "$$ $$Which product contributes the greatest fraction to the revenue of the company in that year?" +
                        "" ,
                "Elegance" ,
                "Executive" ,
                "Smooth" ,
                "Soft"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "6", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Indian currency notes show the denomination indicated in at least seventeen languages. If this is not an indication of the nation’s diversity, nothing else is. Which of the following can be logically inferred from the above sentences?",
                "India is a country of exactly seventeen languages.",
                "Linguistic pluralism is the only indicator of a nation’s diversity.",
                "Indian currency notes have sufficient space for all the Indian languages",
                "Linguistic pluralism is strong evidence of India’s diversity"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "7", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following statements relating to the level of poker play of four players P, Q, R and S.\n" +
                        "$$ $$I. P always beats Q\n" +
                        "<br/>II. R always beats S\n" +
                        "<br/>III. S loses to P only sometimes\n" +
                        "<br/>IV. R always loses to Q\n" +
                        "$$ $$Which of the following can be logically inferred from the above statements?\n" +
                        "$$ $$(i) P is likely to beat all the three other players\n" +
                        "<br/>(ii) S is the absolute worst player in the set",
                "(i) only",
                "(ii) only",
                "(i) and (ii)",
                "neither (i) nor (ii)"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "8", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("If $f(x) $ $= 2x^7 + 3x - 5,$ which of the following is a factor of $f(x)$?",
                "$(x^3 + 8)$",
                "$(x - 1)$",
                "$(2x - 5)$",
                "$(x + 1)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "9", apti, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("In a process, the number of cycles to failure decreases " +
                        "exponentially with an increase in load. At a load of 80 units, " +
                        "it takes 100 cycles for failure. When the load is halved, it takes 10000 " +
                        "cycles for failure. The load for which the failure will happen in 5000 cycles is ________.",
                "40.00",
                "46.02",
                "60.01",
                "92.02"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "10",apti, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="1";

        Q = getQuestion(getstring("Let p, q, r, s represent the following propositions." +
                "$$ $$p: x ∈ {8,9,10,11,12}\n" +
                "<br/>q : x is a composite number\n" +
                "<br/>r : x is a perfect square\n" +
                "<br/>s : x is a prime number" +
                "$$ $$The integer x ≥ 2 which satisfies <br/> ￢((p ⇒ q)∧(￢r ∨ ￢s)) is _________."
        ));
        explanation = getExplaination("");
        q = new Question(Q, "11.0 to 11.0", "11", m, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $a_n$ be the number of n-bit strings that do NOT contain two consecutive 1's. Which one of\n" +
                        " the following is the recurrence relation for $a_n$?",
                "$a_n=a_{n-1}+2a_{n-2}$",
                "$a_n=a_{n-1}+a_{n-2}$",
                "$a_n=2a_{n-1}+a_{n-2}$",
                "$a_n=2a_{n-1}+2a_{n-2}$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "12", m, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("${{lim}↙{x→4}{sin(x-4)}/{x-4}$ = _________."));
        explanation = getExplaination("");
        q = new Question(Q, "1.0 to 1.0", "13", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A probability density function on the interval [a,1] is given by1/$x^2$ and out side this      interval\n" +
                "the value o fthe function is zero. The value of a is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "0.5 to 0.5", "14", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Two eigen values of a 3 × 3 real matrix P are $(2+√{-1})$ and 3. The determinant of P is  _________. "));
        explanation = getExplaination("");
        q = new Question(Q, "15.0 to 15.0", "15", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the Boolean operator # with the following properties :" +
                        "$$ $$x # 0=x, x # 1 = $\\ov{x}$, x # x = 0 and x # $\\ov{x}$ = 1. $$ $$Then  x # y is equivalent to",
                "$x$ $\\ov{y}$ + $\\ov{x}$ $y$",
                "$x$ $\\ov{y}$ + $\\ov{x}$ $\\ov{y}$",
                "$\\ov{x}$$y$ + $xy$",
                "$xy$ + $\\ov{x}$ $\\ov{y}$"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "16", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The 16-bit 2’s complement representation of an integer is 1111111111110101; its decimal\n" +
                "representation is_________. "));
        explanation = getExplaination("");
        q = new Question(Q, "-11.0 to -11.0", "17", digital, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("We want to design asynchronous counter that counts the sequence 0-1-0-2-0-3 and then\n" +
                " repeats. The minimum number of J-K flip-flops required to implement this counter is\n" +
                "_________."));
        explanation = getExplaination("");
        q = new Question(Q, "3.0 to 4.0", "18", digital, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A processor can support a maximum memory of 4GB, where the memory is word-addressable\n" +
                " (a word consists of two bytes).The size of the address bus of the processor is at least \n" +
                " _________ bits."));
        explanation = getExplaination("");
        q = new Question(Q, "31.0 to 31.0", "19", co, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A queue is implemented using an array such that ENQUEUE and DEQUEUE operations are\n" +
                        "performed efficiently. Which one of the following statements is CORRECT (n refers to the\n" +
                        "number of items in the queue)?",
                "Both operations can be performed in O(1) time",
                "At most one operation can be performed in O(1) time but the worst case time for\n" +
                        "the other operation will be Ω(n)",
                "The worst case time complexity for both operations will be Ω(n)",
                "Worst case time complexity for both operations will be Ω(logn)"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "20", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following directed graph:" +
                "$$ $$<img src='"+path+"qno-11.png'/>" +
                "$$ $$The number of different topological orderings of the" +
                " vertices of the graph is _________ ."));
        explanation = getExplaination("");
        q = new Question(Q, "6.0 to 6.0", "21", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program." +
                        "$$ $$" +
                        getProgram("2016-1"+"/prog2016-1-qno-22.txt") +
                        "$$ $$Which one of the following expressions, when placed in the blank above, will NOT result in\n" +
                        "a type checking error?" ,
                "f(s,*s)" ,
                "i =f(i,s)" ,
                "f(i,*s)" ,
                "f(i,*p)"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "22", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The worst case running times of Insertion sort, Mergesort and Quicksort, respectively, are:",
                "$Θ(n\\ log\\ n), Θ(n\\ log\\ n), and Θ(n^2)$",
                "$Θ(n^2), Θ(n^2), and Θ(n\\ log\\ n)$",
                "$Θ(n^2), Θ(n\\ log\\ n), and Θ(n\\ log\\ n)$",
                "$Θ(n^2), Θ(n\\ log\\ n), and Θ(n^2)$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "23", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a weighted connected undirected graph with distinct positive edge weights. If every\n" +
                        " edge weight is increased by the same value, then which of the following statements is/are \n" +
                        "TRUE?" +
                        "$$ $$P: Minimum spanning tree of G does not change\n" +
                        "<br/>Q: Shortest path between any pair of vertices does not change",
                "P only",
                "Q only",
                "Neither P nor Q",
                "Both P and Q"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "24", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following C program." +
                "$$ $$" +
                getProgram("2016-1"+"/prog2016-1-qno-25.txt")+
                "$$ $$The output of the program is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "2016.0 to 2016.0", "25", ds, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following languages is generated by the given grammar?" +
                        "$$ $$S → aS | bS | ε$$ $$",
                "{$a^n b^m$ | $n,m ≥ 0$}",
                "{$w \\{a,b\\}*$ | $w$ has equal number of $a's$ and $b's$ }",
                "{$a^n | n ≥0$} ∪ {$b^n | n ≥ 0$} ∪ {$a^nb^n | n ≥ 0 $}",
                "$\\{a,b\\}*$"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "26", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following decision problems are undecidable?" +
                        "$$ $$I. Given NFAs $N_1$ and $N_2,$ is $L(N_1)$ ∩ $L(N_2)$ = Φ?\n" +
                        "<br/>II. Given a CFG $G = (N,Σ,P,S)$ and a string x ∈ Σ*, does x ∈ L(G)?\n" +
                        "<br/>III. Given CFGs $G_1$ and $G_2,$ is $L(G_1)$ = $L(G_2)$?\n" +
                        "<br/>IV. Given a TM $M,$ is $L(M)$ = Φ?",
                "I and IV only",
                "II and III only",
                "III and IV only",
                "II and IV only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "27", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following regular expressions represents the language: the set of all binary \n" +
                        "strings having two consecutive $0's$ and two consecutive $1's$?",
                "(0+1)*0011(0+1)*+(0+1)*1100(0+1)*",
                "(0+1)*(00(0+1)*11+11(0+1)*00)(0+1)*",
                "(0+1)*00(0+1)*+(0+1)*11(0+1)*",
                "00(0+1)*11+11(0+1)*00"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "28", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following code segment." +
                "$$ $$x = u - t;\n" +
                "<br/>y = x * v;\n" +
                "<br/>x = y + w;\n" +
                "<br/>y = t - z;\n" +
                "<br/>y = x * y;" +
                "$$ $$The minimum number of total variables required to convert the above code segment to static\n" +
                "single assignment form is  _________."));
        explanation = getExplaination("");
        q = new Question(Q, "10.0 to 10.0", "29", com, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider anarbitrary set of CPU-bound processes with unequal CPU burst lengths\n" +
                        "submitted at the same time to a computersystem. Which one of the following process\n" +
                        "scheduling algorithms would minimize the average waiting time in the ready queue?",
                "Shortest remainingtimefirst",
                "Round-robin with time quantum less than the shortest CPU burst",
                "Uniform random",
                "Highest priority first with priority proportional to CPU burst length"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "30", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is NOT a super key in a relational schema with attributes\n" +
                        "V,W, X, Y, Z and primary key V Y?",
                "VXYZ",
                "VWXZ",
                "VWXY",
                "VWXYZ"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "31", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following is NOT a part of the ACID properties of database transactions? ",
                "Atomicity",
                "Consistency",
                "Isolation",
                "Deadlock-freedom"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "32", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("A database of research articles in a journal uses the following schema.\n" +
                        "$$ $$(VOLUME, NUMBER, STARTPAGE, ENDPAGE, TITLE, YEAR, PRICE)\n" +
                        "$$ $$The primary key is(VOLUME, NUMBER, STARTPAGE, ENDPAGE) and the following\n" +
                        "functional dependencies exist in the schema.\n" +
                        "$$ $$=> (VOLUME, NUMBER, STARTPAGE, ENDPAGE) → TITLE\n" +
                        "<br/>=>(VOLUME, NUMBER) → YEAR\n" +
                        "<br/>=> (VOLUME, NUMBER, STARTPAGE, ENDPAGE) → PRICE\n" +
                        "$$ $$The database is redesigned to use the following schemas.\n" +
                        "$$ $$=> (VOLUME, NUMBER, STARTPAGE, ENDPAGE, TITLE, PRICE)\n" +
                        "<br/>=> (VOLUME, NUMBER, YEAR)\n" +
                        "$$ $$Which is the weakest normal form that the new database satisfies, but the old one does not?",
                "1NF",
                "2NF",
                "3NF",
                "BCNF"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "33", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which one of the following protocols is NOT used to resolve one form of address to another\n" +
                        " one?",
                "DNS",
                "ARP",
                "DHCP",
                "RARP"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "34", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Which of the following is/are example(s) of stateful application layer protocols? " +
                        "$$ $$(i) HTTP\n" +
                        "<br/>(ii) FTP\n" +
                        "<br/>(iii) TCP\n" +
                        "<br/>(iv) POP3",
                "(i) and (ii) only",
                "(ii) and (iii) only",
                "(ii) and (iv) only",
                "(iv) only"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "35", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        marks="2";

        Q = getQuestion(getstring("The coefficient of $x^{12}$ in $(x^3+x^4+x^5+x^6+.....)^3$ is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "10.0 to 10.0", "36", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the recurrence relation $a_1=8,$ $a_n=6n^2+2n+a_{n-1}.$" +
                " Let $a_{99}=K × 10^4.$ The value of $K$ is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "197.9 to 198.1", "37", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A function $ f:N^+ → N^+,$ defined on the set of positive integers $N^+,$ satisfies the following properties :" +
                "$$ $$ $  f(n)=\\{\\table f(n/2),if\\ n\\ is\\ even;f(n+5),if\\ n\\ is\\ odd$" +
                "$$ $$Let $R = \\{\\ i | ∃ j: f(j)=i\\ \\}$ be the set of distinct values that $f$ takes. The maximum possible size of R is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "2.0 to 2.0", "38", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following experiment." +
                "$$ $$<B>Step 1.</B> Flip a fair coin twice.\n" +
                "<br/><B>Step 2.</B> If the out comes are(TAILS, HEADS) then output Y and stop.\n" +
                "<br/><B>Step 3.</B> If the out comes are either(HEADS, HEADS) or(HEADS, TAILS), then output N and\n" +
                "stop.\n" +
                "<br/><B>Step 4.</B> If the out comes are(TAILS, TAILS), then goto Step1." +
                "$$ $$The probability that the output of the experiment is Y is (upto two decimal places)\n" +
                " _________."));
        explanation = getExplaination("");
        q = new Question(Q, "0.33 to 0.34", "39", m, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the two cascaded 2-to-1 multiplexers as shown in the figure." +
                        "$$ $$<img src='"+path+"qno-40.png'/>" +
                        "$$ $$The minimal sum of products form of the output X is",
                "$\\ov{P} \\ \\ov{Q}$ + $P Q R$",
                "$\\ov{P}$ Q + $Q R$",
                "$P Q $ + $\\ov{P}$ $\\ov{Q} R$",
                "$\\ov{Q}$ $\\ov{R}$ + $P Q R$"));

        explanation = getExplaination("");
        q = new Question(Q, "D", "40", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The size of the data count register of a DMA controller is 16 bits. The processor needs to\n" +
                "transfer a file of 29,154 kilobytes from disk to main memory. The memory is byte addressable.\n" +
                "The minimum number of times the DMA controller needs to get the control of the system bus\n" +
                "from the processor to transfer the file from the disk to main memory is_________."));
        explanation = getExplaination("");
        q = new Question(Q, "456.0 to 456.0", "41", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("The stage delays in a 4-stage pipeline are 800,500,400 and 300 picoseconds. The first\n" +
                "stage (with delay 800 picoseconds) is replaced with a functionally equivalent design involving\n" +
                "two stages with respective delays 600 and 350 picoseconds. The throughput increase of the\n" +
                "pipeline is _________ percent."));
        explanation = getExplaination("");
        q = new Question(Q, "33.0 to 34.0", "42", co, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a carry lookahead adder for adding two n-bit integers, built using gates of fan-in at\n" +
                        "most two. The time to perform addition using this adder is",
                "$Θ(1)$",
                "$Θ(log (n))$",
                "$Θ(√n)$",
                "$Θ(n)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "43", digital, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The following function computes the maximum value contained in an integer array p[] of size" +
                        "$$ $$" +
                        getProgram("2016-1"+"/prog2016-1-qno-44.txt") +
                        "$$ $$The missing loop condition is",
                "a !=n",
                "b !=0",
                "b > (a+1)",
                "b !=a"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "44", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("What will be the output of the following C program?" +
                        "$$ $$" +
                        getProgram("2016-1"+"/prog2016-1-qno-45.txt") +
                        "$$ $$",
                "3 1 2 2 1 3 4 4 4",
                "3 1 2 1 1 1 2 2 2",
                "3 1 2 2 1 3 4",
                "3 1 2 1 1 1 2"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "45", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("What will be the output of the following pseudo-code when parameters are passed by reference\n" +
                        "and dynamic scoping is assumed?" +
                        "$$ $$" +
                        getProgram("2016-1"+"/prog2016-1-qno-46.txt") +
                        "",
                "6, 2",
                "6, 6",
                "4, 2",
                "4, 4"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "46", ds, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("An operator delete(i) for a binary heap data structure is to be designed to delete the item in\n" +
                        "the i-th node. Assume that the heap is implemented in an array and i refers to the i-th index\n" +
                        "of the array.If the heap tree has depth d (number of edges on the path from the root to the\n" +
                        "farthest leaf),then what is the time complexity to re-fix the heap efficiently after the removal\n" +
                        "of the element?",
                "$O(1)$",
                "$O(d)$ but not $O(1)$",
                "$O(2^d)$ but not $O(d)$",
                "$O(d\\ 2^d)$ but not $ O(2^d)$"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "47", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the weighted undirected graph with 4 vertices, where the weight of edge {i, j} is\n" +
                "given by the entry $W_{i j}$ in the matrix W." +
                "$$ $$ $W\\ = \\ [\\table 0,2,8,5;2,0,5,8;8,5,0,x;5,8,x,0]$" +
                "$$ $$The largest possible integer value of x, for which at least one shortest path between some pair\n" +
                "of vertices will contain the edge with weight x is _________."));
        explanation = getExplaination("");
        q = new Question(Q, "12.0 to 12.0", "48", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let G be a complete undirected graph on 4 vertices, having 6 edges with weights being 1,2,\n" +
                "3, 4, 5, and 6. The maximum possible weight that a minimum weight spanning tree of G can\n" +
                "have is _________ ."));
        explanation = getExplaination("");
        q = new Question(Q, "7.0 to 7.0", "49",algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("G = (V,E) is an undirected simple graph in which each edge has a distinct weight, and e is a\n" +
                        "particular edge of G. Which of the following statements about the minimum spanning trees\n" +
                        "(MSTs) of G is/are TRUE?" +
                        "$$ $$I. If e is the lightest edge of <U>some</U> cycle in G, then every MST of G <U>includes</U> e\n" +
                        "$$ $$II. If e is the heaviest edge of <U>some</U> cycle in G, then every MST of G <U>excludes</U> e",
                "I only",
                "II only",
                "both I and II",
                "neither I nor II"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "50", algo, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let Q denote a queue containing sixteen numbers and S be an empty stack. Head(Q) returns\n" +
                "the element at the head of the queue Q without removing it from Q. Similarly Top(S) returns\n" +
                "the element at the top of S without removing it from S. Consider the algorithm given below.$$ $$" +
                "" +
                getProgram("2016-1"+"/prog2016-1-qno-51.txt")+
                "$$ $$The maximum possible number of iterations of the while loop in the algorithm is\n" +
                "_________."));
        explanation = getExplaination("");
        q = new Question(Q, "256.0 to 256.0", "51", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following context-free grammars:" +
                        "$$ $$<B>$G_1:$</B> $ S\\ →\\ aS$ | $B,\\ B\\ →\\ b\\ |\\ bB$\n" +
                        "<br/><B>$G_2:$</B> $ S\\ →\\ aA$ | $bB, A\\ →\\ aA$ | $B\\ |\\ e;\\ B→bB\\ |\\ ε$" +
                        "$$ $$Which one of the following pairs of languages is generated by $G_1$ and $G_2,$ respectively?",
                "{$a^mb^n$ | $m$ > 0 or $n$ > 0} and {$a^mb^n$ | $m$ > 0 and $n$ > 0}",
                "{$a^mb^n$ | $m$ > 0 and $n$ > 0} and {$a^mb^n$ | $m$ > 0 or $n$ ≥ 0}",
                "{$a^mb^n$ | $m$ ≥ 0 or $n$ > 0} and {$a^mb^n$ | $m$ > 0 and $n$ > 0}",
                "{$a^mb^n$ | $m$ ≥ 0 and $n$ > 0} and {$a^mb^n$ | $m$ > 0 or $n$ > 0}"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "52", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the transition diagram of a PDA given below with input alphabet S = { a, b } and\n" +
                        "stack alphabet Γ = { X, Z }. Z is the initial stack symbol. Let L denote the language accepted\n" +
                        "by the PDA." +
                        "$$ $$<img src='"+path+"qno-53.png'/> " +
                        "$$ $$Which one of the following is TRUE?",
                "L = {$a^nb^n$ | $n$ ≥ 0} and is not accepted by any finite automata",
                "L = {$a^n$ | $n$ ≥ 0} ∪ {$a^nb^n$ | $n$ ≥ 0} and is not accepted by any deterministic PDA",
                "L is not accepted by any Turing machine that halts on every input",
                "L = {$a^n$ | $n$ ≥ 0} ∪ {$a^nb^n$ | $n$ ≥ 0} and is deterministic context-free"));
        explanation = getExplaination("");
        q = new Question(Q, "D", "53",toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Let $X$ be a recursive language and $Y$ be a recursively enumerable but not recursive language.\n" +
                        "Let $W$ and $Z$ be two languages such that $\\ov{Y}$ reduces to $W,$ and $W$ reduces to $\\ov{X}$ (reduction means\n" +
                        "the standard many-one reduction).Which one of the following statements is TRUE?",
                "$W$ can be recursively enumerable and $Z$ is recursive.",
                "$W$ can be recursive and $Z$ is recursively enumerable.",
                "$W$ is not recursively enumerable and $Z$ is recursive.",
                "$W$ is not recursively enumerable and $Z$ is not recursive."));
        explanation = getExplaination("");
        q = new Question(Q, "C", "54", toc, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("The attributes of three arithmetic operators in some programming language are given below" +
                "$$ $$" +
                MyTable(4, 4,getText(4,"Operator","Precedence","Associativity","Arity","+","High","Left","Binary","-","Medium","Righ","Binary","*","Low","Left","Binary","","","","","","","","","","","","","",""),true,false)+
                "$$ $$The value of the expression 2 - 5 + 1 - 7 * 3 in this language is _________ ."));
        explanation = getExplaination("");
        q = new Question(Q, "9.0 to 9.0", "55", algo, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following Syntax Directed Translation Scheme (SDTS), with non-terminals\n" +
                        "{S, A} and terminals {a, b}." +
                        "$$ $$"+
                        "$\\table S,→,aA,\\{\\ print\\ 1\\ \\};S,→,a,\\{\\ print\\ 2\\ \\};S,→,Sb,\\{\\ print\\ 3\\ \\}$" +
                        "$$ $$Using the above SDTS, the output printed by a bottom-up parser, for the input aab is:",
                "1 3 2",
                "2 2 3",
                "2 3 1",
                "syntax error"));
        explanation = getExplaination("");
        q = new Question(Q, "C", "56", com, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a computer system with 40-bit virtual addressing and page size of sixteen\n" +
                "kilobytes. If the computer system has a one-level page table per process and each page table\n" +
                "entry requires 48 bits, then the size of the per-process page table is _________ megabytes."));
        explanation = getExplaination("");
        q = new Question(Q, "384.0 to 384.0", "57", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a disk queue with requests for I/O to blocks on cylinders 47, 38, 121, 191, 87, 11,\n" +
                "92, 10.The C-LOOK scheduling algorithm isused. The head is initially at cylinder number\n" +
                "63, moving towards larger cylinder numbers on its servicing pass. The cylinders are numbered\n" +
                "from 0 to 199. The total head movement (in number of cylinders) incurred while servicing\n" +
                "these requests is _________ ."));
        explanation = getExplaination("");
        q = new Question(Q, "346.0 to 346.0", "58", os, marks, year, explanation,"1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider a computer system with ten physical page frames. The system is provided with\n" +
                "an access sequence $(a_1,a_2, ....,a_{20},a_1,a_2, ....,a_{20}),$ where each $a_i$ is a distinct virtual page\n" +
                "number. The difference in the number of page faults between the last-in-first-out page\n" +
                "replacement policy and the optimal page replacement policy is_________."));
        explanation = getExplaination("");
        q = new Question(Q, "1.0 to 1.0", "59", os, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following proposed solution for the critical section problem. There are $n$\n" +
                        "processes: $P_0 ....P_{n-1}.$ In the code, function pmax returns an integer not smaller than any\n" +
                        "of its arguments. For all $i, t[i]$ is initialized to zero." +
                        "$$ $$Code for $P_i$ :" +
                        getProgram("2016-1"+"/prog2016-1-qno-60.txt") +
                        "$$ $$Which one of the following is TRUE about the above solution?",
                "At most one process can be in the critical section at any time",
                "The bounded wait condition is satisfied",
                "The progress condition is satisfied",
                "It cannot cause a deadlock"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "60", os, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider the following two phase locking protocol. Suppose a transaction T accesses (for\n" +
                        "read or write operations ),a certain set of objects $\\{\\ O_1,.....,O_k\\ \\}.$ This is done in the following\n" +
                        "manner:\n" +
                        "$$ $$<B>Step 1.</B> T acquires exclusive locks to $O_1, ..., O_k$ in increasing order of their addresses.\n" +
                        "<br/><B>Step 2.</B> The required operations are performed.\n" +
                        "<br/><B>Step 3.</B> All locks are released.\n" +
                        "$$ $$This protocol will",
                "guarantee serializability and deadlock-freedom",
                "guarantee neither serializability nor deadlock-freedom",
                "guarantee serializability but not deadlock-freedom",
                "guarantee deadlock-freedom but not serializability"));
        explanation = getExplaination("");
        q = new Question(Q, "A", "61", dbms, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("Consider that B wants to send a message m that is digitally signed to A. Let the pair of private\n" +
                        "and public keys for A and B be denoted by $K^{-}_x$" +
                        " and $K^{+}_x$ for $x = A,B,$ \n" +
                        " respectively. Let $K_x(m)$\n" +
                        "represent the operation of encrypting $m$ with a key $K_x$ and $H(m)$ represent the message digest.\n" +
                        "Which one of the following indicates the CORRECT way of sending the message m along\n" +
                        "with the digital signature to A?",
                "{$m,\\ K^{+}_B(H(m))$}",
                "{$m,\\ K^{-}_B(H(m))$}",
                "{$m,\\ K^{-}_A(H(m))$}",
                "{$m,\\ K^{+}_A(H(m))$}"));
        explanation = getExplaination("");
        q = new Question(Q, "B", "62", cn, marks, year, explanation, "0");
        this.addQuestion(q);

        Q = getQuestion(getstring("An IP datagram of size 1000 bytes arrives at a router. The router has to forward this packet on\n" +
                "a link whose MTU ( maximum transmission unit )is 100 bytes. Assume that the size of the IP\n" +
                "header is 20 bytes.\n" +
                " The number of fragments that the IP datagram willbe divided into for transmission is\n" +
                "_________."));
        explanation = getExplaination("");
        q = new Question(Q, "13.0 to 13.0", "63", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("For a host machine that uses the token bucket algorithm for congestion control, the token\n" +
                "bucket has a capacity of 1 megabyte and the maximum output rate is 20 megabytes persecond.\n" +
                " Tokens arrive at a rate to sustain output at a rate of 10 megabytes per second. The token bucket\n" +
                "is currently full and the machine needs to send 12 megabytes of data. The minimum time\n" +
                "required to transmit the data is _________ seconds."));
        explanation = getExplaination("");
        q = new Question(Q, "1.1 to 1.1", "64", cn, marks, year, explanation, "1");
        this.addQuestion(q);

        Q = getQuestion(getstring("A sender uses the Stop-and-Wait ARQ protocol for reliable transmission of frames. Frames\n" +
                "are of size 1000 bytes and the transmission rate at the sender is 80 Kbps (1 Kbps = 1000\n" +
                "bits/second). Size of an acknowledgement is 100 bytes and the transmission rate at the receiver\n" +
                " is 8 Kbps. The one-way propagation delay is 100 milliseconds.\n" +
                "Assuming no frame is lost, the sender throughput is _________ bytes/second."));
        explanation = getExplaination("");
        q = new Question(Q, "2500.0 to 2500.0", "65", cn, marks, year, explanation, "1");
        this.addQuestion(q);

    }





    //**** 2016-2 questions starts *****//
    private void addQuestions2016_2() {

        //year="2016-2";
        //marks="1";
        //    path = "file:///android_asset/2016-2/";

        Q=getQuestion(getstring("The man who is now Municipal Commissioner worked as __________________.",
                "the security guard at a university",
                "a security guard at the university",
                "a security guard at university",
                "the security guard at the university"));
        explanation=getExplaination("");
        q= new Question(Q,"B","1",apti ,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Nobody knows how the Indian cricket team is going " +
                        "to <U>cope with</U> the difficult and seamer-friendly " +
                        "wickets in Australia." +
                        "$$ $$Choose the option which is closest in meaning to the" +
                        " underlined phrase in the above sentence",
                "put up with",
                "put in with",
                "put down to",
                "put up against"));
        explanation=getExplaination("");
        q= new Question(Q,"A","2",apti,marks, year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Find the odd one in the following group of words." +
                        "$$ $$ mock, deride, praise, jeer",
                "mock",
                "deride",
                "praise",
                "jeer"));
        explanation=getExplaination("");
        q= new Question(Q,"C","3",apti,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Pick the odd one from the following options.",
                "CADBE",
                "JHKIL",
                "XVYWZ",
                "ONPMQ"));
        explanation=getExplaination("");
        q= new Question(Q,"D","4",apti,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("In a quadratic function, the value of the product of the roots (α, β) is 4. Find the value of" +
                        "$$ $$ ${α^n + β^n}/{α^{-n} + β^{-n}}$",
                "$n^4$",
                "$4^n$",
                "$2^{2n-1}$",
                "$4^{n-1}$"));
        explanation=getExplaination("");
        q= new Question(Q,"B","5",apti,marks, year,explanation,"0");
        this.addQuestion(q);

        marks = "2";

        Q=getQuestion(getstring("Among 150 faculty members in an institute, 55 are connected with each other through " +
                        "Facebook® and 85 are connected through WhatsApp®. " +
                        "30 faculty members do not have Facebook® or WhatsApp® accounts. " +
                        "The number of faculty members connected only through Facebook® accounts is ______________.",
                "35",
                "45",
                "65",
                "90"));
        explanation=getExplaination("");
        q= new Question(Q,"A","6",apti,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Computers were invented for performing only high-end useful computations. " +
                        "However, it is no understatement that they have taken over our world today. " +
                        "The internet, for example, is ubiquitous. Many believe that the internet " +
                        "itself is an unintended consequence of the original invention. With the " +
                        "advent of mobile computing on our phones, a whole new dimension is now enabled. " +
                        "One is left wondering if all these developments are good or," +
                        " more importantly, required." +
                        "$$ $$ Which of the statement(s) " +
                        "below is/are logically valid and can be inferred from the above paragraph?" +
                        "$$ $$(i) The author believes that computers are not good for us.\n" +
                        "<br/>(ii) Mobile computers and the internet are both intended inventions$$ $$",
                "(i) only",
                "(ii) only",
                "both (i) and (ii)",
                "neither (i) nor (ii)"));
        explanation=getExplaination("");
        q= new Question(Q,"D","7",apti,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("All hill-stations have a lake. Ooty has two lakes." +
                        "$$ $$Which of the statement(s) below is/are " +
                        "logically valid and can be inferred from the above sentences?" +
                        "$$ $$(i) Ooty is not a hill-station.\n" +
                        "<br/>(ii) No hill-station can have more than one lake.$$ $$",
                "(i) only",
                "(ii) only",
                "both (i) and (ii)",
                "neither (i) nor (ii)"));
        explanation=getExplaination("");
        q= new Question(Q,"D","8",apti,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("In a 2 × 4 rectangle grid shown below, each cell is a " +
                        "rectangle. How many rectangles can be observed in the grid?" +
                        "$$ $$<img src='" + path + "qno-9.png'/>",
                "21",
                "27",
                "30",
                "36"));
        explanation=getExplaination("");
        q= new Question(Q,"C","9",apti,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("" +
                        "$$ $$<img src='" + path + "qno-10.png'/>" +
                        "$$ $$Choose the correct expression for $f(x)$ given in the graph.",
                "$f(x) = 1 - |x-1|$",
                "$f(x) = 1 + |x-1|$",
                "$f(x) = 2 - |x-1|$",
                "$f(x) = 2 + |x-1|$"));
        explanation=getExplaination("");
        q= new Question(Q,"C","10",apti,marks,year,explanation,"0");
        this.addQuestion(q);


        marks="1";


        Q=getQuestion(getstring("Consider the following expressions:" +
                "$$ $$(i) $false$\n" +
                "<br/>(ii) $Q$\n" +
                "<br/>(iii) $true$\n" +
                "<br/>(iv) $P ∨ Q$\n" +
                "<br/>(v) $￢Q ∨ P$" +
                "$$ $$The number of expressions given above that are logically " +
                "implied by $P ∧ (P ⇒ Q)$ is\n" +
                "_________."));
        explanation=getExplaination("");
        q= new Question(Q,"4.0 to 4.0","11",m,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Let $f (x)$ be a polynomial and $g(x) = f' (x)$ be its derivative. If the degree of $( f (x) + f (- x))$ is\n" +
                "10, then the degree of $(g(x)-g(-x))$ is_________."));
        explanation=getExplaination("");
        q= new Question(Q,"9.0 to 9.0","12",m,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("The minimum number of colours that is sufficient to vertex-colour any planar graph is\n" +
                "_________."));
        explanation=getExplaination("");
        q= new Question(Q,"4.0 to 4.0","13",m,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the systems, each consisting of m linear equations in n variables.\n" +
                        "$$ $$I. If m < n, then all such systems have a solution\n" +
                        "<br/>II. If m > n, then none of these systems has a solution\n" +
                        "<br/>III. If m = n, then there exists a system which has a solution\n" +
                        "$$ $$Which one of the following is CORRECT?",
                "I, II and III are true",
                "Only II and III are true",
                "Only III is true",
                "None of them is true"));
        explanation=getExplaination("");
        q= new Question(Q,"C","14",m,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Suppose that a shop has an equal number of LED bulbs of two different types. The probability \n" +
                " of an LED bulb lasting more than 100 hours given that it is of Type 1 is 0.7, and given that it\n" +
                " is of Type 2 is 0.4. The probability that an LED bulb chosen uniformly at random lasts more \n" +
                "than 100 hours is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"0.55 to 0.55","15",m,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Suppose that the eigen values of matrix $A $ are 1,2, 4. The determinant of $(A^{-1})^T$ is\n" +
                " _________."));
        explanation=getExplaination("");
        q= new Question(Q,"0.124 to 0.126","16",m,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider an eight-bit ripple-carry adder for computing the sum of A and B, where A and B are\n" +
                "integers represented in 2’s complement form. If the decimal value of A is one, thedecimal\n" +
                "value of B that leads to the longest latency for the sum to stabilize is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"-1.0 to -1.0","17",digital,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Let, $x_1⊕x_2⊕x_3⊕x_4 = 0$ where $x_1, x_2, x_3, x_4$ are Boolean variables, and ⊕ is the XOR operator.\n" +
                        "Which one of the following must always be TRUE?",
                "$x_1x_2x_3x_4 = 0$",
                "$x_1x_3+x_2 = 0$",
                "$\\ov{x_1} ⊕ \\ov{x_3} =  \\ov{x_2} ⊕ \\ov{x_4}$",
                "$x_1+x_2+x_3+x_4 = 0$"));
        explanation=getExplaination("");
        q= new Question(Q,"C","18",digital,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Let X be the number of distinct 16-bit integers in 2’s complement representation. Let Y be the\n" +
                "number of distinct 16-bit integers in sign magnitude representation. \n" +
                " Then X - Y is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"1.0 to 1.0","19",digital,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("A processor has 40 distinct instructions and 24 general purpose registers. A 32-bit instruction \n" +
                "word has an opcode, two register operands and an immediate operand. The number of bits \n" +
                " available for the immediate operand field is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"16.0 to 16.0","20",co,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Breadth First Search (BFS) is started on a binary tree beginning from the root vertex. There is\n" +
                "a vertex $t$ at a distance four from the root. If $t$ is the n-th vertex in this BFS traversal, then the\n" +
                "maximum possible value of n is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"31.0 to 31.0","21",ds,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("The value printed by the following program is ______." +
                "$$ $$" +
                getProgram("2016-2" + "/prog2016-2-qno-22.txt") +
                ""));
        explanation=getExplaination("");
        q= new Question(Q,"30.0 to 30.0","22",ds,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Assume that the algorithms considered here sort the input sequences in ascending order. If the\n" +
                        "input is already in ascending order, which of the following are TRUE?\n" +
                        "$$ $$I. Quicksort runsin $Θ(n^2)$ time\n" +
                        "<br/>II. Bubblesort runs in $Θ(n^2)$ time\n" +
                        "<br/>III. Mergesort runs in $Θ(n)$ time\n" +
                        "<br/>IV. Insertion sort runs in $Θ(n)$ time",
                "I and II only",
                "I and III only",
                "II and IV only",
                "I and IV only"));
        explanation=getExplaination("");
        q= new Question(Q,"D","23",algo,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("The Floyd-Warshall algorithm for all-pair shortest paths computation is based on",
                "Greedy paradigm.",
                "Divide-and-Conquer paradigm.",
                "Dynamic Programming paradigm.",
                "neither Greedy nor Divide-and-Conquer nor Dynamic Programming paradigm."));
        explanation=getExplaination("");
        q= new Question(Q,"C","24",algo,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("N items are stored in a sorted doubly linked list. For a delete operation, a pointer is provided\n" +
                        "to the record to be deleted. For a decrease-key operation, a pointer is provided to the record on\n" +
                        "which the operation is to be performed." +
                        "$$ $$An algorithm performs the following operations on the list in this order : $Θ(N)$ delete, $O(log\\ N)$\n" +
                        "insert, $O(log\\ N)$ find, and $Θ(N)$ decrease-key. What is the time complexity of all these\n" +
                        "operations put together?",
                "$O(log^2\\ N)$",
                "$O(N)$",
                "$O(N^2)$",
                "$Θ(N^2\\ log\\ N)$"));
        explanation=getExplaination("");
        q= new Question(Q,"C","25",algo,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("The number of states in the minimum sized DFA that accepts the language defined by the\n" +
                " regular expression\n" +
                "(0+1)*(0+1)(0+1)*" +
                "is ________."));
        explanation=getExplaination("");
        q= new Question(Q,"2.0 to 2.0","26",toc,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Language $L_1$ is defined by the grammar: $S_1 → aS_1b|ε$\n" +
                        "<br/>Language $L_2$ is defined by the grammar: $S_2 → abS_2|ε$\n" +
                        "$$ $$Consider the following statements :\n" +
                        "$$ $$P: $L_1$ is regular\n" +
                        "<br/>Q: $L_2$ is regular" +
                        "$$ $$Which one of the following is TRUE?",
                "Both P and Q are true",
                "P is true and Q is false",
                "P is false and Q is true",
                "Both P and Q are false"));
        explanation=getExplaination("");
        q= new Question(Q,"C","27",toc,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following types of languages: $L_1$ : Regular, $L_2$ : Context-free, $L_3$ : Recursive,\n" +
                        "$L_4$ : Recursively enumerable. Which of the following is / are TRUE? \n" +
                        "$$ $$I. $\\ov{L_3} ∪ L_4$ is recursively enumerable\n" +
                        "<br/>II. $\\ov{L_2} ∪ L_3$ is recursive\n" +
                        "<br/>III. $L_1^* ∩ L_2$ is context-free\n" +
                        "<br/>IV. $L_1 ∪ \\ov{L_2}$ is context-free",
                "I only",
                "I and III only",
                "I and IV only",
                "I, II and III only"));
        explanation=getExplaination("");
        q= new Question(Q,"D","28",toc,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Match the following:" +
                        "$$ $$" +
                        MyTable(4, 2, getText(2, "(P) Lexical analysis", "(i)Left most derivation", "(Q) Top down parsing", "(ii)Type checking", "(R) Semantic analysis", "(iii)Regular expressions", "(S) Run time environments", "(iv)Activation records", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), false, false) +
                        "$$ $$",
                "P ↔ i, Q ↔ ii, R ↔ iv,S ↔ iii",
                "P ↔ iii, Q ↔ i, R ↔ ii, S ↔ iv",
                "P ↔ ii, Q ↔ iii, R ↔ i, S ↔ iv",
                "P ↔ iv,Q ↔ i, R ↔ ii, S ↔ iii"));
        explanation=getExplaination("");
        q= new Question(Q,"B","29",com,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("In which one of the following page replacement algorithms it is possible for the page fault rate \n" +
                        "to increase even when the number of allocated frames increases?",
                "LRU(Least Recently Used)",
                "OPT (Optimal Page Replacement)",
                "MRU(Most Recently Used)",
                "FIFO (First In First Out)"));
        explanation=getExplaination("");
        q= new Question(Q,"D","30",os,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("$B^+$ Trees are considered BALANCED because",
                "the lengths of the paths from the root to all leaf nodes are all equal.",
                "the lengths of the paths from the root to all leaf nodes differ from each other by at \n" +
                        " most 1.",
                "the number of children of any two non-leaf sibling nodes differ by at most 1.",
                "the number of records in any two leaf nodes differ by at most 1."));
        explanation=getExplaination("");
        q= new Question(Q,"A","31",ds,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Suppose a database schedule S involves transactions $T_1, ..... , T_n.$ Construct the precedence \n" +
                        "graph of $S$ with vertices representing the transactions and edges representing the conflicts. If \n" +
                        " $S$ is serializable, which one of the following orderings of the vertices of the precedence graph \n" +
                        "is guaranteed to yield a serial schedule? ",
                "Topological order",
                "Depth-first order",
                "Breadth-first order",
                "Ascending order of transaction indices"));
        explanation=getExplaination("");
        q= new Question(Q,"A","32",dbms,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Anarkali digitally signs a message and sends it to Salim. Verification of the signature by Salim\n" +
                        " requires",
                "Anarkali’s public key.",
                "Salim’s public key.",
                "Salim’s private key.",
                "Anarkali’s private key."));
        explanation=getExplaination("");
        q= new Question(Q,"A","33",cn,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("In an Ethernet local area network, which one of the following statements is TRUE? ",
                "A station stops to sense the channel once its tartstransmitting a frame.",
                "The purpose of the jamming signal is to pad the frames that are smaller than the \n" +
                        "minimum framesize.",
                "A station continues to transmit the packet even after the collision is detected.",
                "The exponential backoff mechanism reduces the probability of collision on\n" +
                        "retransmissions."));
        explanation=getExplaination("");
        q= new Question(Q,"D","34",cn,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Identify the correct sequence in which the following packets are transmitted on the network \n" +
                        "by a host when a browser requests a webpage from a remote server, assuming that the host has \n" +
                        "just been restarted.",
                "HTTP GET request, DNS query, TCP SYN",
                "DNS query, HTTP GET request, TCP SYN",
                "DNS query, TCP SYN, HTTP GET request",
                "TCP SYN, DNS query, HTTP GET request"));
        explanation=getExplaination("");
        q= new Question(Q,"C","35",cn,marks,year,explanation,"0");
        this.addQuestion(q);

        marks="2";

        Q=getQuestion(getstring("A binary relation R on N × N is defined as follows : (a, b) R (c, d) if $a ≤ c or b ≤ d.$ Consider\n" +
                        "the following propositions:\n" +
                        "$$ $$P : R is reflexive\n" +
                        "<br/>Q : R is transitive" +
                        "$$ $$Which one of the following statements is TRUE?",
                "Both P and Q are true.",
                "P is true and Q is false.",
                "P is false and Q is true.",
                "Both P and Q are false."));
        explanation=getExplaination("");
        q= new Question(Q,"B","36",m,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Which one of the following well-" +
                        " formed formulae in predicate calculus is NOT valid?",
                "$(∀x p(x) ⇒ ∀xq(x))$ ⇒ $(∃x p(x)$ ∨  $∀xq(x))$",
                "$(∃x p(x) ∨ ∃xq(x))$ ⇒ $∃x (p(x)$ ∨ $q(x))$",
                "$∃x (p(x) ∧ q(x))$ ⇒ $(∃x p(x)$ ∧ $∃xq(x))$",
                "$∀x (p(x) ∨ q(x))$ ⇒ $(∀x p(x)$ ∨ $∀xq(x))$"));
        explanation=getExplaination("");
        q= new Question(Q,"D","37",m,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider a set U of 23 different compounds in a Chemistry lab. There is a subset S of U of \n" +
                        "9 compounds,each of which reacts with exactly 3 compounds of U. Consider the following \n" +
                        " statements:" +
                        "$$ $$I. Each compound in U \\\\ S reacts with an odd number of compounds.\n" +
                        "<br/>II. At least one compound in U \\\\ S reacts with an odd number of compounds.\n" +
                        "<br/>III. Each compound in U \\\\ S reacts with an even number of compounds.\n" +
                        "$$ $$Which one of the above statements is ALWAYS TRUE?",
                "Only I",
                "Only II",
                "Only III",
                "None"));
        explanation=getExplaination("");
        q= new Question(Q,"B","38",m,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("The value of the expression $13^99(mod\\ 17),$ in the range 0 to 16, is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"4.0 to 4.0","39",m,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Suppose the functions $F$ and $G$ can be computed in 5 and 3 nanoseconds by functional units \n" +
                " $U_F$ and $U_G,$ respectively. Given two instances of $U_F$ and two instances of $U_G,$ it is required to\n" +
                " implement the computation $F(G(X_i))$ for 1 ≤ i ≤ 10. Ignoring all other delays, the minimum\n" +
                "time required to complete this computation is _________ nanoseconds."));
        explanation=getExplaination("");
        q= new Question(Q,"28.0 to 28.0","40",co,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider a processor with 64 registers and an instruction set of size twelve. Each instruction\n" +
                " has five distinct fields, namely, opcode, two source register identifiers, one destination register\n" +
                "identifier, and a twelve-bit immediate value. Each instruction must be stored in memory in\n" +
                "a byte-aligned fashion. If a program has 100 instructions, the amount of memory (in bytes) \n" +
                "consumed by the program text is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"500.0 to 500.0","41",co,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("The width of the physical address on a machine is 40 bits. The width of the tag field in a 512\n" +
                " KB 8-way set associative cache is _________ bits."));
        explanation=getExplaination("");
        q= new Question(Q,"24.0 to 24.0","42",co,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider a 3 GHz(gigahertz) processor with a three-stage pipeline and stage latencies $τ_1,$\n" +
                "$τ_2,$ and $τ_3$ such that $τ_1 = 3τ_2\\/4 = 2τ_3$. If the longest pipeline stage is split into two pipeline\n" +
                "stages of equal latency, the new frequency is _________  GHz, ignoring delays in the pipeline\n" +
                "registers."));
        explanation=getExplaination("");
        q= new Question(Q,"3.9 to 4.1","43",co,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("A complete binary min-heap is made by including each integer in [1,1023] exactly once.\n" +
                "The depth of a node in the heap is the length of the path from the root of the heap to that\n" +
                "node. Thus, the root is at depth 0. The maximum depth at which integer 9 can appear is  _________.\n" +
                "."));
        explanation=getExplaination("");
        q= new Question(Q,"8.0 to 8.0","44",algo,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("The following function computes $X^Y$ for positive integers X and Y." +
                        "$$ $$" +
                        getProgram("2016-2" + "/prog2016-2-qno-45.txt") +
                        "$$ $$Which one of the following conditions is TRUE before every iteration of the loop?",
                "$X^Y = a^b$",
                "$(res * a)^Y = (res * X)^b$",
                "$X^Y = res * a^b$",
                "$X^Y = (res * a)^b$"));
        explanation=getExplaination("");
        q= new Question(Q,"C","45",ds,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following New-order strategy for traversing a binary tree:" +
                        "$$ $$▶ Visit the root;\n" +
                        "<br/>▶ Visit the right sub tree using New-order;\n" +
                        "<br/>▶ Visit the left sub tree using New-order;" +
                        "$$ $$The New-order traversal of the expression tree corresponding to the reverse polish expression\n" +
                        "<br/>3 4 * 5 - 2 ˆ 6 7 * 1 + - is givenby:$$ $$",
                "+ - 1 6 7 * 2 ˆ 5 - 3 4 *",
                "- + 1 * 6 7 ˆ 2 - 5 * 3 4",
                "- + 1 * 7 6 ˆ 2 - 5 * 4 3",
                "1 7 6 * + 2 5 4 3 * - ˆ -"));
        explanation=getExplaination("");
        q= new Question(Q,"C","46",ds,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following program:" +
                "$$ $$" +
                getProgram("2016-2" + "/prog2016-2-qno-47.txt") +
                "$$ $$Note: max (x,y) returns the maximum of x and y." +
                "$$ $$The value printed by this program is _________ ."));
        explanation=getExplaination("");
        q= new Question(Q,"3.0 to 3.0","47",ds,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Let $A_1,A_2,A_3,$ and $A_4$ be four matrices of dimensions <br/>10 × 5, 5 × 20, 20 × 10, and 10 × 5,\n" +
                "respectively. The minimum number of scalar multiplications required to find the product\n" +
                "$A_1A_2A_3A_4$ using the basic matrix multiplication method is ."));
        explanation=getExplaination("");
        q= new Question(Q,"1500.0 to 1500.0","48",algo,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("The given diagram shows the flow chart for a recursive function $A(n).$ Assume that all\n" +
                "statements, except for the recursive calls, have $O(1)$ time complexity. If the worst case time\n" +
                "complexity of this function is $O(n^α),$ then the least possible value (accurate upto two decimal\n" +
                " positions) of $α$ is _________." +
                "$$ $$Flow chart for Recursive Function $A(n)$" +
                "$$ $$" +
                "<img src='" + path + "qno-49.png'/>"));
        explanation=getExplaination("");
        q= new Question(Q,"2.2 to 2.4","49",algo,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("The number of ways in which the numbers <br/>1,2,3,4,5,6,7 can be inserted in an empty binary\n" +
                "search tree, such that the resulting tree has height 6, is _________.\n" +
                "$$ $$Note: The height of a tree with a single node is 0."));
        explanation=getExplaination("");
        q= new Question(Q,"64.0 to 64.0","50",algo,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("In an adjacency list representation of an undirected simple graph G = (V,E), each edge (u,v)\n" +
                        "has two adjacency list entries : $[v]$ in the adjacency list of $u,$ and $[u]$ in the adjacency list of\n" +
                        " v. These are called twins of each other. A twin pointer is a pointer from an adjacency list\n" +
                        "entry to its twin. If $|E| = m$ and $|V| = n,$ and the memory size is not a constraint ,what is the\n" +
                        "time complexity of the most efficient algorithm to set the twin pointer in each entry in each\n" +
                        "adjacency list?",
                "$Θ(n^2)$",
                "$Θ(n+m)$",
                "$Θ(m^2)$",
                "$Θ(n^4)$"));
        explanation=getExplaination("");
        q= new Question(Q,"B","51",algo,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following two statements:" +
                        "$$ $$I. If all states of an NFA are accepting states then the language accepted by the NFA is $Σ^*.$\n" +
                        "$$ $$II. There exists a regular language $A$ such that for all languages $B, A ∩ B$ is regular." +
                        "$$ $$Which one of the following is CORRECT?",
                "Only I is true",
                "Only II is true",
                "Both I and II are true",
                "Both I and II are false"));
        explanation=getExplaination("");
        q= new Question(Q,"B","52",toc,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following languages:" +
                        "$$ $$ $L_1 =\\{a^n b^m c^{n+m} : m,n ≥ 1 \\}$" +
                        "<br/>$L_1 =\\{a^n b^n c^{2n} : n ≥ 1 \\}$" +
                        "$$ $$Which one of the following is TRUE?",
                "Both $L_1$ and $L_2$ are context-free.",
                "$L_1$ is context-free while $L_2$ is not context-free.",
                "$L_2$ is context-free while $L_1$ is not context-free.",
                "Neither $L_1$ nor $L_2$ is context-free."));
        explanation=getExplaination("");
        q= new Question(Q,"B","53",toc,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following languages." +
                        "$$ $$$L_1$ = {$\\〈 M \\〉 | M$ takes at least 2016 steps on some input };\n" +
                        "$$ $$$L_2$ = {$\\〈 M \\〉 | M$ takes at least 2016 steps on all inputs } and\n" +
                        "$$ $$$L_3$ = {$\\〈 M \\〉 | M$ accepts ε };" +
                        "$$ $$where for each Turing machine $M, \\〈M\\〉$ denotes a specific encoding of $M.$ Which one of the\n" +
                        " following is TRUE?$$ $$",
                "$L_1$ is recursive and $L_2,L_3$ are not recursive",
                "$L_2$ is recursive and $L_1,L_3$ are not recursive",
                "$L_1,L_2$ are recursive and $L_3$ is not recursive",
                "$L_1,L_2,L_3$ are recursive"));
        explanation=getExplaination("");
        q= new Question(Q,"C","54",toc,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Which one of the following grammars is free from left recursion? ",
                "$\\table S,→,AB,,;A,→,Aa,\\/,b;B,→,c,,$",
                "$\\table S,→,Ab,\\/,Bb,\\/,c;A,→,Bd,\\/,ε;B,→,e,,$",
                "$\\table S,→,Aa,\\/,B;A,→,Bb,\\/,Sc,\\/,ε;B,→,d,,$",
                "$\\table S,→,Aa,\\/,Bb,\\/,c;A,→,Bd,\\/,ε;B,→,Ae,\\/,ε,$"));
        explanation=getExplaination("");
        q= new Question(Q,"B","55",com,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("A student wrote two context-free grammars $G_1$ and $G_2$ for generating a single C-like array\n" +
                        "declaration. The dimension of the array is at least one. For example," +
                        "$$ $$int a[10][3];" +
                        "$$ $$The grammars use D as the start symbol, and use six terminal symbols int ; id [ ] num." +
                        "$$ $$" +

                        MyTable(5, 2, getText(2, "Grammar G1", "Grammar G2", "D → int L;", "D → int L;", "L → id [E", "L → id E", "E → num]", "E → E[num]", "E → num] [E", "E → [num]", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""), true, false) +
                        "$$ $$Which of the grammars correctly generate the declaration mentioned above?",
                "Both G1 and G2",
                "Only G1",
                "Only G2",
                "Neither G1 nor G2"));
        explanation=getExplaination("");
        q= new Question(Q,"A","56",com,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following processes, with the arrival time and the length of the CPU burst given\n" +
                "in milliseconds. The scheduling algorithm used is preemptive shortest remaining-time first" +
                "$$ $$" +
                MyTable(5, 3,getText(3,"Process","Arrival Time","Burst Time","$P_1$","0","10","$P_2$","3","6","$P_3$","7","1","$P_4$","8","3","","","","","","","","","","","","","","",""),true,false)+
                "$$ $$The average turn around time of these processes is _________ milliseconds."
        ));
        explanation=getExplaination("");
        q= new Question(Q,"8.2","57",os,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following two-process synchronization solution." +
                        "$$ $$" +
                        getProgram("2016-2"+"/prog2016-2-qno-58.txt")+

                        "$$ $$" +
                        getProgram("2016-2"+"/prog2016-2-qno-58-1.txt")+
                        "$$ $$The shared variable turn is initialized to zero. " +
                        "Which one of the following is TRUE?$$ $$",
                "This is a correct two-process synchronization solution.",
                "This solution violates mutual exclusion requirement.",
                "This solution violates progress requirement.",
                "This solution violates bounded wait requirement."));
        explanation=getExplaination("");
        q= new Question(Q,"C","58",os,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider a non-negative counting semaphore $S.$ The operation $P(S)$ decrements $S,$ and $V(S)$\n" +
                "increments S. During an execution, 20 $P(S)$ operations and 12 $V(S)$ operations are issued in\n" +
                "some order. The largest initial value of $S$ for which at least one $P(S)$ operation will remain\n" +
                "blocked is ________ ."));
        explanation=getExplaination("");
        q= new Question(Q,"7.0 to 7.0","59",os,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("A file system uses an in-memory cache to cache disk blocks. The miss rate of the cache is\n" +
                "shown in the figure. The latency to read a block from the cache is 1 ms and to read a block\n" +
                "from the disk is 10 ms. Assume that the cost of checking whether a block exists in the cache\n" +
                "is negligible. Available cache sizes are in multiples of 10MB." +
                "$$ $$<img src='"+path+"qno-60.png'/>" +

                "$$ $$The smallest cache size required to ensure an average read latency of less than 6 ms is\n" +
                " ________ MB."));
        explanation=getExplaination("");
        q= new Question(Q,"30.0 to 30.0","60",os,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following database schedule with two transactions, $T_1$ and $T_2.$" +
                        "$$ $$ $S = r_2(X); r_1(X);$ $r_2(Y); w_1(X);$ $r_1(Y);$ $w_2(X);$ $a_1; a_2$" +
                        "$$ $$where $r_i(Z)$ denotes a read operation by transaction $T_i$ on avariable $Z,$ $w_i(Z)$ denotes a write\n" +
                        "operation by $T_i$ on a variable $Z$ and $a_i$ denotes an abort by transaction $T_i.$\n" +
                        "$$ $$Which one of the following statements about the above schedule is TRUE?",
                "S is non-recoverable",
                "S is recoverable, but has a cascading abort",
                "S does not have a cascading abort",
                "S is strict"));
        explanation=getExplaination("");
        q= new Question(Q,"C","61",dbms,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider the following database table named water_schemes :" +
                "$$ $$ water_schemes :" +
                MyTable(8, 3,getText(3,"scheme_no","district_name","capacity","1","Ajmer","20","1","Bikaner","10","2","Bikaner","10","3","Bikaner","20","1","Churu","10","2","Churu","20","1","Dungargarh","10","1","Dungargarh","10","","",""), true,false)+
                "$$ $$The number of tuples returned by the following SQL query is _______.$$ $$" +
                getProgram("2016-2"+"/prog2016-2-qno-62.txt")+
                ""));
        explanation=getExplaination("");
        q= new Question(Q,"2.0 to 2.0","62",dbms,marks, year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("A network has a data transmission bandwidth of $20 × 10^6$ bits per second. It uses CSMA/CD\n" +
                "in the MAC layer. The maximum signal propagation time from one node to another node is\n" +
                "40 microseconds. The minimum size of a frame in the network is  _______ bytes."));
        explanation=getExplaination("");
        q= new Question(Q,"200.0 to 200.0","63",cn,marks,year,explanation,"1");
        this.addQuestion(q);

        Q=getQuestion(getstring("For the IEEE 802.11 MAC protocol for wireless communication, which of the following\n" +
                        "statements is/are TRUE?" +
                        "$$ $$I. At least three non-over lapping channels are available for transmissions.\n" +
                        "$$ $$II. The RTS-CTS mechanism is used for collision detection.\n" +
                        "$$ $$III. Unicast frames are ACKed.",
                "All I,II,and III",
                "I and III only",
                "II and III only",
                "II only"));
        explanation=getExplaination("");
        q= new Question(Q,"B","64",cn,marks,year,explanation,"0");
        this.addQuestion(q);

        Q=getQuestion(getstring("Consider a $128 × 10^3$ bits/second satellite communication link with one way propagation delay\n" +
                "of 150 milliseconds. Selective retransmission (repeat) protocol is used on this link to send\n" +
                "data with a frame size of 1 kilobyte. Neglect the transmission time of acknowledgement. The\n" +
                "minimum number of bits required for the sequence number field to achieve 100% utilization\n" +
                "is _________."));
        explanation=getExplaination("");
        q= new Question(Q,"4.0 to 4.0","65",cn,marks, year,explanation,"1");
        this.addQuestion(q);


        //MessageClass.Message(context, "addQuestion is called");
        Log.e("Reach", "we are inside Dbhelper class in addQuestion method at ending");


    }


    public String MyCustomTable2011() {
        String s;


        s = "<TABLE border=\"1\" cellpadding=\"5\">\n" +
                "<TR><TH rowspan=\"2\" bgcolor=\"#5C97BF\">Test Case<TH colspan=\"3\" bgcolor=\"#5C97BF\">Input set<TH colspan=\"3\" bgcolor=\"#5C97BF\">Expected Output set\n" +
                "<TR><TH bgcolor=\"#5C97BF\">a<TH bgcolor=\"#5C97BF\">b<TH bgcolor=\"#5C97BF\">c<TH bgcolor=\"#5C97BF\">Root1<TH bgcolor=\"#5C97BF\">Root2<TH bgcolor=\"#5C97BF\">Return Value \n" +
                "<TR><TH >T1<TD>0.0<TD>0.0<TD>7.0 <TD>0.0<TD>0.0<TD>-1" +
                "<TR><TH >T2<TD>0.0<TD>1.0<TD>3.0 <TD>0.0<TD>0.0<TD>-1" +
                "<TR><TH >T3<TD>1.0<TD>2.0<TD>1.0 <TD>-1.0<TD>-1.0<TD>0" +
                "<TR><TH >T4<TD>4.0<TD>-12.0<TD>9.0 <TD>1.5<TD>1.5<TD>0" +
                "<TR><TH >T5<TD>1.0<TD>-2.0<TD>-3.0 <TD>3.0<TD>-1.0<TD>0" +
                "<TR><TH >T6<TD>1.0<TD>1.0<TD>4.0 <TD>0.0<TD>0.0<TD>-1" +

                "</TABLE>";
        return s;


    }


    public String MyCustomTable2015_3() {
        String s;


        s = "<TABLE border=\"1\" cellpadding=\"5\">\n" +
                "<TR><TH rowspan=\"2\" bgcolor=\"#5C97BF\">Time instance<TH colspan=\"2\" bgcolor=\"#5C97BF\">Transaction-id\n" +
                "<TR><TH bgcolor=\"#5C97BF\">T1<TH bgcolor=\"#5C97BF\">T2 \n" +
                "<TR><TH >1<TD>read(A)<TD>\n" +
                "<TR><TH >2<TD>write(A)<TD>" +
                "<TR><TH >3<TD><TD>read(C)" +
                "<TR><TH >4<TD><TD>write(C)" +
                "<TR><TH >5<TD><TD>read(B)" +
                "<TR><TH >6<TD><TD>write(B)" +
                "<TR><TH >7<TD><TD>read(A)" +
                "<TR><TH >8<TD><TD>commit" +
                "<TR><TH >9<TD>read(B)<TD>" +
                "</TABLE>";
        return s;


    }

    private  String [][] getLargeText(int column_no,String s1,String s2,String s3,String s4,String s5,String s6,String s7,
                                      String s8,String s9,String s10,String s11,String s12,String s13,
                                      String s14,String s15,String s16,String s17,String s18,String s19,String s20,String s21,
                                      String s22,String s23,String s24,String s25,String s26,String s27,String s28,String s29,String s30,
                                      String s31,String s32,String s33,String s34,String s35,String s36,
                                      String s37,String s38,String s39,String s40,String s41,String s42,String s43,String s44,String s45,
                                      String s46,String s47,
                                      String s48,String s49,String s50,String s51,String s52,String s53,String s54,String s55,String s56) {
        if (column_no == 6) {
            String[][] a = {{s1, s2, s3, s4, s5, s6}, {s7, s8, s9, s10, s11, s12}, {s13, s14, s15, s16, s17, s18}, {s19, s20, s21, s22, s23, s24}, {s25, s26, s27, s28, s29, s30}, {s31, s32, s33, s34, s35, s36}, {s37, s38, s39, s40, s41, s42}, {s43, s44, s45, s46, s47, s48}, {s49, s50, s51, s52, s53, s54}};

            return a;
        }
        if(column_no==7){
            String[][] a = {{s1, s2, s3, s4, s5, s6,s7}, {s8, s9, s10, s11, s12,s13, s14},{s15, s16, s17, s18,s19, s20, s21}, {s22, s23, s24,s25, s26, s27, s28}, {s29, s30,s31, s32, s33, s34, s35}, {s36,s37, s38, s39, s40, s41, s42}, {s43, s44, s45, s46, s47, s48,s49} };

            return a;
        }
        return null;
    }
    private String[][] getSmallText(int column_no,String s1,String s2,String s3,String s4,String s5,String s6){
        if(column_no==3){
            String [][] a={{s1,s2,s3},{s4,s5,s6}};
            return a;
        }
        return  null;
    }
    private String[][] getText(int column_no,String s1,String s2,String s3,String s4,String s5,String s6,String s7,
                               String s8,String s9,String s10,String s11,String s12,String s13,
                               String s14,String s15,String s16,String s17,String s18,String s19,String s20,String s21,
                               String s22,String s23,String s24,String s25,String s26,String s27,String s28,String s29,String s30){
        Log.d("test","we are start of inside my table");

        if(column_no==2){
            String[][] a={{s1,s2},{s3,s4},{s5,s6},{s7,s8},{s9,s10},{s11,s12},{s13,s14},{s15,s16},{s17,s18},{s19,s20},{s21,s22},{s23,s24}};
            return a;
        }else if(column_no==10){
            String[][] a={{s1,s2,s3,s4,s5,s6,s7,s8,s9,s10},{s11,s12,s13,s14,s15,s16,s17,s18,s19,s20},{s21,s22,s23,s24,s25,s26,s27,s28,s29,s30}};
            return  a;
        }
        else if(column_no==3){
            String [][] a={{s1,s2,s3},{s4,s5,s6},{s7,s8,s9},{s10,s11,s12},{s13,s14,s15},{s16,s17,s18},{s19,s20,s21},{s22,s23,s24},{s25,s26,s27},{s28,s29,s30}};
            return a;
        }
        else if(column_no==1){
            String [][] a={{s1},{s2},{s3},{s4},{s5},{s6},{s7},{s8},{s9},{s10},{s11},{s12},{s13},{s14},{s15},{s16},{s17},{s18},{s19},{s20},{s21},{s22},{s23},{s24},{s25},{s26},{s27},{s28},{s29},{s30}};
            return a;
        }
        else if(column_no==5){
            String [][] a={{s1,s2,s3,s4,s5},{s6,s7,s8,s9,s10},{s11,s12,s13,s14,s15},{s16,s17,s18,s19,s20},{s21,s22,s23,s24,s25},{s26,s27,s28,s29,s30}};
            return a;
        }
        else if(column_no==6){
            String [][] a={{s1,s2,s3,s4,s5,s6},{s7,s8,s9,s10,s11,s12},{s13,s14,s15,s16,s17,s18},{s19,s20,s21,s22,s23,s24},{s25,s26,s27,s28,s29,s30}};
            return a;
        }

        else if(column_no==4){
            String [][] a={{s1,s2,s3,s4},{s5,s6,s7,s8},{s9,s10,s11,s12},{s13,s14,s15,s16},{s17,s18,s19,s20},{s21,s22,s23,s24},{s25,s26,s27,s28}};
            return a;
        }

        return null;
    }





    //public String

    public String MyCustomTable2014_1(int Qno){
        String s;
        if(Qno==9) {

            s = "<TABLE border=\"1\" cellpadding=\"5\">\n" +
                    "<TR><TH rowspan=\"2\" bgcolor=\"#5C97BF\"><TH colspan=\"3\" bgcolor=\"#5C97BF\">Own vehicle\n" +
                    "    <TH rowspan=\"2\" bgcolor=\"#5C97BF\">Do not own vehicle\n" +
                    "<TR><TH bgcolor=\"#5C97BF\">Car<TH bgcolor=\"#5C97BF\">Scooter <TH bgcolor=\"#5C97BF\">Both \n" +
                    "<TR><TH bgcolor=\"#5C97BF\">Men<TD>40<TD>30<TD>60<TD>20\n" +
                    "<TR><TH bgcolor=\"#5C97BF\">Women<TD>34<TD>20<TD>46<TD>50\n" +
                    "</TABLE>";
            return s;
        }
        if(Qno==31){
            s = "<TABLE border=\"1\" cellpadding=\"5\">\n" +
                    "<TR><TH rowspan=\"2\" bgcolor=\"#5C97BF\"><TH colspan=\"3\" bgcolor=\"#5C97BF\">Allocation\n" +
                    "    <TH colspan=\"3\" bgcolor=\"#5C97BF\">Max\n" +
                    "<TR><TH bgcolor=\"#5C97BF\">X<TH bgcolor=\"#5C97BF\">Y<TH bgcolor=\"#5C97BF\">Z<TH bgcolor=\"#5C97BF\">X<TH bgcolor=\"#5C97BF\">Y<TH bgcolor=\"#5C97BF\">Z \n" +
                    "<TR><TH bgcolor=\"#5C97BF\">P0<TD>0<TD>0<TD>1<TD>8<TD>4<TD>3\n" +
                    "<TR><TH bgcolor=\"#5C97BF\">P1<TD>3<TD>2<TD>0<TD><TD>2<TD>0\n" +
                    "<TR><TH bgcolor=\"#5C97BF\">P2<TD>2<TD>1<TD>1<TD>3<TD>3<TD>3\n" +
                    "</TABLE>";
            return s;
        }
        return null;
    }

    private String getProgram(String pro) {

        BufferedReader br = null;
        StringBuffer sb = new StringBuffer();

        try {
            br = new BufferedReader(new InputStreamReader(context.getAssets().open(pro)));


            String line;
            while ((line = br.readLine()) != null)
                sb.append(line + "\n");
        } catch (Exception e) {

        }


        pro=sb.toString();
        String htmlCode = "<pre>" + pro + "</pre>";
        return htmlCode;


    }

    public String getExplaination(String s){
        String path = "file:///android_asset/mathscribe/";
        String js = "<!DOCTYPE html><head>" +
                "<style type=\"text/css\">\n" +
                "                    @font-face {\n" +
                "                       font-family: MyFont;\n" +
                "                       src: url(\'file:///android_asset/fonts/Regular.ttf')\n" +
                "                    }\n" +
                "                    body {\n" +
                "                        font-family: MyFont;\n" +
                "                        font-size: medium;\n" +
                "                    }\n" +
                "                 </style>\n"
                + "<link rel='stylesheet' href='" + path + "jqmath-0.4.3.css'>"
                + "<script src='" + path + "jquery-1.4.3.min.js'></script>"
                + "<script src='" + path + "jqmath-etc-0.4.3.min.js'></script>"
                + "</head><body>";
        js = js + s;
        js = js + "</script></body></html>";
        //+ "<script>var s = 'If $ax^2+bx+c=0$ with $a≠0$ then: $$ $$ $A. x={-b±√{b^2-4ac}}/{2a}$  $B. y-y_0=m(x-x_0)$     $$ $$     $C. ∫_\\Δd\\bo ω=∫_{∂\\Δ}\\bo ω$ $D. {1+√5}/2=1+1/{1+1/{1+⋯}}$';M.parseMath(s);document.write(s);</script></body>";

        return js;
    }

    public String getQuestion(String s) {
        String path = "file:///android_asset/mathscribe/";
        String js = "<!DOCTYPE html><head>" +
                "<style type=\"text/css\">\n" +
                "                    @font-face {\n" +
                "                       font-family: MyFont;\n" +
                "                       src: url(\'file:///android_asset/fonts/Regular.ttf')\n" +
                "                    }\n" +
                "                    body {\n" +
                "                        font-family: MyFont;\n" +
                "                        font-size: medium;\n" +
                "                    }\n" +
                "                 </style>\n"
                + "<link rel='stylesheet' href='" + path + "jqmath-0.4.3.css'>"
                + "<script src='" + path + "jquery-1.4.3.min.js'></script>"
                + "<script src='" + path + "jqmath-etc-0.4.3.min.js'></script>"
                + "</head><body>";
        js = js + s;
        js = js + "</script></body></html>";
        //+ "<script>var s = 'If $ax^2+bx+c=0$ with $a≠0$ then: $$ $$ $A. x={-b±√{b^2-4ac}}/{2a}$  $B. y-y_0=m(x-x_0)$     $$ $$     $C. ∫_\\Δd\\bo ω=∫_{∂\\Δ}\\bo ω$ $D. {1+√5}/2=1+1/{1+1/{1+⋯}}$';M.parseMath(s);document.write(s);</script></body>";

        return js;
    }


    public String[][] getTextForDoubleHeading(int column_no,String s1,String s2,String s3,String s4,String s5,String s6,String s7,
                                              String s8,String s9,String s10,String s11,String s12,String s13,
                                              String s14,String s15,String s16,String s17,String s18,String s19,String s20,String s21,
                                              String s22,String s23,String s24,String s25,String s26,String s27,String s28,String s29,String s30,
                                              String s31,String s32,String s33,String s34,String s35,String s36,
                                              String s37,String s38,String s39,String s40,String s41,String s42,String s43,String s44,String s45,
                                              String s46,String s47,
                                              String s48,String s49,String s50,String s51,String s52,String s53,String s54,String s55,String s56){
        if(column_no==7){
            String[][] a = {{s1, s2, s3, s4, s5, s6,s7}, {s8, s9, s10, s11, s12,s13, s14},{s15, s16, s17, s18,s19, s20, s21}, {s22, s23, s24,s25, s26, s27, s28},
                    {s29, s30,s31, s32, s33, s34, s35}, {s36,s37, s38, s39, s40, s41, s42}, {s43, s44, s45, s46, s47, s48,s49},{s50, s51, s52, s53, s54, s55,s56} };

            return a;
        }

        return null;
    }


    public String MyHeadingTable(int row_no,int Outer_column_no,int inner_Column,String[][] a) {
        String x;
        int i = 0, j = 0, k = 0;
        int column_No = 1;





        x ="<table border=1>";
        x = x + "<tr>";
        for (i = 1; i < Outer_column_no; i++,column_No++) {



            if (column_No == 1) {

                x = x + "<td><table border=1>";
                x = x + "<th colspan=\"4\" bgcolor=\"#5C97BF\">" + a[0][i] + "</th>";

                for (j = 1; j < row_no; j++) {
                    x = x + "<tr>";
                    for (int l = 0; l <= 3; l++) {

                        x = x + "<td>" + a[j][l] + "</td>";
                    }
                    x = x + "</tr>";


                }
                x = x + "</table></td>";
            } else if (column_No == 2) {

                x = x + "<td><table border=1>";
                x = x + "<th colspan=\"3\" bgcolor=\"#5C97BF\">" + a[0][i] + "</th>";
                for (j = 1; j < row_no; j++) {
                    x = x + "<tr>";
                    for (int l = 4; l < 7; l++) {

                        x = x + "<td >" + a[j][l] + "</td>";
                    }
                    x = x + "</tr>";


                }
                x = x + "</table></td>";
            }


        }
        x = x + "</table>";





        return x;
    }


    public String MyTable(int row_no, int column_no,String[][] a, boolean heading_top,boolean heading_left){
        Log.d("test","we are start of inside my table");
        String x;
        int i=0,j=0;

        x="<table border=1 cellpadding=\"5\">";

        if(heading_top) {
            j=1;
            x=x+"<tr>" ;
            for (i = 0; i < column_no; i++) {
                x = x + "<th bgcolor=\"#5C97BF\">" + a[0][i] + "</th>";

            }

            x = x + "</tr>";
        }
        for(i=j;i<row_no;i++){
            j=0;
            x=x+"<tr>";
            if(heading_left){
                x = x + "<td bgcolor=\"#5C97BF\">" + a[i][j] + "</td>";
                j++;
            }
            for(j=j;j<column_no;j++){

                x=x+"<td>"+a[i][j]+"</td>";
            }

            x=x+"</tr>";

        }
        x=x+"</table>";
        Log.d("test","we are end of inside my table");
        return x;
    }
    public String getstring(String q,String op1,String op2,String op3, String op4){
        String text;
        text=q+" $$ $$<B> A: </B>"+op1+" $$ $$<B> B: </B>"+op2+" $$ $$<B> C: </B>"+op3+" $$ $$<B> D: </B>"+op4+"";
        return text;
    }

    private String getstring(String q){
        return q;
    }
    /*
    //FOR iMAGE CONVER BITMAP TO BYTE
    public static byte[] getBytes(Bitmap bitmap) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.PNG, 0, stream);
        return stream.toByteArray();
    }
*/
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        // Drop older table if existed
        //MessageClass.Message(context,"onUpgrade is called");
        Log.e("Reach", "we are inside Dbhelper class in onUgrade method");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_QUEST);
        // Create tables again
        onCreate(db);
    }
    public void addQuestion(Question quest) {
        //SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        Log.d("Reach", "we are in_side of add question");
        //yha par hum question aur uske option ko is class ke varible me daal rhe hai
        //actually ek tarah ka assignment hai hum yha koi int ya string bhi daal sakte hai apne use ke hisab se
        //like int i; values.put(i,24); i ka table ki koi column hona jaroori hai.
        values.put(KEY_QUES, quest.getQUESTION());
        //Log.d("score", "Your score"+quest.getANSWER());
        values.put(KEY_ANSWER, quest.getANSWER());
        values.put(QUESTION_NO,quest.getQUESTION_NO());
        values.put(TOPIC,quest.getTOPIC());
        values.put(MARKS,quest.getMARKS());
        values.put(YEAR, quest.getYEAR());

        values.put(EXPLAINATION,quest.getExplanation());
        values.put(SUBJECTIVE,quest.getSubjective());
        // values.put(KEY_IMAGE, quest.getImage());
        // Inserting Row
        //yha par null ka matlab hai null column hack
        dbase.insert(TABLE_QUEST, null, values);
    }
    //hamare data base me saare question rahege hum getallquestions ke through abhi jitne
    //question display karana chate hai wo quest ke obj me set kar rhe hai
    //hum es class me where clause ka use karege select query me. es function me hum parameter pass karege
    //jo ki where clause ki condition hogi.
    public List<Question> getAllQuestions(String year1) {
        List<Question> quesList = new ArrayList<Question>();
        Log.d("Reach", "we are inside Dbhelper class in getAllquestion method");
        // getAll ke liye hum SQL lecture ka 17and 18 no ka video check kar sakte hai.
        //uske baad hum select query for our app.txt is text file ko check kar sakte hai
        //jo hame batayegi ki kaise do where condition ko ek saath write karna hai
        // String selectQuery = "SELECT  * FROM " + TABLE_QUEST+"where YEAR=\"2010";
        Log.d("Reach", "we are inside Dbhelper class in getAllquestion method before initilizing dbms");
        String [] columns={KEY_ID,KEY_QUES,KEY_ANSWER,YEAR,QUESTION_NO,TOPIC,MARKS,EXPLAINATION,SUBJECTIVE};


        //dbase=DbHelper.this.getReadableDatabase();
        Log.d("Reach", "we are inside getAllquestion method before cursor obj initilized Year is "+year1);
        Log.d("Reach", "we are inside Dbhelper class in getAllquestion method after initilizing dbms");
        String Where="YEAR='2010'";

        String selection =YEAR + " = ?";
        String[] selecton_arg={year1};

        // String selectQuery = "SELECT  * FROM " + TABLE_QUEST+" WHERE "+ YEAR  + " ="+year1;
        SQLiteDatabase db = this.getWritableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
        String sqlTables = "quest";
        qb.setTables(sqlTables);
        Cursor cursor;
        try{
            cursor = db.query(sqlTables,columns,"YEAR = ?",new String[] {year1},null,null,null,null);
            Log.d("Reach", "we are inside try method after cursor obj initilized ");

            if(cursor.moveToFirst()){
                Log.d("Reach", "we are inside if statement cursor.movetofirst");
                do {
                    Question quest = new Question();
                    quest.setID(cursor.getInt(0));
                    Log.d("Database", "The Id is " + cursor.getInt(0));
                    quest.setQUESTION(cursor.getString(1));
                    Log.d("Database", "The question is " + cursor.getString(1));
                    quest.setANSWER(cursor.getString(2));
                    Log.d("Database", "The Answer is " + cursor.getString(2));
                    quest.setQUESTION_NO(cursor.getString(4));
                    Log.d("Database", "The question Number is " + cursor.getString(4));
                    quest.setTOPIC(cursor.getString(5));
                    Log.d("Database", "The question topic is " + cursor.getString(5));
                    quest.setMARKS(cursor.getString(6));
                    Log.d("Database", "The question marks is " + cursor.getString(6));
                    quest.setYEAR(cursor.getString(3));
                    Log.d("Database", "The question year is " + cursor.getString(3));
                    quest.setExplanation(cursor.getString(7));
                    Log.d("Database", "The question explaination is " + cursor.getString(7));
                    quest.setSubjective(cursor.getString(8));
                    Log.d("Database", "The question subjective is " + cursor.getString(8));
                    //quest.setSubjective(cursor.);
                    quest.setRow_no(cursor.getCount());
                    quesList.add(quest);
                }while (cursor.moveToNext());

            }


        }catch (Throwable e){
            e.printStackTrace();
            Log.d("Reach", "we are inside catch block initilized Year is ");
        }


        Log.d("Reach", "we are inside getAllquestion method initilized Year is " + year1);
        Log.d("Reach", "That's cool job is done");
        // looping through all rows and adding to list

        // return quest list
        Log.d("Reach", "we are at end of getAllquestion method after cursor obj initilized ");
        return quesList;

    }

    public List<Question> getAllQuestions(String year1, String TopicName) {
        List<Question> quesList = new ArrayList<Question>();
        Log.d("Reach", "we are inside Dbhelper class in getAllquestion method");
        String [] columns={KEY_ID,KEY_QUES,KEY_ANSWER,YEAR,QUESTION_NO,TOPIC,MARKS,EXPLAINATION,SUBJECTIVE};
        String sqlTables = "quest";
        String Where="YEAR='2010'";

        String selection =YEAR + " = ?";
        String[] selecton_arg={year1,TopicName};

        String selectQuery = "SELECT  * FROM " + TABLE_QUEST+" WHERE "+ YEAR  + " ="+year1 +"%' **AND**"+ TOPIC + " ="+TopicName;
        SQLiteDatabase db = this.getWritableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        qb.setTables(sqlTables);
        Cursor cursor;
        try{
            cursor = db.query(sqlTables, columns, "YEAR = ? AND TOPIC = ?", new String[]{year1,TopicName}, null, null, null, null);
            Log.d("Reach", "we are inside try method after cursor obj initilized ");

            if(cursor.moveToFirst()){
                Log.d("Reach", "we are inside if statement cursor.movetofirst");
                do {
                    Question quest = new Question();
                    quest.setID(cursor.getInt(0));
                    quest.setQUESTION(cursor.getString(1));
                    Log.d("Reach", "The question is " + quest.getQUESTION());
                    quest.setANSWER(cursor.getString(2));
                    quest.setQUESTION_NO(cursor.getString(4));
                    Log.d("Database", "The question Number is " + cursor.getString(4));
                    quest.setTOPIC(cursor.getString(5));
                    Log.d("Database", "The question topic is " + cursor.getString(5));
                    quest.setMARKS(cursor.getString(6));
                    Log.d("Database", "The question marks is " + cursor.getString(6));
                    quest.setYEAR(cursor.getString(3));
                    Log.d("Database", "The question year is " + cursor.getString(3));
                    quest.setExplanation(cursor.getString(7));
                    quest.setSubjective(cursor.getString(8));
                    //quest.setSubjective(cursor.);
                    quest.setRow_no(cursor.getCount());
                    quesList.add(quest);
                }while (cursor.moveToNext());

            }


        }catch (Throwable e){
            e.printStackTrace();
            Log.d("Reach", "we are inside catch block initilized Year is ");
        }


        Log.d("Reach", "we are inside getAllquestion method initilized Year is "+year1);
        Log.d("Reach", "That's cool job is done");
        // looping through all rows and adding to list

        // return quest list
        Log.d("Reach", "we are at end of getAllquestion method after cursor obj initilized ");
        return quesList;

    }

    public int rowcount(String year1)
    {
        int row=0;
        String [] columns={KEY_ID,KEY_QUES,KEY_ANSWER,YEAR,QUESTION_NO,TOPIC,MARKS,EXPLAINATION,SUBJECTIVE};
        String sqlTables = "quest";
        // String selectQuery = "SELECT  * FROM " + TABLE_QUEST+" WHERE "+ YEAR  + " ="+year1;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor  cursor = db.query(sqlTables, columns, "YEAR = ?", new String[]{year1}, null, null, null, null);
        row=cursor.getCount();
        return row;
    }
    public int rowcount(String year1,String TopicName)
    {
        int row=0;
        String [] columns={KEY_ID,KEY_QUES,KEY_ANSWER,YEAR,QUESTION_NO,TOPIC,MARKS,EXPLAINATION,SUBJECTIVE};
        String sqlTables = "quest";
        // String selectQuery = "SELECT  * FROM " + TABLE_QUEST+" WHERE "+ YEAR  + " ="+year1;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor  cursor = db.query(sqlTables, columns, "YEAR = ? AND TOPIC = ?", new String[]{year1,TopicName}, null, null, null, null);
        row=cursor.getCount();
        return row;
    }


}
