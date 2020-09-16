package com.algobty.educare.question;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.algobty.educare.question.QuizContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "Quiz.db";
    private static final int DATABASE_VERSION = 9;

    private SQLiteDatabase db;

    public QuizDbHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionTable.TABLE_NAME + " ( " +
                QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionTable.COLUMN_GRADE + " INTEGER, " +
                QuestionTable.COLUMN_QUARTER + " INTEGER, " +
                QuestionTable.COLUMN_SUBJECT + " INTEGER, " +
                QuestionTable.COLUMN_QUESTIONS + " TEXT, " +
                QuestionTable.COLUMN_OPTION_A + " TEXT, " +
                QuestionTable.COLUMN_OPTION_B + " TEXT, " +
                QuestionTable.COLUMN_OPTION_C + " TEXT, " +
                QuestionTable.COLUMN_OPTION_D + " TEXT, " +
                QuestionTable.COLUMN_CORRECT_ANS + " INTEGER" +
                " ) ";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionTable.TABLE_NAME);
        onCreate(db);
    }

    private void fillQuestionsTable() {

        //FIRST QUARTER
        //GRADE 9 FIRST START

        //English 9

        Question q1 = new Question(
                9,
                1,
                9,
                "Who sighs like a furnace in the poem the Seven Ages of Man?",
                "A. Infant",
                "B. Lover",
                "C. Middle Aged",
                "D. Young Man",
                2);
        addQuestion(q1);

        Question q2 = new Question(
                9,
                1,
                9,
                "It is a part of what makes poetry musical. One two or more phrases or words that end in the same sounds.",
                "A. Rhyme",
                "B. Meter",
                "C. Rhythm",
                "D. Sound",
                1);
        addQuestion(q2);

        Question q3 = new Question(
                9,
                1,
                9,
                "It is poetry with an unrhymed iambic pentameter liner.",
                "A. Free Verse",
                "B. Blank Verse",
                "C. Narrative Poetry",
                "D. Pastoral Poetry",
                2);
        addQuestion(q3);

        Question q4 = new Question(
                9,
                1,
                9,
                "What are the two types of rhyme in the poem.",
                "A. Assonant and Consonant rhyme",
                "B. Dactylic and Eye rhyme",
                "C. End rhyme and Internal rhyme",
                "D. Imperfect and Slant rhyme",
                3);
        addQuestion(q4);

        Question q5 = new Question(
                9,
                1,
                9,
                "It is a sound device used by poets to suggest actions, movements, and meanings.",
                "A. Onomatopoeia",
                "B. Alliteration",
                "C. Assonance",
                "D. Consonance",
                1);
        addQuestion(q5);

        Question q6 = new Question(
                9,
                1,
                9,
                "It is the repetition of constant sounds at the beginning of the words.",
                "A. Onomatopoeia",
                "B. Alliteration",
                "C. Assonance",
                "D. Imagery",
                2);
        addQuestion(q6);

        Question q7 = new Question(
                9,
                1,
                9,
                "It is the repetition of vowel sounds within words",
                "A. Onomatopoeia",
                "Alliteration",
                "Assonance",
                "Imagery",
                3);
        addQuestion(q7);

        Question q8 = new Question(
                9,
                1,
                9,
                "What is the mood of the Seven Ages of Man",
                "A. Mild",
                "B. Calm",
                "C. Bitter",
                "D. Sad",
                3);
        addQuestion(q8);

        Question q9 = new Question(
                9,
                1,
                9,
                "It is a formal type of poetry which expresses personal emotions or feelings, typically spoken in the first person.",
                "A. Sonnet",
                "B. Lyric",
                "C. Narrative",
                "D. Epic",
                2);
        addQuestion(q9);

        Question q10 = new Question(
                9,
                1,
                9,
                "It is a long poem that typically detail extraordinary feats and adventures of characters from a distant past such as heroes and warriors",
                "A. Sonnet",
                "B. Lyric",
                "C. Narrative",
                "D. Epic",
                4);
        addQuestion(q10);

        Question q11 = new Question(
                9,
                1,
                9,
                "What do we use to help us find the sensible meaning of what we're reading?",
                "A. Dictionary",
                "B. Thesaurus",
                "C. Punctuation Marks",
                "D. Google",
                3);
        addQuestion(q11);

        Question q12 = new Question(
                9,
                1,
                9,
                "What year did the indented paragraph appeared, as did the comma and period as we know them?",
                "A. A.D 1500",
                "B. 17th Century",
                "C. 450 BCE",
                "D. 388 BCE",
                2);
        addQuestion(q12);

        Question q13 = new Question(
                9,
                1,
                9,
                "Presenting ideas and information from the author or speaker in your own words and acknowledging where they come from.",
                "A. Speech",
                "B. Plagiarizing",
                "C. Paraphrasing",
                "D. Summarizing",
                3);
        addQuestion(q13);

        Question q14 = new Question(
                9,
                1,
                9,
                "Used to emphasize ke facts or points",
                "A. Elaborating",
                "B. Summarizing",
                "C. Quoting",
                "D. Paraphrasing",
                2);
        addQuestion(q14);

        Question q15 = new Question(
                9,
                1,
                9,
                "Taking the exact words from an original source.",
                "A. Quoting",
                "B. Plagiarizing",
                "C. Copying",
                "D. Paraphrasing",
                1);
        addQuestion(q15);

        Question q16 = new Question(
                9,
                1,
                9,
                "What did the epic poem \"Beowulf\" deals with?",
                "A. War and Adventure",
                "B. War and Love",
                "C. Love and Adventure",
                "D. Adventure and Peace",
                1);
        addQuestion(q16);

        Question q17 = new Question(
                9,
                1,
                9,
                "\"Grendel to gnaw the broken bones of his last human supper.\" What does gnaw mean?",
                "A. bite and nibble",
                "B. break",
                "C. pick",
                "D. kick",
                1);
        addQuestion(q17);

        Question q18 = new Question(
                9,
                1,
                9,
                "_____ is feared by all in Heorot but Beowulf",
                "A. Hrothgar",
                "B. Grendel",
                "C. Hansel",
                "D. Wiglaf",
                2);
        addQuestion(q18);

        Question q19 = new Question(
                9,
                1,
                9,
                "Who is the ruler of Danes and is troubled by the rampage of a demon named Grendel?",
                "A. Hrothgar",
                "B. Grendel",
                "C. Grendel's Mom",
                "D. Hansel",
                1);
        addQuestion(q19);

        Question q20 = new Question(
                9,
                1,
                9,
                "A personal type of writing where words can flow and carry you along the realms of beautiful thought.",
                "A. Poetry",
                "B. Essay",
                "C. Narrative",
                "D. Fiction",
                1);
        addQuestion(q20);

        //ICT 9
        Question q21 = new Question(
                9,
                1,
                6,
                "The _____ is the panel at the top portion of the document. It has seven tabs which are Home, Insert, Design, Animations, Slide, Show, Review, View.",
                "A. Commands",
                "B. Tools",
                "C. Table Tools",
                "D. Ribbon",
                4);
        addQuestion(q21);

        Question q22 = new Question(
                9,
                1,
                6,
                "A _____ is a graphical control element in the form of a set of toolbars placed on a several tabs.",
                "A. Commands",
                "B. Tools",
                "C. Table tools",
                "D. Ribbon",
                4);
        addQuestion(q22);

        Question q23 = new Question(
                9,
                1,
                6,
                "This Home tab displays the related commands which are grouped as?",
                "A. insert, animations",
                "B. Clipboard, slides font, paragraph drawing, editing",
                "C. image, illustrations, links",
                "D. start slide show, set up and monitor",
                2);
        addQuestion(q23);

        Question q24 = new Question(
                9,
                1,
                6,
                "Inserts a Smart Art graphics to visually communicate information",
                "A. Smart Art",
                "B. Chart",
                "C. Action",
                "D. Shapes",
                1);
        addQuestion(q24);

        Question q25 = new Question(
                9,
                1,
                6,
                "Insert a characters that are not on your keyboard.",
                "A. Characters",
                "B. Hyperlink",
                "C. Insert Character",
                "D. Symbol",
                4);
        addQuestion(q25);

        Question q26 = new Question(
                9,
                1,
                6,
                "Hide the background graphics included in the themes you have selected.",
                "A. Hide",
                "B. Background Graphics",
                "C. Hide background graphics",
                "D. Hide Themes",
                3);
        addQuestion(q26);

        Question q27 = new Question(
                9,
                1,
                6,
                "Sets a special start condition for an animation.",
                "A. Trigger",
                "B. Animation pane",
                "C. Special animation",
                "D. Animations",
                1);
        addQuestion(q27);

        Question q28 = new Question(
                9,
                1,
                6,
                "Change to a variation of the selected transition.",
                "A. Variation effect",
                "B. Transition",
                "C. Selection",
                "D. Change",
                2);
        addQuestion(q28);

        Question q29 = new Question(
                9,
                1,
                6,
                "Launch a full screen presentation wherein you can rehearse your presentation",
                "A. Rehearse Timings",
                "B. Preview",
                "C. Resolutions",
                "D. Presenter View",
                1);
        addQuestion(q29);

        Question q30 = new Question(
                9,
                1,
                6,
                "The _____ tab displays the related commands which are grouped as Proofing, Language, Comments and Compare.",
                "A. References",
                "B. Review",
                "C. Preview",
                "D. View",
                2);
        addQuestion(q30);

        Question q31 = new Question(
                9,
                1,
                6,
                "This Slide Show Tab displays the related commands which are grouped as?",
                "A. insert, animations",
                "B. Clipboard, slides font, paragraph drawing, editing",
                "C. image, illustrations, links slide show, design text, symbol, media",
                "D. start slid show, set up and monitor",
                4);
        addQuestion(q31);

        Question q32 = new Question(
                9,
                1,
                6,
                "_____ contains frequently used commands. You can display or hide the icons.",
                "A. Quick access toolbar",
                "B. Access tools",
                "C. Toolbars",
                "D. Commands",
                1);
        addQuestion(q32);

        Question q33 = new Question(
                9,
                1,
                6,
                "Changes the design and layout of printed handouts.",
                "A. Master Views",
                "B. Handout Master",
                "C. Slide Master",
                "D. Design and Layout",
                3);
        addQuestion(q33);

        Question q34 = new Question(
                9,
                1,
                6,
                "You can use the _____ and _____ to format text without going to the Home tab.",
                "A. Toolbar and Menu",
                "B. Context Menu and Review Bar",
                "C. Ribbon",
                "D. Mini toolbar and Context menu",
                4);
        addQuestion(q34);

        Question q35 = new Question(
                9,
                1,
                6,
                "Shows the presentation in full screen",
                "A. Normal View",
                "B. Reading View",
                "C. Slide Sorter",
                "D. Slide Show",
                2);
        addQuestion(q35);

        Question q36 = new Question(
                9,
                1,
                6,
                "You can't customize the Ribbon to add tabs, groups of commands that you will use often?",
                "A. True",
                "B. I don't know",
                "C. False",
                "D. None of the above",
                3);
        addQuestion(q36);

        Question q37 = new Question(
                9,
                1,
                6,
                "A new _____ is launched every time you open Microsoft PowerPoint",
                "A. Tab",
                "B. Presentation",
                "C. Window",
                "D. File",
                2);
        addQuestion(q37);

        Question q38 = new Question(
                9,
                1,
                6,
                "There are 3 kinds of views in the View Button located at the lower portion of the window. These are _____, _____, _____?",
                "A. View, Review, Preview",
                "B. Outline view, Thumbnail view, View",
                "C. Normal View, Sorter, Slide",
                "D. Minimize, Scroll bar, Print Preview",
                3);
        addQuestion(q38);

        Question q39 = new Question(
                9,
                1,
                6,
                "Reduces the presentation to a button size icon at the buttom of the window.",
                "A. Maximize",
                "B. Reduce",
                "C. Size Reduce",
                "D. Minimize",
                4);
        addQuestion(q39);

        Question q40 = new Question(
                9,
                1,
                6,
                "Show the presentation in a reduced view that allows you to move the worksheet by clicking and dragging the pointer and resize the worksheet by dragging the resizing arrows.",
                "A. Restore",
                "B. Restore View",
                "C. Reduced View",
                "D. Resize",
                1);
        addQuestion(q40);

        //SCIENCE 9
        Question q41 = new Question(
                9,
                1,
                2,
                "Pumps blood throughout the body",
                "A. Brain",
                "B. Heart",
                "C. Lungs",
                "D. Veins",
                2);
        addQuestion(q41);

        Question q42 = new Question(
                9,
                1,
                2,
                "A condition in which a body is lacking of healthy red blood cells caused by the lower amounts of a certain vitamins which includes vitamin B12 or folic acid.",
                "A. Iron-Deficiency Anemia",
                "B. Leukemia",
                "C. Hypertension",
                "D. Vitamin Deficiency Anemia",
                4);
        addQuestion(q42);

        Question q43 = new Question(
                9,
                1,
                2,
                "Identify the list of how to prevent circulatory disorder.",
                "A. Avoid smoking and Eat sweet foods",
                "B. Eat sweet foods and Live in a filthy environment",
                "C. Avoid smoking and Have a positive outlook in life",
                "D. Avoid smoking, Eat sweet foods and Have a positive outlook in life",
                3);
        addQuestion(q43);

        Question q44 = new Question(
                9,
                1,
                2,
                "Airsacs that allow gas exchange in the lungs",
                "A. Bronchi",
                "B. Trachea",
                "C. Heart",
                "D. Alveoli",
                4);
        addQuestion(q44);

        Question q45 = new Question(
                9,
                1,
                2,
                "Carry blood to the heart",
                "A. Veins",
                "B. Arteries",
                "C. Capillaries",
                "D. Lungs",
                1);
        addQuestion(q45);

        Question q46 = new Question(
                9,
                1,
                2,
                "Carry blood away from the heart",
                "A. Veins",
                "B. Arteries",
                "C. Capillaries",
                "D. Lungs",
                2);
        addQuestion(q46);

        Question q47 = new Question(
                9,
                1,
                2,
                "Having two different alleles of a particular gene or genes",
                "A. Homozygous",
                "B. Heterozygous",
                "C. Phenotype",
                "D. None of the above",
                2);
        addQuestion(q47);

        Question q48 = new Question(
                9,
                1,
                2,
                "There are _____ blood types. Blood types controlled by _____ alleles",
                "A. There are 4 blood types. Blood types are controlled by 3 alleles",
                "B. There are 5 blood types. Blood types are controlled by 10 alleles",
                "C. There are 3 blood types. Blood types are controlled by 5 alleles",
                "D. There are 5 blood types. Blood types are controlled by 3 alleles",
                1);
        addQuestion(q48);

        Question q49 = new Question(
                9,
                1,
                2,
                "Helps form the phosphate backbone of DNA molecules and contains five carbons atoms.",
                "A. Calcium",
                "B. Deoxyribose sugar",
                "C. Cholesterol",
                "D. Adenine, Thymine, Guanine, Cytosine",
                2);
        addQuestion(q49);

        Question q50 = new Question(
                9,
                1,
                2,
                "A genetic disorder in human that causes hairy ears.",
                "A. Diabetes",
                "B. Hemochromatosis",
                "C. Klinefelter syndrome",
                "D. Hypertrichosis pinnae auris",
                4);
        addQuestion(q50);

        Question q51 = new Question(
                9,
                1,
                2,
                "What causes species extinction?",
                "A. humans",
                "B. reforestation",
                "C. typhoon",
                "D. global warming",
                1);
        addQuestion(q51);

        Question q52 = new Question(
                9,
                1,
                2,
                "A group number of organisms of the same species living in a certain place.",
                "A. biodiversity",
                "B. ecosystem",
                "C. population",
                "D. community",
                3);
        addQuestion(q52);

        Question q53 = new Question(
                9,
                1,
                2,
                "It refers to the variety of life in the area",
                "A. diversity",
                "B. biodiversity",
                "C. ecosystem",
                "D. eutrophication",
                2);
        addQuestion(q53);

        Question q54 = new Question(
                9,
                1,
                2,
                "It is a result of air pollution mostly from factories and motor vehicles.",
                "A. acid rain",
                "B. global warming",
                "C. floods",
                "D. soil erosion",
                1);
        addQuestion(q54);

        Question q55 = new Question(
                9,
                1,
                2,
                "It happens when the concentration of organic nutrients that comes from domestic garbage are thrown in bodies of water.",
                "A. water pollution",
                "B. floods",
                "C. eutrophication",
                "D. oil pollution",
                1);
        addQuestion(q55);

        Question q56 = new Question(
                9,
                1,
                2,
                "Plants use _____, _____ and _____ in photosynthesis.",
                "A. Carbon dioxide, Salt and Sugar",
                "B. Carbon dioxide, Oxygen and Alcohol",
                "C. Carbon dioxide, Alcohol and Methane",
                "D. Carbon dioxide, Oxygen and Water",
                4);
        addQuestion(q56);

        Question q57 = new Question(
                9,
                1,
                2,
                "Oxygen and carbon dioxide are gases that cycle out in the ecosystem. Which of the following gases is important to photosynthesis.",
                "A. ozone gas",
                "B. water vapos",
                "C. oxygen",
                "D. carbon dioxide",
                4);
        addQuestion(q57);

        Question q58 = new Question(
                9,
                1,
                2,
                "Plants are considered as food makers. In which of the following cell organelles does photosynthesis occur?",
                "A. ribsome",
                "B. chlorophyll",
                "C. chloroplast",
                "D. mitochondrion",
                3);
        addQuestion(q58);

        Question q59 = new Question(
                9,
                1,
                2,
                "How many molecule/s of carbon dioxide is/are released from one pyruvic acid molecule being oxidized?",
                "A. 1",
                "B. 4",
                "C. 3",
                "D. 2",
                3);
        addQuestion(q59);

        Question q60 = new Question(
                9,
                1,
                2,
                "During the synthesis of ATP, what is the direction of hydrogen flow.",
                "A. from matrix to intermembrane space",
                "B. from intermembrane space to matrix",
                "C. from matrix to mitochondrion to cytoplasm",
                "D. from cytoplasm to matrix to mitochondrion",
                1);
        addQuestion(q60);

        //AP 9
        Question q61 = new Question(
                9,
                1,
                1,
                "Tumutukoy sa halaga ng bagay o nang best alternative na handang ipagpalit sa bawat paggawa ng desisyon.",
                "A. Trade Off",
                "B. Incentives",
                "C. Opportunity Cost",
                "D. Marginal Thinking",
                3);
        addQuestion(q61);

        Question q62 = new Question(
                9,
                1,
                1,
                "Mahalang isaalang alang ang paggawa ng \"Matalinong Desisyon\" sa pamamagitan ng pagsusuri sa apat na mga bagay. Ano ang mga ito?",
                "A. Incentives, Opportunity Cost, Marketing, Trade Off",
                "B. Trade Off, Hilaw na Materyales, Kakapusan, Marginalism/Marginal Thinking",
                "C. Kakapusan, Goods, Incentives, Trade Off",
                "D. Marginalism/Marginal Thinking, Trade Off, Incentives, Opportunity Cost",
                4);
        addQuestion(q62);

        Question q63 = new Question(
                9,
                1,
                1,
                "Kaakibat ng buhay dahil may limitasyon ang kakayahan ng tao at may limitasyon din ang iba pang pinagkukunang yaman at kapital.",
                "A. Kakapusan",
                "B. Pagkaubos ng likas na yaman",
                "C. Pakaubos ng karne ng baboy",
                "D. Shortage",
                1);
        addQuestion(q63);

        Question q64 = new Question(
                9,
                1,
                1,
                "Ang yamang _____ tulad ng makinarya, gusali, at kagamitan sa paglikha ng produkto ay naluluma o nasisira at may limitasyon din ang maaring malikha.",
                "A. Yamang Teknolohiya",
                "B. Yamang Industriya",
                "C. Yamang Kapital",
                "D. Likas na Yaman",
                3);
        addQuestion(q64);

        Question q65 = new Question(
                9,
                1,
                1,
                "Sino ang nagpanukala sa teoryang \"Theory of Human Motivation\"",
                "A. Harold Sulamban",
                "B. Albert Barateta",
                "C. Abraham Maslow",
                "D. Niccolo Paganini",
                3);
        addQuestion(q65);

        Question q66 = new Question(
                9,
                1,
                1,
                "Anong salik ang nakaimpluwensya sa pangangailangan at kagustuhan ng tao na nagbabatay sa antas ng pinag-aralan?",
                "A. Antas ng Edukasyon",
                "B. Edad",
                "C. Katayuan sa Buhay",
                "D. Panlasa",
                1);
        addQuestion(q66);

        Question q67 = new Question(
                9,
                1,
                1,
                "Ito ay isang salik na nakakaapekto sa pangangailangan at kagustuhan ng tao na nagbabatay sa katayuan ng tao sa kanyang pamayanan at pinagtatarabahuan.",
                "A. Antas ng Edukasyon",
                "B. Edad",
                "C. Katayuan sa Buhay",
                "D. Panlasa",
                3);
        addQuestion(q67);

        Question q68 = new Question(
                9,
                1,
                1,
                "Anong organisasyon ang binubuo ng dalawa o higit pang  indibidwal na nagkasundo at sumasang ayong paghatian ang mga kita at pagkalugi ng isang negosyo.",
                "A. Corporation",
                "B. Partnership",
                "C. Sole Proprietorship",
                "D. Cooperative",
                2);
        addQuestion(q68);

        Question q69 = new Question(
                9,
                1,
                1,
                "Ano ang tawag sa proseso ng pagiging korporasyon?",
                "A. Incorporation",
                "B. Corporation",
                "C. Cooperative",
                "D. Production",
                1);
        addQuestion(q69);

        Question q70 = new Question(
                9,
                1,
                1,
                "Ito ang tumutukoy sa kakayahan at kagustuhan ng isang tao na magsimula ng isang negosyo.",
                "A. Proprietorship",
                "B. Partnership",
                "C. Relationship",
                "D. Entrepreneurship",
                4);
        addQuestion(q70);

        Question q71 = new Question(
                9,
                1,
                1,
                "Umiiral ito dahil limitado ang pinagkukunang-yaman at walang katapusang pangangailangan at kagustuhan ng tao.",
                "A. Kakapusan",
                "B. Produksiyon",
                "C. Kakulangan",
                "D. Alokasyon",
                1);
        addQuestion(q71);

        Question q72 = new Question(
                9,
                1,
                1,
                "Nagaganap ito kung may pansamantalang pagkukulang sa supply ng isang produkto.",
                "A. Kakapusan",
                "B. Produksiyon",
                "C. Kakulangan",
                "D. Alokasyon",
                3);
        addQuestion(q72);

        Question q73 = new Question(
                9,
                1,
                1,
                "Sa lahat ng organisasyon sa negosyo ano ang pinakamasalimuot?",
                "A. Corporation",
                "B. Partnership",
                "C. Sole Proprietorship",
                "D. Cooperative",
                1);
        addQuestion(q73);

        Question q74 = new Question(
                9,
                1,
                1,
                "Bahagi na ng buhay ng tao simula ng kaniyang pagsilang.",
                "A. Kagustuhan",
                "B. Kakapusan",
                "C. Pagtipid",
                "D. Pagkonsumo",
                4);
        addQuestion(q74);

        Question q75 = new Question(
                9,
                1,
                1,
                "Ang ekonomiya ay nasa ilalim ng komprehensibong kontrol at regulasyon ng pamahalaan.",
                "A. Command Economy",
                "B. Mixed Economy",
                "C. Market Economy",
                "D. Traditional Economy",
                1);
        addQuestion(q75);

        Question q76 = new Question(
                9,
                1,
                1,
                "Ayon sa kanya, habang lumalaki ang kita ng tao ay lumalaki rin ang kanayang kakayahan sa kumonsumo ng mga produkto at serbisyo.",
                "A. John Maynard Keynes",
                "B. Albert Einstein",
                "C. Abraham Kennedy",
                "D. President Ramon Magsaysay",
                1);
        addQuestion(q76);

        Question q77 = new Question(
                9,
                1,
                1,
                "Ano/Anu ang/ang mga salik ng produksiyon?",
                "A. Lupa, Kapital, Paggawa, Entrepreneurship",
                "B. Lupa, Kapital, Teknolohiya, Entrepreneurship",
                "C. Produkto",
                "D. Pagkain, Lupa, Tirahan, Damo",
                1);
        addQuestion(q77);

        Question q78 = new Question(
                9,
                1,
                1,
                "Isang modelo na nagpapakita ng mga estratehiya(strategy) sa paggamit ng mga salik upang makalikha ng mga produkto.",
                "A. Industriyalisasyon",
                "B. Production Possibility Frontier",
                "C. Department of Trade and Industry(DTI)",
                "D. Marketing",
                2);
        addQuestion(q78);

        Question q79 = new Question(
                9,
                1,
                1,
                "Ang _____ ay mga bagay na dapat mayroon ang tao sapagkat kailangan niya nito sa kanyang pang-araw-araw na gawain.",
                "A. Kagustuhan",
                "B. Pangangailangan",
                "C. Pamayanan",
                "D. Kayamanan",
                2);
        addQuestion(q79);

        Question q80 = new Question(
                9,
                1,
                1,
                "Ito ang pinakamataas na antas ng pangangailangan ng tao.",
                "A. Pangangailangang Panlipunan",
                "B. Pangangailangang Pisyolohikal",
                "C. Kaganapan ng Pagkatao",
                "D. Pangangailangan ng Seguridad at Kaligtasan",
                3);
        addQuestion(q80);

        //MAPEH 9
        Question q81 = new Question(
                9,
                1,
                4,
                "This grouped performed secular music which has not bound by Catholic tradition across Europe during the later part of the Medieval Period",
                "A. Mass",
                "B. Madrigal",
                "C. Orchestra",
                "D. Troubadours",
                4);
        addQuestion(q81);

        Question q82 = new Question(
                9,
                1,
                4,
                "It is a form of sacred musical composition that sets text of the Eucharistic liturgy into music.",
                "A. Mass",
                "B. Madrigal",
                "C. Fugue",
                "D. Concertino",
                1);
        addQuestion(q82);

        Question q83 = new Question(
                9,
                1,
                4,
                "The period when the arts highlighted grandiose and elaborate ornamentation.",
                "A. Medieval",
                "B. Renaissance",
                "C. Baroque",
                "D. Classical",
                3);
        addQuestion(q83);

        Question q84 = new Question(
                9,
                1,
                4,
                "A large scale musical composition for ochestra that incorporates narratives on religious themes.",
                "A. Concerto",
                "B. Fugue",
                "C. Concerto Grosso",
                "D. Oratorio",
                4);
        addQuestion(q84);

        Question q85 = new Question(
                9,
                1,
                4,
                "There are five main section of the Mass. Which of the following is the only section with Greek text.",
                "A. Kyrie",
                "B. Gloria",
                "C. Credo",
                "D. Agnus Dei",
                1);
        addQuestion(q85);

        Question q86 = new Question(
                9,
                1,
                4,
                "These paintings have been confined in the illumination of manuscript pages and the painting of frescoes on the walls of churches in cosmopolitan and elegant manner.",
                "A. paintings from Gothic Era",
                "B. paintings from Classical Greek Era",
                "C. paintings from Romantic Era",
                "D. Prehistoric Era",
                1);
        addQuestion(q86);

        Question q87 = new Question(
                9,
                1,
                4,
                "Most of the paintings from this era were copied from Hellenic Greek paintings.",
                "A. paintings from Gothic Era",
                "B. paintings from Classical Greek Era",
                "C. paintings from Romantic Era",
                "D. Prehistoric Era",
                2);
        addQuestion(q87);

        Question q88 = new Question(
                9,
                1,
                4,
                "It has the lively style of paintings that lived on in Byzantium which has been invented in Greece and Rome.",
                "A. Fresco Painting",
                "B. Romanesque Art",
                "C. Panel Paintings",
                "D. Byzantine Art",
                4);
        addQuestion(q88);

        Question q89 = new Question(
                9,
                1,
                4,
                "He discovered the cave of Lascaux in 1940.",
                "A. Jacques Marsal",
                "B. Georges Agnel",
                "C. Marcel Ravidat",
                "D. Lascaux",
                3);
        addQuestion(q89);

        Question q90 = new Question(
                9,
                1,
                4,
                "_____ is an art or process where an image is created using as assemblage of small pieces of colored glass, stones, or other materials.",
                "A. Fresco",
                "B. Byzantine",
                "C. Encaustic",
                "D. Mosaic",
                4);
        addQuestion(q90);

        Question q91 = new Question(
                9,
                1,
                4,
                "A RICE method that is excellent anti-inflammatory and reduces swelling and pain.",
                "A. Ice",
                "B. Compression",
                "C. Rest",
                "D. elevation",
                1);
        addQuestion(q91);

        Question q92 = new Question(
                9,
                1,
                4,
                "It is a twist or tear of a muscle or tendon",
                "A. injury",
                "B. sprain",
                "C. dislocation",
                "D. strain",
                4);
        addQuestion(q92);

        Question q93 = new Question(
                9,
                1,
                4,
                "An injury caused by a stretch or tear of ligament",
                "A. injury",
                "B. sprain",
                "C. dislocation",
                "D. strain",
                2);
        addQuestion(q93);

        Question q94 = new Question(
                9,
                1,
                4,
                "A break in the bone occurs from quick or one time injury.",
                "A. Sprain",
                "B. Strain",
                "C. Fracture",
                "D. Dislocation",
                3);
        addQuestion(q94);

        Question q95 = new Question(
                9,
                1,
                4,
                "Cord of tissue connecting muscle to bone",
                "A. ligament",
                "B. muscle",
                "C. tendon",
                "D. nerve",
                3);
        addQuestion(q95);

        Question q96 = new Question(
                9,
                1,
                4,
                "This environmental problem causes climate change",
                "A. pollution",
                "B. deforestation",
                "C. soil erosion",
                "D. improper waste disposal",
                1);
        addQuestion(q96);

        Question q97 = new Question(
                9,
                1,
                4,
                "What environmental problem reduces the ability of soil to store water and support plant growth?",
                "A. deforestation",
                "B. pollution",
                "C. soil erosion",
                "D. improper waste disposal",
                3);
        addQuestion(q97);

        Question q98 = new Question(
                9,
                1,
                4,
                "This program of DOH promotes community health.",
                "A. primary health care",
                "B. maternity health care",
                "C. family health program",
                "D. house hold program",
                1);
        addQuestion(q98);

        Question q99 = new Question(
                9,
                1,
                4,
                "If you are throwing garbage anywhere, what environmental problem does it affect?",
                "A. deforestation",
                "B. soil erosion",
                "C. water pollution",
                "D. improper waste disposal",
                3);
        addQuestion(q99);

        Question q100 = new Question(
                9,
                1,
                4,
                "Why do we need to ensure community health in planning for community development?",
                "A. to keep safety community",
                "B. to live Healthy",
                "C. to be fit",
                "D. to be clean",
                1);
        addQuestion(q100);

        //FILIPINO 9
        Question q101 = new Question(
                9,
                1,
                7,
                "Grupo ng mga salitang nag papahayag ng buang diwa.",
                "A. Parirala",
                "B. Pangungusap",
                "C. Salita",
                "D. Ugnay",
                2);
        addQuestion(q101);

        Question q102 = new Question(
                9,
                1,
                7,
                "Ito ang tawag sa mga salitang nag-uugnay sa dalawang salita, parirala o sugnay",
                "A. Transitional device",
                "B. Pang-uri",
                "C. Pangatnig",
                "D. Pang-abay",
                1);
        addQuestion(q102);

        Question q103 = new Question(
                9,
                1,
                7,
                "May tatlong elemento ang kuwento. Alin dito ang hindi elemento ng kuwento?",
                "A. Nobela",
                "B. Tauhan",
                "C. Banghay",
                "D. Tagpuan",
                1);
        addQuestion(q103);

        Question q104 = new Question(
                9,
                1,
                7,
                "Maraming parte ang Banghay. Alin dito ang Hindi kabilang",
                "A. Wakas",
                "B. Kasukdulan",
                "C. Sanaysay",
                "D. Simula",
                3);
        addQuestion(q104);

        Question q105 = new Question(
                9,
                1,
                7,
                "Ano ang nobelang masining?",
                "A. Binibigyan diin ang katauhan ng pangunahing tauhan.",
                "B. Pagkasunod-sunod ng pangyayari at paglalarawan sa mga tauhan",
                "C. Ukol sa pangyayari nakakapagbago",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q105);

        Question q106 = new Question(
                9,
                1,
                7,
                "Isang uri ng nobela na ang isang akda ay nasa pagkakabalangkas ng mga pangyayari na ikinawiwili ng mga mambabasa",
                "A. Nobelang Banghay",
                "B. Nobelang masining",
                "C. Nobelang romansa",
                "D. Layunin",
                1);
        addQuestion(q106);

        Question q107 = new Question(
                9,
                1,
                7,
                "Sa nobelang ito isinasalaysay ang mga pangyayari may kaugnayan sa kasaysayan ng bayan.",
                "A. Sanaysay",
                "B. Nobelang Banghay",
                "C. Nobelang kasaysayan",
                "D. Nobelang pagbabago",
                3);
        addQuestion(q107);

        Question q108 = new Question(
                9,
                1,
                7,
                "Isang nobela na ukol sa pagibig",
                "A. Nobelang Banghay",
                "B. Nobelang masining",
                "C. Nobelang romansa",
                "D. Layunin",
                3);
        addQuestion(q108);

        Question q109 = new Question(
                9,
                1,
                7,
                "Ito ay maiksing komposisyon sa kalimitang naglalaman ng personal na kuro-kuro ng may akda",
                "A. Sanaysay",
                "B. Tula",
                "C. Nobela",
                "D. Kuwento",
                1);
        addQuestion(q109);

        Question q110 = new Question(
                9,
                1,
                7,
                "Bahagi ng sanaysay na nagsasara sa talakayang naganap sa gitna | katawan ng sanaysay",
                "A. Gitna/katawan",
                "B. Wakas",
                "C. Simula/panimula",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q110);

        Question q111 = new Question(
                9,
                1,
                7,
                "Isang akdang pampanitikan na naglalayong mapahayag ang damdamin sa malayang pagsusulat",
                "A. Sanaysay",
                "B. Tula",
                "C. Nobela",
                "D. Kuwento",
                2);
        addQuestion(q111);

        Question q112 = new Question(
                9,
                1,
                7,
                "Ano ang di-pormal?",
                "A. Palagayan o personal",
                "B. Matayutay",
                "C. Ang tono ay seryoso",
                "D. Ito ay impersonal",
                1);
        addQuestion(q112);

        Question q113 = new Question(
                9,
                1,
                7,
                "Ano ang mga uri ng sanaysay?",
                "A. Simula, Pormal at Di-Pormal",
                "B. Pormal at Di-Pormal",
                "C. Simula, Wakas at Di-Pormal",
                "D. Simula at Pormal",
                4);
        addQuestion(q113);

        Question q114 = new Question(
                9,
                1,
                7,
                "Ano ang tumutukoy sa bilang ng pantig sa taludtod o linya ng isang tula.",
                "A. Tono",
                "B. Talinghaga",
                "C. Sukat",
                "D. Persona",
                3);
        addQuestion(q114);

        Question q115 = new Question(
                9,
                1,
                7,
                "Ang persona, tono, talinghaga, tugma, sukat at saknong ay ano ng tula?",
                "A. Bahagi",
                "B. Elemento",
                "C. Uri",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q115);

        Question q116 = new Question(
                9,
                1,
                7,
                "Isang pananaw ng isang Tao na maaring totoo pwedeng pasubalian ng iba",
                "A. Katotohanan",
                "B. Opinion",
                "C. Kuwento",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q116);

        Question q117 = new Question(
                9,
                1,
                7,
                "Ayon sa Department of Health noong Agusto 10,2020 ay ang highest single day increase na natamaan ng COVID-19 sa Pilipinas. Sa nabasa mong pangungusap ano ito?",
                "A. Katotohan",
                "B. Opinion",
                "C. Kuwento",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q117);

        Question q118 = new Question(
                9,
                1,
                7,
                "Isang pahayag na nagsasaad ng pangyayari na katotohanan at tangap ng lahat na totoo at hindi mapasubalian kahit ibang lugar.",
                "A. Katotohanan",
                "B. Opinion",
                "C. Kuwento",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q118);

        Question q119 = new Question(
                9,
                1,
                7,
                "Para naging opinion ang binubuong pangungusap ano ang ilalagay mo?",
                "A. Para sa akin",
                "B. At",
                "C. Dahil",
                "D. Noon",
                1);
        addQuestion(q119);

        Question q120 = new Question(
                9,
                1,
                7,
                "Ito ay isang paniniwala na mas malakas pa sa impresyon?",
                "A. Katotohanan",
                "B. Tula",
                "C. Nobelang romansa",
                "D. Opinion",
                4);
        addQuestion(q120);

        //Research 9
        Question q121 = new Question(
                9,
                1,
                8,
                "The following are some of the contents of chapter 1, except:",
                "A. Introduction",
                "B. Statement of the problem",
                "C. Statistical Parameter",
                "D. Significance of the study",
                3);
        addQuestion(q121);

        Question q122 = new Question(
                9,
                1,
                8,
                "Introduction contains:",
                "A. Topic, Importance of the Topic, Reasons for choosing the topic, Purpose of the study",
                "B. Bibliography, Topic, Reasons for choosing the topic",
                "C. Bibliography, Topic, Importance of the Topic, Purpose of the study",
                "D. Conclusions, Bibliography, Importance of the Topic, Reason for choosing the topic",
                1);
        addQuestion(q122);

        Question q123 = new Question(
                9,
                1,
                8,
                "What is Background of the study?",
                "A. It consist statements on what led the investigator to launch the study.",
                "B. Describes the problem as clearly as possible",
                "C. An Overview of the factors and historical significance of the problem",
                "D. All of the Above",
                4);
        addQuestion(q123);

        Question q124 = new Question(
                9,
                1,
                8,
                "It is a general statement of the whole problem followed by the specific questions or sub-problems.",
                "A. Introductions",
                "B. Statement of the problem",
                "C. Background of the study",
                "D. Scope and Delimitations of the study",
                2);
        addQuestion(q124);

        Question q125 = new Question(
                9,
                1,
                8,
                "You will know who are to be benefited and how they are going to be benefited in which content of the study",
                "A. Significance of the study",
                "B. Statistical Parameter",
                "C. Scope and Delimitations of the study",
                "D. Conceptual Framework",
                1);
        addQuestion(q125);

        Question q126 = new Question(
                9,
                1,
                8,
                "It is the diagrammatic representation of the conceptual framework.",
                "A. Research Design",
                "B. Appendix A",
                "C. Abstract",
                "D. Paradigm",
                4);
        addQuestion(q126);

        Question q127 = new Question(
                9,
                1,
                8,
                "Why do we need a diagrammatic representation of the conceptual framework?",
                "A. Because it depicts in a more vivid way what the conceptual framework wants to convey",
                "B. Because it doesn't depicts in a more vivid way what the conceptual framework wants to convey",
                "C. Just because",
                "D. To know the hypothesis",
                1);
        addQuestion(q127);

        Question q128 = new Question(
                9,
                1,
                8,
                "Which statement is true?",
                "A. If the hypothesis is derived from the observation before the research is conducted, this is called inductive hypothesis. And if the hypothesis is derived from the theory, this is called deductive hypothesis.",
                "B. If the hypothesis is derived from the observation before the research is conducted, this is called deductive hypothesis. And if the hypothesis is derived from the theory, this is called inductive hypothesis.",
                "C. If the hypothesis is derived from the observation before the research is conducted, this is called independent hypothesis. And if the hypothesis is derived from the theory, this is dependent hypothesis.",
                "D. If the hypothesis is derived from the observation before the research is conducted, this is called dependent hypothesis. And if the hypothesis is derived from the theory, this is called independent hypothesis.",
                1);
        addQuestion(q128);

        Question q129 = new Question(
                9,
                1,
                8,
                "What is assumptions?",
                "A. A belief that forms one of the bases for the research.",
                "B. Is a tentative answer to a research study.",
                "C. A and B",
                "D. None of the above",
                1);
        addQuestion(q129);

        Question q130 = new Question(
                9,
                1,
                8,
                "It may be taken from encyclopedias, books, magazines, newspaper articles, dictionaries, and other publication.",
                "A. Definitions of terms",
                "B. Research procedure",
                "C. Research design",
                "D. Research instrument",
                1);
        addQuestion(q130);

        Question q131 = new Question(
                9,
                1,
                8,
                "The Paradigm of the study should be arrange as follow:",
                "A. Output-Input-Process",
                "B. Process-Input-Output",
                "C. Input-Output-Process",
                "D. Input-Process-Output",
                4);
        addQuestion(q131);

        Question q132 = new Question(
                9,
                1,
                8,
                "Input contains:",
                "A. How to do your Research Product",
                "B. First thing to do in making your Research Product",
                "C. The materials of your Research Product",
                "D. None of the above",
                3);
        addQuestion(q132);

        Question q133 = new Question(
                9,
                1,
                8,
                "It contains the procedure of your Research",
                "A. Input",
                "B. Process",
                "C. Output",
                "D. All of the above",
                2);
        addQuestion(q133);

        Question q134 = new Question(
                9,
                1,
                8,
                "Process may contain:",
                "A. Preparation of Materials",
                "B. Preparation of Mixture and Blending Process",
                "C. Mixing",
                "D. All of the above",
                4);
        addQuestion(q134);

        Question q135 = new Question(
                9,
                1,
                8,
                "Scope and Delimitations should include the following, except:",
                "A. A brief statement of the general purpose study.",
                "B. The subject matter and topics studied and discussed.",
                "C. The period of the study.",
                "D. The possible solutions to existing problems or improvement to unsatisfactory conditions",
                4);
        addQuestion(q135);

        Question q136 = new Question(
                9,
                1,
                8,
                "The following are true about Definition of terms, except:",
                "A. Only terms, words or phrases which have special or unique meanings in the study are defined",
                "B. It can be in alphabetical order, or not in alphabetical orde, either ways will be acceptable",
                "C. It should be brief, clear, and unequivocal as possible",
                "D. Definitions may be taken from encyclopedias, books, magazines, and other publications.",
                2);
        addQuestion(q136);

        Question q137 = new Question(
                9,
                1,
                8,
                "What type of study need expressly written assumptions and hypothesis?",
                "A. Historical investigation",
                "B. Descriptive investigation",
                "C. Experimental study",
                "D. All of the Above",
                3);
        addQuestion(q137);

        Question q138 = new Question(
                9,
                1,
                8,
                "Introduction discusses four relevant ideas namely: TOPIC, IMPORTANCE of the topic, REASONS for choosing the topic and PURPOSE of the study. What does the researcher do in writing the TOPIC or subject matter?",
                "A. Define and elaborate using methods of paragraph development like classification and giving examples.",
                "B. Cite the role that the topic plays in your life and the benefits you derive from it.",
                "C. Emphasized what motivated you to choose the topic.",
                "D. Discusses the objective of the study.",
                1);
        addQuestion(q138);

        Question q139 = new Question(
                9,
                1,
                8,
                "Introduction discusses four relevant ideas namely: TOPIC, IMPORTANCE of the topic, REASONS for choosing the topic and PURPOSE of the study. What does the researcher do in writing the PURPOSE of the study?",
                "A. Define and elaborate using methods of paragraph development like classification and giving examples.",
                "B. Cite the role that the topic plays in your life and the benefits you derive from it.",
                "C. Emphasized what motivated you to choose the topic.",
                "D. Discusses the objective of the study.",
                4);
        addQuestion(q139);

        Question q140 = new Question(
                9,
                1,
                8,
                "Introduction discusses four relevant ideas namely: TOPIC, IMPORTANCE of the topic, REASONS for choosing the topic and PURPOSE of the study. What does the researcher do in writing the IMPORTANCE of the study?",
                "A. Define and elaborate using methods of paragraph development like classification and giving examples.",
                "B. Cite the role that the topic plays in your life and the benefits you derive from it.",
                "C. Emphasized what motivated you to choose the topic.",
                "D. Discusses the objective of the study.",
                2);
        addQuestion(q140);

        //Math 9
        Question q141 = new Question(
                9,
                1,
                5,
                "Solve: x2 – 81 = 0",
                "A. x = ±4",
                "B. x = ±9",
                "C. x = ±10",
                "D. x = ±1",
                2);
        addQuestion(q141);

        Question q142 = new Question(
                9,
                1,
                5,
                "Solve 4x2 +3x – 27 = 0 using the factoring method.",
                "A. x = 3 and x = 9",
                "B. x = 27and x = 1",
                "C. x = 9/4 and x = -3",
                "D. x = 4 and x = -7 ",
                3);
        addQuestion(q142);

        Question q143 = new Question(
                9,
                1,
                5,
                "Evaluate: x2 + 16x + 15 = 0 by completing the square.",
                "A. x = 5 and x = -3",
                "B. x = 15 and x = 1",
                "C. x = -8 and x = -2",
                "D. x = -1 and x = -15",
                4);
        addQuestion(q143);

        Question q144 = new Question(
                9,
                1,
                5,
                "Solve: x2 + 5x – 14 = 0 using the quadratic formula.",
                "A. x = 2 and x = -7",
                "B. x = 14 and x = -1",
                "C. x = -7 and x = -2",
                "D. x = 5 and x = 3",
                1);
        addQuestion(q144);

        Question q145 = new Question(
                9,
                1,
                5,
                "What is the nature of the roots of the equation 3x2 – 2x – 5 = 0?",
                "A. Real numbers and equal",
                "B. Rational numbers but are not equal",
                "C. Irrational numbers and are not equal ",
                "D. No real roots ",
                2);
        addQuestion(q145);

        Question q146 = new Question(
                9,
                1,
                5,
                "What is the sum and the product of the roots of the quadratic equation 6x2 – 6x – 12 = 0?",
                "A. -12 and 1",
                "B. -1 and 6",
                "C. 0 and -6",
                "D. 1 and 2",
                4);
        addQuestion(q146);

        Question q147 = new Question(
                9,
                1,
                5,
                "A rectangular garden has an area of 14 m2 and a perimeter of 18 m. What are the dimensions of the rectangular garden?",
                "A. 2 m and 7 m ",
                "B. 5 m and 9 m ",
                "C. 2 m and 9 m ",
                "D. 7 m and 7m ",
                1);
        addQuestion(q147);

        Question q148 = new Question(
                9,
                1,
                5,
                "The sum of the squares of two consecutive positive integers is 145. What are the numbers?",
                "A. 7 and 8",
                "B. 12 and 13",
                "C. 6 and 7",
                "D. 8 and 9",
                4);
        addQuestion(q148);

        Question q149 = new Question(
                9,
                1,
                5,
                "Find the interval notation of the quadratic inequality x2 – x – 6 ≤ 0.",
                "A. [-2, 3]",
                "B. [-1, 6)",
                "C. (-2, -3)",
                "D. [2, 6]",
                1);
        addQuestion(q149);




        Question q150 = new Question(
                9,
                1,
                5,
                "Solve the inequality x2 – x < 12.",
                "A. [-3, 4]",
                "B. (-∞, 4]",
                "C. [-3, ∞)",
                "D. (-3, 4)",
                4);
        addQuestion(q150);

        Question q151 = new Question(
                9,
                1,
                5,
                "3x/x + 1/2",
                "A. (-4x)/2x",
                "B. 7x/2x",
                "C. 2x/x",
                "D. 3  1/2",
                4);
        addQuestion(q151);

        Question q152 = new Question(
                9,
                1,
                5,
                "(x^2+4x+3)/(x^2+2x-3)",
                "A. x",
                "B. (x+1)/(x-1)",
                "C. -x",
                "D. (x-1)/(x+1)",
                2);
        addQuestion(q152);



        Question q153 = new Question(
                9,
                1,
                5,
                "36x/4-4x/x",
                "A. (9x^2+4x)/x",
                "B. 9x^2+4",
                "C. 10x/1",
                "D. 9x^2-4",
                2);
        addQuestion(q153);

        Question q154 = new Question(
                9,
                1,
                5,
                "(x^2-2x-3)/(x^2+x-6) ● (x^2-x-2)/(x^2-8x+15)",
                "A.  〖(x+1)〗^2/((x-3)(x+5)) ",
                "B. 〖(x-1)〗^2/((x+3)(x-5))",
                "C. 〖(x+1)〗^2/((x+3)(x-5))",
                "D. ((x+3)(x-5))/〖(x+1)〗^2 ",
                3);
        addQuestion(q154);








        Question q155 = new Question(
                9,
                1,
                5,
                "(x^2+5x-24)/(s^2+6x+8) ● (x^2+4x+4)/(x^2-3x)",
                "A. ((x+8)(x+2))/(x(x+4))",
                "B. ((x-8)(x+2))/(x(x-4))",
                "C. (x(x-4))/((x+8)(x-2)) ",
                "D. (x(x+4))/((x+8)(x-2))",
                1);
        addQuestion(q155);

        Question q156 = new Question(
                9,
                1,
                5,
                "3/4x=5/2x-7/4",
                "A. x=1",
                "B. x=1, or x=2",
                "C. no answer ",
                "D. x=1, or x=5",
                1);
        addQuestion(q156);

        Question q157 = new Question(
                9,
                1,
                5,
                "5/x-1/3=1/x",
                "A. x= 12",
                "B. t=-12",
                "C. t=9, or t=4",
                "D. no answer ",
                1);
        addQuestion(q157);


        Question q158 = new Question(
                9,
                1,
                5,
                "3x/(x^2-4)-2/(x+2)=1/(x+2)",
                "A. no answer ",
                "B. x=1",
                "C. x=2",
                "D. x=3",
                1);
        addQuestion(q158);

        Question q159 = new Question(
                9,
                1,
                5,
                "2-1/(x(x+1))=3/(x-1)",
                "A. x=- 1/2, or x= 1",
                "B. no answer ",
                "C. x= -1",
                "D. x= 3",
                1);
        addQuestion(q159);
        Question q160 = new Question(
                9,
                1,
                5,
                "x/(x+2)+2/(x^2+5x+6)=5/(x+3)",
                "A. x= -2, or x= 4",
                "B. x= 2, or x= -4",
                "C. no answer ",
                "D. x= 2, or x= 4",
                1);
        addQuestion(q160);

        //GRADE 7 FIRST START

        //Araling Panlipunan 7
        Question q181 = new Question (
                7,
                1,
                1,
                "Ang pagkakaiba-iba ng klima sa Asya ay bunsod ng iba’t ibang salik kabilang na rito ang lokasyon at topograpiya ng isang lugar. Kung sa Kanlurang Asya ay bihira ang ulan at hindi palagian ang klima, at sa Hilagang Asya naman ay mahaba ang tag-lamig at maigsi ang tag-init, ano naman ang katangian ng klima sa Timog-Silangang Asya?",
                "A. Ang mga bansa sa rehiyon ay nakararanas ng tag-init, tag-lamig, tag-araw, at tag-ulan.",
                "B. May mainit na panahon sa ilang bahagi at may mga bahagi ng rehiyon na nababalutan ng yelo.",
                "C. Mahalumigmig, tag-lamig, tag-init, at tag-tuyot ang nararanasan sa rehiyong ito sa iba’t ibang buwan sa loob ng isang taon.",
                "D. Sobrang lamig sa rehiyon at hindi kayang panirahan ng tao.",
                1);
        addQuestion(q181);

        Question q182 = new Question (
                7,
                1,
                1,
                "Ano ang pinakamataas na bahagi ng Asya?",
                "A. Mt. Apo",
                "B. Mt. Rinjani",
                "C. Mt. Everest",
                "D. Mt. Huashan",
                3);
        addQuestion(q182);

        Question q183 = new Question (
                7,
                1,
                1,
                "Ang mga Asyano ay nahahati sa Iba’t ibang pangkat batay sa wika at etnisidad na kinabibilangan. Ano ang tawag sa pagpapangkat na ito?",
                "A. Pamayanan",
                "B. Nomad",
                "C. Katutubo",
                "D. Etnolingguwistiko",
                4);
        addQuestion(q183);

        Question q184 = new Question (
                7,
                1,
                1,
                "Kung iba’t iba ang kultura ng mga pamayanang etniko sa Asya, nangangahulogang pinakamalaking hamon sa rehiyon ang ___________.",
                "A. ideolohiyang politikal",
                "B. pagkakalinlan",
                "C. modernisasyon",
                "D. pagkakaisa",
                4);
        addQuestion(q184);

        Question q185 = new Question (
                7,
                1,
                1,
                "Ito ay nauukol sa pag-aaral ng mundo at mga taong naninirahan dito, na sumasakop din sa pag-aaral sa katangiang pisikal nito, iba’t ibang anyong lupa at anyong tubig, klima, at likas na yaman ng isang pook.",
                "A. astronomiya",
                "B. heograpiya",
                "C. botanika",
                "D. pisika",
                2);
        addQuestion(q185);

        Question q186 = new Question (
                7,
                1,
                1,
                "Ito ay tumutukoy sa malawak na lupang pantay o patag.",
                "A. bundok",
                "B. taiga",
                "C. lambak",
                "D. kapatagan",
                4);
        addQuestion(q186);

        Question q187 = new Question (
                7,
                1,
                1,
                "Ito ang mga distansyang angular na natutukoy sa hilaga o timog ng equator.",
                "A. latitude",
                "B. longitude",
                "C. Prime Meridian",
                "D. Tropic of Cancer",
                1);
        addQuestion(q187);

        Question q188 = new Question (
                7,
                1,
                1,
                "Ano ang malalaking isdang likas sa Hilagang Asya na pinagkukunan ng caviar (itlog) na isa sa mga produktong panluwas ng rehiyon?",
                "A. salmon",
                "B. stingray",
                "C. sturgeon",
                "D. trout",
                3);
        addQuestion(q188);

        Question q189 = new Question (
                7,
                1,
                1,
                "Ano ang tawag sa pinakamalaking dibisyon ng lupain sa daigdig?",
                "A. Bansa",
                "B. Kontinente",
                "C. Pulo",
                "D. Europe",
                2);
        addQuestion(q189);

        Question q190 = new Question (
                7,
                1,
                1,
                "Ito ang zero-degree latitude na humahati sa globo sa hilaga at timog na hemisphere nito.",
                "A. Longitude",
                "B. Prime Meridian",
                "C. Equator",
                "D. Tropic of Cancer",
                3);
        addQuestion(q190);

        Question q191 = new Question (
                7,
                1,
                1,
                "Ano ang pinakamalaking kontinente sa daigdig?",
                "A. Asya",
                "B. Africa",
                "C. North America",
                "D. South America",
                1);
        addQuestion(q191);

        Question q192 = new Question (
                7,
                1,
                1,
                "Sa ilang rehiyon nahahati ang Asya?",
                "A. 4",
                "B. 5",
                "C. 6",
                "D. 7",
                2);
        addQuestion(q192);

        Question q193 = new Question (
                7,
                1,
                1,
                "Alin sa sumusunod na mga bansa ang hindi parte ng Timog-Silangang Asya?",
                "A. Singapore",
                "B. Thailand",
                "C. Indonesia",
                "D. Bhutan",
                4);
        addQuestion(q193);

        Question q194 = new Question (
                7,
                1,
                1,
                "Ano ang pinakamalaking disyerto sa Asya?",
                "A. Taklimakan Desert",
                "B. Kara Kum Desert",
                "C. Thar Desert",
                "D. Gobi Desert",
                4);
        addQuestion(q194);

        Question q195 = new Question (
                7,
                1,
                1,
                "Ano ang pinakamalaking lawa sa mundo na matatagpuan sa hilagang Iran, Kazakhstan, Turkmenistan, Azerbaijan, Armenia, at Georgia?",
                "A. Caspian Sea",
                "B. Lake Baikal",
                "C. Dead Sea",
                "D. Aral Sea",
                1);
        addQuestion(q195);

        Question q196 = new Question (
                7,
                1,
                1,
                "Ano ang tawag sa uri o dami ng mga halaman sa isang lugar tulad ng pagkakaroon ng kagubatan o damuhan?",
                "A. Kapatagan",
                "B. Steppe",
                "C. Vegetation",
                "D. Savanna",
                3);
        addQuestion(q196);

        Question q197 = new Question (
                7,
                1,
                1,
                "Ito ay uri ng damuhang may ugat na mabababaw o shallow-rooted short grasses.",
                "A. Tundra",
                "B. Steppe",
                "C. Prairie",
                "D. Savanna",
                2);
        addQuestion(q197);

        Question q198 = new Question (
                7,
                1,
                1,
                "Ano ang tawag sa karaniwang panahon o average weather na nararanasan ng isang lugar sa loob ng mahabang panahon?",
                "A. Klima",
                "B. Monsoon",
                "C. Panahon",
                "D. Ulan",
                1);
        addQuestion(q198);

        Question q199 = new Question (
                7,
                1,
                1,
                "Ito ay tumutukoy sa pagkaubos at pagkawala ng mga punongkahoy sa mga gubat.",
                "A. Salinization",
                "B. Siltation",
                "C. Desertification",
                "D. Deforestation",
                4);
        addQuestion(q199);

        Question q200 = new Question (
                7,
                1,
                1,
                "Ito ang pagbabago ng pandaigdigan o rehiyunal na klima na maaaring dulot ng likas na pagbabago sa daigdig o ng mga gawain ng tao.",
                "A. Global Climate Change",
                "B. Siltation",
                "C. Deforestation",
                "D. Polusyon",
                1
        );
        addQuestion(q200);

        //ENGLISH 7
        Question q201 = new Question (
                7,
                1,
                9,
                "In Subject-Verb Agreement, this rule refers to a verb that agrees with its subject in number.",
                "A. Rule 3",
                "B. Rule 10",
                "C. Rule 6",
                "D. Rule 1",
                4);
        addQuestion(q201);

        Question q202 = new Question (
                7,
                1,
                9,
                "This rule of Subjects-Verb Agreement refers to subject that are joined by \"and\" are plural while subjects that are joined by \"or\" or \"nor\" take a verb that agrees with the last subject.",
                "A. Rule 4",
                "B. Rule 5",
                "C. Rule 9",
                "D. Rule 7",
                2);
        addQuestion(q202);

        Question q203 = new Question (
                7,
                1,
                9,
                "In this rule of Subjects-Verb Agreement, some subject always take a singular verb even though the meaning may seem plural. What rule is it?",
                "A. Rule 2",
                "B. Rule 8",
                "C. Rule 4",
                "D. Rule 3",
                4);
        addQuestion(q203);

        Question q204 = new Question (
                7,
                1,
                9,
                "In this rule of Subjects-Verb Agreement, some nouns, while plural in form are singular in meaning.",
                "A. Rule 10",
                "B. Rule 2",
                "C. Rule 9",
                "D. Rule 6",
                3);
        addQuestion(q204);

        Question q205 = new Question (
                7,
                1,
                9,
                "This rule of Subjects-Verb Agreement refers to \"don't\" and \"doesn't\" must agree with the subject.",
                "A. Rule 10",
                "B. Rule 7",
                "C. Rule 6",
                "D. Rule 9",
                1);
        addQuestion(q205);

        Question q206 = new Question (
                7,
                1,
                9,
                "Who developed the Dewey Decimal System?",
                "A. David Hume",
                "B. Albert Camus",
                "C. Melvil Dewey",
                "D. Kevin Dewey",
                3);
        addQuestion(q206);

        Question q207 = new Question (
                7,
                1,
                9,
                "In the Dewey Decimal System, this includes the references about mythology, histories of religion and the bible.",
                "A. 200-299 Religion",
                "B. 500-599 Pure Science ",
                "C. 900-999 History ",
                "D. 100-199 Philosophy ",
                1);
        addQuestion(q207);

        Question q208 = new Question (
                7,
                1,
                9,
                "In the Dewey Decimal System, this includes the references about medicine, engineering, agriculture, cooking, sewing and manufacturing. What section is it?",
                "A. 700-799 Fine Arts and Recreation",
                "B. 300-399 Social Sciences",
                "C. 000-099 General works of reference",
                "D. 600-699 Useful Arts or Applied Science",
                4);
        addQuestion(q208);

        Question q209 = new Question (
                7,
                1,
                9,
                "In Dewey Decimal System, what section includes architecture, drawing, music, painting, sculpture, photography, and amusement?",
                "A. 700-799 Fine Arts and Recreation",
                "B. 800-899 Literature",
                "C. 000-099 General works of reference ",
                "D. 400-499 Language",
                1);
        addQuestion(q209);

        Question q210 = new Question (
                7,
                1,
                9,
                "What do you call a distinct section of a piece of writing, usually dealing with a single theme and indicated by a new line, indention, or numbering",
                "A. Title",
                "B. Paragraph",
                "C. Concluding sentence",
                "D. Topic sentence",
                2);
        addQuestion(q210);

        Question q211 = new Question (
                7,
                1,
                9,
                "It is one of the features of the paragraph that is a word or phrase given to a text or paragraph. What is it?",
                "A. Topic sentence",
                "B. Title",
                "C. Unity or Logical Consistency",
                "D. Indention",
                2);
        addQuestion(q211);

        Question q212 = new Question (
                7,
                1,
                9,
                "In the features of a paragraph, what do you call the short distance from the margin?",
                "A. Concluding sentence ",
                "B. Title",
                "C. Unity",
                "D. Indention",
                4);
        addQuestion(q212);

        Question q213 = new Question (
                7,
                1,
                9,
                "What do you call the kind of a paragraph that helps tell the story and keeps the story moving?",
                "A. Descriptive",
                "B. Explanatory or Explosive",
                "C. Narrative",
                "D. Persuasive",
                3);
        addQuestion(q213);

        Question q214 = new Question (
                7,
                1,
                9,
                "What language uses words or expressions to convey a meaning that is different from the literal interpretation?",
                "A. Figurative Language",
                "B. Simile",
                "C. Literal Language",
                "D. Personification",
                1);
        addQuestion(q214);

        Question q215 = new Question (
                7,
                1,
                9,
                "This writing is rigid, procedural, purposed purely to convey knowledge, data and information",
                "A. Essay Writing",
                "B. Blog Writing",
                "C. Literary Writing",
                "D. Academic Writing",
                4);
        addQuestion(q215);

        Question q216 = new Question (
                7,
                1,
                9,
                "In the characteristics of Academic Writing, it is to be easily understood by intended audience.",
                "A. Comprehensiveness",
                "B. Specific Audience",
                "C. Clarity",
                "D. Conciseness",
                3);
        addQuestion(q216);

        Question q217 = new Question (
                7,
                1,
                9,
                "This characteristic of Academic Writing refers to factual, correct and free from bias.",
                "A. Accuracy",
                "B. Correctness",
                "C. Clarity",
                "D. Conciseness",
                1);
        addQuestion(q217);

        Question q218 = new Question (
                7,
                1,
                9,
                "What characteristic of Academic Writing includes to target a particular audience?",
                "A. Specific Purpose",
                "B. Specific Audience",
                "C. Accuracy",
                "D. Conciseness",
                2);
        addQuestion(q218);

        Question q219 = new Question (
                7,
                1,
                9,
                "What type of writing is inspired, artistic and entertains with word pics, concepts and deep meaning?",
                "A. Academic Writing",
                "B. Report Writing",
                "C. Blog Writing",
                "D. Literary Writing",
                4);
        addQuestion(q219);

        Question q220 = new Question (
                7,
                1,
                9,
                "What do you call the signs that inform road users of traffic laws and regulations?",
                "A. Regulatory Signs",
                "B. Road Signs",
                "C. Warning Signs",
                "D. Notice Signs",
                2
        );
        addQuestion(q220);

        //ESP 7
        Question q221 = new Question (
                7,
                1,
                3,
                "Ang sumusunod ay mahahalagang layunin ng inaasahang kakayahan at kilos (developmental tasks) sa bawat yugto ng pagtanda ng tao maliban sa:",
                "A. Nagsisilbing gabay kung ano ang inaasahan ng lipunan sa bawat yugto ng buhay",
                "B. Nakatutulong upang malinang ang kakayahang iakma ang sarili sa mga bagong sitwasyon",
                "C. Nagtuturo sa isang nagdadalaga/nagbibinata ng mga nararapat na gawin na akma sa kanilang edad",
                "D. Nagsisilbing pangganyak o motibasyon upang gawin ng isang nagdadalaga/nagbibinata ang inaasahan sa kanya ng lipunan",
                3);
        addQuestion(q221);

        Question q222 = new Question (
                7,
                1,
                3,
                "Ang sumusunod ay ilan sa mga inaasahang kakayahan at kilos na dapat malinang sa panahon ng pagdadalaga / pagbibinata maliban sa ______.",
                "A. Pagsisikap na makakilos nang angkop sa kanyang edad",
                "B. Pagtanggap ng papel sa lipunan na angkop sa babae o lalaki",
                "C. Pagtatamo at pagtanggap ng maayos na ugali sa pakikipagkapwa",
                "D. Pagtatamo ng bago at ganap na pakikipag-ugnayan sa mga kasing edad",
                1);
        addQuestion(q222);

        Question q223 = new Question (
                7,
                1,
                3,
                "Basahin at unawain ang mga talata sa ibaba. Pagkatapos, sagutin ang bilang 3-4. Pagtuntong ng isang bata sa kanyang ika labintatlong taon, nagsisimula ang matulin at kagyat na pagbabago sa kanyang pag-iisip at pag-uugali. Kung dati ay kuntento na ang isang batang lalaki sa paglalaro, ngayon ay tila naaakit na siyang tumingin sa kababaihan. Gayundin ang isang batang babae: nagsisimula na rin siyang kumilos na tulad sa isang ganap na babae. Sa panig ng kalalakihan, nagiging masilakbo ang kanilang pag-iisip at pag-uugali: laging tila humaharap sa hamon na susubok sa kanilang katapangan. Nagiging mapangahas sila sa anumang bagay, waring ipinagwawalambahala ang panganib, nagkukunwarinng hindi nababalisa sa anumang suliranin. Ito ang panahon na tila naghihimagsik ang isang kabataan, waring di matanggap ang katotohanang hindi pa siya ganap na lalaki at nagpupuyos ang kalooban na pasubalian ito sa mundo. Ito ang panahon na ang isang lalaki ay wala pang napapatunayan sa kanyang sarili at sa iba, kaya napakalaki ng kanyang kawalan ng seguridad, lagging humahanap ng pagkakataon na ipakita ang kanyang kahalagahan. Sa panig ng kababaihan, ang isang nagdadalaga ay nagsisimulang iwan ang daigdig ng mga manika at laruan, nag-iingat na kumilos nang magaslaw o tila bata. Isa siyang bulaklak na nagsisimulang mamukadkad. Hango sa: http://cpnhs.com/smf/index.php?topic=167.0. Ano ang pangunahing paksa ng sanaysay?",
                "A. Ang pagbabago sa panahon ng pagdadalaga/pagbibinata",
                "B. Ang mga karanasan na pinagdaraanan ng mga nagdadalaga/nagbibinata.",
                "C. Ang damdamin ng mga nagdadalaga/nagbibinata sa mga pagbabagong kanilang pinagdaraanan",
                "D. Ang pagkakaiba ng pagbabagong pinagdaraanan ng isang nagdadalaga at nagbibinata",
                1);
        addQuestion(q223);

        Question q224 = new Question (
                7,
                1,
                3,
                "Basahin at unawain ang mga talata sa ibaba. Pagkatapos, sagutin ang bilang 3-4. Pagtuntong ng isang bata sa kanyang ika labintatlong taon, nagsisimula ang matulin at kagyat na pagbabago sa kanyang pag-iisip at pag-uugali. Kung dati ay kuntento na ang isang batang lalaki sa paglalaro, ngayon ay tila naaakit na siyang tumingin sa kababaihan. Gayundin ang isang batang babae: nagsisimula na rin siyang kumilos na tulad sa isang ganap na babae. Sa panig ng kalalakihan, nagiging masilakbo ang kanilang pag-iisip at pag-uugali: laging tila humaharap sa hamon na susubok sa kanilang katapangan. Nagiging mapangahas sila sa anumang bagay, waring ipinagwawalambahala ang panganib, nagkukunwarinng hindi nababalisa sa anumang suliranin. Ito ang panahon na tila naghihimagsik ang isang kabataan, waring di matanggap ang katotohanang hindi pa siya ganap na lalaki at nagpupuyos ang kalooban na pasubalian ito sa mundo. Ito ang panahon na ang isang lalaki ay wala pang napapatunayan sa kanyang sarili at sa iba, kaya napakalaki ng kanyang kawalan ng seguridad, lagging humahanap ng pagkakataon na ipakita ang kanyang kahalagahan. Sa panig ng kababaihan, ang isang nagdadalaga ay nagsisimulang iwan ang daigdig ng mga manika at laruan, nag-iingat na kumilos nang magaslaw o tila bata. Isa siyang bulaklak na nagsisimulang mamukadkad. Hango sa: http://cpnhs.com/smf/index.php?topic=167.0. Ano ang pangunahing pagkakaiba ng isang nagdadalaga sa isang nagbibinata ayon sa paglalarawan?",
                "A. Ang nagbibinata ay walang seguridad at ang nagdadalaga ay nakararamdam ng kalituhan",
                "B. Ang nagbibinata ay nagiging mapangahas at ang nagdadalaga ay hindi na naglalaro ng manika at iba pang laruan.",
                "C. Ang nagbibinata ay nagiging masidhi ang pag-iisip at damdamin at ang nagdadalaga ay nagsisimulang maging pino sa kanilang kilos.",
                "D. Ang nagbibinata ay nagsisimulang maging matapang at ang nagdadalaga ay nagsisimula nang kumilos na tulad ng isang ganap na babae.",
                3);
        addQuestion(q224);

        Question q225 = new Question (
                7,
                1,
                3,
                "Basahin ang mga katangian ng mga tinedyer sa ibaba. Ano ang mahuhubog kung ipagpapatuloy ng bawat isa ang kanyang gawi?" +
                        "•	Palaging sinasabi ni Rosemarie sa kanyang sarili na hindi siya perpekto, alam niyang sa bawat pakakamali ay mayroong siyang matututuhan." +
                        "•	Hinahasa ni Stephanie ang kanyang kakayahang suriin at tayahin ang kanyang sariling mga pagtatanghal bilang isang mang-aawit." +
                        "•	Hindi hinahayaan ni Anthony na talunin ng takot at pag-aalinlangan ang kanyang kakayahan." +
                        "•	Hindi natatakot si Renato na harapin ang anumang hamon upang ipakita niya ang kanyang talento.",
                "A. tapang",
                "B. talento at kakayahan",
                "C. tiwala sa sarili",
                "D. positibong pagtingin sa sarili",
                4);
        addQuestion(q225);

        Question q226 = new Question (
                7,
                1,
                3,
                "Bakit mahalaga ang pagtatamo ng bago at ganap na pakikipag-ugnayan sa mga kasing-edad sa panahon ng pagdadalaga at pagbibinata?",
                "A. Upang masiguro niya na may tao na tatanggap sa kanyang mga kalakasan at kahinaan",
                "B. Upang magkaroon siya ng kalaro na magtuturo sa kanya ng pakikipagugnayan sa mga kasing-edad",
                "C. Upang mapatunayan sa lahat ng tao na may kakayahan siyang makipagugnayan nang maayos sa kanyang kasing edad",
                "D. Upang magkaroon siya ng makakasundo na tutulong sa kaniya upang matanggap sa isang pangkat na labas sa kanyang pamilya",
                4);
        addQuestion(q226);

        Question q227 = new Question (
                7,
                1,
                3,
                "Sa yugto ng maagang pagdadalgaga o pagbibinata, inaasahan na ang pagkakaroon ng tinedyer ng kasintahan (girlfriend/boyfriend). Ang pangungusap ay:",
                "A. Tama, dahil mahalagang mamulat ang nagdadalaga o nagbibinata sa pagbuo ng relasyon sa katapat na kasarian sa maagang panahon.",
                "B. Tama, dahil ito ay makatutulong sa kanya upang matutong humawak ng isang relasyon at maging handa sa magiging seryosong relasyon sa hinaharap.",
                "C. Mali, dahil mahalagang masukat muna ang kahandaan ng isip at damdamin ng isang nagdadalaga/nagbibinata sa paghawak ng isang seryosong relasyon.",
                "D. 100-199 Philosophy Mali, dahil hindi pa nararapat na magkaroon ng seryosong relasyon ang isang tinedyer.",
                3);
        addQuestion(q227);

        Question q228 = new Question (
                7,
                1,
                3,
                "Si Cleofe ay iskolar sa isang pamantasang mataas ang kalidad. Napaliligiran siya ng mga mayayaman na kamag-aral. Labis ang kanyang pagkabalisa dahil alam niyang hindi naman siya makasasabay sa mga ito sa maraming bagay. Ano ang pinakamakatuwirang gawin ni Cleofe?",
                "A. Makipagkaibigan lamang siya sa kapwa niya mga iskolar na mahirap din.",
                "B. Ipakita niya ang kanyang totoong pagkatao.",
                "C. Kausapin niya ang kanyang mga magulang upang bumili ng mga gamit at damit na halos katulad ng sa mga mayayamang kamag-aral.",
                "D. Makiangkop sa kamag-aral na mayaman sa oras na sila ang kasama at sa mga kapwa niyang iskolar na mahirap kung sila naman ang kasama.",
                2);
        addQuestion(q228);

        Question q229 = new Question (
                7,
                1,
                3,
                "Masasabi lamang na ganap ang pakikipag-unayan kung handang ipaalam ang lahat sa kapwa. Ang pangungusap ay:",
                "A. Tama, dahil ito ay nagpapakita ng tiwala sa kapwa.",
                "B. Tama, dahil ito ang magiging simula ng isang malalim na pakikipagugnayan.",
                "C. Mali, dahil sa kasapi ng pamilya lamang nararapat na sabihin ang lahat ng sikreto.",
                "D. Mali, dahil mahalagang magkaroon ng limitasyon upang hindi magamit ang mga impormasyon tungkol sa sarili laban sa kanya sa hinaharap.",
                4);
        addQuestion(q229);

        Question q230 = new Question (
                7,
                1,
                3,
                "Si Bernard ay mababa ang tiwala sa sarili sa kabila ng kanyang talento. Hindi niya ito ipinakikita sa paaralan dahil sa takot na hindi ito maging kalugodlugod sa iba pang mga mag-aaral. Ano ang makatuwirang gawin ni Bernard?",
                "A. Kausapin niya ang kanyang sarili at sabihin na hindi matatalo ng hindi pagtanggap ng iba sa kanyang talento ang kanyang pagnanais na umangat dahil sa kanyang kakayahan.",
                "B. Humingi siya ng papuri mula sa kanyang mga kaibigan at kapamilya na makatutulong upang maiangat ang kanyang tiwala sa sarili",
                "C. Harapin niya ang mga hamon nang may tapang at hayaang mangibabaw ang kanyang kalakasan.",
                "D. Huwag niyang iisipin na mas magaling ang iba sa kanya, bagkus isipin niya na siya ay nakaaangat sa lahat.",
                1);
        addQuestion(q230);

        Question q231 = new Question (
                7,
                1,
                3,
                "It is one of the features of the paragraph that is a word or phrase given to a text or paragraph. What is it?",
                "A. Ang talento ay isang pambihira at likas na kakayahan samantalang ang kakayahan ay kalakasang intelektwal upang makagawa ng isang pambihirang bagay.",
                "B. Ang talento ay mula sa pambihirang katangian na minana sa magulang samantalang ang kakayahan ay tinataglay ng tao dahil sa kanyang kakayahang mag-isip.",
                "C. Ang talento ay mahirap sukatin samantalang ang kakayahan ay tinataglay ng tao dahil sa kanyang kakayahang mag-isip.",
                "D. Ang talento ay kusang lumalabas sa takdang panahon samantalang ang kakayahan ay kailangang dumaan sa proseso ng pagsasanay.",
                4);
        addQuestion(q231);

        Question q232 = new Question (
                7,
                1,
                3,
                "Maliit pa lang si Joanna nang siya ay matuklasan ng kanyang mga magulang na magaling sa pag-awit. Sa edad na tatlo, nakasali na siya sa mga patimpalak at siya ay nakikilala dahil sa kanyang kahusayan sa kabila ng murang edad. Ngunit sa kanyang paglaki ay naging mahiyain si Joanna at hindi na sumasali sa mga patimpalak dahil ayaw niyang humarap sa maraming tao. Hindi alam ng kanyang mga kamag-aral ang kanyang talento dahil hindi naman siya nagpapakita nito kahit sa mga gawain sa klase o sa paaralan. Palagi pa ring umaawit si Joanna ngunit ito ay sa kanilang lamang bahay kasabay ang kanyang nakatatandang kapatid. Ano ang pangunahing balakid sa pagtatagumpay ni Joanna?",
                "A. Ang kawalan ng suporta ng kanyang mga magulang",
                "B. Ang kawalan niya ng tiwala sa kanyang kakayahan",
                "C. Ang kanyang paniniwala na nakakatakot humarap sa maraming tao",
                "D. Ang kanyang mga kamag-aral dahil hindi siya hinihimok na sumali sa paligsahan at magtanghal.",
                2);
        addQuestion(q232);

        Question q233 = new Question (
                7,
                1,
                3,
                "Maliit pa lang si Joanna nang siya ay matuklasan ng kanyang mga magulang na magaling sa pag-awit. Sa edad na tatlo, nakasali na siya sa mga patimpalak at siya ay nakikilala dahil sa kanyang kahusayan sa kabila ng murang edad. Ngunit sa kanyang paglaki ay naging mahiyain si Joanna at hindi na sumasali sa mga patimpalak dahil ayaw niyang humarap sa maraming tao. Hindi alam ng kanyang mga kamag-aral ang kanyang talento dahil hindi naman siya nagpapakita nito kahit sa mga gawain sa klase o sa paaralan. Palagi pa ring umaawit si Joanna ngunit ito ay sa kanilang lamang bahay kasabay ang kanyang nakatatandang kapatid. Ano ang nararapat na gawin ni Joanna?",
                "A. Kailangan niyang kausapin ang kanyang sarili at sabihing mas magaling siya sa pag-awit sa sinoman na kanyang narinig sa paaralan.",
                "B. Kailangan niyang humingi ng tulong sa kanyang kapatid upang palaging samahan siya sa lahat ng kanyang paligsahan at pagtatanghal.",
                "C. Kailangan niyang kausapin ang kanyang sarili at sabihin na kaya niyang harapin ang anomang hamon at lagpasan ang kanyang mga kahinaan",
                "D. Kailangan niyang magsanay nang labis upang maperpekto niya ang kanyang talento at hindi matakot na mapahiya sa harap ng maraming tao",
                3);
        addQuestion(q233);

        Question q234 = new Question (
                7,
                1,
                3,
                "Bakit mahalagang tuklasin at paunlarin ang mga angking talento at kakayahan?",
                "A. Figurative LanguageUpang magkaroon ng tiwala sa sarili at malampasan ang mga kahinaan",
                "B. Upang maisakatuparan ang mga tungkulin sa sarili at sa lipunan",
                "C. Upang makapaglingkod sa pamayanan",
                "D. Lahat ng nabanggit",
                4);
        addQuestion(q234);

        Question q235 = new Question (
                7,
                1,
                3,
                "Si Cleo ay mahusay sa paglalaro ng basketball. Labis ang paghanga sa kanya ng kanyang mga kasamahan sa team. Sa tuwing maglalaro ay siya ang nakapagbibigay ng malaking puntos sa kanilan team. Makikitang halos naperpekto na niya ang kanyang kakayahan sa basketball. Ngunit sa labis na kaabalahan sa pag-aaral, barkada at pamilya hindi na siya nakapagsasanay nang mabuti. Ano ang maaaring maging kahihinatnan ng ganitong gawi ni Cleo?",
                "A. Manghihina ang kanyang katawan dahil sa kakulangan ng pagsasanay",
                "B. Blog WritingHindi magkakaroon ng pagbabago sa kanyang paraan ng paglalaro dahil halos perpekto na niya ang kanyang kakayahan.",
                "C. Makaaapekto ito sa kanyang laro dahil bukod sa pagkokondisyon ng katawan ay mahalaga ang pagsasanay kasama ng kanyang team upang mahasa sa pagbuo ng laro kasama ang mga ito.",
                "D. Hindi ito makaaapekto dahil alam naman niyang laging nariyan ang kanyang mga kasamahan na patuloy ang masugid na pagsasanay at nakahandang sumuporta sa kanya sa laro.",
                3);
        addQuestion(q235);

        Question q236 = new Question (
                7,
                1,
                3,
                "Sa pagpasok ni Angeline sa high school ay naging kapansin-pansin ang kanyang pagiging matangkad. Isang araw ay nilapitan siya ng isang kaklase ay inalok na sumali sa volleyball team ng paaralan. Nabuo ang interes sa kanyang isip na sumali dahil wala pa siyang kinahihiligan ng sports hanggang sa kasalukuyan. Hindi pa siya nagkapaglalaro ng volleyball minsan man sa kanyang buhay ngunit nakahanda naman siyang magsanay. Sa kabila ng mga agam-agam ay nagpasiya siyang sumali rito. Ano kaya ang magiging kahihinatnan ng pasya ni Angeline?",
                "A. Magiging mahusay siya sa paglalaro ng volleyball dahil sa kanyang interes at kahandaan na dumaan sa pagsasanay.",
                "B. Magiging mahusay siya sa paglalaro sa matagal na panahon dahil hindi siya makasasabay sa kanyang mga kasama na matagal ng nagsasanay.",
                "C. Magiging mahirap ang kanyang pagdaraanan dahil hindi sapat ang kanyang pisikal na katangian lalo na at wala naman siyang talento sa paglalaro ng volleyball.",
                "D. Magiging mahirap lalo na sa kanyang pangangatawan dahil hindi siya sanay sa paglahok sa anomang isports sa matagal na panahon.",
                1);
        addQuestion(q236);

        Question q237 = new Question (
                7,
                1,
                3,
                "Sa murang edad ay dapat ng matuklasan ang talento at kakayahan upang mahaba ang panahon ng pagpapaunlad nito. Ang pangungusap ay:",
                "A. Tama, dahil ang patuloy at mahabang pagsasanay ang nagpapaperpekto sa talento at kakayahan ng tao.",
                "B. Tama, dahil mas mahabang panahon ang maitutuon sa mga pagsubok sa talento katulad ng pagsali sa paligsahan at mga pagtatanghal",
                "C. Mali, dahil walang takdang panahon ang pag-usbong ng talento",
                "D. Mali, dahil maaring magbunga ito ng pagkabagot at pagkasawa",
                3);
        addQuestion(q237);

        Question q238 = new Question (
                7,
                1,
                3,
                "Ang mga sumusunod ay katangian ng tiwala sa sarili maliban sa:",
                "A. Ito ay hindi namamana",
                "B. Ito ay nababago sa paglipas ng panahon",
                "C. Ito ay hindi nakasalalay na sa mga bagay na labas sa ating sarili",
                "D. Ito ay unit-unting natutuklasan bunga ng karanasan",
                4);
        addQuestion(q238);

        Question q239 = new Question (
                7,
                1,
                3,
                "Mababa ang marka ni Leo sa English dahil hirap siya sa asignaturang ito. Palaging mababa ang kanyang marka sa mga pagsusulit at hindi siya magkaroon ng lakas ng loob na magrecite sa klase dahil hirap siya sa pagsasalita ng inlges. Ano ang maaarig maging solusyon sa suliranin ni Leo?",
                "A. Maglapat ng mga paraan kung paano isasagawa ang pagpapaunlad ng kanyang kakayahan sa pagsasalita at pagsusulat sa Ingles",
                "B. Tayahin kung ano ang dahilan ng kanyang kahinaan sa asignatura",
                "C. Tukuyin kung ano ang nais na matutuhan upang ito ay paularin",
                "D. Lahat ng nabanggit",
                4);
        addQuestion(q239);

        Question q240 = new Question (
                7,
                1,
                3,
                "Bakit may mga taong nagsasabi na sila ay ipinanganak na walang talento?",
                "A. Dahil hindi sila naglalaan ng panahon upang ito ay tuklasin",
                "B. Dahil mayroon talagang tao na ipinanganak na walang talento",
                "C. Dahil hindi pa panahon upang matuklasan nila ang kanilang talento",
                "D. Dahil hindi nila kinikilala ang kanilang mga kakayahan na talento dahil hindi naman ito makaagaw atensyon",
                4);
        addQuestion(q240);

        //ICT 7
        Question q241 = new Question (
                7,
                1,
                6,
                "It is the information given to the computer",
                "A. File",
                "B. PDF",
                "C. Data",
                "D. Code",
                3);
        addQuestion(q241);

        Question q242 = new Question (
                7,
                1,
                6,
                "______ is an application software developed by MS Incorporated. It is a word processing software that is used to create and edit professional looking document.",
                "A. MS Word",
                "B. Adobe Acrobat  Reader DC",
                "C. MS Excel",
                "D. WPS Office",
                1);
        addQuestion(q242);

        Question q243 = new Question (
                7,
                1,
                6,
                "A ______ is an electronic machine that processes data. It is made up of monitor, CPU, Keyboard, Mouse, and Printer.",
                "A. Cellphone",
                "B. Laptop",
                "C. Xbox ",
                "D. Computer",
                4);
        addQuestion(q243);

        Question q244 = new Question (
                7,
                1,
                6,
                "It is found on the top of the window when you open MS Word app, contains opened application name.",
                "A. Menu bar",
                "B. Status bar",
                "C. Ruler bar",
                "D. Title bar",
                4);
        addQuestion(q244);

        Question q245 = new Question (
                7,
                1,
                6,
                "What is the meaning of CPU?",
                "A. Center Process Unit",
                "B. Central Processing Unit",
                "C. Center of Process Unit",
                "D. Central Processing of the Unit",
                2);
        addQuestion(q245);

        Question q246 = new Question (
                7,
                1,
                6,
                "It looks like a typewriter and has many buttons",
                "A. Monitor",
                "B. Typewriter",
                "C. Keyboard",
                "D. Joystick",
                3);
        addQuestion(q246);

        Question q247 = new Question (
                7,
                1,
                6,
                "______ is used to scroll the page up/down and right/left when pages are zoom low or high",
                "A. Ruler bar",
                "B. Scroller bar",
                "C. Scrolling bar",
                "D. Standard formatting bar",
                3);
        addQuestion(q247);

        Question q248 = new Question (
                7,
                1,
                6,
                "‘B’ is the symbol of what?",
                "A. Underline",
                "B. Border ",
                "C. Body",
                "D. Bold",
                4);
        addQuestion(q248);

        Question q249 = new Question (
                7,
                1,
                6,
                "What are the two types of scrolling bar?",
                "A. horizontal and vertical scrolling bar",
                "B. top and bottom scrolling bar",
                "C. left and right scrolling bar",
                "D. up and down scrolling bar",
                1);
        addQuestion(q249);

        Question q250 = new Question (
                7,
                1,
                6,
                "It looks like a TV Screen and it shows whatever you type on the keyboard or draw with the mouse.",
                "A. LCD screen",
                "B. Monitor",
                "C. AMOLED screen",
                "D. Display",
                2);
        addQuestion(q250);

        Question q251 = new Question (
                7,
                1,
                6,
                "A page or set of pages of printed material printed produced by a computer’s printer.",
                "A. print out",
                "B. printed page",
                "C. bond paper",
                "D. photocopy",
                1);
        addQuestion(q251);


        Question q252 = new Question (
                7,
                1,
                6,
                "It changes the font face, you can pick new font for your text",
                "A. Font Style",
                "B. Font Size",
                "C. Change Case",
                "D. Text effects",
                1);
        addQuestion(q252);

        Question q253 = new Question (
                7,
                1,
                6,
                "Is used to take live photos/videos and you can save it in computer",
                "A. Computer Lens",
                "B. Built-in Camera",
                "C. Web Camera/Digital Camera",
                "D. Camera lens",
                3);
        addQuestion(q253);

        Question q254 = new Question (
                7,
                1,
                6,
                "It creates a large capital letter at the beginning of the paragraph",
                "A. Grow Font",
                "B. DropCap",
                "C. Word Art",
                "D. Quick Parts",
                2);
        addQuestion(q254);

        Question q255 = new Question (
                7,
                1,
                6,
                "‘Aa’ is the symbol of what?",
                "A. Strikethrough",
                "B. Font Color",
                "C. Font Size",
                "D. Change case",
                4);
        addQuestion(q255);

        Question q256 = new Question (
                7,
                1,
                6,
                "It helps us put data in the computer, it also gives instructions to the computer",
                "A. Keyboard",
                "B. Input devices ",
                "C. CPU",
                "D. Output devices",
                2);
        addQuestion(q256);


        Question q257 = new Question (
                7,
                1,
                6,
                "All of these are OUTPUT DEVICES, except ONE",
                "A. Monitor",
                "B. Headphones",
                "C. Web Camera",
                "D. Printer",
                3);
        addQuestion(q257);

        Question q258 = new Question (
                7,
                1,
                6,
                "All of these belong to FILE TAB, except ONE",
                "A. New",
                "B. Save",
                "C. Open",
                "D. Cut",
                4);
        addQuestion(q258);

        Question q259 = new Question (
                7,
                1,
                6,
                "It contains all the menus such as File, Home, Insert, Page Layout, References, Mailings, Review, and View",
                "A. Menu Bar",
                "B. Standard Formatting Bar",
                "C. Status Bar",
                "D. Title Bar",
                1);
        addQuestion(q259);

        Question q260 = new Question (
                7,
                1,
                6,
                "It is used to adjust such as margins, orientation, size, spacing, indents, etc.",
                "A. Insert",
                "B. Home",
                "C. Page Layout",
                "D. Review",
                3);
        addQuestion(q260);

        //SCIENCE 7
        Question q261 = new Question (
                7,
                1,
                2,
                "Two liquids mixed in each other are said to be ______.",
                "A. soluble",
                "B. miscible",
                "C. insoluble",
                "D. immiscbile",
                2);
        addQuestion(q261);

        Question q262 = new Question (
                7,
                1,
                2,
                "Which of the following does not form a solution?",
                "A. alcohol and water",
                "B. salt and water",
                "C. iron fillings",
                "D. sugar and water",
                3);
        addQuestion(q262);

        Question q263 = new Question (
                7,
                1,
                2,
                "Which of these elements is radioactive?",
                "A. Lead",
                "B. Xenon",
                "C. Americium",
                "D. Neon",
                3);
        addQuestion(q263);

        Question q264 = new Question (
                7,
                1,
                2,
                "In a sugar solution, which one is the solvent",
                "A. water",
                "B. salt",
                "C. sugar",
                "D. sand",
                1
        );
        addQuestion(q264);

        Question q265 = new Question (
                7,
                1,
                2,
                "Blood plasma is an example of _______",
                "A. suspension",
                "B. naturally occuring solution",
                "C. solvent",
                "D. solute",
                2);
        addQuestion(q265);

        Question q266 = new Question (
                7,
                1,
                2,
                "A salt derived from a strong base and weak acid will give salt that is _______",
                "A. neutral",
                "B. acidic",
                "C. volatile",
                "D. basic",
                4);
        addQuestion(q266);

        Question q267 = new Question (
                7,
                1,
                2,
                "What is the neutral pH level?",
                "A. pH 5",
                "B. pH 8",
                "C. pH 7",
                "D. pH 6",
                3);
        addQuestion(q267);

        Question q268 = new Question (
                7,
                1,
                2,
                "What is the periodic symbol of Antimony?",
                "A. Au",
                "B. An",
                "C. Am",
                "D. Sb",
                4);
        addQuestion(q268);

        Question q269 = new Question (
                7,
                1,
                2,
                "The solution that contains the maximum amount of solute dissolved by a given amount of solvent is called a __________",
                "A. saturated solution",
                "B. solubility of the solute",
                "C. solution",
                "D. unsaturated solution",
                1);
        addQuestion(q269);

        Question q270 = new Question (
                7,
                1,
                2,
                "Which metal pollutes the air of a big city?",
                "A. Lead",
                "B. Copper",
                "C. Gallium",
                "D. Cadmium",
                1);
        addQuestion(q270);

        Question q271 = new Question (
                7,
                1,
                2,
                "How many ml of 3.5% solution would contain 2.8g of salt?",
                "A. 0.98 ml",
                "B. 0.098 ml",
                "C. 9.8 ml",
                "D. 0.0098 ml",
                2);
        addQuestion(q271);

        Question q272 = new Question (
                7,
                1,
                2,
                "Dry air consists of what?",
                "A. 70% Nitrogen, 29% oxygen, 1% argon, about 1% carbon dioxide, 0.04% water vapour",
                "B. 78% nitrogen, 21% oxygen, 1% argon, about",
                "C. 78% Oxygen, 21% carbon dioxide, 1% nitrogen, about 1% argon, 0.04% water vapour ",
                "D. 80% Oxygen, 10% Nitrogen, 10% carbon dioxide",
                2);
        addQuestion(q272);

        Question q273 = new Question (
                7,
                1,
                2,
                "It is the characteristics of metal that can be pounded and shaped into very thin sheets without breaking.",
                "A. ductility",
                "B. malleability",
                "C. dull",
                "D. brittle",
                2);
        addQuestion(q273);

        Question q274 = new Question (
                7,
                1,
                2,
                "It is the characteristics of metal that can be stretched into wires or thread",
                "A. brittle",
                "B. dull",
                "C. malleability",
                "D. ductility",
                4);
        addQuestion(q274);

        Question q275 = new Question (
                7,
                1,
                2,
                "It is the upward push exerted by a liquid, like water, on an object.",
                "A. buoyant force",
                "B. volume",
                "C. density",
                "D. mass",
                1);
        addQuestion(q275);

        Question q276 = new Question (
                7,
                1,
                2,
                "It is the changing of an object into another substance after interacting with oxygen.",
                "A. carbonation",
                "B. density",
                "C. oxidation",
                "D. suspension ",
                1);
        addQuestion(q276);

        Question q277 = new Question (
                7,
                1,
                2,
                "A compound produce when an acid reacts with a base",
                "A. salt",
                "B. litmus paper",
                "C. water",
                "D. rust",
                3);
        addQuestion(q277);

        Question q278 = new Question (
                7,
                1,
                2,
                "Combination of two or more substances that are combined physically.",
                "A. matter",
                "B. element",
                "C. mixture",
                "D. compound",
                3);
        addQuestion(q278);

        Question q279 = new Question (
                7,
                1,
                2,
                "How many ml of 3.5% solution would contain 2.8 g of salt?",
                "A. 9.8 ml",
                "B. 0.98 ml",
                "C. 8.0 ml",
                "D. 0.098 ml",
                4);
        addQuestion(q279);

        Question q280 = new Question (
                7,
                1,
                2,
                "In what group of elements does Hydrogen belong?",
                "A. Actinides",
                "B. Alkali metals",
                "C. Halogens",
                "D. Non-metals",
                4);
        addQuestion(q280);

        //MAPEH 7
        Question q281 = new Question (
                7,
                1,
                4,
                "What is the structure of a musical composition called?",
                "A. Tempo",
                "B. Texture",
                "C. Timbre",
                "D. Form",
                4);
        addQuestion(q281);

        Question q282 = new Question (
                7,
                1,
                4,
                "It it is the quality or color of tone of an instrument or voice.",
                "A. Rhythm",
                "B. Timbre",
                "C. Tonality",
                "D. Form",
                2);
        addQuestion(q282);

        Question q283 = new Question (
                7,
                1,
                4,
                "It refers to the flow, the breathing pattern or simply the pulse in music.",
                "A. Melody",
                "B. Dynamics",
                "C. Rhythm",
                "D. Beat",
                3);
        addQuestion(q283);

        Question q284 = new Question (
                7,
                1,
                4,
                "It refers to the rate of speed in a composition.",
                "A. Tempo",
                "B. Melody",
                "C. Harmony",
                "D. Timbre",
                1);
        addQuestion(q284);

        Question q285 = new Question (
                7,
                1,
                4,
                "How many beats does a half note have?",
                "A. 1 beat",
                "B. 2 beats",
                "C. 3 beats",
                "D. 4 beats",
                2);
        addQuestion(q285);

        Question q286 = new Question (
                7,
                1,
                4,
                "What is the term for an art originating among the common people of a nation or region and usually reflecting their traditional culture and history?",
                "A. Literary Art",
                "B. Folk Art",
                "C. Culinary Art",
                "D. Painting",
                2);
        addQuestion(q286);

        Question q287 = new Question (
                7,
                1,
                4,
                "They are known for their iloco or inabel fabric",
                "A. Ilocos Region",
                "B. Cordillera",
                "C. Davao",
                "D. Pangasinan",
                1);
        addQuestion(q287);

        Question q288 = new Question (
                7,
                1,
                4,
                "The Ifugaos weave a loincloth called ikat. From what country did the term ikat originated",
                "A. Malaysia",
                "B. Vietnam",
                "C. Indonesia",
                "D. Singapore",
                3);
        addQuestion(q288);

        Question q289 = new Question (
                7,
                1,
                4,
                "They are known for their different types of baskets such as the bobo and suklang",
                "A. Ifugaos",
                "B. Bontocs",
                "C. Igorots",
                "D. Ilocanos",
                2);
        addQuestion(q289);

        Question q290 = new Question (
                7,
                1,
                4,
                "What is the Ivatan's head gear for women called?",
                "A. Ikat",
                "B. Lufid",
                "C. Lingling-o",
                "D. Vakul",
                4);
        addQuestion(q290);

        Question q291 = new Question (
                7,
                1,
                4,
                "It is the condition of being physically fit and healthy, especially as a result of exercise and proper nutrition.",
                "A. Fitness",
                "B. Skill",
                "C. Wellness",
                "D. Agility",
                1);
        addQuestion(q291);

        Question q292 = new Question (
                7,
                1,
                4,
                "It enhances one's performance athletic or sports events.",
                "A. Health-Related Fitness",
                "B. Skill-Related Fitness",
                "C. Wellness",
                "D. Flexibility",
                2);
        addQuestion(q292);

        Question q293 = new Question (
                7,
                1,
                4,
                "What is the ability of the muscle to work over an extended period of time without fatigue?",
                "A. Muscular Strength",
                "B. Muscular Endurance",
                "C. Flexibility",
                "D. Body Composition",
                2);
        addQuestion(q293);

        Question q294 = new Question (
                7,
                1,
                4,
                "It focus on factors that promote optimum health and prevent the onset of disease and problems aassociated with inactivity.",
                "A. Skill-Related Fitness",
                "B. Health-Related Fitness",
                "C. Wellness",
                "D. Fitness",
                2);
        addQuestion(q294);

        Question q295 = new Question (
                7,
                1,
                4,
                "Which of the following is not a part of the components of skill-related fitness?",
                "A. Agility",
                "B. Speed",
                "C. Flexibility",
                "D. Balance",
                3);
        addQuestion(q295);

        Question q296 = new Question (
                7,
                1,
                4,
                "It is the physiological and emotional responses to a significant or unexpected change or disruption in one's life.",
                "A. Stress",
                "B. Depression",
                "C. Mental Health",
                "D. Stressor",
                1);
        addQuestion(q296);

        Question q297 = new Question (
                7,
                1,
                4,
                "It referss to the positive response of the body from a stressor",
                "A. Distress",
                "B. Eustress",
                "C. Mental Health",
                "D. Emotional Health",
                2);
        addQuestion(q297);

        Question q298 = new Question (
                7,
                1,
                4,
                "It refers to the negative reaction of the body towards a given stressor.",
                "A. Mental Health",
                "B. Distress",
                "C. Eustress",
                "D. Emotional Health",
                2);
        addQuestion(q298);

        Question q299 = new Question (
                7,
                1,
                4,
                "It refers to the things that makes a person stressed",
                "A. Distress",
                "B. Eustress",
                "C. Stressors",
                "D. General Adaptation Syndrome",
                3);
        addQuestion(q299);

        Question q300 = new Question (
                7,
                1,
                4,
                "Which of the following is not a cause of distress?",
                "A. Arguing with a classmate",
                "B. Losing your money",
                "C. Getting a failing mark",
                "D. Getting a birthday surprise",
                4);
        addQuestion(q300);

        //FILIPINO 7
        Question q301 = new Question (
                7,
                1,
                7,
                "Anong elemento ng kuwento ang nagpapahiwatig kung saan at kailan naganap ang pangyayari?",
                "A. Banghay",
                "B. Simula",
                "C. Tagpuan",
                "D. Tauhan",
                3);
        addQuestion(q301);

        Question q302 = new Question (
                7,
                1,
                7,
                "Ano ang pahayag ang nagbibigay ng patunay?",
                "A. Hindi kapani-paniwala",
                "B. Kasinungalingan",
                "C. May dokumentaryong ebidensya",
                "D. Walang matibay na ebidensya",
                3);
        addQuestion(q302);

        Question q303 = new Question (
                7,
                1,
                7,
                "Anong element ng kuwento kung saan sila maaring mabuti o masama?",
                "A. Banghay",
                "B. Simula",
                "C. Tagpuan",
                "D. Tauhan",
                4);
        addQuestion(q303);

        Question q304 = new Question (
                7,
                1,
                7,
                "Anong element ng kuwento kung saan ang kawilihan ng mga mambabasa ay nakasalalay dito>",
                "A. Banghay",
                "B. Simula",
                "C. Tunggalian",
                "D. Kasukdulan",
                2);
        addQuestion(q304);

        Question q305 = new Question (
                7,
                1,
                7,
                "Anong elemento ng kuwento kung saan ito ang pinakamataas na bahagi ng kuwento?",
                "A. Kakalasan",
                "B. Kaskdulan",
                "C. Banghay",
                "D. Kasukdulan",
                4);
        addQuestion(q305);

        Question q306 = new Question (
                7,
                1,
                7,
                "Anong elemento ang kahinatnan o resolusyon ng kuwentong maaring masaya o malungkot?",
                "A. Tunggalian",
                "B. Kakalasan",
                "C. Wakas",
                "D. Kasukdulan",
                3);
        addQuestion(q306);

        Question q307 = new Question (
                7,
                1,
                7,
                "Anong elemento ang nagpapakita ng maayos na pagkasunod-sunod ng pangyayari?",
                "A. Banghay",
                "B. Tunggalian",
                "C. Kakalasan",
                "D. Simula",
                1);
        addQuestion(q307);

        Question q308 = new Question (
                7,
                1,
                7,
                "Anong elemento ang nagbibigay daan sa wakas?",
                "A. Kasukdulan",
                "B. Kakalasan",
                "C. Tunggalian",
                "D. Wakas",
                2);
        addQuestion(q308);

        Question q309 = new Question (
                7,
                1,
                7,
                "Anong elemento kung saan bumababa ang takbo ng kuwento?",
                "A. Kalakasan",
                "B. Kasukdulan",
                "C. Banghay",
                "D. Wakas",
                1);
        addQuestion(q309);

        Question q310 = new Question (
                7,
                1,
                7,
                "Anong elemento ang pakikitunggali ng pangunahing tauhan",
                "A. Tunggalian",
                "B. Banghay",
                "C. Tagpuan",
                "D. Simula",
                1);
        addQuestion(q310);

        Question q311 = new Question (
                7,
                1,
                7,
                "Anong elemento ang tumutukoy sa ipinakilala ang tauhan at ang tagpuang iikutan?",
                "A. Banghay",
                "B. Tagpuan",
                "C. Simula",
                "D. Kakalasan",
                3);
        addQuestion(q311);

        Question q312 = new Question (
                7,
                1,
                7,
                "Anong elemento ang nagbibigay buhay sa kuwento?",
                "A. Tagpuan",
                "B. Simula",
                "C. Tauhan",
                "D. Wakas",
                3);
        addQuestion(q312);

        Question q313 = new Question (
                7,
                1,
                7,
                "Anong elemento ang nagbibigay aksyon?",
                "A. Kakalasan",
                "B. Banghay",
                "C. Tunggalian",
                "D. Kasukdulan",
                4);
        addQuestion(q313);

        Question q314 = new Question (
                7,
                1,
                7,
                "Ano ang pang-ugnay na ginagamit sa pagbibigay ng sanhi?",
                "A. Dahil",
                "B. Hindi",
                "C. Dahil dito",
                "D. A at C",
                1);
        addQuestion(q314);

        Question q315 = new Question (
                7,
                1,
                7,
                "Ano ang pang-ugnay na ginagamit sa pagbibigay ng bunga?",
                "A. Sapagkat",
                "B. Kaya",
                "C. Dahil",
                "D. Kapag",
                2);
        addQuestion(q315);

        Question q316 = new Question (
                7,
                1,
                7,
                "Anong pang-ugnay ang ginagamit sa pagbibigay ng pagpapahayag ng saloobin",
                "A. Pagkat",
                "B. Oo",
                "C. Totoo",
                "D. Hinuhako",
                4);
        addQuestion(q316);

        Question q317 = new Question (
                7,
                1,
                7,
                "Anong pang-ugnay ang ginagamit sa pagbibigay ng pagtutol?",
                "A. Bagamat",
                "B. Basta",
                "C. Kung gayon",
                "D. Sana",
                1);
        addQuestion(q317);

        Question q318 = new Question (
                7,
                1,
                7,
                "Anong pang-ugnay ang ginagamit sa pagbibiga ng panghihikayat?",
                "A. Sapagkat",
                "B. Dahil",
                "C. Mabuti",
                "D. Basta",
                3);
        addQuestion(q318);

        Question q319 = new Question (
                7,
                1,
                7,
                "Anong pang-ugnay ang ginagamit sa pagbibigay ng pag sang-ayon?",
                "A. Naging",
                "B. Sigurado",
                "C. Hindi",
                "D. Subalit",
                2);
        addQuestion(q319);

        Question q320 = new Question (
                7,
                1,
                7,
                "Ano ang saktong pagkasunod ng elemento ng kuwento?",
                "A. Simula - Kakalasan - Tunggalian - Kasukdulan - Wakas",
                "B. Simula - Kasukdulan - Tunggalian - Wakas",
                "C. Simula - Kasukdulan - Kakalasan - Wakas",
                "D. Simula - Tunggalian -Kasukdulan - Wakas",
                4);
        addQuestion(q320);

        //MATH 7
        Question q321 = new Question (
                7,
                1,
                5,
                "Is a collection of well-defined objects.",
                "A. Set",
                "B. Null Set",
                "C. Venn Diagram",
                "D. Number Line",
                1);
        addQuestion(q321);

        Question q322 = new Question (
                7,
                1,
                5,
                "It is a set without an element",
                "A. Set",
                "B. Number Line",
                "C. Null Set",
                "D. Venn Diagram",
                3);
        addQuestion(q322);

        Question q323 = new Question (
                7,
                1,
                5,
                "Given the set of days in a week that starts with letter S, then what is the cardinality?",
                "A. 4",
                "B. 2",
                "C. 1",
                "D. 3",
                2);
        addQuestion(q323);

        Question q324 = new Question (
                7,
                1,
                5,
                "How many elements are in the power set of A = {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday}?",
                "A. 2",
                "B. 128",
                "C. 64",
                "D. Sunday",
                2);
        addQuestion(q324);

        Question q325 = new Question (
                7,
                1,
                5,
                "Is an illustration of sets using circles",
                "A. Venn Diagram",
                "B. Set",
                "C. Number Line",
                "D. Subset",
                1);
        addQuestion(q325);

        Question q326 = new Question (
                7,
                1,
                5,
                "If the absolute value of |15| is 15, then what is the absolute value of |-15|?",
                "A. -15",
                "B. 0",
                "C. 15",
                "D. 225",
                3);
        addQuestion(q326);

        Question q327 = new Question (
                7,
                1,
                5,
                "If you are asked to find the distance using the number line, then how far is 12 to the right from 3 to the left?",
                "A. 9",
                "B. -9",
                "C. 15",
                "D. -15",
                3);
        addQuestion(q327);

        Question q328 = new Question (
                7,
                1,
                5,
                "In plotting the number line, what is the number between the negative and positive number?",
                "A. Null",
                "B. 0",
                "C. Null set",
                "D. Infinity Symbol",
                2);
        addQuestion(q328);

        Question q329 = new Question (
                7,
                1,
                5,
                "Given the 3(5) = 5(3), then which property multiplication is being illustrated?",
                "A. Commutative Property",
                "B. Inverse Property",
                "C. Multiplicative Identity Property",
                "D. Distributive Property",
                1);
        addQuestion(q329);

        Question q330 = new Question (
                7,
                1,
                5,
                "Given 10+(-10) = 0 then which property of addition is being illustrated?",
                "A. Commutative Property",
                "B. Inverse Property",
                "C. Associative Property",
                "D. Additive Identity Property",
                2);
        addQuestion(q330);

        Question q331 = new Question (
                7,
                1,
                5,
                "Given -3, -1, 0, -2, -5, -4 Arrange the rational numbers in ascending order.",
                "A. 0, -1, -2, -3, -4, -5",
                "B. -1, -2, -3, -4, -5, 0",
                "C. -5, -4, -3, -2, -1, 0",
                "D. 0, -5, -1, -4, -2, -3",
                3);
        addQuestion(q331);

        Question q332 = new Question (
                7,
                1,
                5,
                "What is the square root of 16",
                "A. 8",
                "B. 2",
                "C. 4",
                "D. 16",
                3);
        addQuestion(q332);

        Question q333 = new Question (
                7,
                1,
                5,
                "What is the 2nd root of 64?",
                "A. -6",
                "B. -32",
                "C. -16",
                "D. -8",
                4);
        addQuestion(q333);

        Question q334 = new Question (
                7,
                1,
                5,
                "Given the square root of 15, then between which two consecutive integers does the square root lie?",
                "A. 4 and 5",
                "B. 3 and 4",
                "C. 5 and 6",
                "D. 2 and 3",
                2);
        addQuestion(q334);

        Question q335 = new Question (
                7,
                1,
                5,
                "Given the square root of 100 then 10 is",
                "A. A perfect root",
                "B. Perfect square root",
                "C. Principal root",
                "D. Imaginary root",
                3);
        addQuestion(q335);

        Question q336 = new Question (
                7,
                1,
                5,
                "In adding the integers, what is the answer of -5 + 5?",
                "A. -10",
                "B. 10",
                "C. 5",
                "D. 0",
                4);
        addQuestion(q336);

        Question q337 = new Question (
                7,
                1,
                5,
                "In subracting integers, what is the answer of -15 - 3?",
                "A. -18",
                "B. -12",
                "C. 12",
                "D. 18",
                1);
        addQuestion(q337);

        Question q338 = new Question (
                7,
                1,
                5,
                "In multiplying integers, what is the answer of (-5)(-4)?",
                "A. -20",
                "B. 20",
                "C. -9",
                "D. 9",
                2);
        addQuestion(q338);

        Question q339 = new Question (
                7,
                1,
                5,
                "Jake has twenty-five 10-peso coins in his coin purse. If he gave 10 coins to his little sister, then how much does he have left?",
                "A. 190",
                "B. 100",
                "C. 150",
                "D. 290",
                1);
        addQuestion(q339);

        Question q340 = new Question (
                7,
                1,
                5,
                "If Harry owes his best friend Php1500. And each day he earns Php150 in tutoring, then how many days does he need to tutor someone to earn Php 1500?",
                "A. 100",
                "B. 1000",
                "C. 10",
                "D. 0",
                3);
        addQuestion(q340);

        //RESEARCH 7
        Question q341 = new Question (
                7,
                1,
                9,
                "It is a laboratory apparatus used to measure, store, mix and heat liquids.",
                "A. Pipet",
                "B. Funnel",
                "C. Crucibles",
                "D. Beaker",
                4);
        addQuestion(q341);

        Question q342 = new Question (
                7,
                1,
                9,
                "Where does the Alcohol Lamp belong in the following group?",
                "A. Measuring",
                "B. Heating",
                "C. Auxiliary",
                "D. None of the above7",
                2);
        addQuestion(q342);

        Question q343 = new Question (
                7,
                1,
                9,
                "What laboratory apparatus is used to measure the temperature?",
                "A. Thermometer",
                "B. Barometer",
                "C. Stethoscope",
                "D. Richter Scale",
                1);
        addQuestion(q343);

        Question q344 = new Question (
                7,
                1,
                9,
                "Which of the following apparatus isn't used for heating?",
                "A. Funnel",
                "B. Wire gauze",
                "C. Iron clamp",
                "D. Bunsen burner",
                1);
        addQuestion(q344);

        Question q345 = new Question (
                7,
                1,
                9,
                "It is a laboratory apparatus designed to measure small mass in the sub-milligram range.",
                "A. Triple beam balance",
                "B. Spring balance",
                "C. Analytical balance",
                "D. Test Tube",
                3);
        addQuestion(q345);

        Question q346 = new Question (
                7,
                1,
                9,
                "It is a laboratory apparatus used to measure mass very precisely.",
                "A. Triple beam balance",
                "B. Spring balance",
                "C. Analytical Balance",
                "D. Test tube",
                1);
        addQuestion(q346);

        Question q347 = new Question (
                7,
                1,
                9,
                "The following are the steps of scientific method except for one:",
                "A. Observing",
                "B. Concluding",
                "C. Experimenting",
                "D. Whining",
                4);
        addQuestion(q347);

        Question q348 = new Question (
                7,
                1,
                9,
                "It is a laboratory equipment used to measure the volume of a liquid.",
                "A. Test tube",
                "B. Graduated cylinder",
                "C. Funnel",
                "D. Florence flask",
                2);
        addQuestion(q348);

        Question q349 = new Question (
                7,
                1,
                9,
                "The volume of a regular solid is expressed in:",
                "A. Square units",
                "B. Kilogram",
                "C. Meter",
                "D. Cubic units",
                4);
        addQuestion(q349);

        Question q350 = new Question (
                7,
                1,
                9,
                "It is a piece of a laboratory glassware that can be heated to evaporate liquids.",
                "A. Erlenmeyer flask",
                "B. Funnel",
                "C. Evaporating dish",
                "D. Iron clamp",
                3);
        addQuestion(q350);

        Question q351 = new Question (
                7,
                1,
                9,
                "It is a laboratory glassware used to hold and mix chemicals.",
                "A. Crucibles",
                "B. Funnel",
                "C. Test tube",
                "D. Pipet",
                3);
        addQuestion(q351);

        Question q352 = new Question (
                7,
                1,
                9,
                "It is a process of investigation in which a problem is first identified, experiments or other relevant data are then used to construct or test hypothesis that purport to solve it.",
                "A. Scientific Method",
                "B. Construction Methods",
                "C. Analysis Method",
                "D. Quantitative Method",
                1);
        addQuestion(q352);

        Question q353 = new Question (
                7,
                1,
                9,
                "It is one of the steps of the scientific method in which you will come up with an idea or theory that is not yet proven but that leads to further study or discussion.",
                "A. Concluding",
                "B. Asking questions/purpose",
                "C. Hypothesizing",
                "D. Experimenting",
                3);
        addQuestion(q353);

        Question q354 = new Question (
                7,
                1,
                9,
                "It is one of the steps of the scientific method in which you perform a series of actions and carefully observe the effects in order to learn about something.",
                "A. Experimenting",
                "B. Hypothesizing",
                "C. Observing",
                "D. Concluding",
                1);
        addQuestion(q354);

        Question q355 = new Question (
                7,
                1,
                9,
                "It is one of the steps of the scientific method in which an opinion or decision is formed after a period of thought or research.",
                "A. Experimenting",
                "B. Observing",
                "C. Concluding",
                "D. Hypothesizing",
                3);
        addQuestion(q355);

        Question q356 = new Question (
                7,
                1,
                9,
                "What do you call the act or process of reaching a conclusion about something from known facts or evidence?",
                "A. Observation",
                "B. Speculation",
                "C. Inference",
                "D. All of the above",
                3);
        addQuestion(q356);

        Question q357 = new Question (
                7,
                1,
                9,
                "It refers to a statement about something that you have noticed.",
                "A. Observation",
                "B. Speculation",
                "C. Inference",
                "D. All of the above",
                1);
        addQuestion(q357);

        Question q358 = new Question (
                7,
                1,
                9,
                "'There's a rainbow in the sky'. Tell whether the statement is a/an",
                "A. Observation",
                "B. Speculation",
                "C. Inference",
                "D. None of the above",
                1);
        addQuestion(q358);

        Question q359 = new Question (
                7,
                1,
                9,
                "‘She is in a deep forlorn'. Tell whether the statement is a/ an:",
                "A. Observation",
                "B. Speculation",
                "C. Inference",
                "D. None of the above",
                3);
        addQuestion(q359);

        Question q360 = new Question (
                7,
                1,
                9,
                "'The baby is sick'. Tell whether the statement is a/an:",
                "A. Observation",
                "B. Speculation",
                "C. Inference",
                "D. None of the above",
                3);
        addQuestion(q360);

        //GRADE 8 FIRST START

        //GRADE 10 FIRST START

        //AP 10
        Question q361 = new Question(
                10,
                1,
                1,
                "Mayroong dalwang uri ng social group. Alin ditto ang tumutukoy sa malapit at impormal na ugnayan ng mga indibidwal at kadalasan ito ay maroon lamang maliit na bilang?",
                "A. Primary group",
                "B. Secondary Group",
                "C. Real group",
                "D. Trusted group",
                1);
        addQuestion(q361);

        Question q362 = new Question(
                10,
                1,
                1,
                "Ito ang tumutukoy sa mga karapatan, obligasyon at mga inaasahan ng lipunan na kaakibat ng posisyon ng indibidwal. Anong istraktura to ng lipunan?",
                "A. Institusyon",
                "B. Social Group",
                "C. gampanin",
                "D. status",
                3);
        addQuestion(q362);

        Question q363 = new Question(
                10,
                1,
                1,
                "Ano ang tawag sa isang kumplikadong sistema ng ugnayan na nagbibigay-kahulugan sa paraan ng pamumuhay ng isang lipunan?",
                "A. Istrukturang panlipunan",
                "B. Paniniwala ng lipunan",
                "C. Kaugalian at tradisyon",
                "D. Kultura ng lipunan",
                4);
        addQuestion(q363);

        Question q364 = new Question(
                10,
                1,
                1,
                "Sa ating lipunan ito ang bumubuo sa mga asal, kilos o gawi na binubuo at nagsisilbing pamantayan sa isang lipunan. Nagiging batayan ito ng mga ugali, aksyon at pakikitungo ng isang indibiduwal sa lipunang kaniyang kinabibilangan. Ano ang tawag ditto?",
                "A. Pagpapahalaga",
                "B. Simbolo",
                "C. Paniniwala",
                "D. Norms",
                4);
        addQuestion(q364);

        Question q365 = new Question(
                10,
                1,
                1,
                "Ang kultura sa isang lipunan ay nahahati sa dalawa. Ano ang kinabibilangan ng mga batas, gawi, ideya, paniniwala at norms ng isang grupo ng tao?",
                "A. Hindi Materyal",
                "B. Materyal",
                "C. Mga kaugalian",
                "D. Semi material",
                1);
        addQuestion(q365);

        Question q366 = new Question(
                10,
                1,
                1,
                "Ito ang tumutukoy sa pagsusuri sa lawak, sakop at pinsala na maaring danasin ng isang lugar kung ito ay mahaharap sa isang sakuna o kalamidad sa isang particular na panahon. Sa pamamagitan nito natutukoy kung ano-ano ang mga hazard ba gawa ng kalikasan o gwa ng tao na maaaring maganap sa isang lugar. Ano ang gawiing ito na makakatulong sa paghahanda sa komunidad sa isang sakuna?",
                "A. Hazard assessment",
                "B. Risk assessment",
                "C. Vulnerability assessment",
                "D. Hazard mapping",
                1);
        addQuestion(q366);

        Question q367 = new Question(
                10,
                1,
                1,
                "Ito ang pagkakaroon ng kaalaman tungkol sa iba’t ibang hazard at kung paano ito umusbong sa isang lugar.",
                "A. Katangian",
                "B. Lawak",
                "C. Manageability",
                "D. Pagkakilanlan",
                4);
        addQuestion(q367);

        Question q368 = new Question(
                10,
                1,
                1,
                "Tumutukoy sa panahon o oras sa pagitan ng pagtukoy ng hazard at oras ng pagtama nito sa isang komunidad.",
                "A. Duration",
                "B. Frequency",
                "C. Forewarning",
                "D. Speed of onset",
                3);
        addQuestion(q368);

        Question q369 = new Question(
                10,
                1,
                1,
                "Ano ang tawag sa pagtataya ng kakayahan ng komunidad na harapin ang iba’t ibang uri ng hazard at pagsusuri ng kapasidad ng komunidad na harapin ang anoamng hazard?",
                "A. Capacity assessment",
                "B. Hazard assessment",
                "C. Hazard mapping",
                "D. Historical profiling",
                1);
        addQuestion(q369);

        Question q370 = new Question(
                10,
                1,
                1,
                "Ayon kina Ondiz at Redito tumutukoy ito sa mga hakbang na dapat gawin bago ang pagtama ng sakuna, kalamidad at hazard na may layuning maiwasan o mapigilan ang malawakang pinsala sa tao at kalikasan. Ano ang tawag dito?",
                "A. Capacity assessment",
                "B. Hazard assessment",
                "C. Risk assessment",
                "D. Vulnerability assessment",
                3);
        addQuestion(q370);

        Question q371 = new Question(
                10,
                1,
                1,
                "Ano ang tumutukoy sa mga banta na maaaring dulot ng kalikasan o ng gawa ng tao?",
                "A. Resilience",
                "B. Hazard",
                "C. Vulnerability",
                "D. Risk",
                2);
        addQuestion(q371);

        Question q372 = new Question(
                10,
                1,
                1,
                "Ito ay tumutukoy sa inaasahang pinsala sa tao, ari-arian at buhay dulot ng pagtama ng isang kalamidad.",
                "A. Resilience",
                "B. Hazard",
                "C. Vulnerability",
                "D. Risk",
                4);
        addQuestion(q372);

        Question q373 = new Question(
                10,
                1,
                1,
                "Sa paggawa ng disaster management plan maaring pagpilian ang mga approach para pagbasehan nito. Alin sa mga sumusunod ang katangian ng top down approach?",
                "A. Ang mga mamamayan ay may kakayahang simulan at panatilihin ang kaunlaran ng kanilang komunidad",
                "B. Ang responsibilidad sa pagbabago ay nasa kamay ng mga mamamayang naninirahan sa pamayanan",
                "C. Ang mga mamamayan ay walang partisipasyon sa pagbuo ng disaster management plan, tagatanggap lamang sila nito at taga sunod ng nakaplano na",
                "D. Ang iba’t ibang grupo sa isang pamayanan ay maaaring may magkakaibang pananaw sa mga banta at vulnerabilities na nararanasan sa kanilang lugar",
                3);
        addQuestion(q373);

        Question q374 = new Question(
                10,
                1,
                1,
                "Alin sa mga approach ang nagsisimula sa mga mamamayan at iba pang sektor ng lipunan ang mga hakbang sa pagtukoy, pag-aanalisa at paglutas sa mga suliranin at hamong pangkapaligiran na nararanasan sa kanilang pamayanan?",
                "A. Active-top approach",
                "B. Bottom-down approach",
                "C. Bottom-up approach",
                "D. Top-down approach",
                3);
        addQuestion(q374);

        Question q375 = new Question(
                10,
                1,
                1,
                "Ano ang tawag sa proseso ng pagbuo ng isang disaster management plan na kinakailangang produkto ng pagkakaisa at agtutulungan ng iba’t ibang sektor ng lipunan tulad ng pamahalaan, private sector, business sector, Nongovernmental Organizations (NGOs), at higit sa lahat ng mga mamamayang naninirahan sa partikular na komunidad?",
                "A. Community-Based Disaster and Risk Management (CBDRM)",
                "B. Disaster Risk Reduction and Management Framework",
                "C. Community-Based Disaster and Risk Management Approach",
                "D. Disaster Management",
                1);
        addQuestion(q375);

        Question q376 = new Question(
                10,
                1,
                1,
                "Ilang tonelada ng basura ang nalilikha ng Pilipinas bawat araw ng taong 2015 ayon sap ag-aaral ni Oliviera?",
                "A. 39, 422 tonelada",
                "B. 39, 224 tonelada",
                "C. 39, 442 tonelada",
                "D. 39, 242 tonelada",
                1);
        addQuestion(q376);

        Question q377 = new Question(
                10,
                1,
                1,
                "Anong organisasyon ang kabahagi ng programang tulad ng Orchidarium and Butterfly Pavilion, Gift of Trees, Green Choice Philippines, Piso Para sa Pasig at Trees for Life Philippines",
                "A. Bantay Kalikasan",
                "B. Greenpeace",
                "C. Clean ang Green Foundation",
                "D. Mother Earth Foundation",
                3);
        addQuestion(q377);

        Question q378 = new Question(
                10,
                1,
                1,
                "Anong organisasyon ang naglalayong baguhin ang kaugalian at pananaw ng tao sa pagtrato at pangangalaga sa kalikasan at pagsusulong ng kapayapaan?",
                "A. Bantay Kalikasan",
                "B. Greenpeace",
                "C. Clean ang Green Foundation",
                "D. Mother Earth Foundation",
                2);
        addQuestion(q378);

        Question q379 = new Question(
                10,
                1,
                1,
                "Anong batas ang ipinatupad ng pamahalaan ng Pilipinas upang magkaroon ng legal na batayan sa iba’t ibang desisyon at proseso ng pamamahala ng solid waste sa bansa?",
                "A. Republic Act 0039 o Ecological Solid Waste Management Act of 2000",
                "B. Republic Act 9003 o Ecological Solid Waste Management Act of 2000",
                "C. Republic Act 9030 o Ecological Solid Waste Management Act of 2000",
                "D. Republic Act 3009 o Ecological Solid Waste Management Act of 2000",
                2);
        addQuestion(q379);

        Question q380 = new Question(
                10,
                1,
                1,
                "Ano ang tawag sa paggamit ng puno bilang panggatong?",
                "A. Migration",
                "B. Illegal logging",
                "C. Fuel wood harvesting",
                "D. Ilegal na pagmimina",
                3);
        addQuestion(q380);

        //ENGLISH 10
        Question q381 = new Question(
                10,
                1,
                9,
                "What is an ancient story created to explain natural events that have gods, goddesses, and heroes as characters?",
                "A. Legend",
                "B. Myth",
                "C. Fable",
                "D. Anecdote",
                2);
        addQuestion(q381);

        Question q382 = new Question(
                10,
                1,
                9,
                "In the story Daedalus and Icarus, why did Icarus fall down and die while trying to escape Crete with his wings?",
                "A. Because he ascended too high into the sky and it melted the adhesive in his wings.",
                "B. Because King Minos, who was enraged with the loss of his daughter, ordered his men to shoot his wings.",
                "C. Because the gods punished them for flying too high up into the sky, which was forbidden to mortals.",
                "D. None of the above",
                1);
        addQuestion(q382);

        Question q383 = new Question(
                10,
                1,
                9,
                "In the story Daedalus and Icarus, what did Daedalus construct to contain the dreadful and monstrous half-human, half-bull Minotaur?",
                "A. Propylaea",
                "B. Parthenon",
                "C. Labyrinth",
                "D. Crete",
                3);
        addQuestion(q383);

        Question q384 = new Question(
                10,
                1,
                9,
                "What refers to any deliberate, repetitive, and aggressive social behavior intended to hurt others or to belittle another individual or group?",
                "A. Prejudicial bullying",
                "B. Cyberbullying",
                "C. Social bullying",
                "D. Gender-based bullying",
                3);
        addQuestion(q384);

        Question q385 = new Question(
                10,
                1,
                9,
                "What is the manner in which information is passed from one generation to the next in the absence of writing or a recording medium?",
                "A. Obsolete Tradition",
                "B. Speech Tradition",
                "C. Oral Tradition",
                "D. Oratory Tradition",
                3);
        addQuestion(q385);

        Question q386 = new Question(
                10,
                1,
                9,
                "In presenting an oral report, which of the following is not included under the Non-verbal skills?",
                "A. body language",
                "B. elocution",
                "C. eye contact",
                "D. poise",
                2);
        addQuestion(q386);

        Question q387 = new Question(
                10,
                1,
                9,
                "Which of the following is included in oral reporting under the verbal skills?",
                "A. body language",
                "B. enthusiasm",
                "C. eye contact",
                "D. poise",
                2);
        addQuestion(q387);

        Question q388 = new Question(
                10,
                1,
                9,
                "What is the ‘tone’ of a literary work?",
                "A. It is he feeling created in a reader by a literary work",
                "B. It refers to the attitude of the writer towards his subject",
                "C. It is the central idea of a work of literature.",
                "D. It contains the body of evidence used to support a point of view.",
                2);
        addQuestion(q388);

        Question q389 = new Question(
                10,
                1,
                9,
                "Drew decided to treat himself to a fancy dinner. What type of pronoun is the word ‘himself’ in the sentence?",
                "A. Intrinsic Pronoun",
                "B. Extrinsic Pronoun",
                "C. Intensive Pronoun",
                "D. Reflexive Pronoun",
                4);
        addQuestion(q389);

        Question q390 = new Question(
                10,
                1,
                9,
                "Jonathan built the shed in the backyard all by himself. What type of pronoun is the word ‘himself’ in the sentence?",
                "A. Intrinsic Pronoun",
                "B. Extrinsic Pronoun",
                "C. Intensive Pronoun",
                "D. Reflexive Pronoun",
                3);
        addQuestion(q390);

        Question q391 = new Question(
                10,
                1,
                9,
                "Which of the following sentences makes use of intensive pronoun?",
                "A. Anna Rose promised herself a reward for her hard work.",
                "B. Have you asked yourselves why you are here?",
                "C. The basketball players prepared themselves by staying in shape.",
                "D. We cooked the whole meal ourselves.",
                4);
        addQuestion(q391);

        Question q392 = new Question(
                10,
                1,
                9,
                "I must eat healthy and balance diet. What does the underlined modal indicate?",
                "A. ability",
                "B. obligation",
                "C. permission",
                "D. possibility",
                2);
        addQuestion(q392);

        Question q393 = new Question(
                10,
                1,
                9,
                "Linux and Windows are both operating systems. Computers use them to run programs. Linux is totally free and open source, so users can improve or otherwise modify the source code. Windows is proprietary, so it costs money to use and users are prohibited from altering the source code. If we will compare and contrast the two operating systems, what is the most appropriate graphic organizer we can utilize?",
                "A. Diagram",
                "B. Flow chart",
                "C. Venn Diagram",
                "D. Tree diagram",
                3);
        addQuestion(q393);

        Question q394 = new Question(
                10,
                1,
                9,
                "Which of the following is NOT included in the Steps in Writing Persuasive Essay?",
                "A. Addressing the audience you are trying to persuade.",
                "B. Choosing a subject",
                "C. Clarifying your purpose",
                "D. Writing the final draft.",
                4);
        addQuestion(q394);

        Question q395 = new Question(
                10,
                1,
                9,
                "In the story The Gorgon’s Head, who was the son of Zeus and a mortal named Danae that beheaded Medusa and saved Andromeda from the sea monster Cetus?",
                "A. Heracles",
                "B. Perseus",
                "C. Amphion",
                "D. Achilles",
                2);
        addQuestion(q395);

        Question q396 = new Question(
                10,
                1,
                9,
                "In the story of Orpheus, what instrument did he play to convince Hades and Persephone to give Eurydice a second chance to live?",
                "A. Zither",
                "B. Viola",
                "C. Harp",
                "D. Lyre",
                4);
        addQuestion(q396);

        Question q397 = new Question(
                10,
                1,
                9,
                "What condition did Hades give them to let Eurydice go back with Orpheus to the living world?",
                "A. That Orpheus and Eurydice must not make a sound until they reach Earth.",
                "B. That Orpheus must not look back at Eurydice until they reach Earth.",
                "C. That Orpheus must not touch Eurydice until they reach Earth.",
                "D. That Orpheus and Eurydice must cross the river of Styx without paying the ferryman Charon.",
                2);
        addQuestion(q397);

        Question q398 = new Question(
                10,
                1,
                9,
                "In the story of Arachne, why did Athene turn Arachne into a spider?",
                "A. Because Arachne’s skills in weaving tapestry was a lot better than Athene’s.",
                "B. Because Arachne had beauty that was greater than Athene.",
                "C. Because Arachne’s artwork portrayed the evil or unworthy actions of Gods.",
                "D. Because Arachne’s artwork depicted Athene’s rival, Poseidon, as the truthful ruler of Athens.",
                3);
        addQuestion(q398);

        Question q399 = new Question(
                10,
                1,
                9,
                "My pet 'may' pass away soon so we talked about it and decided to euthanize him. What does the qouted modal of the sentence indicate?",
                "A. Ability",
                "B. Obligation",
                "C. Permission",
                "D. Possibility",
                4);
        addQuestion(q399);

        Question q400 = new Question(
                10,
                1,
                9,
                "Which of the following qouted pronouns is NOT an example of a reflexive pronoun?",
                "A. Adam e-mailed 'himself' a copy of the report.",
                "B. Christine poured 'herself' a glass of milk.",
                "C. Maria knew she 'herself' could make a positive impact on the world, if only she put her mind to it.",
                "D. The students are able to monitor 'themselves'.",
                3);
        addQuestion(q400);

        //FILIPINO 10
        Question q401 = new Question(
                10,
                1,
                7,
                "Ito ay mga kuwento o istorya tungkol sa mga diyos at diyosa?",
                "A. Alamat",
                "B. Mitolohiya",
                "C. Epiko",
                "D. Nobela",
                2);
        addQuestion(q401);

        Question q402 = new Question(
                10,
                1,
                7,
                "Ang salitamg mito/myth ay galing sa salitang _______  na mythos at salitang ______ na muthos?",
                "A. Latin, Greek",
                "B. Greek, Latin",
                "C. Greek, Greek",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q402);

        Question q403 = new Question(
                10,
                1,
                7,
                "Ang kanilang mitolohiya ay hinalaw Mula sa  Greece na kanilang sinakop?",
                "A. Mitolohiya Ng taga Greece",
                "B. Mitolohiya Ng taga Spain",
                "C. Mitolohiya Ng taga Rome",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q403);

        Question q404 = new Question(
                10,
                1,
                7,
                "Alin dito sa mga pinagpipilian ay Hindi  kabilang sa  mitolohiya?",
                "A. Bathala ",
                "B. Cupid at Psyche",
                "C. Pandora’s Box",
                "D. Ang alamat Ng Piña",
                4);
        addQuestion(q404);

        Question q405 = new Question(
                10,
                1,
                7,
                "Sino sa mga Diyos at Diyosa sa mitolohiya Ng Greek ang nag dadala Ng sandata na kulog at kidlat?",
                "A. Poseidon",
                "B. Hephaestus",
                "C. Zeus",
                "D. Hestia",
                3);
        addQuestion(q405);

        Question q406 = new Question(
                10,
                1,
                7,
                "Ano Ang pangalan ni Hades sa Mitolohiya Ng Rome?",
                "A. Pluto",
                "B. Jupiter",
                "C. Juno",
                "D. Mars",
                1);
        addQuestion(q406);

        Question q407 = new Question(
                10,
                1,
                7,
                "Sa mitolohiya Ng Cupid at Psyche Sino Ang pangalan Ng kaakit akit na babae na Ang kagandahan ay mas mataas pa daw Kay Venus?",
                "A. Cupid",
                "B. Rama",
                "C. Psyche",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q407);

        Question q408 = new Question(
                10,
                1,
                7,
                "Bakit nagalit si Venus Kay Psyche?",
                "A. Dahil sa sobra niyang kagandahan",
                "B. Nakalimutan na Ng mga kalalakihan na mag alay sa kaniya",
                "C. Dahil si Psyche Ang sanhi Ng pagkasira at pagkadumi Ng kanyang templo",
                "D. Lahat sa nabanggit",
                4);
        addQuestion(q408);

        Question q409 = new Question(
                10,
                1,
                7,
                "Bakit nabahala Ang mga magulang ni Psyche?",
                "A. Dahil sa galit ni Venus",
                "B. Dahil maraming lalaki Ang gusting umibig sa kaniya",
                "C. Dahil walang umibig na lalaki sa kaniya",
                "D. Lahat Ng nabanggit",
                3);
        addQuestion(q409);

        Question q410 = new Question(
                10,
                1,
                7,
                "Ito ay nangangahulugang walang kamatayan o katapusan?",
                "A. Imortal",
                "B. Ambrosia",
                "C. Mortal",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q410);

        Question q411 = new Question(
                10,
                1,
                7,
                "Ito ay tinaguriang pagkain Ng mga Diyos at Diyosa?",
                "A. Imortal",
                "B. Alin",
                "C. Ambrosia",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q411);

        Question q412 = new Question(
                10,
                1,
                7,
                "Anong epiko Ang tungkol sa mag Asawa na Hindi magkaroon Ng anak?",
                "A. Nagkaroon Ng anak Sina Wigan at Bugan",
                "B. Ibalon",
                "C. Ulalim ",
                "D. Maragtas",
                1);
        addQuestion(q412);

        Question q413 = new Question(
                10,
                1,
                7,
                "Sino Ang nag salin ng epikong \"Nagkaroon Ng anak si Wigan at Bugan\"?",
                "A. Vilma C. Ambat",
                "B. Willita A. Enrijo",
                "C. Emilio Jacinto",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q413);

        Question q414 = new Question(
                10,
                1,
                7,
                "Sa pagdating ni Bugan sa lawa Ng Lagud, Sino/ Ano Ang kanyang unang Nakita?",
                "A. Buwaya",
                "B. Pating",
                "C. Ngilin",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q414);

        Question q415 = new Question(
                10,
                1,
                7,
                "Bakit naglakbay si Bugan sa tahanan Ng mga Diyos?",
                "A. Dahil intirisado siya",
                "B. Dahil nagkaroon siya Ng anak",
                "C. Dahil nagalit siya sa kanila",
                "D. Wala sa nabanggit",
                4);
        addQuestion(q415);

        Question q416 = new Question(
                10,
                1,
                7,
                "Ito ay isang anyo Ng sulating naglalahad na minsan ay may layuning makakuha Ng anumang pagbabago na bagaman ay makakalibang din?",
                "A. Tula",
                "B. Dagli",
                "C. Pangungusao",
                "D. Sanaysay",
                4);
        addQuestion(q416);

        Question q417 = new Question(
                10,
                1,
                7,
                "Ito ay Isa sa mga  tatlong mahalagang bahagi Ng sanaysay na madalas na inilahad Ang pangunahing kaisipan?",
                "A. Gitna",
                "B. Panimula",
                "C. Wakas",
                "D. Tema",
                2);
        addQuestion(q417);

        Question q418 = new Question(
                10,
                1,
                7,
                "Ito ay mga ideyang nabanggit na ugnayan o nagpapalinaw  sa tema?",
                "A. Kaisipan",
                "B. Tema",
                "C. Antas",
                "D. Estilo",
                1);
        addQuestion(q418);

        Question q419 = new Question(
                10,
                1,
                7,
                "Sino Ang may akda Ng alegorya Ng Yungib?",
                "A. Plato",
                "B. Aristotle",
                "C. Shakespeare",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q419);

        Question q420 = new Question(
                10,
                1,
                7,
                "Sino Ang may akda Ng \"Ang Ningning at Ang liwanag\"?",
                "A. Emilio Jacinto",
                "B. Plato",
                "C. Vilma C. Ambat",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q420);

        //ICT 10
        Question q421 = new Question(
                10,
                1,
                6,
                "In making a new Photoshop file to be used for digital purposes such as in websites, social media posts, and other non-print media, which of the following color modes is optimal to use?",
                "A. CMYK color",
                "B. Lab color",
                "C. RGB color",
                "D. Bitmap color",
                3);
        addQuestion(q421);

        Question q422 = new Question(
                10,
                1,
                6,
                "It is an important feature of Photoshop that allows you to separate different parts of an image and editing them without affecting other parts of the image.",
                "A. Artboards",
                "B. Slices",
                "C. Layers",
                "D. Glyphs",
                3);
        addQuestion(q422);

        Question q423 = new Question(
                10,
                1,
                6,
                "What type of computer graphics is Photoshop based on?",
                "A. Scalar Graphics",
                "B. Vector Graphics",
                "C. Raster Graphics",
                "D. Visual Graphics",
                3);
        addQuestion(q423);

        Question q424 = new Question(
                10,
                1,
                6,
                "Adobe Photoshop is entirely written in what programming language?",
                "A. C++",
                "B. C#",
                "C. JavaScript",
                "D. Python",
                1);
        addQuestion(q424);

        Question q425 = new Question(
                10,
                1,
                6,
                "The following are some of the many uses of Adobe Photoshop, except?",
                "A. Animation",
                "B. Website Development",
                "C. Making 3D objects",
                "D. None of the Above",
                4);
        addQuestion(q425);

        Question q426 = new Question(
                10,
                1,
                6,
                "Adobe Photoshop, or Display as it was called back then, was developed by two brothers in 1987. Who are they?",
                "A. John and Charles Warnock",
                "B. Orville and Wilbur Wright",
                "C. Thomas and John Knoll",
                "D. Henry and Karl Marx",
                3);
        addQuestion(q426);

        Question q427 = new Question(
                10,
                1,
                6,
                "What file extension is a Photoshop file saved in?",
                "A. .psr",
                "B. .psf",
                "C. .psd",
                "D. .pfx",
                3);
        addQuestion(q427);

        Question q428 = new Question(
                10,
                1,
                6,
                "It is a Photoshop feature that allows you to organize different design elements and print or save them separately.",
                "A. Artboards",
                "B. Slices",
                "C. Layers",
                "D. Pixels",
                1);
        addQuestion(q428);

        Question q429 = new Question(
                10,
                1,
                6,
                "What does the CC in Adobe Photoshop CC stand for?",
                "A. Creating Content",
                "B. Crony Capitalism",
                "C. Creative Cloud",
                "D. Creative Commons",
                3);
        addQuestion(q429);

        Question q430 = new Question(
                10,
                1,
                6,
                "What Photoshop tool allows you to select a part of an image by snapping into image edges?",
                "A. Lasso tool",
                "B. Polygonal Lasso tool",
                "C. Magnetic Lasso tool",
                "D. Magic Wand tool",
                3);
        addQuestion(q430);

        Question q431 = new Question(
                10,
                1,
                6,
                "What Photoshop tool allows you to pan to different parts of an image?",
                "A. Hand tool",
                "B. Move tool",
                "C. Pan tool",
                "D. View Tool",
                1);
        addQuestion(q431);

        Question q432 = new Question(
                10,
                1,
                6,
                "What Photoshop tool allows you to create placeholder frames for images?",
                "A. Placeholder tool",
                "B. Frame tool",
                "C. Crop tool",
                "D. Slice Tool",
                2);
        addQuestion(q432);

        Question q433 = new Question(
                10,
                1,
                6,
                "What Photoshop tool allows you to sample colors from an image to use it in putting color to text, shapes, etc.?",
                "A. Eyedropper tool",
                "B. Color tool",
                "C. Color Sampler tool",
                "D. Magic Wand tool",
                1);
        addQuestion(q433);

        Question q434 = new Question(
                10,
                1,
                6,
                "If you want to fix an imperfection or blemish in an image, the following tools can be used except?",
                "A. Healing tool",
                "B. Patch tool",
                "C. Content-aware Move tool",
                "D. Dodge tool",
                4);
        addQuestion(q434);

        Question q435 = new Question(
                10,
                1,
                6,
                "What Photoshop tool allows you to cut an image into smaller sections suitable for web development?",
                "A. Artboard tool",
                "B. Slice tool",
                "C. Glyph tool",
                "D. Cut tool",
                2);
        addQuestion(q435);

        Question q436 = new Question(
                10,
                1,
                6,
                "Darken, Multiply, Luminosity, and Color dodge are some examples of ______ that allows you to allow graphics to interact with the background.",
                "A. Adjusting Options",
                "B. Filters",
                "C. Blending Options",
                "D. Interactive Modes",
                3);
        addQuestion(q436);

        Question q437 = new Question(
                10,
                1,
                6,
                "What Photoshop tool allows you to create a gradual blend between two colors?",
                "A. Blend tool",
                "B. Gradient tool",
                "C. Color tool",
                "D. Swatch tool",
                2);
        addQuestion(q437);

        Question q438 = new Question(
                10,
                1,
                6,
                "What category of color in Photoshop is the color you apply with the eraser that replaces the color being erased?",
                "A. Background color",
                "B. Shadow color",
                "C. Foreground color",
                "D. Highlight color",
                1);
        addQuestion(q438);

        Question q439 = new Question(
                10,
                1,
                6,
                "What keyboard key do you need to press while resizing a picture so that the original aspect ratio doesn’t change or the image will not be distorted?",
                "A. Ctrl key",
                "B. Alt key",
                "C. Shift key",
                "D. Tab key",
                3);
        addQuestion(q439);

        Question q440 = new Question(
                10,
                1,
                6,
                "Most programs in the Adobe Creative Cloud collection have shortcut keys used to access different tools efficiently. What is the default key in the Adobe Photoshop application that lets you access the Move tool?",
                "A. M",
                "B. V",
                "C. N",
                "D. O",
                2);
        addQuestion(q440);

        //MATH 10
        Question q441 = new Question(
                10,
                1,
                5,
                "Which is a finite arithmetic sequence?",
                "A. 1, 2, 4, 8, 16,…, n",
                "B. 1, 2, 3, 4, 5, 6, 7, 8",
                "C. 2, 2, 2, 2, 2, 2,…,n",
                "D. ½, 1/3, ¼, 1/5, 1/6, 1/7, 1/8",
                2);
        addQuestion(q441);

        Question q442 = new Question(
                10,
                1,
                5,
                "Which is the nth term of the sequence 6, 18, 30, 42,…, n? ",
                "A. An = 6n + 6",
                "B. An = 5n² + n + 2",
                "C. An = 12n - 6",
                "D. An = 6 + 12n",
                3);
        addQuestion(q442);

        Question q443 = new Question(
                10,
                1,
                5,
                "Karl Friedrich Gauss was asked about the sum of the first hundred natural numbers and answered it correctly in seconds only, which formula can be used to answer the problem?",
                "A. An = n/2(A1 + An)",
                "B. An = n(n + 1)/2",
                "C. Both a & b",
                "D. None of these",
                3);
        addQuestion(q443);

        Question q444 = new Question(
                10,
                1,
                5,
                "(Use the formula for nth term An = A1 +(n - 1)d where A1 is the first term, n as the number of terms and d as the common difference.) How many blocks are there in row 100 if row 1: 3, row 2: 5, row 3: 7?",
                "A. 199",
                "B. 201",
                "C. 197",
                "D. 100",
                2);
        addQuestion(q444);

        Question q445 = new Question(
                10,
                1,
                5,
                "A pyramid is formed by 1m × 1m × 1m cubes, looking at one face of the pyramid, you can see that the number of cubes in a row diminishes by 2 each time it gets higher. Given that there are 225 cubes seen on that face and only one cube at the topmost, how high is the pyramid?",
                "A. 1500 cm",
                "B. 14 m",
                "C. 1.4 dm",
                "D. 0.15 km",
                1);
        addQuestion(q445);

        Question q446 = new Question(
                10,
                1,
                5,
                "Find the missing terms: 6, 12, __, __, 30",
                "A. 18, 24",
                "B. 24, 18",
                "C. 18, 30",
                "D. Both a & b",
                1);
        addQuestion(q446);

        Question q447 = new Question(
                10,
                1,
                5,
                "Given that the formula for geometric sequences is  An = A1(r)^(n-1) where A1 is the first term, r is the common ratio and n is the number of terms. Find the 7th term of the sequence with A1 = r = 2.",
                "A. 128",
                "B. 32",
                "C. 64",
                "D. 256",
                1);
        addQuestion(q447);

        Question q448 = new Question(
                10,
                1,
                5,
                "The geometric series is defined by Sn = [A1 (1 - r^n)]/(1 - r). Find the sum of the sequence from no.7",
                "A. -126",
                "B. 126",
                "C. 256",
                "D. 254",
                4);
        addQuestion(q448);

        Question q449 = new Question(
                10,
                1,
                5,
                "In a geometric series, what happens if the common ratio is equal to 1?",
                "A. Both b &c",
                "B. The formula for geometric series will yield i (undefined/imaginary)",
                "C. The sum will be equal to n(A1)",
                "D. All of the above",
                4);
        addQuestion(q449);

        Question q450 = new Question(
                10,
                1,
                5,
                "In a harmonic sequence, the elements are the reciprocals of an arithmetic sequence or vice-versa. Find the nth term of the corresponding arithmetic sequence of 3, 3/2, 1, ¾, 3/5,…,n.",
                "A. An = 3n/4",
                "B. An = 3+ (n+1)/3",
                "C. An = n/3",
                "D. None of these",
                3);
        addQuestion(q450);

        Question q451 = new Question(
                10,
                1,
                5,
                "In a bar, an infinite number of mathematicians order a wine filling up 1 cup, 1/3, 1/9, 1/27 and so on. If you were the bartender, how many cups would you give all in all? (S_○○= A_1 /(1-r))",
                "A. 1 2/3",
                "B. 2",
                "C. 2 2/3",
                "D. 3",
                4);
        addQuestion(q451);

        Question q452 = new Question(
                10,
                1,
                5,
                "Fibonacci sequence has the following terms: 0,1,1,2,3,5,8,…, n. Which of the following cannot be one of the following terms?",
                "A. 13",
                "B. 55",
                "C. 34",
                "D. 56",
                4);
        addQuestion(q452);

        Question q453 = new Question(
                10,
                1,
                5,
                "If 2, a, b, 2/27. Find a and b.",
                "A. a = 2, b = 3",
                "B. a = 1, b = 2/9",
                "C. a = 2/3, b = 2/9",
                "D. a = 2/9, b = 1/9",
                3);
        addQuestion(q453);

        Question q454 = new Question(
                10,
                1,
                5,
                "Evaluate P(x)/D(x) = (3x³ - 6x² + 7x - 48)/(x - 3)",
                "A. 3x + 3 + (16/x-3)",
                "B. 3x² + 3x + 16",
                "C. 3x² + 16x + 3",
                "D. 3x + 16 + (3/x-3)",
                2);
        addQuestion(q454);

        Question q455 = new Question(
                10,
                1,
                5,
                "Find the remainder of x⁶ + 7x⁵ + 6x³ - 3x² + 2x - 1 divided by x-2",
                "A. 328",
                "B. 327",
                "C. 329",
                "D. 326",
                2);
        addQuestion(q455);

        Question q456 = new Question(
                10,
                1,
                5,
                "It states that (x-r) is a factor of P(x) if P(r) = 0.",
                "A. Rational Root Theorem",
                "B. Remainder Theorem",
                "C. Factor Theorem",
                "D. Both b & c",
                3);
        addQuestion(q456);

        Question q457 = new Question(
                10,
                1,
                5,
                "Given that P(r) is the remainder, find P(r) if P(x) = x²⁰²⁰ - 1 is divided by x + 1.",
                "A. -1",
                "B. 1",
                "C. 0",
                "D. None of these",
                3);
        addQuestion(q457);

        Question q458 = new Question(
                10,
                1,
                5,
                "If P(2) = P(3) = P(0) = 0, find the 3rd degree polynomial P(x).",
                "A. P(x) = x(x - 2)(x - 3)",
                "B. P(x) = x(x + 2)(x + 3)",
                "C. P(x) = x(x - 2)(x + 3)",
                "D. P(x) = x(x + 2)(x - 3)",
                1);
        addQuestion(q458);

        Question q459 = new Question(
                10,
                1,
                5,
                "P(x) has three factors (2, -3, 5) and P(x) = 2x³ + bx² - 60x + d. Find b.",
                "A. b = 2",
                "B. b = -30",
                "C. b = 4",
                "D. b = -4",
                3);
        addQuestion(q459);

        Question q460 = new Question(
                10,
                1,
                5,
                "What is the degree of the polynomial 7x⁵ + 6x² + 5x³ + x⁷ = 4x⁵ - 7x⁶ + 2x⁷ - x⁷",
                "A. 5",
                "B. 6",
                "C. 7",
                "D. 3",
                2);
        addQuestion(q460);

        //SCIENCE 10
        Question q461 = new Question(
                10,
                1,
                2,
                "The following are indications of where to find edges of crustal plates except__.",
                "A. Volcanism",
                "B. Mountain Formation",
                "C. Sea level",
                "D. Earthquakes",
                3);
        addQuestion(q461);

        Question q462 = new Question(
                10,
                1,
                2,
                "The location of the focus is a determining factor of how an earthquake affects an area. Which of the following is true?",
                "A. Shallow focus earthquakes are the least destructive",
                "B. Intermediate focus earthquakes are likely the most destructive",
                "C. Deep focus earthquakes are stronger because they occur at greater pressure than both shallow and intermediate",
                "D. The intensity of an earthquake is determined by how deep the focus of an earthquake is located",
                4);
        addQuestion(q462);

        Question q463 = new Question(
                10,
                1,
                2,
                "Active volcanoes are usually found in what plate boundary?",
                "A. Convergent",
                "B. Divergent",
                "C. Transform",
                "D. Both b & c",
                1);
        addQuestion(q463);

        Question q464 = new Question(
                10,
                1,
                2,
                "Which of the following is true?",
                "A. Convergent-conservative",
                "B. Divergent-destructive",
                "C. Transform-conservative",
                "D. Transform-constructive",
                3);
        addQuestion(q464);

        Question q465 = new Question(
                10,
                1,
                2,
                "Which of the following do you expect to find in transform-fault boundaries?",
                "A. Mountains",
                "B. Faults",
                "C. Trenches",
                "D. Rift valleys",
                2);
        addQuestion(q465);

        Question q466 = new Question(
                10,
                1,
                2,
                "Who proposed the theory of Tectonic Plates?",
                "A. Alfred Wegener",
                "B. Charles Darwin",
                "C. Isaac Newton",
                "D. Jacques Charles",
                1);
        addQuestion(q466);

        Question q467 = new Question(
                10,
                1,
                2,
                "Which of the following is not an evidence of the Continental Drift Theory?",
                "A. Continental Jigsaw Puzzle",
                "B. Rock Formation",
                "C. Oceanic depth",
                "D. Evidence from Fossils",
                3);
        addQuestion(q467);

        Question q468 = new Question(
                10,
                1,
                2,
                "The Philippine Islands are formed due to a/an _________ collision of the Eurasian and Philippine Plate.",
                "A. Oceanic-oceanic",
                "B. Oceanic-continental",
                "C. Continental-continental",
                "D. All except c",
                1);
        addQuestion(q468);

        Question q469 = new Question(
                10,
                1,
                2,
                "It is a process of locating earthquakes by the use of 3 surrounding recording stations.",
                "A. Triangulation",
                "B. Time difference of P and S wave arrival",
                "C. Earthquake plotting",
                "D. Seismic waves",
                1);
        addQuestion(q469);

        Question q470 = new Question(
                10,
                1,
                2,
                "What drives plate tectonics?",
                "A. Thermal conduction",
                "B. Thermal convection",
                "C. Solar energy",
                "D. Erosion",
                2);
        addQuestion(q470);

        Question q471 = new Question(
                10,
                1,
                2,
                "The mantle is liquid, Is this true?",
                "A. Yes, because thermal convection takes place in the mantle.",
                "B. Yes, because it facilitates the movement of plates.",
                "C. No, because shear waves can pass through the mantle.",
                "D. No, because earth is a compacted solid planet.",
                3);
        addQuestion(q471);

        Question q472 = new Question(
                10,
                1,
                2,
                "Which wave is the most destructive?",
                "A. P-wave",
                "B. S-wave",
                "C. Rayleigh Wave",
                "D. Love wave",
                4);
        addQuestion(q472);

        Question q473 = new Question(
                10,
                1,
                2,
                "Which of the following are surface waves?",
                "A. P-wave and S-wave",
                "B. Rayleigh and Love Waves",
                "C. P-wave and Rayleigh",
                "D. Love waves and S-waves",
                2);
        addQuestion(q473);

        Question q474 = new Question(
                10,
                1,
                2,
                "The difference in the traveled distance of P and S-waves is 100 km in every 8 seconds. How far is an earthquake’s epicenter if the P-wave arrived 2 minutes earlier than the S-wave?",
                "A. 25 km",
                "B. 25 m",
                "C. 400 m",
                "D. 1500 m",
                4);
        addQuestion(q474);

        Question q475 = new Question(
                10,
                1,
                2,
                "Where is the earth’s magnetic field generated?",
                "A. In the crust",
                "B. In the mantle",
                "C. In the outer core",
                "D. In the inner core",
                3);
        addQuestion(q475);

        Question q476 = new Question(
                10,
                1,
                2,
                "Which layer facilitates crustal movement?",
                "A. Crust",
                "B. Asthenosphere",
                "C. Mantle ",
                "D. Core",
                2);
        addQuestion(q476);

        Question q477 = new Question(
                10,
                1,
                2,
                "Scientists found clues on what the earth’s interior look like through p and s waves. What’s the effect of the earth’s interior on P and S waves?",
                "A. It can send them into seismic gaps",
                "B. It virtually has no effect",
                "C. It can absorb P waves, but not S waves",
                "D. It can affect the speed and direction of the waves",
                4);
        addQuestion(q477);

        Question q478 = new Question(
                10,
                1,
                2,
                "Which of the following is true?",
                "A. P waves and S waves are both refracted in the outer core",
                "B. P-wave shadow zone is smaller than S-wave shadow zone",
                "C. S-waves are absorbed in the outer core",
                "D. P and S waves can travel through different medium",
                3);
        addQuestion(q478);

        Question q479 = new Question(
                10,
                1,
                2,
                "In a deep mine, temperatures increase at the rate of ___________.",
                "A. 3°C per kilometer",
                "B. 30°C per kilometer",
                "C. 300°C per kilometer",
                "D. 1°C per kilometer",
                2);
        addQuestion(q479);

        Question q480 = new Question(
                10,
                1,
                2,
                "Why is the density of the core the highest?",
                "A. Due to heavy pressure of overlying rocks",
                "B. Due to high temperature of overlying rocks",
                "C. Due to high density of overlying rocks",
                "D. All of the above",
                1);
        addQuestion(q480);

        //MAPEH 10
        Question q481 = new Question(
                10,
                1,
                4,
                "One of the earlier but concrete forms declaring the entry of 20th century where the sentimental melodies and dramatic emotionalism of the preceding Romantic Period were being replaced in favor of moods and impressions.",
                "A. Primitivism",
                "B. Impressionism",
                "C. Expressionism",
                "D. None of the above",
                2);
        addQuestion(q481);

        Question q482 = new Question(
                10,
                1,
                4,
                "His compositional style is mainly characterized by its uniquely innovative but not atonal style of harmonic treatment.",
                "A. Claude Debussy ",
                "B. Joseph Maurice Ravel",
                "C. Bela Bartok",
                "D. None of the above",
                2);
        addQuestion(q482);

        Question q483 = new Question(
                10,
                1,
                4,
                "He was a concert pianist as he travelled, exploring the music of Hungarian peasants.",
                "A. Claude Debussy",
                "B. Joseph Maurice Ravel",
                "C. Bela Bartok",
                "D. None of the above",
                3);
        addQuestion(q483);

        Question q484 = new Question(
                10,
                1,
                4,
                "He was the primary exponent of the impressionist movement and the focal point for other impressionist composers.",
                "A. Claude Debussy",
                "B. Joseph Maurice Ravel",
                "C. Bela Bartok",
                "D. None of the above",
                1);
        addQuestion(q484);

        Question q485 = new Question(
                10,
                1,
                4,
                "This style was associated with electronic music and dealt with the parameters or dimensions of sound in space.",
                "A. Primitivism",
                "B. Avant Grande",
                "C. Atonal Style",
                "D. None of the above",
                2);
        addQuestion(q485);

        Question q486 = new Question(
                10,
                1,
                4,
                "These artists created works with more emotional force or imagination than with realistic or natural images.",
                "A. Expressionists",
                "B. Impressionists",
                "C. Imaginists",
                "D. None of the above",
                1);
        addQuestion(q486);

        Question q487 = new Question(
                10,
                1,
                4,
                "He is best known for his landscape paintings, particularly those depicting his beloved flower garden and water lily ponds at his home in Giverny.",
                "A. Claude Monet",
                "B. Edouard Manet",
                "C. Vincent Van Gogh",
                "D. None of the above",
                1);
        addQuestion(q487);

        Question q488 = new Question(
                10,
                1,
                4,
                "He was a key figure in the transition of realism to impressionism with a number of works considered as marking the birth of modern art.",
                "A. Claude Monet",
                "B. Edouard Manet",
                "C. Vincent Van Gogh",
                "D. None of the above",
                2);
        addQuestion(q488);

        Question q489 = new Question(
                10,
                1,
                4,
                "It was an art movement that emerged and had a tremendous impact and influence on the painting style that followed, such as neo-impressionism, post-it impressionism, fauvism ans cubism even the artistic style and movement of today.",
                "A. Expressionism ",
                "B. Neo-classicism",
                "C. Impressionism",
                "D. None of the above",
                3);
        addQuestion(q489);

        Question q490 = new Question(
                10,
                1,
                4,
                "One of the first 19th century artists which his striking style was to have a far-reaching influence on 20th century art, with his works becoming the most recognizable in the world.",
                "A. Claude Monet",
                "B. Edouard Manet",
                "C. Vincent Van Gogh",
                "D. None of the above",
                3);
        addQuestion(q490);

        Question q491 = new Question(
                10,
                1,
                4,
                "The way in which an individual lives.",
                "A. Habits",
                "B. Lifestyle",
                "C. Exercise",
                "D. None of the above",
                2);
        addQuestion(q491);

        Question q492 = new Question(
                10,
                1,
                4,
                "Patterns of behavior regards to eating.",
                "A. Eating Habits",
                "B. Lifestyle",
                "C. Exercise",
                "D. None of the above",
                1);
        addQuestion(q492);

        Question q493 = new Question(
                10,
                1,
                4,
                "These are tests that gauge your fitness level, may be health-related or skilled-related.",
                "A. Physical Fitness Tests",
                "B. Mass Tests",
                "C. Exercise Tests",
                "D. None of the above",
                1);
        addQuestion(q493);

        Question q494 = new Question(
                10,
                1,
                4,
                "It is calculated by dividing your body weight in kilograms by the square of your height in meters.",
                "A. Body Index Mass",
                "B. Body Mass Index",
                "C. Index Body Mass",
                "D. None of the above",
                2);
        addQuestion(q494);

        Question q495 = new Question(
                10,
                1,
                4,
                "Preliminary activity done to prepare the body for actual physical activity or sports-related specific.",
                "A. Warm up",
                "B. Cool down",
                "C. Meditation",
                "D. None of the above",
                1);
        addQuestion(q495);

        Question q496 = new Question(
                10,
                1,
                4,
                "It aims to develop a person's ability to evaluate and utilized health information, products, services, wisely and effectively.",
                "A. Consumer Health",
                "B. Good Health",
                "C. Special Health",
                "D. None of the above",
                1);
        addQuestion(q496);

        Question q497 = new Question(
                10,
                1,
                4,
                "Any concept, step or advice that various sources give to aid the health status of an individual.",
                "A. Health services",
                "B. Health information ",
                "C. Health products",
                "D. None of the above",
                2);
        addQuestion(q497);

        Question q498 = new Question(
                10,
                1,
                4,
                "These programs aim to appraise the health conditions of individuals through examinations, cure and treat disorders and such.",
                "A. Health services",
                "B. Health information ",
                "C. Health products",
                "D. None of the above",
                1);
        addQuestion(q498);

        Question q499 = new Question(
                10,
                1,
                4,
                "These are food, drugs, cosmetics, devices, biological, vaccines and many more products which consumers buy for their health.",
                "A. Health services",
                "B. Health information ",
                "C. Health products",
                "D. None of the above",
                3);
        addQuestion(q499);

        Question q500 = new Question(
                10,
                1,
                4,
                "It is a financial agreement between an insurance company and an individual or group for the payment of healthcare costs.",
                "A. Health security",
                "B. Health insurance",
                "C. Health payment",
                "D. None of the above",
                2);
        addQuestion(q500);

        //RESEARCH 10
        Question q501 = new Question(
                10,
                1,
                8,
                "According to Good and Scates (1997), what is the purpose of Research?",
                "A. To serve mankind",
                "B. To make things easier",
                "C. For future advantages",
                "D. None of the above",
                1);
        addQuestion(q501);

        Question q502 = new Question(
                10,
                1,
                8,
                "Which of the following is not the characteristics of a researcher?",
                "A. Empirical",
                "B. Logical",
                "C. Economical",
                "D. None of the above",
                3);
        addQuestion(q502);

        Question q503 = new Question(
                10,
                1,
                8,
                "Which of the following is not the characteristics of a researcher?",
                "A. Cyclical",
                "B. Analytical",
                "C. Resourceful",
                "D. None of the above",
                3);
        addQuestion(q503);

        Question q504 = new Question(
                10,
                1,
                8,
                "Which of the following is one of the qualities of a researcher?",
                "A. Religious",
                "B. Sympathetic",
                "C. Cyclical",
                "D. None of the above",
                1);
        addQuestion(q504);

        Question q505 = new Question(
                10,
                1,
                8,
                "What do you call the variable that is the cause of the study?",
                "A. Controlled Variable",
                "B. Independent Variable",
                "C. Dependent Variable",
                "D. None of the above",
                2);
        addQuestion(q505);

        Question q506 = new Question(
                10,
                1,
                8,
                "What do you call the variable that is the effect of the study?",
                "A. Controlled Variable",
                "B. Independent Variable",
                "C. Dependent Variable",
                "D. None of the above",
                3);
        addQuestion(q506);

        Question q507 = new Question(
                10,
                1,
                8,
                "What do you call the variable that is chosen by the researcher to determine if it changes the relationship of 2 variables?",
                "A. Intervening Variable",
                "B. Moderator",
                "C. Dependent Variable",
                "D. None of the above",
                2);
        addQuestion(q507);

        Question q508 = new Question(
                10,
                1,
                8,
                "Are Historical books a primary source?",
                "A. Yes",
                "B. No",
                "C. Depends",
                "D. None of the above",
                2);
        addQuestion(q508);

        Question q509 = new Question(
                10,
                1,
                8,
                "Are video records of an interview a primary source?",
                "A. Yes",
                "B. No",
                "C. Depends",
                "D. None of the above",
                1);
        addQuestion(q509);

        Question q510 = new Question(
                10,
                1,
                8,
                "What is the classification of research wherein studies are conducted artificially?",
                "A. Library",
                "B. Laboratory",
                "C. Field",
                "D. None of the above",
                2);
        addQuestion(q510);

        Question q511 = new Question(
                10,
                1,
                8,
                "What is the classification of research wherein studies are either descriptive or historical?",
                "A. Library",
                "B. Laboratory ",
                "C. Field  ",
                "D. None of the above",
                1);
        addQuestion(q511);

        Question q512 = new Question(
                10,
                1,
                8,
                "What is the classification of research wherein studies are conducted in natural environment?",
                "A. Library",
                "B. Laboratory",
                "C. Field",
                "D. None of the above",
                3);
        addQuestion(q512);

        Question q513 = new Question(
                10,
                1,
                8,
                "What is the intervening variable in the study \"Effectiveness of teaching Mathematics as perceived by BSHS student\"?",
                "A. Teaching Mathematics",
                "B. Efficiency of Teaching",
                "C. Mean Score",
                "D. None of the above",
                2);
        addQuestion(q513);

        Question q514 = new Question(
                10,
                1,
                8,
                "What is the independent variable in the study \"Effectiveness of teaching Mathematics as perceived by BSHS student\"?",
                "A. Teaching Mathematics",
                "B. Efficiency of Teaching",
                "C. Mean Score",
                "D. None of the above",
                1);
        addQuestion(q514);

        Question q515 = new Question(
                10,
                1,
                8,
                "What is the dependent variable in the study \"Effectiveness of teaching Mathematics as perceived by BSHS student\"?",
                "A. Teaching Mathematics",
                "B. Efficiency of Teaching ",
                "C. Mean Score",
                "D. None of the above",
                3);
        addQuestion(q515);

        Question q516 = new Question(
                10,
                1,
                8,
                "In the study of How does sunlight affect the growth of plant? What is the dependent variable in the study?",
                "A. Plant",
                "B. Plant growth",
                "C. Exposure to sunlight",
                "D. None of the above",
                2);
        addQuestion(q516);

        Question q517 = new Question(
                10,
                1,
                8,
                "In the study of How does sunlight affect the growth of plant? What is the independent variable in the study?",
                "A. Plant",
                "B. Plant growth",
                "C. Exposure to sunlight",
                "D. None of the above",
                3);
        addQuestion(q517);

        Question q518 = new Question(
                10,
                1,
                8,
                "In the study of the effectiveness of pineapple peeling as a paper bag. What Kind of research is the study?",
                "A. Developmental",
                "B. Applied",
                "C. Basic",
                "D. None of the above",
                2);
        addQuestion(q518);

        Question q519 = new Question(
                10,
                1,
                8,
                "What kind of Research revolves around fundamental research with laws and principles?",
                "A. Developmental",
                "B. Applied",
                "C. Basic",
                "D. None of the above",
                3);
        addQuestion(q519);

        Question q520 = new Question(
                10,
                1,
                8,
                "What kind of Research revolves around developing new method to solve a problem?",
                "A. Developmental",
                "B. Applied",
                "C. Basic",
                "D. None of the above",
                1);
        addQuestion(q520);

        //ESP 10

        //GRADE 8 FIRST START

        //FILIPINO 8
        Question q541 = new Question(
                8,
                1,
                7,
                "Ang official kenkoy ng klase.",
                "A. Spice Girls",
                "B. Geeks",
                "C. Clowns",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q541);

        Question q542 = new Question(
                8,
                1,
                7,
                "Mga walang pakialam sa mundo.",
                "A. Clowns",
                "B. Geeks",
                "C. Spice Girls",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q542);

        Question q543 = new Question(
                8,
                1,
                7,
                "Barkadahan ng mga babaeng mahilig gumimik, sabay sabay pero late na pumasok ng room pagkatapos ng recess at lunch break.",
                "A. Geeks",
                "B. Spice Girls",
                "C. Gwapings",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q543);

        Question q544 = new Question(
                8,
                1,
                7,
                "Ang male counterpart ng SG.",
                "A. Da Gwapings",
                "B. Clowns",
                "C. Celebrities",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q544);

        Question q545 = new Question(
                8,
                1,
                7,
                "Mga record holders pagdating sa persistence.",
                "A. Celebrities",
                "B. Guinness",
                "C. Bob Ongs",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q545);

        Question q546 = new Question(
                8,
                1,
                7,
                "Si Impeng Negro ay isang?",
                "A. Artista",
                "B. Agwador",
                "C. MAgsasaka",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q546);

        Question q547 = new Question(
                8,
                1,
                7,
                "Sino ang hari ng gripo?",
                "A. Kano",
                "B. Agor",
                "C. Bremancor",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q547);

        Question q548 = new Question(
                8,
                1,
                7,
                "Sino ang mga kapatid ni Impen?",
                "A. Kano at Kanin",
                "B. Kano at Bob",
                "C. Kano at Boy",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q548);

        Question q549 = new Question(
                8,
                1,
                7,
                "Sino ang makatarungang datu sa Alamat ng Daragang Mayon?",
                "A. Lapu-lapu",
                "B. Makusog",
                "C. Mar Roxas",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q549);

        Question q550 = new Question(
                8,
                1,
                7,
                "Anak ni Datu Makusog at Dawani. Isang babaeng walang kapares sa kagandahan at kabaitan.",
                "A. Catriona Gray",
                "B. Daragang Magayon",
                "C. Daragang Mayon",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q550);

        Question q551 = new Question(
                8,
                1,
                7,
                "Ang dakilang mangangaso.",
                "A. Datung Aruga",
                "B. Datung Iraga",
                "C. Pobreng Iraga",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q551);

        Question q552 = new Question(
                8,
                1,
                7,
                "Mga generic na miyembro ng klase.",
                "A. Commoners",
                "B. Celebrities",
                "C. Bob Ongs",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q552);

        Question q553 = new Question(
                8,
                1,
                7,
                "Dalawang uri ng Asimilasyon?",
                "A. Di-ganap at Ganap",
                "B. Di-ganap at Kasalungat",
                "C. Pang-abay at Pang-uri",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q553);

        Question q554 = new Question(
                8,
                1,
                7,
                "Ano ang parsyal na uri ng Asimilasyon?",
                "A. Ganap",
                "B. Di-ganap",
                "C. Both",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q554);

        Question q555 = new Question(
                8,
                1,
                7,
                "Kinakaltas ang unang titik",
                "A. Ganap",
                "B. Di-ganap",
                "C. Both",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q555);

        Question q556 = new Question(
                8,
                1,
                7,
                "Poticians, Athletes, at Performers",
                "A. Celebrities",
                "B. Da Gwapings",
                "C. Hollow Man",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q556);

        Question q557 = new Question(
                8,
                1,
                7,
                "Asawa ni Datu Makusog",
                "A. Daragang Magayon",
                "B. Dawani",
                "C. Laura",
                "D. Wala sa nabanggit",
                2);
        addQuestion(q557);

        Question q558 = new Question(
                8,
                1,
                7,
                "Mga medyo matalino na medyo may sayod",
                "A. Bob Ongs",
                "B. Hollow Man",
                "C. Commoners",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q558);

        Question q559 = new Question(
                8,
                1,
                7,
                "Binase sa anog bundok ang Alamat ng Daragang Mayon?",
                "A. Mt. Apo",
                "B. Mt. Kanlaon",
                "C. Mt. Mayon",
                "D. Wala sa nabanggit",
                3);
        addQuestion(q559);

        Question q560 = new Question(
                8,
                1,
                7,
                "Sino ang tahimik ngunit matapang na anak ni Datu?",
                "A. Ulap",
                "B. Florante",
                "C. Boy",
                "D. Wala sa nabanggit",
                1);
        addQuestion(q560);


    }

    private void addQuestion(Question question){

        ContentValues cv = new ContentValues();
        cv.put(QuestionTable.COLUMN_GRADE, question.getGrade());
        cv.put(QuestionTable.COLUMN_QUARTER, question.getQuarter());
        cv.put(QuestionTable.COLUMN_SUBJECT, question.getSubject());
        cv.put(QuestionTable.COLUMN_QUESTIONS, question.getQuestion());
        cv.put(QuestionTable.COLUMN_OPTION_A, question.getOptionA());
        cv.put(QuestionTable.COLUMN_OPTION_B, question.getOptionB());
        cv.put(QuestionTable.COLUMN_OPTION_C, question.getOptionC());
        cv.put(QuestionTable.COLUMN_OPTION_D, question.getOptionD());
        cv.put(QuestionTable.COLUMN_CORRECT_ANS, question.getCorrectAns());
        db.insert(QuestionTable.TABLE_NAME, null, cv);
    }

    public List<Question> getQuestion(int grade, int quarter, int subject) {

        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        Cursor c = db.rawQuery("SELECT * FROM " + QuestionTable.TABLE_NAME +
                " WHERE " + QuestionTable.COLUMN_GRADE + " = " + grade + " AND " + QuestionTable.COLUMN_QUARTER +
                " = " + quarter + " AND " + QuestionTable.COLUMN_SUBJECT + " = " + subject, null);

        if (c.moveToFirst()) {

            do{

                Question question = new Question();
                question.setGrade(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_GRADE)));
                question.setQuarter(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_QUARTER)));
                question.setSubject(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_SUBJECT)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionTable.COLUMN_QUESTIONS)));
                question.setOptionA(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION_A)));
                question.setOptionB(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION_B)));
                question.setOptionC(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION_C)));
                question.setOptionD(c.getString(c.getColumnIndex(QuestionTable.COLUMN_OPTION_D)));
                question.setCorrectAns(c.getInt(c.getColumnIndex(QuestionTable.COLUMN_CORRECT_ANS)));
                questionList.add(question);

            } while (c.moveToNext());

        }

        c.close();
        return questionList;

    }


}
