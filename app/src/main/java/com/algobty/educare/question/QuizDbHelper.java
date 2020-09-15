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
    private static final int DATABASE_VERSION = 7;

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
        //GRADE 9 START

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

        //GRADE 7 START

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
