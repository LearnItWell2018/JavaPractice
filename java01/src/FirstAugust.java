import java.util.*;

public class FirstAugust {
    public static void printAllWords(String content) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        for (int i = 0; i < wordsAsList.size(); i++) {
            System.out.println(wordsAsList.get(i));
        }


    }

    public static void printSingleCharacterWord(String content) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        for (int i = 0; i < wordsAsList.size(); i++) {
            if (wordsAsList.get(i).length() == 1) {
                System.out.println(wordsAsList.get(i));
            }
        }

    }

    public static void printDoubleCharacterWord(String content) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        for (int i = 0; i < wordsAsList.size(); i++) {
            if (wordsAsList.get(i).length() == 2) {
                System.out.println(wordsAsList.get(i));
            }
        }

    }

    public static void printNCharacterWord(String content, int x) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        for (int i = 0; i < wordsAsList.size(); i++) {
            if (wordsAsList.get(i).length() == x) {
                System.out.println(wordsAsList.get(i));
            }
        }

    }

    public static void printAllCapsWord(String content) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] upperCase = upper.toCharArray();
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        for (int i = 0; i < wordsAsList.size(); i++) {
            for (int j = 0; j < upperCase.length; j++) {
                if (upperCase[j] == wordsAsList.get(i).charAt(0)) {
                    System.out.println(wordsAsList.get(i));
                }
            }


        }
    }

    public static void printUniqueWords(String content) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < wordsAsList.size(); i++) {
            if (wordsAsList.contains(wordsAsList.get(i))) {
                uniqueWords.add(wordsAsList.get(i));

            }

        }
        System.out.println(uniqueWords);

    }

    public static void pyramidOfUniqueWords(String content) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        Set<String> uniqueWords = new HashSet<>();
        for (int i = 0; i < wordsAsList.size(); i++) {
            if (wordsAsList.contains(wordsAsList.get(i))) {
                uniqueWords.add(wordsAsList.get(i));

            }

        }
        List<String> uniqueList = new ArrayList<>(uniqueWords);

        int minLength = uniqueList.get(0).length();
        int minWordIndex = 0;
        for (int i = 0; i < uniqueList.size(); i++) {
            if (uniqueList.get(i).length() < minLength) {
                minLength = uniqueList.get(i).length();
                minWordIndex = i;
            }


        }
        System.out.println(uniqueList.get(minWordIndex));
        System.out.println("uniqueList " + uniqueList);

        //////////////////////////

        int maxLength = uniqueList.get(0).length();
        int maxWordIndex = 0;
        for (int i = 0; i < uniqueList.size(); i++) {
            if (uniqueList.get(i).length() > maxLength) {
                maxLength = uniqueList.get(i).length();
                maxWordIndex = i;
            }


        }
        System.out.println(maxLength);


        //////////////////////////////

        List<String> pyramidList = new ArrayList<>();

        for (int i = minLength; i <= maxLength; i++) {
            for (int j = 0; j < uniqueList.size(); j++) {
                if (uniqueList.get(j).length() == i) {
                    pyramidList.add(uniqueList.get(j));

                }
            }
        }


        /////////////////////////////////
        System.out.println("pyramidList " + pyramidList);


    }


    public static void printAccordingFirstLetter(String content) {
        content = content.replaceAll("\\.", "");
        String[] words = content.split(" ");
        List<String> wordsAsList = Arrays.asList(words);
        int min = wordsAsList.get(0).charAt(0);
        for (int i = 0; i < wordsAsList.size(); i++) {
            if (wordsAsList.get(i).charAt(0) < min) {
                min = wordsAsList.get(i).charAt(0);

            }
            System.out.println(wordsAsList.get(i));
        }


    }

    public static void findSmallestNumber() {


        ArrayList<Integer> newList = new ArrayList<>();

        newList.add(409);
        newList.add(766);
        newList.add(915);
        newList.add(803);
        newList.add(886);
        newList.add(898);
        newList.add(624);
        newList.add(724);
        newList.add(335);
        newList.add(349);
        newList.add(300);
        newList.add(615);
        newList.add(529);
        newList.add(756);
        newList.add(917);
        newList.add(256);
        newList.add(819);
        newList.add(482);
        newList.add(501);
        newList.add(855);
        newList.add(457);
        newList.add(704);
        newList.add(861);
        newList.add(648);
        newList.add(922);
        newList.add(336);
        newList.add(266);
        newList.add(246);
        newList.add(507);
        newList.add(944);
        newList.add(309);
        newList.add(581);
        newList.add(413);
        newList.add(948);
        newList.add(205);
        newList.add(983);
        newList.add(706);
        newList.add(693);
        newList.add(297);
        newList.add(975);
        newList.add(473);
        newList.add(830);
        newList.add(813);
        newList.add(745);
        newList.add(698);
        newList.add(903);
        newList.add(719);
        newList.add(640);
        newList.add(913);
        newList.add(429);
        newList.add(530);
        newList.add(777);
        newList.add(696);
        newList.add(222);
        newList.add(911);
        newList.add(534);
        newList.add(712);
        newList.add(843);
        newList.add(593);
        newList.add(884);
        newList.add(295);
        newList.add(951);
        newList.add(333);
        newList.add(823);
        newList.add(417);
        newList.add(525);
        newList.add(978);
        newList.add(580);
        newList.add(382);
        newList.add(343);
        newList.add(795);
        newList.add(418);
        newList.add(241);
        newList.add(902);
        newList.add(864);
        newList.add(785);
        newList.add(419);
        newList.add(584);
        newList.add(853);
        newList.add(734);
        newList.add(209);
        newList.add(758);
        newList.add(787);
        newList.add(213);
        newList.add(244);
        newList.add(514);
        newList.add(590);
        newList.add(799);
        newList.add(721);
        newList.add(772);
        newList.add(291);
        newList.add(320);
        newList.add(608);
        newList.add(528);
        newList.add(834);
        newList.add(892);
        newList.add(505);
        newList.add(215);
        newList.add(842);
        newList.add(477);
        newList.add(760);
        newList.add(260);
        newList.add(829);
        newList.add(976);
        newList.add(938);
        newList.add(786);
        newList.add(400);
        newList.add(970);
        newList.add(219);
        newList.add(887);
        newList.add(261);
        newList.add(411);
        newList.add(310);
        newList.add(545);
        newList.add(759);
        newList.add(788);
        newList.add(757);
        newList.add(548);
        newList.add(319);
        newList.add(330);
        newList.add(461);
        newList.add(630);
        newList.add(552);
        newList.add(899);
        newList.add(832);
        newList.add(475);
        newList.add(543);
        newList.add(765);
        newList.add(723);
        newList.add(526);
        newList.add(981);
        newList.add(579);
        newList.add(931);
        newList.add(301);
        newList.add(897);
        newList.add(547);
        newList.add(683);
        newList.add(876);
        newList.add(784);
        newList.add(384);
        newList.add(742);
        newList.add(717);
        newList.add(332);
        newList.add(622);
        newList.add(427);
        newList.add(679);
        newList.add(906);
        newList.add(735);
        newList.add(252);
        newList.add(454);
        newList.add(821);
        newList.add(476);
        newList.add(253);
        newList.add(468);
        newList.add(845);
        newList.add(928);
        newList.add(367);
        newList.add(421);
        newList.add(732);
        newList.add(871);
        newList.add(733);
        newList.add(277);
        newList.add(353);
        newList.add(544);
        newList.add(449);
        newList.add(862);
        newList.add(518);
        newList.add(231);
        newList.add(414);
        newList.add(376);
        newList.add(242);
        newList.add(582);
        newList.add(420);
        newList.add(809);
        newList.add(304);
        newList.add(416);
        newList.add(265);
        newList.add(460);
        newList.add(980);
        newList.add(338);
        newList.add(323);
        newList.add(665);
        newList.add(709);
        newList.add(675);
        newList.add(727);
        newList.add(989);
        newList.add(606);
        newList.add(438);
        newList.add(889);
        newList.add(888);
        newList.add(539);
        newList.add(394);
        newList.add(224);
        newList.add(365);
        newList.add(716);
        newList.add(985);
        newList.add(744);
        newList.add(634);
        newList.add(848);
        newList.add(776);
        newList.add(894);
        newList.add(221);
        newList.add(807);
        newList.add(705);
        newList.add(869);
        newList.add(762);
        newList.add(806);
        newList.add(546);
        newList.add(748);
        newList.add(553);
        newList.add(604);
        newList.add(324);
        newList.add(664);
        newList.add(296);
        newList.add(589);
        newList.add(668);
        newList.add(828);
        newList.add(935);
        newList.add(632);
        newList.add(306);
        newList.add(885);
        newList.add(327);
        newList.add(666);
        newList.add(217);
        newList.add(865);
        newList.add(490);
        newList.add(350);
        newList.add(974);
        newList.add(947);
        newList.add(512);
        newList.add(443);
        newList.add(824);
        newList.add(872);
        newList.add(700);
        newList.add(540);
        newList.add(783);
        newList.add(494);
        newList.add(229);
        newList.add(635);
        newList.add(398);
        newList.add(263);
        newList.add(513);
        newList.add(950);
        newList.add(245);
        newList.add(426);
        newList.add(669);
        newList.add(560);
        newList.add(308);
        newList.add(992);
        newList.add(257);
        newList.add(572);
        newList.add(280);
        newList.add(356);
        newList.add(551);
        newList.add(613);
        newList.add(455);
        newList.add(264);
        newList.add(465);
        newList.add(896);
        newList.add(390);
        newList.add(681);
        newList.add(708);
        newList.add(509);
        newList.add(298);
        newList.add(752);
        newList.add(575);
        newList.add(424);
        newList.add(878);
        newList.add(599);
        newList.add(436);
        newList.add(729);
        newList.add(925);
        newList.add(592);
        newList.add(204);
        newList.add(393);
        newList.add(532);
        newList.add(689);
        newList.add(750);
        newList.add(313);
        newList.add(488);
        newList.add(249);
        newList.add(290);
        newList.add(722);
        newList.add(340);
        newList.add(491);
        newList.add(677);
        newList.add(702);
        newList.add(352);
        newList.add(279);
        newList.add(549);
        newList.add(804);
        newList.add(967);
        newList.add(881);
        newList.add(225);
        newList.add(793);
        newList.add(639);
        newList.add(238);
        newList.add(764);
        newList.add(412);
        newList.add(633);
        newList.add(440);
        newList.add(339);
        newList.add(874);
        newList.add(707);
        newList.add(789);
        newList.add(826);
        newList.add(774);
        newList.add(656);
        newList.add(314);
        newList.add(268);
        newList.add(815);
        newList.add(370);
        newList.add(585);
        newList.add(955);
        newList.add(811);
        newList.add(506);
        newList.add(840);
        newList.add(269);
        newList.add(368);
        newList.add(711);
        newList.add(694);
        newList.add(486);
        newList.add(952);
        newList.add(345);
        newList.add(470);
        newList.add(516);
        newList.add(463);
        newList.add(278);
        newList.add(827);
        newList.add(381);
        newList.add(223);
        newList.add(946);
        newList.add(610);
        newList.add(964);
        newList.add(447);
        newList.add(425);
        newList.add(991);
        newList.add(614);
        newList.add(558);
        newList.add(936);
        newList.add(782);
        newList.add(270);
        newList.add(527);
        newList.add(602);
        newList.add(954);
        newList.add(924);
        newList.add(408);
        newList.add(728);
        newList.add(637);
        newList.add(863);
        newList.add(284);
        newList.add(371);
        newList.add(851);
        newList.add(674);
        newList.add(315);
        newList.add(214);
        newList.add(565);
        newList.add(423);
        newList.add(726);
        newList.add(953);
        newList.add(929);
        newList.add(914);
        newList.add(895);
        newList.add(814);
        newList.add(234);
        newList.add(743);
        newList.add(481);
        newList.add(489);
        newList.add(480);
        newList.add(611);
        newList.add(351);
        newList.add(372);
        newList.add(833);
        newList.add(870);
        newList.add(235);
        newList.add(697);
        newList.add(960);
        newList.add(251);
        newList.add(971);
        newList.add(428);
        newList.add(577);
        newList.add(566);
        newList.add(439);
        newList.add(361);
        newList.add(879);
        newList.add(366);
        newList.add(203);
        newList.add(587);
        newList.add(660);
        newList.add(939);
        newList.add(958);
        newList.add(302);
        newList.add(342);
        newList.add(841);
        newList.add(873);
        newList.add(210);
        newList.add(233);
        newList.add(775);
        newList.add(212);
        newList.add(271);
        newList.add(431);
        newList.add(659);
        newList.add(718);
        newList.add(779);
        newList.add(318);
        newList.add(671);
        newList.add(918);
        newList.add(966);
        newList.add(347);
        newList.add(536);
        newList.add(464);
        newList.add(401);
        newList.add(554);
        newList.add(797);
        newList.add(649);
        newList.add(358);
        newList.add(258);
        newList.add(504);
        newList.add(574);
        newList.add(586);
        newList.add(397);
        newList.add(399);
        newList.add(556);
        newList.add(852);
        newList.add(275);
        newList.add(657);
        newList.add(479);
        newList.add(661);
        newList.add(357);
        newList.add(730);
        newList.add(619);
        newList.add(433);
        newList.add(882);
        newList.add(591);
        newList.add(378);
        newList.add(567);
        newList.add(434);
        newList.add(459);
        newList.add(820);
        newList.add(430);
        newList.add(387);
        newList.add(389);
        newList.add(519);
        newList.add(972);
        newList.add(856);
        newList.add(937);
        newList.add(522);
        newList.add(654);
        newList.add(658);
        newList.add(292);
        newList.add(230);
        newList.add(999);
        newList.add(474);
        newList.add(808);
        newList.add(374);
        newList.add(839);
        newList.add(207);
        newList.add(791);
        newList.add(891);
        newList.add(561);
        newList.add(940);
        newList.add(508);
        newList.add(227);
        newList.add(380);
        newList.add(959);
        newList.add(908);
        newList.add(720);
        newList.add(725);
        newList.add(451);
        newList.add(499);
        newList.add(867);
        newList.add(965);
        newList.add(984);
        newList.add(262);
        newList.add(598);
        newList.add(822);
        newList.add(695);
        newList.add(701);
        newList.add(930);
        newList.add(524);
        newList.add(737);
        newList.add(535);
        newList.add(603);
        newList.add(218);
        newList.add(485);
        newList.add(817);
        newList.add(682);
        newList.add(645);
        newList.add(943);
        newList.add(638);
        newList.add(713);
        newList.add(289);
        newList.add(617);
        newList.add(647);
        newList.add(988);
        newList.add(328);
        newList.add(402);
        newList.add(849);
        newList.add(686);
        newList.add(359);
        newList.add(904);
        newList.add(912);
        newList.add(392);
        newList.add(837);
        newList.add(273);


        //Write your code here
        int min = newList.get(0);
        for (int i = 0; i < newList.size(); i++) {

            if (newList.get(i) < min) {
                min = newList.get(i);
            }

        }
        System.out.println(min + " " + newList.indexOf(203));

        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) == min) {
                System.out.println(i);
            }
        }
        int max = newList.get(0);
        for (int i = 0; i < newList.size(); i++) {
            if (newList.get(i) > max) {
                max = newList.get(i);
            }
        }
        System.out.println(max);


    }


    public static void main(String[] args) {
        String content = "I am Learning Java. I want to learn for loop.";


        // printAllWords(content);
        //printSingleCharacterWord(content);
        // printDoubleCharacterWord(content);
        //printNCharacterWord(content, 4);
        //printAllCapsWord(content);
        // printUniqueWords(content);
        pyramidOfUniqueWords(content);

        // findSmallestNumber();

        //printAccordingFirstLetter(content);


    }
}


