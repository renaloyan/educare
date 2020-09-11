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
    private static final int DATABASE_VERSION = 5;

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

        //English 9 first quarter

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

    public List<Question> getAllQuestion() {

        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionTable.TABLE_NAME, null);

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
