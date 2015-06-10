package com.rson.brothers.gatecswithlecture;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.startapp.android.publish.StartAppAd;


/**
 * Created by Brother's on 6/20/2016.
 */
public class Video_Play extends YouTubeBaseActivity implements
        YouTubePlayer.OnInitializedListener {

    Config config =new Config();

    String[] Theory_of_Computation = {"Introduction to TOC and DFA", "Construction of minimal DFA and problem",
            "Construction of DFA and cross product of DFA","DFA and Problem", "DFA Construction",
            "DFA construction of binary no which is divisible by 2 and number system", "DFA of binary no which is divisible by 3 ",
            "DFA of binary no divisible by 4 ", "DFA of strings which starts with 'a'","DFA of strings which contains 'a'",
            "DFA of strings which ends with 'a'","Comparison between different DFAs","DFA of strings containing 'ab' as substring ",
            "DFA of strings which ends with 'ab'","DFA of strings which ends with 'ab'","DFA problem and concatenation of DFA",
            "DFA which accepts string starting and ending with different symbol","DFA which accepts string starting and ending with same symbol",
            "Complementation of DFA","DFA which accepts strings in which every 'a' is followed by 'b'"
            ,"DFA which accepts strings in which every 'a' is never followed by 'b'","DFA which accepts strings in which every 'a' is followed by 'bb'",
            "DFA which accepts strings in which every 'a' is never be followed by 'bb'","DFA which accepts strings  = { a^nb^m|n,m greater than or equal to 1 }",
            "DFA which accepts strings = { a^nb^m|n,m greater than or equal to 0 }","DFA which accepts strings = { a^nb^mc^l|n,m,l greater than or equal to 1 }",
            "DFA which accepts strings = { a^nb^mc^l|n,m,l greater than equal to 0 }","DFA which accepts strings = { a^nb^mc^l|n,m,l greater than equal to 0 }",
            "DFA which accepts strings such that 2nd symbol from LHS is 'a'","DFA which accepts strings of form a^3bwa^3, where 'w' is any string",
            "DFA Union , Concatenation, Cross product, Complementation, Reversal","Problems of DFA",
            "Introduction to NFA","Examples of NFA","Conversion of NFA to DFA","Conversion of NFA to DFA -2","Conversion of NFA to DFA-3",
            "Conversion of NFA to DFA-4","Examples to construct NFA","Complementation of NFA","Minimization of DFA -1",
            "Minimization of DFA -2","Minimization of DFA -3","Minimization of DFA -4","Minimization of DFA -5",
            "Moore Machine and mealy machine","Examples of Moore machine -1","Examples of Moore machine -2",
            "Examples of Moore machine -3","Examples of Moore machine -4","Examples of Mealy machine -1",
            "Examples of Mealy machine -2","Conversion of Moore machine to Mealy machine -1",
            "Conversion of Moore machine to Mealy machine -2","Conversion of Mealy machine to Moore machine -1",
            "Conversion of Mealy machine to Moore machine -2","Epsilon NFA and conversion of epsilon NFA to NFA",
            "Conversion of epsilon NFA to NFA","Families of languages","Introduction to regular language","Examples of Regular expressions",
            "Examples of Regular expressions and identities of RE","Conversion of Finite automata to Regular expression and vice versa",
            "Testing whether a language is regular or not","Examples of Regular languages","Chomskey Classification","Context free grammar",
            "PDA and Examples","Examples on Context free grammar","NPDA and Examples","Find the languages are regular or not",
            "More Lectures"};

    String[] Compiler_Design = {"Introduction and various phases of compiler", "Introduction to lexical analyser and Grammars",
            "Ambiguous grammars and making them unambiguous","Elimination of left recursion and left factoring the grammars",
            "Introduction to parsers and LL(1) parsing", "Examples on how to find first and follow in LL(1)",
            "Construction of LL(1) parsing table", "Recursive descent parser", "Operator grammar and Operator ",
            "LR parsing, LR(0) items and LR(0) parsing table ", "LR(0) parsing example and SLR(1) table","Example of LR(0) and SLR(1)",
            "Example of LR(0) and SLR(1)","CLR(1) and LALR(1) parsers","Conflicts and example of CLR(1) and LALR(1)",
            "Example of CLR(1) and LALR(1)","Syntax directed translation","Examples of SDT","S attributed and L attributed definitions ",
            "For more Videos"};

    String[] Computer_Network = {"Introduction to Computer Network and IP address ", "Types of Casting : Unicast , Limited Broadcast, Directed Broadcast ",
            "Subnet, Subnet Mask and Routing ","Variable length subnet masking ", "Subnet Masking question ",
            "Classless inter domain routing", "Subnetting in CIDR, VLSM in CIDR", "Some interesting problems on subnet mask",
            "Supernetting or aggregation ","Delays in CN ", "Flow control, Stop and wait","Capacity of pipe and pipelining ",
            "Go Back N ","Selective Repeat and comparison between all sliding window protocols",
            "Introduction to Access control methods, TDM and Polling ","CSMA/CD ","Back off algorithm for CSMA/CD ",
            "Token passing access control method ","Aloha and difference between flow and access control ",
            "Error control and CRC ","More Lectures "};

    String[] Computer_Network_problems = {"Computer Network Problem 1 ", "Computer Network Problem 2 ","Computer Network Problem 3 ",
            "Computer Network Problem 4 ","Computer Network Problem 5 ","Computer Network Problem 6 ","Computer Network Problem 7 ",
            "Computer Network Problem 8 ","Computer Network Problem 9 ","Computer Network Problem 10 ","Computer Network Problem 11 ",
            "Computer Network Problem 12 ","Computer Network Problem 13 ","Computer Network Problem 14 ","Computer Network Problem 15 ",
            "Computer Network Problem 16 ","Computer Network Problem 17 ","Computer Network Problem 18 ","Computer Network Problem 19 ",
            "Computer Network Problem 20 ","Computer Network Problem 21 ","Computer Network Problem 22 ","Computer Network Problem 23 ",
            "Computer Network Problem 24 ","Computer Network Problem 25 ","Computer Network Problem 26 ","Computer Network Problem 27 ",
            "Computer Network Problem 28 ","Computer Network Problem 29 ","Computer Network Problem 30 ","Computer Network Problem 31 ",
            "Computer Network Problem 32 ","Computer Network Problem 33 ","Computer Network Problem 34 ","Computer Network Problem 35 ",
            "Computer Network Problem 36 ","Computer Network Problem 37 ","Computer Network Problem 38 ","Computer Network Problem 39 ",
            "Computer Network Problem 40 ","Computer Network Problem 41 ","Computer Network Problem 42 ","Computer Network Problem 43 ",
            "Computer Network Problem 44 ","Computer Network Problem 45 ","Computer Network Problem 46 ","Computer Network Problem 47 ",
            "Computer Network Problem 48 ","Computer Network Problem 49 ","Computer Network Problem 50 ","Computer Network Problem 51 ",
            "Computer Network Problem 52 ","Computer Network Problem 53 ","Computer Network Problem 54 ","Computer Network Problem 55 ",
            "Computer Network Problem 56 ","Computer Network Problem 57 ","Computer Network Problem 58 ","Computer Network Problem 59 ",
            "Computer Network Problem 60 ","Computer Network Problem 61 ","Computer Network Problem 62 ","Computer Network Problem 63 ",
            "Computer Network Problem 64 ","Computer Network Problem 65 ","Computer Network Problem 66 ","Computer Network Problem 67 ",
            "Computer Network Problem 68 ","Computer Network Problem 69 ","Computer Network Problem 70 ","Computer Network Problem 71 ",
            "Computer Network Problem 72 ","Computer Network Problem 73 ","Computer Network Problem 74 ","Computer Network Problem 75 ",
            "Computer Network Problem 76 ","More Lectures "};

    String[] Algorithms_and_Data_Structure = {"Introduction to asymptotic notations", "Time complexity Analysis of iterative", "Time analysis of recursive program ",
            "comparing various functions to analyze time complexity ", "Masters theorem ",
            "Analyzing space complexity of iterative and recursive algorithms ", "Insertion sort algorithm and analysis ",
            "Merge sort algorithm, analysis and problems ", "Quick sort algorithm ","Analysis of quick sort and problems on it",
            "Introduction to heaps ","Max heapify algorithm and complete binary tree","Build max heap algorithm and analysis ",
            "Extract max, increase key and insert key into heap ","More Lectures "};

    String[] Operating_System = {"Introduction to OS", "Process, PCB and Attributes ", "Process States and Multiprogramming ",
            "Process State Transition Diagram and various Schedulers ", "Question on Process states ",
            "Various times related to process ", "CPU scheduling ", "FCFS(First Come First Serve)", "Convoy effect ","FCFS example ", "FCFS with overhead ",
            "SJF","Analysis of SJF","Round Robin Algorithm","SJF with prediction of BT","Round Robin example 1",
            "Round Robin example 2 ","Round Robin example 3 ","Round Robin example 4 ","Longest job first ","Longest remaining time first ",
            "Longest remaining time first Gate 2006 question ","Highest Response Ratio Next(HRRN) ",
            "Priority Scheduling ","Non preemptive priority scheduling","Pre-emptive priority scheduling ",
            "Pre-emptive priority with process contains CPU and IO time ","SRTF with process contains CPU and IO time example 1 ",
            "Multi level queues and multi level feedback queues ","SRTF with processes contains CPU and IO time example 2 ",
            "Example on SRTF Gate 2007","Smallest Remaining time first (SRTF)","Example on SRTF Gate 2011"
            ,"More Lectures"};

    String[] Database = {"Introduction to DBMS", "Database models ", "Introduction to ER model ",
            "Attributes", "Relationships 1: Many",
            "Relationships 1:1 ", "Relationships M:N examples ", "Recursive relationships ",
            "Attributes to relationships ","Weak entity", "Introduction to relational database","More Lectures"};

    String[] Computer_Organization = {"Introduction to cache memory ", "Direct mapping ", "Numericals on associative memory ",
            "Direct mapping problems 2", "Introduction to associative mapping ",
            "Problems on set associative mapping ", "Problems on set associative mapping -2 ", "Comparing all the mappings ",
            "More Lectures "};

    String[] Digital_logic = {"Basic properties of switching algebra ", "Switching expressions and simplifications ",
            "Demorgans law and simplification","Switching Function", "Canonical sum of Products",
            "Canonical Product of sums", "Examples of canonical forms", "Functional properties",
            "Number of functions","Counting the number of functions and neutral functions", "Venn diagram representation  ",
            "Contact representation","Nested function","NAND gate and properties","NOR gate and properties",
            "EX OR gate and properties","EX NOR gate and properties","Functionally completeness ",
            "Example 1 on functional completeness ","Example 2 on functional completeness ",
            "Example 3 on functional completeness ","Example 4 on functional completeness ",
            "Example 5 on functional completeness ","Example 6 on functional completeness ",
            "Self dual functions ","Number of self dual functions ","Self dual functions are closed under complementation "
            ,"Introduction to electronic gates ","Positive and negative logic systems ","Introduction to minimization of boolean expressions"
            ,"Irredundant or irreducible expressions ","K map introduction ","K map simplification ",
            "Examples on Kmap ","Covering functions ","Get More Lectures "};

    String[] Pemutation_and_combination = {"Introduction to permutations and combinations ", "Properties of nCr -1 ",
            "Properties of nCr -2 ","Properties of nCr -3 ", "Properties of nCr -4 ",
            "Example 1 on nCr", "Example 2 on nCr ", "Example 3 on nCr ", "Example 4 on nCr "};

    String[] Calculus = {"Introduction to limits", "Left hand limit and right hand limit to check if limit exists ",
            "Some example on finding whether limit exists or not "};

    String[] Linear_Algebra = {"Matrices Basic definitions", "Addition of Matrices ",
            "Scalar multiplication ","Matrix multiplication ","Properties of matrix multiplication 1"
            ,"Properties of matrix multiplication 2 ","Triangular, diagonal and scalar matrices ",
            "Matrices Example 1","Matrices Example 2","Matrices Example 3","Matrices Example 4",
            "Matrices Example 5","Matrices Example 6","Matrices Example 7","Idempotent matrices ",
            "Idempotent example 1 ","Idempotent example 2 ","Involutary matrices ","Nilpotent matrices ","Transpose of a matrix"
            ,"Symmetric and skew symmetric matrices ","Symmetric and skew symmetric matrices examples 1 ",
            "Symmetric and skew symmetric matrices examples 2 ","Symmetric and skew symmetric matrices examples 3 ",
            "Symmetric and skew symmetric matrices examples 4 ","Symmetric and skew symmetric matrices examples 5 ",
            "Hermitian and skew hermitian matrices ","Determinant, minor, co factor ",
            "Determinants of upper and lower triangular matrices ","Theorems on determinant part 1 ",
            "Theorems on determinant part 2 "};


    String[] NPTELTheory_of_Computation={"What is Theory of Computation","Introduction to finite automatan"
            ,"Finite Automata and deterministic finite automata (DFAs)","Regular languages and their closure porperties",
            "DFAs solve set membership problems in linear time, pumping lemma","More examples of nonregular languages, proof of pumping lemma",
            "A generalization of pumping lemma, nondeterministic finite automata (NFAs)","Fromal description of NFA and languge accepted by NFA, such languages are also regular",
            "Guess and verify paradigm for nondeterminism","NFA's with epsilon transitions","Regular expressions , they denot regular languages",
            "Construction of regular expression for a langurage given a DFA accepting it","Clouser Properties 2",
            "Closure under reversal , use of closure properties","Decision problems for regular languages",
            "About minimization of states of DFAs. Myhill Nerode theorem.","Continuation of proof of myhill-Nerode theorem",
            "Application of Myhill-Nerode theorem and DFA minimization","DFA minimization 2","Introduction to context free languages",
            "Languages generated by a cfg, leftmost derivation, more examples of cfgs and cfls","Parse trees, inductive proof that L is L(G). All regular languages are context free",
            "Towards Chomsky normal forms: elimination of useless symbols","Simplification of cfgs continued, Removal of epsilon productions",
            "Elimination of unit productions. Converting a cfg into Chomsky normal form","Pumping lemma for cfls. Adversarial paradigm"
            ,"Completion of pumping lemma proof","Closure properties continued, cfls not closed under complementation",
            "Another example of a cfl whose complement is not a cfl, Decision problems for cfls",
            "More decision problems. CYK algorithm for membership decision","Introduction to pushdown automata",
            "PDA configurations, acceptance notions for PDAs Transition diagrams for PDAs",
            "Equivalence of acceptance by empty stack and acceptance by final state","Turing machine:informal defination, example, transition diagram",
            "Execution trace, another example (unary to binary conversiion)","Example continued, finiteness of TM description",
            "Notion of non-acceptance or rejection of a string by a TM, Multitrack TM",
            "Simulation of multitape TMs by basic model NonDeterministic TM(NDTM)",
            "Counter machines and their equivalence to basic TM model","TMs can simulate computers, diagonalization proof",
            "Existence of Non-R.E. languages, recursive languages, notion of decidability",
            "Separation of recursive and Recursive Enumerable classes, halting problem and its udecidability"};


    String[] NPTELCompiler_Design={"Mod-01 Lec-01","Mod-01 Lec-02","Mod-01 Lec-03","Mod-01 Lec-04","Mod-01 Lec-05",
            "Mod-01 Lec-06","Mod-01 Lec-07","Mod-01 Lec-08","Mod-01 Lec-09","Mod-01 Lec-10",
            "Mod-01 Lec-11","Mod-01 Lec-12","Mod-01 Lec-13","Mod-01 Lec-14","Mod-01 Lec-15",
            "Mod-01 Lec-16","Mod-01 Lec-17","Mod-01 Lec-18","Mod-01 Lec-19","Mod-01 Lec-20",
            "Mod-01 Lec-21","Mod-01 Lec-22","Mod-01 Lec-23","Mod-01 Lec-24","Mod-01 Lec-25",
            "Mod-01 Lec-26","Mod-01 Lec-27","Mod-01 Lec-28","Mod-01 Lec-29","Mod-01 Lec-30"};

    String[] NPTELComputer_Network={"Goals and motivation","Uses of Networks","Network Components",
            "Socket","Traceroute","Protocol and layers","Reference Models","Internet History","Lecture Outline",
            "Physical layer overview","Media","Signals","Modulation","Limits","Data Link layer overview",
            "Framing","Error Overview","Error Detection","Error Correction","Overview of the data link layer",
            "Retransmissions","Multiplexing","Randomized multiple access","Wireless multiple access",
            "Congestion free multiple access","LAN switches","Switch Spanning tree","Network layer",
            "Network Services","Internetworking","IP prefixes","IP forwarding","ARP and DHCP",
            "Packet Fragmentation","IP Errors ICMP","IP version 6","Network Address Translation",
            "Routing Introduction","Shortest Path Routing","Dijkstra's Algorithms","Distance Vector Routing",
            "Flooding","Link State Routing","Equal cost multi path routing","Hosts and routers",
            "Hierarchical routing","Prefix Aggregation and subnets","Routing with multiple paties",
            "Border Gateway Protocal","Transport layer","User Datagram Protocal (UDP)","Connection Establishment",
            "Connection Release","Sliding window Protocol","Flow Control","Retransmission Timeouts",
            "Transmission control protocol (TCP)","Googles Optimization to Network protocol","Congestion Control",
            "Fairness of Allocations","Additive increase Multiplicative Decrease","History of TCP Congestion Control",
            "TCP ack clocking","TCP slow start","TCP fast retransmit/Fast recovery","Explicite Congestion Notificaion",
            "Application layer","DNS 1","DNS 2","HTTP Introduction","HTTP performance","HTTP caching and proxies",
            "Content Delivery Networks","Future of HTTP","Peer to peer Networks (BitTorrent)",
            "Quality of service Overview","Real time Transport","Streaming Media","Fair Queuing",
            "Traffic Shaping","Differentiated Servies","Rate and delay Guarantees","Network Security Overview",
            "Massage Confidentiality","Massage Authentication","Wireless Security","Web Security","DNS Security",
            "Firewalls","Virtual Private Networks (VPNs)","Distributed Denial of service","At Last"};







    String[] NPTELDatabase={"Introduction to Database management System","Conceptual Designs",
            "Conceptual Design 2","Relational Model","Relational Model 2","Structured Query Language 1",
            "Structured Query Language 2","ER Model to Relational Mapping","Functional Dependencies and Normal Forms",
            "ER Model to Relational Model Mapping","Strage Structures","Indexing Techniques Single Level",
            "Indexing Techniques Multi-Level","Constraints and Triggers","Query Processing and Optimization",
            "Query processing and optimization 2","Query processing and optimization 3","Transaction Processing Concepts",
            "Transaction processing and database manager","Foundation for Concurrency Control",
            "Concurrency Control 1","Concurrency Control 2","Concurrency Control 3","Concurrency Control 4",
            "Distributed Transaction Models","Basic 2-phase and 3-phase commit protocol","Concurrency Control for Distributed Transaction",
            "Introduction to Transaction Recovery","Recovery Mechanisms 2","Recovery Mechanisms 3",
            "Introduction to Data warehousing and OLAP","Introduction to Data Warehousing and OLAP 2",
            "Case Study : MYSQL","Case study ORACLE and Microsoft Access","Data Minimg and Knowledge Discovery",
            "Data Mining and Knowledge Discovery 2","Object Oriented Databases","Object Oriented Database 2",
            "XML Introductory Concepts","XML Advanced Concepts","XML Databases","Case Study - Database Design 1",
            "Case Study - Database Design 2"};


    String[] NPTELComputer_Organization={"Introduction to Computing","Introduction to System : Software",
    "Inroduction to System : Hardware","Processor Activities","Processor As a State Machine",
    "Data Path Architecture","Data Path Controller : Micro Programmed","State Machine Design",
    "Controller Design : Microprogrammed and Hardwired","Controller Design 2","Typical Micro Instructions",
    "Addressing Modes","Problem Exercise 1","Problem Exercise 2","Introduction to Memory System",
    "CPU - Memory interaction","Cache Organization","Cache Organization 2","Virtual Memory",
    "Virtual Memory 2","Performance Calculation","Segmentation","Address Translation and Protection",
    "Programmed I/O","Interrupt Driven I/O","DMA : Direct Memory Access","Device Service Routines",
    "Evolution of I/O","I/O Devices","I/O Devices 2","Buses","Buses 2","Pipeline Concept -1",
            "Pipeline Concept - 2","Pipeline Concept - 3","Pipeline CPU - 1","Pipeline CPU - 2",
            "Pipline CPU - 3","Conclusion"};



    String[] NPTELAlgorithms_and_Data_Structure={"Introduction to data structures and algorithms","Stacks",
            "Queues and Linked Lists","Dictionaries","Hashing","Trees","Tree Walks/Traversals",
            "Ordered Dictionaries","Deletion","Quick Sort","AVL Trees 1","AVL Trees 2","Trees","Red Black Trees",
            "Insertion in Red Black Trees","Disk Based Data Structures","Case Study: Searching for Patterns",
            "Tries","Data Compression","Priority Queues","Binary Heaps","Why Sorting","More Sorting",
            "Graphs","Data Structures for Graphs","Two Applications of Breadth first Search",
            "Depth first Search","Applicaion of DFS","DFS in Directed Graphs","Applications of DFS in Directed Graphs",
            "Minimum Spanning Trees","The Union","Prims Algorithm for minimum Spanning Trees",
            "Single Source Shortest Paths","Correctness of Dijkstras Algorithm","Single Source Shortest paths"};


    String[] NPTELOperating_System={"Introduction to Operating Systems","Process Management 1","Process Management 2",
            "Process Management 3","Concurrent Management 1","Concurrent Management 2","Critical Section Problem -1",
            "Critical Section Problem -2","Critical Section Problem -3","Dead Lock -1","Dead Lock -2","Dead Lock -3",
            "Dead Lock -4","Dead Lock -5","Memory Management -1","Memory Management -2","Memory Management -3",
            "Memory Management -4","Cache Memory - 1","Cache Memory - 2","Secondary Storage Memories",
            "Buffer Cache - 1","Buffer Cache - 2","File Representation - 1","File Representation - 2","File Representation - 3",
            "File System Architecture - 1","File System Architecture - 2","File System Architecture - 3",
            "Introduction to Distribution Systems","Conclusion"};

    String[] NPTELDiscrete_Maths={"Propositional Logic","Propositional Logic 2",
            "Predicates and Quantifiers","Predicates and quantifiers 2","Logical Inference",
            "Resolution Principles and Application to Prolog","Methods of Proof","Normal Forms",
            "Proving programs correct","Sets","Induction","Set Operations on Strings over and Alphabet",
            "Relations","Graphs","Graphs 2","Trees","Trees and Graphs","Special properties of Relations",
            "Closure of Relations","Closure of Relations 2","Order Relations","Order and Relations and Equivalence Relations",
            "Equivalence relations and partitions","Functions","Functions 2","Functions 3","Pigeonhole Principle",
            "Permutations and combinations","Permutations and combinations 2","Generating Functions 1",
            "Generating Functions 2","Recurrence Relations","Recurrence Relations 2","Recurrence Relations 3",
            "Algebras","Algebras 2","Algebras 3","Finite State Automaton 1","Finite State Automaton 2",
            "Lattices"};


    String[] NPTELDigital_logic={"Introduction to Digital Circuits","Introduction to Digital Circuits 2",
            "Combinational Logic Basics","Combinational Circuits","Logic Simplification","Karnaugh Maps and Implicants",
            "Logic Minimization using Karnaugh Maps","Karnaugh Map Minimization using Maxterms",
            "Code Converters","Parity Generator and Display Decoder","Arithmetic Circuits","Carry look ahead adders",
            "Subtractors","2's Complement Subtractor and BCD adder","Array Multiplier","Introduction to Sequential circuits",
            "S-R, J-K, and D Flip Flops","J-K and T Flip Flops","Triggering Mechanisms of Flip Flops and Counters",
            "UP/Down Counters","Shift Registers","Application of Shift Registers","State Machines",
            "Design of Synchronous Sequential circuits","Design Using J-K Flip Flop","Mealy and Moore Circuits",
            "Pattern Detector","MSI and LSI Based Design","Multiplexer Based Design","Encoder and Decoders",
            "Programmable Logic Devices","Design Using Programmable Logic Devices 1","Design Using Programmable Logic Devices 2",
            "MSI and LSI based Implementation of Sequential","MSI and LSI based Implementation of Sequential 2","Design of Circuits using MSI Sequential Blocks",
            "System Design Example 1","System Design Example 2","System Design Using the Concept of Controllers",
            "System Design Using the concept of Controllers"};


    String[] MotivationBuildUp={"Defeat EveryOne","Nothing is Impossible","Your Dream is Possible","Why Do We Fall",
            "Forget the past","Nothing will Stop Me","Prove Them worng","Be Phenomenal","A.P.J. Abdul Kalam's 10 Rule of Success",
            "How bad you want it","Struggle","Life Chainging Tip","Positive Thinking Muhammad Ali Tribute by Black Diary"};

    String[] MotivationHappyLife={"My philosophy for a happy life","Causeless Happiness by Sandeep Maheshwari",
            "Happiness by Vasant Chauhan","How to remain Happy and Positive in Life"};

    String [] TipsbyRavindraSir={"Indian Education System Expecially in Engineering has failed",
            "How to put in more hours in to GATE preparation","Take breaks in between","How to prepare for product based companies",
            "What is your reason ??","How to revise and remember the topics for long","At what age should we settle down??",
            "GATE CS syllabus, Marks distribution and recommended books","For the registered students-- How to use the videos for preparation",
            "Managing the environment","Good to Great","Time Management","Areas in Computer science","Computer Networks, GATE, Cisco",
            "How to get 1st Rank in GATE","About Algorithms","How to watch the videos","FAQ about GATE preperation","More Lectures"};

    String[] MotivationSandeep_Maheshwari={"Everything is possible","Story of Last Moments","LAST Life Changing",
            "How to Change Your Life From Negative to Positive","You Can do Everything","How to Control your mind",
            "How to Conquer Yourself","Absolute Freedom","How to learn from everyone","How to achieve success in life",
            "Courage for Students","Guaranteed Success","Choose Your own way","How to increase your Intelligence",
            "Miracles","Power of your desire","How to create your own Destiny","Power of Focus",
            "OverComming your Fear and Anger","Laugh At Yourself","Realistic Positive thinking",
            "Gurranteed Success 2","Power of Your Belief","The Unstoppable","From Illusion to Reality"};

    String[] MotivationVasant_Chauhan={"Battel with my Mind","Bitter truth","Motivational Connection",
            "Success Key","Monkey","Boring Life","Mahashay Dharampal","How to remain Consistent",
            "Dreams and reality","Death","Don't waste your Time","Dil ki suno","Negative thaughts",
            "Sacrifice","Rise up","How to Deal with Negative People","kaash ye Baat pehle pata hoti",
            "Sapna Toota","Problems Problems Problems","Enjoy Every Moment","ONE","Apni life apni marzi se apne liye",
            "The Real Hero","How to find your Inner Strength and power","Be like a Child",
            "How to find your Passion","Mental","Never Give Up","How to stay Emotionally fit",
            "Superfast Goal Achievement","Tips for Dealing with Nervousness","I am the Best",
            "My Life MY Rules","Time Management","Don't worry be Happy","Wash your Brain",
            "Change Your Life","How to Concentrate on Studies","How to Improve Presence of Mind",
            "Real Truth","Why Average students become successful","Ladki patane walon ke liye special video",
            "Interview Question and answers tips","How to change Your Bad Habits","How to be Confident",
            "How to Handle Break Up","How to Change Your thoughts","Be Mad"};

    String[] shiv_khera_motivational={"Shiv khera motivation First Part","Shiv khera motivation Second Part","Winner see the gain but Loosers see the pain",
            "Story of Michael Phelps"};


    String[] MathsSolution={"GATE Question paper full Solution (1994 to 2013) (Linear algebra)",
            "GATE Question paper with full Solution (1994 to 2015) (Vector Calculus)"
            ,"GATE Paper Solving Session for Maths and General Aptitude"
    };


    private YouTubePlayerView youTubeView;
    Typeface fontstyle;

    TextView PlayingVideoname;
    private StartAppAd startAppAd = new StartAppAd(this);
    private static final int RECOVERY_DIALOG_REQUEST = 1;

    InterstitialAd mInterstitialAd;

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
       // Chartboost.startWithAppId(this, "576cca22f6cd455584144959", "896a49557cf4ef953a1b24a4c9960e045e1977c0");
        //Chartboost.onCreate(this);
        setContentView(R.layout.video_play);
        //StartAppSDK.init(this, "104130031", "204644773", true);


        setContentView(R.layout.video_play);



        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);

        // Initializing video player with developer key
        //youTubeView.initialize(Config.DEVELOPER_KEY, this);

         //Initializing video player with developer key
        youTubeView.initialize(Config.DEVELOPER_KEY, this);

        PlayingVideoname= (TextView) findViewById(R.id.videoName);

        ListView l;
        l = (ListView) findViewById(R.id.listView3);
        //ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Topic, android.R.layout.simple_list_item_1);
        // l.setAdapter(adapter);
        //l.setOnItemClickListener(this);
        fontstyle= Typeface.createFromAsset(this.getAssets(), "Regular.ttf");
        PlayingVideoname.setTypeface(fontstyle);
        if(config.getLectureTeacher()==1){
            if(config.getSubject()==0){
                l.setAdapter(new CustomAdapter(Video_Play.this,Theory_of_Computation));

                PlayingVideoname.setText(Theory_of_Computation[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==1){

                l.setAdapter(new CustomAdapter(Video_Play.this,Compiler_Design));
                PlayingVideoname.setText(Compiler_Design[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==2){

                l.setAdapter(new CustomAdapter(Video_Play.this,Computer_Network));
                PlayingVideoname.setText(Computer_Network[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==3){

                l.setAdapter(new CustomAdapter(Video_Play.this,Computer_Network_problems));
                PlayingVideoname.setText(Computer_Network_problems[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==4){

                l.setAdapter(new CustomAdapter(Video_Play.this,Algorithms_and_Data_Structure));
                PlayingVideoname.setText(Algorithms_and_Data_Structure[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==5){

                l.setAdapter(new CustomAdapter(Video_Play.this,Operating_System));
                PlayingVideoname.setText(Operating_System[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==6){

                l.setAdapter(new CustomAdapter(Video_Play.this,Database));
                PlayingVideoname.setText(Database[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==7){

                l.setAdapter(new CustomAdapter(Video_Play.this,Computer_Organization));
                PlayingVideoname.setText(Computer_Organization[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==8){

                l.setAdapter(new CustomAdapter(Video_Play.this,Digital_logic));
                PlayingVideoname.setText(Digital_logic[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==9){

                l.setAdapter(new CustomAdapter(Video_Play.this,Pemutation_and_combination));
                PlayingVideoname.setText(Pemutation_and_combination[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==10){

                l.setAdapter(new CustomAdapter(Video_Play.this,Calculus));
                PlayingVideoname.setText(Calculus[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==11){

                l.setAdapter(new CustomAdapter(Video_Play.this,Linear_Algebra));
                PlayingVideoname.setText(Linear_Algebra[config.getSubjectLectureNo()]);
            }
        }


        else if((config.getLectureTeacher()==2)){


            if(config.getSubject()==0){
                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELTheory_of_Computation));

                PlayingVideoname.setText(NPTELTheory_of_Computation[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==1){

                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELCompiler_Design));
                PlayingVideoname.setText(NPTELCompiler_Design[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==2){

                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELComputer_Network));
                PlayingVideoname.setText(NPTELComputer_Network[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==3){

                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELAlgorithms_and_Data_Structure));
                PlayingVideoname.setText(NPTELAlgorithms_and_Data_Structure[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==4){
                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELOperating_System));
                PlayingVideoname.setText(NPTELOperating_System[config.getSubjectLectureNo()]);

            }
            else if(config.getSubject()==5){
                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELDatabase));
                PlayingVideoname.setText(NPTELDatabase[config.getSubjectLectureNo()]);

            }
            else if(config.getSubject()==6){

                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELComputer_Organization));
                PlayingVideoname.setText(NPTELComputer_Organization[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==7){

                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELDigital_logic));
                PlayingVideoname.setText(NPTELDigital_logic[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==8){

                l.setAdapter(new CustomAdapter(Video_Play.this,NPTELDiscrete_Maths));
                PlayingVideoname.setText(NPTELDiscrete_Maths[config.getSubjectLectureNo()]);
            }

        }
        else if ((config.getLectureTeacher() == 3)) {
            if(config.getSubject()==0){
                l.setAdapter(new CustomAdapter(Video_Play.this,MotivationBuildUp));
                PlayingVideoname.setText(MotivationBuildUp[config.getSubjectLectureNo()]);

            }
            else if(config.getSubject()==1){
                l.setAdapter(new CustomAdapter(Video_Play.this,MotivationHappyLife));
                PlayingVideoname.setText(MotivationHappyLife[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==2){
                l.setAdapter(new CustomAdapter(Video_Play.this,TipsbyRavindraSir));
                PlayingVideoname.setText(TipsbyRavindraSir[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==3){
                l.setAdapter(new CustomAdapter(Video_Play.this,MotivationSandeep_Maheshwari));
                PlayingVideoname.setText(MotivationSandeep_Maheshwari[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==4){
                l.setAdapter(new CustomAdapter(Video_Play.this,shiv_khera_motivational));
                PlayingVideoname.setText(shiv_khera_motivational[config.getSubjectLectureNo()]);
            }
            else if(config.getSubject()==5){
                l.setAdapter(new CustomAdapter(Video_Play.this,MotivationVasant_Chauhan));
                PlayingVideoname.setText(MotivationVasant_Chauhan[config.getSubjectLectureNo()]);
            }
        }
        else if ((config.getLectureTeacher() == 4)) {
            if(config.getSubject()==0){
                l.setAdapter(new CustomAdapter(Video_Play.this,MathsSolution));
                PlayingVideoname.setText(MathsSolution[config.getSubjectLectureNo()]);

            }

        }

        //Chartboost.setLoggingLevel(CBLogging.Level.ALL);





        //InMobiSdk.init(Video_Play.this, "fd5ea81d0e034b6cbc681b2f551461b9");



       // StartAppSDK.init(this, "104130031", "204644773", true);
        //startAppAd.onBackPressed();

        mInterstitialAd = new InterstitialAd(this);
        //set the ad unit ID
        mInterstitialAd.setAdUnitId(getString(R.string.interstrial_during_video_play));

        AdRequest Request = new AdRequest.Builder().build();

        // Load ads into Interstitial Ads
        mInterstitialAd.loadAd(Request);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });


        //Chartboost.cacheInterstitial(CBLocation.LOCATION_DEFAULT);
       // Chartboost.showInterstitial(CBLocation.LOCATION_DEFAULT);

    }


   private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        //Chartboost.onStart(this);
    }

    @Override
    public void onResume() {
        super.onResume();

        //Chartboost.onResume(this);
    }

    @Override
    public void onPause() {
        super.onPause();
       // Chartboost.onPause(this);
    }

    @Override
    public void onStop() {
        super.onStop();
        //Chartboost.onStop(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        //Chartboost.onDestroy(this);
    }

    @Override
    public void onBackPressed() {
        // If an interstitial is on screen, close it.
        startAppAd.onBackPressed();
            super.onBackPressed();
    }

  /*  @Override
    public void onBackPressed() {
        //showInterstitial();
      //  startAppAd.onBackPressed();
        super.onBackPressed();
    }*/

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider,
                                        YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {

            // loadVideo() will auto play video
            // Use cueVideo() method, if you don't want to play it automatically
            player.loadVideo(Config.ReturnVideoPlay());

            // Hiding player controls
            player.setPlayerStyle(YouTubePlayer.PlayerStyle.DEFAULT);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider,
                                        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
            String errorMessage = String.format(
                    "There was an error initializing the YouTubePlayer", errorReason.toString());
            Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_DIALOG_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.DEVELOPER_KEY, this);
        }
    }

    private YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView) findViewById(R.id.youtube_view);
    }


    public class CustomAdapter extends BaseAdapter {
        String [] result;
        Context context;

        private LayoutInflater inflater=null;

        public CustomAdapter(Context mainActivity, String[] YearList) {
            // TODO Auto-generated constructor stub
            result=YearList;
            context=mainActivity;

            inflater = ( LayoutInflater )context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        @Override
        public int getCount() {
            // TODO Auto-generated method stub
            return result.length;
        }

        @Override
        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        @Override
        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public class Holder
        {
            ImageView starimage;
            TextView tv;

        }
        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub


            boolean r=false;
            if(position%2==0){
                Log.d("Star","2 star is initilized");
                r=true;
            }


            Holder holder=new Holder();
            View rowView;
            rowView = inflater.inflate(R.layout.lecturerow, null);
            holder.tv=(TextView) rowView.findViewById(R.id.listItems);
            holder.starimage= (ImageView) rowView.findViewById(R.id.starImage);
            RatingClass ratingClass=new RatingClass();

            if(config.getLectureTeacher()==1){

                holder.starimage.setImageResource(R.drawable.lecturestar3);

            }
            else if(config.getLectureTeacher()==2){

                int rate=ratingClass.ReturnRating(config.getSubject(),position);
                Log.d("Rating","Rating of lecutre no :"+config.getSubjectLectureNo()+"Rating is :"+rate);
                if(rate==1){
                    holder.starimage.setImageResource(R.drawable.lecturestar1);
                }
                else if(rate==2){
                    holder.starimage.setImageResource(R.drawable.lecturestar2);
                }
                else{
                    holder.starimage.setImageResource(R.drawable.lecturestar3);
                }
            }else if(config.getLectureTeacher()==3){
                holder.starimage.setImageResource(R.drawable.lecturestar3);
            }

            holder.tv.setTypeface(fontstyle);
            holder.tv.setText(result[position]);

            rowView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // TODO Auto-generated method stub
                    if(position>=0){


                        config.setSubjectLectureNo(position);

                        Intent intent = getIntent();
                        finish();
                        startActivity(intent);

                        //Toast.makeText(Video_Play.this,"Hai you have clicked at position of"+position,Toast.LENGTH_SHORT).show();


                    }

                }
            });
            return rowView;
        }

    }


}
