/*
 * Copyright 2014 Ankush Sachdeva
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.ankushsachdeva.emojicon.emoji;

import java.io.Serializable;

/**
 * @author Hieu Rocker (rockerhieu@gmail.com)
 */
public class Emojicon implements Serializable {

    private static final long serialVersionUID = 1L;
    private String emoji;
        public static final Emojicon[] DATA = new Emojicon[] {Emojicon.fromCodePoint(0x1f604),
                Emojicon.fromCodePoint(0x1f603), Emojicon.fromCodePoint(0x1f600),
                Emojicon.fromCodePoint(0x1f60a), Emojicon.fromChar((char) 0x263a),
                Emojicon.fromCodePoint(0x1f609), Emojicon.fromCodePoint(0x1f60d),
                Emojicon.fromCodePoint(0x1f618), Emojicon.fromCodePoint(0x1f61a),
                Emojicon.fromCodePoint(0x1f617), Emojicon.fromCodePoint(0x1f619),
                Emojicon.fromCodePoint(0x1f61c), Emojicon.fromCodePoint(0x1f61d),
                Emojicon.fromCodePoint(0x1f61b), Emojicon.fromCodePoint(0x1f633),
                Emojicon.fromCodePoint(0x1f601), Emojicon.fromCodePoint(0x1f614),
                Emojicon.fromCodePoint(0x1f60c), Emojicon.fromCodePoint(0x1f612),
                Emojicon.fromCodePoint(0x1f61e), Emojicon.fromCodePoint(0x1f623),
                Emojicon.fromCodePoint(0x1f622), Emojicon.fromCodePoint(0x1f602),
                Emojicon.fromCodePoint(0x1f62d), Emojicon.fromCodePoint(0x1f62a),
                Emojicon.fromCodePoint(0x1f625), Emojicon.fromCodePoint(0x1f630),
                Emojicon.fromCodePoint(0x1f605), Emojicon.fromCodePoint(0x1f613),
                Emojicon.fromCodePoint(0x1f629), Emojicon.fromCodePoint(0x1f62b),
                Emojicon.fromCodePoint(0x1f628), Emojicon.fromCodePoint(0x1f631),
                Emojicon.fromCodePoint(0x1f620), Emojicon.fromCodePoint(0x1f621),
                Emojicon.fromCodePoint(0x1f624), Emojicon.fromCodePoint(0x1f616),
                Emojicon.fromCodePoint(0x1f606), Emojicon.fromCodePoint(0x1f60b),
                Emojicon.fromCodePoint(0x1f637), Emojicon.fromCodePoint(0x1f60e),
                Emojicon.fromCodePoint(0x1f634), Emojicon.fromCodePoint(0x1f635),
                Emojicon.fromCodePoint(0x1f632), Emojicon.fromCodePoint(0x1f61f),
                Emojicon.fromCodePoint(0x1f626), Emojicon.fromCodePoint(0x1f627),
                Emojicon.fromCodePoint(0x1f608), Emojicon.fromCodePoint(0x1f47f),
                Emojicon.fromCodePoint(0x1f62e), Emojicon.fromCodePoint(0x1f62c),
                Emojicon.fromCodePoint(0x1f610), Emojicon.fromCodePoint(0x1f615),
                Emojicon.fromCodePoint(0x1f62f), Emojicon.fromCodePoint(0x1f636),
                Emojicon.fromCodePoint(0x1f607), Emojicon.fromCodePoint(0x1f60f),
                Emojicon.fromCodePoint(0x1f611), Emojicon.fromCodePoint(0x1f472),
                Emojicon.fromCodePoint(0x1f473), Emojicon.fromCodePoint(0x1f46e),
                Emojicon.fromCodePoint(0x1f477), Emojicon.fromCodePoint(0x1f482),
                Emojicon.fromCodePoint(0x1f476), Emojicon.fromCodePoint(0x1f466),
                Emojicon.fromCodePoint(0x1f467), Emojicon.fromCodePoint(0x1f468),
                Emojicon.fromCodePoint(0x1f469), Emojicon.fromCodePoint(0x1f474),
                Emojicon.fromCodePoint(0x1f475), Emojicon.fromCodePoint(0x1f471),
                Emojicon.fromCodePoint(0x1f47c), Emojicon.fromCodePoint(0x1f478),
                Emojicon.fromCodePoint(0x1f63a), Emojicon.fromCodePoint(0x1f638),
                Emojicon.fromCodePoint(0x1f63b), Emojicon.fromCodePoint(0x1f63d),
                Emojicon.fromCodePoint(0x1f63c), Emojicon.fromCodePoint(0x1f640),
                Emojicon.fromCodePoint(0x1f63f), Emojicon.fromCodePoint(0x1f639),
                Emojicon.fromCodePoint(0x1f63e), Emojicon.fromCodePoint(0x1f479),
                Emojicon.fromCodePoint(0x1f47a), Emojicon.fromCodePoint(0x1f648),
                Emojicon.fromCodePoint(0x1f649), Emojicon.fromCodePoint(0x1f64a),
                Emojicon.fromCodePoint(0x1f480), Emojicon.fromCodePoint(0x1f47d),
                Emojicon.fromCodePoint(0x1f4a9), Emojicon.fromCodePoint(0x1f525), Emojicon.fromChar(
                (char) 0x2728), Emojicon.fromCodePoint(0x1f31f), Emojicon.fromCodePoint(0x1f4ab),
                Emojicon.fromCodePoint(0x1f4a5), Emojicon.fromCodePoint(0x1f4a2),
                Emojicon.fromCodePoint(0x1f4a6), Emojicon.fromCodePoint(0x1f4a7),
                Emojicon.fromCodePoint(0x1f4a4), Emojicon.fromCodePoint(0x1f4a8),
                Emojicon.fromCodePoint(0x1f442), Emojicon.fromCodePoint(0x1f440),
                Emojicon.fromCodePoint(0x1f443), Emojicon.fromCodePoint(0x1f445),
                Emojicon.fromCodePoint(0x1f444), Emojicon.fromCodePoint(0x1f44d),
                Emojicon.fromCodePoint(0x1f44e), Emojicon.fromCodePoint(0x1f44c),
                Emojicon.fromCodePoint(0x1f44a), Emojicon.fromChar((char) 0x270a),
                Emojicon.fromChar(
                        (char) 0x270c), Emojicon.fromCodePoint(0x1f44b),
                Emojicon.fromChar((char) 0x270b),
                Emojicon.fromCodePoint(0x1f450), Emojicon.fromCodePoint(0x1f446),
                Emojicon.fromCodePoint(0x1f447), Emojicon.fromCodePoint(0x1f449),
                Emojicon.fromCodePoint(0x1f448), Emojicon.fromCodePoint(0x1f64c),
                Emojicon.fromCodePoint(0x1f64f), Emojicon.fromChar((char) 0x261d),
                Emojicon.fromCodePoint(0x1f44f), Emojicon.fromCodePoint(0x1f4aa),
                Emojicon.fromCodePoint(0x1f6b6), Emojicon.fromCodePoint(0x1f3c3),
                Emojicon.fromCodePoint(0x1f483), Emojicon.fromCodePoint(0x1f46b),
                Emojicon.fromCodePoint(0x1f46a), Emojicon.fromCodePoint(0x1f46c),
                Emojicon.fromCodePoint(0x1f46d), Emojicon.fromCodePoint(0x1f48f),
                Emojicon.fromCodePoint(0x1f491), Emojicon.fromCodePoint(0x1f46f),
                Emojicon.fromCodePoint(0x1f646), Emojicon.fromCodePoint(0x1f645),
                Emojicon.fromCodePoint(0x1f481), Emojicon.fromCodePoint(0x1f64b),
                Emojicon.fromCodePoint(0x1f486), Emojicon.fromCodePoint(0x1f487),
                Emojicon.fromCodePoint(0x1f485), Emojicon.fromCodePoint(0x1f470),
                Emojicon.fromCodePoint(0x1f64e), Emojicon.fromCodePoint(0x1f64d),
                Emojicon.fromCodePoint(0x1f647), Emojicon.fromCodePoint(0x1f3a9),
                Emojicon.fromCodePoint(0x1f451), Emojicon.fromCodePoint(0x1f452),
                Emojicon.fromCodePoint(0x1f45f), Emojicon.fromCodePoint(0x1f45e),
                Emojicon.fromCodePoint(0x1f461), Emojicon.fromCodePoint(0x1f460),
                Emojicon.fromCodePoint(0x1f462), Emojicon.fromCodePoint(0x1f455),
                Emojicon.fromCodePoint(0x1f454), Emojicon.fromCodePoint(0x1f45a),
                Emojicon.fromCodePoint(0x1f457), Emojicon.fromCodePoint(0x1f3bd),
                Emojicon.fromCodePoint(0x1f456), Emojicon.fromCodePoint(0x1f458),
                Emojicon.fromCodePoint(0x1f459), Emojicon.fromCodePoint(0x1f4bc),
                Emojicon.fromCodePoint(0x1f45c), Emojicon.fromCodePoint(0x1f45d),
                Emojicon.fromCodePoint(0x1f45b), Emojicon.fromCodePoint(0x1f453),
                Emojicon.fromCodePoint(0x1f380), Emojicon.fromCodePoint(0x1f302),
                Emojicon.fromCodePoint(0x1f484), Emojicon.fromCodePoint(0x1f49b),
                Emojicon.fromCodePoint(0x1f499), Emojicon.fromCodePoint(0x1f49c),
                Emojicon.fromCodePoint(0x1f49a), Emojicon.fromChar((char) 0x2764),
                Emojicon.fromCodePoint(0x1f494), Emojicon.fromCodePoint(0x1f497),
                Emojicon.fromCodePoint(0x1f493), Emojicon.fromCodePoint(0x1f495),
                Emojicon.fromCodePoint(0x1f496), Emojicon.fromCodePoint(0x1f49e),
                Emojicon.fromCodePoint(0x1f498), Emojicon.fromCodePoint(0x1f48c),
                Emojicon.fromCodePoint(0x1f48b), Emojicon.fromCodePoint(0x1f48d),
                Emojicon.fromCodePoint(0x1f48e), Emojicon.fromCodePoint(0x1f464),
                Emojicon.fromCodePoint(0x1f465), Emojicon.fromCodePoint(0x1f4ac),
                Emojicon.fromCodePoint(0x1f463), Emojicon.fromCodePoint(0x1f4ad),
                Emojicon.fromCodePoint(0x1f436),
                Emojicon.fromCodePoint(0x1f43a), Emojicon.fromCodePoint(0x1f431),
                Emojicon.fromCodePoint(0x1f42d), Emojicon.fromCodePoint(0x1f439),
                Emojicon.fromCodePoint(0x1f430), Emojicon.fromCodePoint(0x1f438),
                Emojicon.fromCodePoint(0x1f42f), Emojicon.fromCodePoint(0x1f428),
                Emojicon.fromCodePoint(0x1f43b), Emojicon.fromCodePoint(0x1f437),
                Emojicon.fromCodePoint(0x1f43d), Emojicon.fromCodePoint(0x1f42e),
                Emojicon.fromCodePoint(0x1f417), Emojicon.fromCodePoint(0x1f435),
                Emojicon.fromCodePoint(0x1f412), Emojicon.fromCodePoint(0x1f434),
                Emojicon.fromCodePoint(0x1f411), Emojicon.fromCodePoint(0x1f418),
                Emojicon.fromCodePoint(0x1f43c), Emojicon.fromCodePoint(0x1f427),
                Emojicon.fromCodePoint(0x1f426), Emojicon.fromCodePoint(0x1f424),
                Emojicon.fromCodePoint(0x1f425), Emojicon.fromCodePoint(0x1f423),
                Emojicon.fromCodePoint(0x1f414), Emojicon.fromCodePoint(0x1f40d),
                Emojicon.fromCodePoint(0x1f422), Emojicon.fromCodePoint(0x1f41b),
                Emojicon.fromCodePoint(0x1f41d), Emojicon.fromCodePoint(0x1f41c),
                Emojicon.fromCodePoint(0x1f41e), Emojicon.fromCodePoint(0x1f40c),
                Emojicon.fromCodePoint(0x1f419), Emojicon.fromCodePoint(0x1f41a),
                Emojicon.fromCodePoint(0x1f420), Emojicon.fromCodePoint(0x1f41f),
                Emojicon.fromCodePoint(0x1f42c), Emojicon.fromCodePoint(0x1f433),
                Emojicon.fromCodePoint(0x1f40b), Emojicon.fromCodePoint(0x1f404),
                Emojicon.fromCodePoint(0x1f40f), Emojicon.fromCodePoint(0x1f400),
                Emojicon.fromCodePoint(0x1f403), Emojicon.fromCodePoint(0x1f405),
                Emojicon.fromCodePoint(0x1f407), Emojicon.fromCodePoint(0x1f409),
                Emojicon.fromCodePoint(0x1f40e), Emojicon.fromCodePoint(0x1f410),
                Emojicon.fromCodePoint(0x1f413), Emojicon.fromCodePoint(0x1f415),
                Emojicon.fromCodePoint(0x1f416), Emojicon.fromCodePoint(0x1f401),
                Emojicon.fromCodePoint(0x1f402), Emojicon.fromCodePoint(0x1f432),
                Emojicon.fromCodePoint(0x1f421), Emojicon.fromCodePoint(0x1f40a),
                Emojicon.fromCodePoint(0x1f42b), Emojicon.fromCodePoint(0x1f42a),
                Emojicon.fromCodePoint(0x1f406), Emojicon.fromCodePoint(0x1f408),
                Emojicon.fromCodePoint(0x1f429), Emojicon.fromCodePoint(0x1f43e),
                Emojicon.fromCodePoint(0x1f490), Emojicon.fromCodePoint(0x1f338),
                Emojicon.fromCodePoint(0x1f337), Emojicon.fromCodePoint(0x1f340),
                Emojicon.fromCodePoint(0x1f339), Emojicon.fromCodePoint(0x1f33b),
                Emojicon.fromCodePoint(0x1f33a), Emojicon.fromCodePoint(0x1f341),
                Emojicon.fromCodePoint(0x1f343), Emojicon.fromCodePoint(0x1f342),
                Emojicon.fromCodePoint(0x1f33f), Emojicon.fromCodePoint(0x1f33e),
                Emojicon.fromCodePoint(0x1f344), Emojicon.fromCodePoint(0x1f335),
                Emojicon.fromCodePoint(0x1f334), Emojicon.fromCodePoint(0x1f332),
                Emojicon.fromCodePoint(0x1f333), Emojicon.fromCodePoint(0x1f330),
                Emojicon.fromCodePoint(0x1f331), Emojicon.fromCodePoint(0x1f33c),
                Emojicon.fromCodePoint(0x1f310), Emojicon.fromCodePoint(0x1f31e),
                Emojicon.fromCodePoint(0x1f31d), Emojicon.fromCodePoint(0x1f31a),
                Emojicon.fromCodePoint(0x1f311), Emojicon.fromCodePoint(0x1f312),
                Emojicon.fromCodePoint(0x1f313), Emojicon.fromCodePoint(0x1f314),
                Emojicon.fromCodePoint(0x1f315), Emojicon.fromCodePoint(0x1f316),
                Emojicon.fromCodePoint(0x1f317), Emojicon.fromCodePoint(0x1f318),
                Emojicon.fromCodePoint(0x1f31c), Emojicon.fromCodePoint(0x1f31b),
                Emojicon.fromCodePoint(0x1f319), Emojicon.fromCodePoint(0x1f30d),
                Emojicon.fromCodePoint(0x1f30e), Emojicon.fromCodePoint(0x1f30f),
                Emojicon.fromCodePoint(0x1f30b), Emojicon.fromCodePoint(0x1f30c),
                Emojicon.fromCodePoint(0x1f320), Emojicon.fromChar((char) 0x2b50),
                Emojicon.fromChar(
                        (char) 0x2600), Emojicon.fromChar((char) 0x26c5),
                Emojicon.fromChar((char) 0x2601),
                Emojicon.fromChar((char) 0x26a1), Emojicon.fromChar((char) 0x2614),
                Emojicon.fromChar(
                        (char) 0x2744), Emojicon.fromChar((char) 0x26c4),
                Emojicon.fromCodePoint(0x1f300),
                Emojicon.fromCodePoint(0x1f301), Emojicon.fromCodePoint(0x1f308),
                Emojicon.fromCodePoint(0x1f30a),
                Emojicon.fromCodePoint(0x1f38d),
                Emojicon.fromCodePoint(0x1f49d), Emojicon.fromCodePoint(0x1f38e),
                Emojicon.fromCodePoint(0x1f392), Emojicon.fromCodePoint(0x1f393),
                Emojicon.fromCodePoint(0x1f38f), Emojicon.fromCodePoint(0x1f386),
                Emojicon.fromCodePoint(0x1f387), Emojicon.fromCodePoint(0x1f390),
                Emojicon.fromCodePoint(0x1f391), Emojicon.fromCodePoint(0x1f383),
                Emojicon.fromCodePoint(0x1f47b), Emojicon.fromCodePoint(0x1f385),
                Emojicon.fromCodePoint(0x1f384), Emojicon.fromCodePoint(0x1f381),
                Emojicon.fromCodePoint(0x1f38b), Emojicon.fromCodePoint(0x1f389),
                Emojicon.fromCodePoint(0x1f38a), Emojicon.fromCodePoint(0x1f388),
                Emojicon.fromCodePoint(0x1f38c), Emojicon.fromCodePoint(0x1f52e),
                Emojicon.fromCodePoint(0x1f3a5), Emojicon.fromCodePoint(0x1f4f7),
                Emojicon.fromCodePoint(0x1f4f9), Emojicon.fromCodePoint(0x1f4fc),
                Emojicon.fromCodePoint(0x1f4bf), Emojicon.fromCodePoint(0x1f4c0),
                Emojicon.fromCodePoint(0x1f4bd), Emojicon.fromCodePoint(0x1f4be),
                Emojicon.fromCodePoint(0x1f4bb), Emojicon.fromCodePoint(0x1f4f1), Emojicon.fromChar(
                (char) 0x260e), Emojicon.fromCodePoint(0x1f4de), Emojicon.fromCodePoint(0x1f4df),
                Emojicon.fromCodePoint(0x1f4e0), Emojicon.fromCodePoint(0x1f4e1),
                Emojicon.fromCodePoint(0x1f4fa), Emojicon.fromCodePoint(0x1f4fb),
                Emojicon.fromCodePoint(0x1f508), Emojicon.fromCodePoint(0x1f509),
                Emojicon.fromCodePoint(0x1f50a), Emojicon.fromCodePoint(0x1f507),
                Emojicon.fromCodePoint(0x1f514), Emojicon.fromCodePoint(0x1f515),
                Emojicon.fromCodePoint(0x1f4e2), Emojicon.fromCodePoint(0x1f4e3), Emojicon.fromChar(
                (char) 0x23f3), Emojicon.fromChar((char) 0x231b), Emojicon.fromChar((char) 0x23f0),
                Emojicon.fromChar((char) 0x231a), Emojicon.fromCodePoint(0x1f513),
                Emojicon.fromCodePoint(0x1f512), Emojicon.fromCodePoint(0x1f50f),
                Emojicon.fromCodePoint(0x1f510), Emojicon.fromCodePoint(0x1f511),
                Emojicon.fromCodePoint(0x1f50e), Emojicon.fromCodePoint(0x1f4a1),
                Emojicon.fromCodePoint(0x1f526), Emojicon.fromCodePoint(0x1f506),
                Emojicon.fromCodePoint(0x1f505), Emojicon.fromCodePoint(0x1f50c),
                Emojicon.fromCodePoint(0x1f50b), Emojicon.fromCodePoint(0x1f50d),
                Emojicon.fromCodePoint(0x1f6c1), Emojicon.fromCodePoint(0x1f6c0),
                Emojicon.fromCodePoint(0x1f6bf), Emojicon.fromCodePoint(0x1f6bd),
                Emojicon.fromCodePoint(0x1f527), Emojicon.fromCodePoint(0x1f529),
                Emojicon.fromCodePoint(0x1f528), Emojicon.fromCodePoint(0x1f6aa),
                Emojicon.fromCodePoint(0x1f6ac), Emojicon.fromCodePoint(0x1f4a3),
                Emojicon.fromCodePoint(0x1f52b), Emojicon.fromCodePoint(0x1f52a),
                Emojicon.fromCodePoint(0x1f48a), Emojicon.fromCodePoint(0x1f489),
                Emojicon.fromCodePoint(0x1f4b0), Emojicon.fromCodePoint(0x1f4b4),
                Emojicon.fromCodePoint(0x1f4b5), Emojicon.fromCodePoint(0x1f4b7),
                Emojicon.fromCodePoint(0x1f4b6), Emojicon.fromCodePoint(0x1f4b3),
                Emojicon.fromCodePoint(0x1f4b8), Emojicon.fromCodePoint(0x1f4f2),
                Emojicon.fromCodePoint(0x1f4e7), Emojicon.fromCodePoint(0x1f4e5),
                Emojicon.fromCodePoint(0x1f4e4), Emojicon.fromChar((char) 0x2709),
                Emojicon.fromCodePoint(0x1f4e9), Emojicon.fromCodePoint(0x1f4e8),
                Emojicon.fromCodePoint(0x1f4ef), Emojicon.fromCodePoint(0x1f4eb),
                Emojicon.fromCodePoint(0x1f4ea), Emojicon.fromCodePoint(0x1f4ec),
                Emojicon.fromCodePoint(0x1f4ed), Emojicon.fromCodePoint(0x1f4ee),
                Emojicon.fromCodePoint(0x1f4e6), Emojicon.fromCodePoint(0x1f4dd),
                Emojicon.fromCodePoint(0x1f4c4), Emojicon.fromCodePoint(0x1f4c3),
                Emojicon.fromCodePoint(0x1f4d1), Emojicon.fromCodePoint(0x1f4ca),
                Emojicon.fromCodePoint(0x1f4c8), Emojicon.fromCodePoint(0x1f4c9),
                Emojicon.fromCodePoint(0x1f4dc), Emojicon.fromCodePoint(0x1f4cb),
                Emojicon.fromCodePoint(0x1f4c5), Emojicon.fromCodePoint(0x1f4c6),
                Emojicon.fromCodePoint(0x1f4c7), Emojicon.fromCodePoint(0x1f4c1),
                Emojicon.fromCodePoint(0x1f4c2), Emojicon.fromChar((char) 0x2702),
                Emojicon.fromCodePoint(0x1f4cc), Emojicon.fromCodePoint(0x1f4ce), Emojicon.fromChar(
                (char) 0x2712), Emojicon.fromChar((char) 0x270f), Emojicon.fromCodePoint(0x1f4cf),
                Emojicon.fromCodePoint(0x1f4d0), Emojicon.fromCodePoint(0x1f4d5),
                Emojicon.fromCodePoint(0x1f4d7), Emojicon.fromCodePoint(0x1f4d8),
                Emojicon.fromCodePoint(0x1f4d9), Emojicon.fromCodePoint(0x1f4d3),
                Emojicon.fromCodePoint(0x1f4d4), Emojicon.fromCodePoint(0x1f4d2),
                Emojicon.fromCodePoint(0x1f4da), Emojicon.fromCodePoint(0x1f4d6),
                Emojicon.fromCodePoint(0x1f516), Emojicon.fromCodePoint(0x1f4db),
                Emojicon.fromCodePoint(0x1f52c), Emojicon.fromCodePoint(0x1f52d),
                Emojicon.fromCodePoint(0x1f4f0), Emojicon.fromCodePoint(0x1f3a8),
                Emojicon.fromCodePoint(0x1f3ac), Emojicon.fromCodePoint(0x1f3a4),
                Emojicon.fromCodePoint(0x1f3a7), Emojicon.fromCodePoint(0x1f3bc),
                Emojicon.fromCodePoint(0x1f3b5), Emojicon.fromCodePoint(0x1f3b6),
                Emojicon.fromCodePoint(0x1f3b9), Emojicon.fromCodePoint(0x1f3bb),
                Emojicon.fromCodePoint(0x1f3ba), Emojicon.fromCodePoint(0x1f3b7),
                Emojicon.fromCodePoint(0x1f3b8), Emojicon.fromCodePoint(0x1f47e),
                Emojicon.fromCodePoint(0x1f3ae), Emojicon.fromCodePoint(0x1f0cf),
                Emojicon.fromCodePoint(0x1f3b4), Emojicon.fromCodePoint(0x1f004),
                Emojicon.fromCodePoint(0x1f3b2), Emojicon.fromCodePoint(0x1f3af),
                Emojicon.fromCodePoint(0x1f3c8), Emojicon.fromCodePoint(0x1f3c0), Emojicon.fromChar(
                (char) 0x26bd), Emojicon.fromChar((char) 0x26be), Emojicon.fromCodePoint(0x1f3be),
                Emojicon.fromCodePoint(0x1f3b1), Emojicon.fromCodePoint(0x1f3c9),
                Emojicon.fromCodePoint(0x1f3b3), Emojicon.fromChar((char) 0x26f3),
                Emojicon.fromCodePoint(0x1f6b5), Emojicon.fromCodePoint(0x1f6b4),
                Emojicon.fromCodePoint(0x1f3c1), Emojicon.fromCodePoint(0x1f3c7),
                Emojicon.fromCodePoint(0x1f3c6), Emojicon.fromCodePoint(0x1f3bf),
                Emojicon.fromCodePoint(0x1f3c2), Emojicon.fromCodePoint(0x1f3ca),
                Emojicon.fromCodePoint(0x1f3c4), Emojicon.fromCodePoint(0x1f3a3), Emojicon.fromChar(
                (char) 0x2615), Emojicon.fromCodePoint(0x1f375), Emojicon.fromCodePoint(0x1f376),
                Emojicon.fromCodePoint(0x1f37c), Emojicon.fromCodePoint(0x1f37a),
                Emojicon.fromCodePoint(0x1f37b), Emojicon.fromCodePoint(0x1f378),
                Emojicon.fromCodePoint(0x1f379), Emojicon.fromCodePoint(0x1f377),
                Emojicon.fromCodePoint(0x1f374), Emojicon.fromCodePoint(0x1f355),
                Emojicon.fromCodePoint(0x1f354), Emojicon.fromCodePoint(0x1f35f),
                Emojicon.fromCodePoint(0x1f357), Emojicon.fromCodePoint(0x1f356),
                Emojicon.fromCodePoint(0x1f35d), Emojicon.fromCodePoint(0x1f35b),
                Emojicon.fromCodePoint(0x1f364), Emojicon.fromCodePoint(0x1f371),
                Emojicon.fromCodePoint(0x1f363), Emojicon.fromCodePoint(0x1f365),
                Emojicon.fromCodePoint(0x1f359), Emojicon.fromCodePoint(0x1f358),
                Emojicon.fromCodePoint(0x1f35a), Emojicon.fromCodePoint(0x1f35c),
                Emojicon.fromCodePoint(0x1f372), Emojicon.fromCodePoint(0x1f362),
                Emojicon.fromCodePoint(0x1f361), Emojicon.fromCodePoint(0x1f373),
                Emojicon.fromCodePoint(0x1f35e), Emojicon.fromCodePoint(0x1f369),
                Emojicon.fromCodePoint(0x1f36e), Emojicon.fromCodePoint(0x1f366),
                Emojicon.fromCodePoint(0x1f368), Emojicon.fromCodePoint(0x1f367),
                Emojicon.fromCodePoint(0x1f382), Emojicon.fromCodePoint(0x1f370),
                Emojicon.fromCodePoint(0x1f36a), Emojicon.fromCodePoint(0x1f36b),
                Emojicon.fromCodePoint(0x1f36c), Emojicon.fromCodePoint(0x1f36d),
                Emojicon.fromCodePoint(0x1f36f), Emojicon.fromCodePoint(0x1f34e),
                Emojicon.fromCodePoint(0x1f34f), Emojicon.fromCodePoint(0x1f34a),
                Emojicon.fromCodePoint(0x1f34b), Emojicon.fromCodePoint(0x1f352),
                Emojicon.fromCodePoint(0x1f347), Emojicon.fromCodePoint(0x1f349),
                Emojicon.fromCodePoint(0x1f353), Emojicon.fromCodePoint(0x1f351),
                Emojicon.fromCodePoint(0x1f348), Emojicon.fromCodePoint(0x1f34c),
                Emojicon.fromCodePoint(0x1f350), Emojicon.fromCodePoint(0x1f34d),
                Emojicon.fromCodePoint(0x1f360), Emojicon.fromCodePoint(0x1f346),
                Emojicon.fromCodePoint(0x1f345), Emojicon.fromCodePoint(0x1f33d),
                Emojicon.fromCodePoint(0x1f3e0),
                Emojicon.fromCodePoint(0x1f3e1), Emojicon.fromCodePoint(0x1f3eb),
                Emojicon.fromCodePoint(0x1f3e2), Emojicon.fromCodePoint(0x1f3e3),
                Emojicon.fromCodePoint(0x1f3e5), Emojicon.fromCodePoint(0x1f3e6),
                Emojicon.fromCodePoint(0x1f3ea), Emojicon.fromCodePoint(0x1f3e9),
                Emojicon.fromCodePoint(0x1f3e8), Emojicon.fromCodePoint(0x1f492), Emojicon.fromChar(
                (char) 0x26ea), Emojicon.fromCodePoint(0x1f3ec), Emojicon.fromCodePoint(0x1f3e4),
                Emojicon.fromCodePoint(0x1f307), Emojicon.fromCodePoint(0x1f306),
                Emojicon.fromCodePoint(0x1f3ef), Emojicon.fromCodePoint(0x1f3f0), Emojicon.fromChar(
                (char) 0x26fa), Emojicon.fromCodePoint(0x1f3ed), Emojicon.fromCodePoint(0x1f5fc),
                Emojicon.fromCodePoint(0x1f5fe), Emojicon.fromCodePoint(0x1f5fb),
                Emojicon.fromCodePoint(0x1f304), Emojicon.fromCodePoint(0x1f305),
                Emojicon.fromCodePoint(0x1f303), Emojicon.fromCodePoint(0x1f5fd),
                Emojicon.fromCodePoint(0x1f309), Emojicon.fromCodePoint(0x1f3a0),
                Emojicon.fromCodePoint(0x1f3a1), Emojicon.fromChar((char) 0x26f2),
                Emojicon.fromCodePoint(0x1f3a2), Emojicon.fromCodePoint(0x1f6a2), Emojicon.fromChar(
                (char) 0x26f5), Emojicon.fromCodePoint(0x1f6a4), Emojicon.fromCodePoint(0x1f6a3),
                Emojicon.fromChar((char) 0x2693), Emojicon.fromCodePoint(0x1f680),
                Emojicon.fromChar(
                        (char) 0x2708), Emojicon.fromCodePoint(0x1f4ba),
                Emojicon.fromCodePoint(0x1f681),
                Emojicon.fromCodePoint(0x1f682), Emojicon.fromCodePoint(0x1f68a),
                Emojicon.fromCodePoint(0x1f689), Emojicon.fromCodePoint(0x1f69e),
                Emojicon.fromCodePoint(0x1f686), Emojicon.fromCodePoint(0x1f684),
                Emojicon.fromCodePoint(0x1f685), Emojicon.fromCodePoint(0x1f688),
                Emojicon.fromCodePoint(0x1f687), Emojicon.fromCodePoint(0x1f69d),
                Emojicon.fromCodePoint(0x1f68b), Emojicon.fromCodePoint(0x1f683),
                Emojicon.fromCodePoint(0x1f68e), Emojicon.fromCodePoint(0x1f68c),
                Emojicon.fromCodePoint(0x1f68d), Emojicon.fromCodePoint(0x1f699),
                Emojicon.fromCodePoint(0x1f698), Emojicon.fromCodePoint(0x1f697),
                Emojicon.fromCodePoint(0x1f695), Emojicon.fromCodePoint(0x1f696),
                Emojicon.fromCodePoint(0x1f69b), Emojicon.fromCodePoint(0x1f69a),
                Emojicon.fromCodePoint(0x1f6a8), Emojicon.fromCodePoint(0x1f693),
                Emojicon.fromCodePoint(0x1f694), Emojicon.fromCodePoint(0x1f692),
                Emojicon.fromCodePoint(0x1f691), Emojicon.fromCodePoint(0x1f690),
                Emojicon.fromCodePoint(0x1f6b2), Emojicon.fromCodePoint(0x1f6a1),
                Emojicon.fromCodePoint(0x1f69f), Emojicon.fromCodePoint(0x1f6a0),
                Emojicon.fromCodePoint(0x1f69c), Emojicon.fromCodePoint(0x1f488),
                Emojicon.fromCodePoint(0x1f68f), Emojicon.fromCodePoint(0x1f3ab),
                Emojicon.fromCodePoint(0x1f6a6), Emojicon.fromCodePoint(0x1f6a5), Emojicon.fromChar(
                (char) 0x26a0), Emojicon.fromCodePoint(0x1f6a7), Emojicon.fromCodePoint(0x1f530),
                Emojicon.fromChar((char) 0x26fd), Emojicon.fromCodePoint(0x1f3ee),
                Emojicon.fromCodePoint(0x1f3b0), Emojicon.fromChar((char) 0x2668),
                Emojicon.fromCodePoint(0x1f5ff), Emojicon.fromCodePoint(0x1f3aa),
                Emojicon.fromCodePoint(0x1f3ad), Emojicon.fromCodePoint(0x1f4cd),
                Emojicon.fromCodePoint(0x1f6a9), Emojicon.fromChars("\ud83c\uddef\ud83c\uddf5"),
                Emojicon.fromChars("\ud83c\uddf0\ud83c\uddf7"), Emojicon.fromChars(
                "\ud83c\udde9\ud83c\uddea"), Emojicon.fromChars("\ud83c\udde8\ud83c\uddf3"),
                Emojicon.fromChars("\ud83c\uddfa\ud83c\uddf8"), Emojicon.fromChars(
                "\ud83c\uddeb\ud83c\uddf7"), Emojicon.fromChars("\ud83c\uddea\ud83c\uddf8"),
                Emojicon.fromChars("\ud83c\uddee\ud83c\uddf9"), Emojicon.fromChars(
                "\ud83c\uddf7\ud83c\uddfa"), Emojicon.fromChars("\ud83c\uddec\ud83c\udde7"),
                Emojicon.fromChars("\u0031\u20e3"),
                Emojicon.fromChars("\u0032\u20e3"), Emojicon.fromChars("\u0033\u20e3"),
                Emojicon.fromChars("\u0034\u20e3"), Emojicon.fromChars("\u0035\u20e3"),
                Emojicon.fromChars("\u0036\u20e3"), Emojicon.fromChars("\u0037\u20e3"),
                Emojicon.fromChars("\u0038\u20e3"), Emojicon.fromChars("\u0039\u20e3"),
                Emojicon.fromChars("\u0030\u20e3"), Emojicon.fromCodePoint(0x1f51f),
                Emojicon.fromCodePoint(0x1f522), Emojicon.fromChars("\u0023\u20e3"),
                Emojicon.fromCodePoint(0x1f523), Emojicon.fromChar((char) 0x2b06),
                Emojicon.fromChar(
                        (char) 0x2b07), Emojicon.fromChar((char) 0x2b05),
                Emojicon.fromChar((char) 0x27a1),
                Emojicon.fromCodePoint(0x1f520), Emojicon.fromCodePoint(0x1f521),
                Emojicon.fromCodePoint(0x1f524), Emojicon.fromChar((char) 0x2197),
                Emojicon.fromChar(
                        (char) 0x2196), Emojicon.fromChar((char) 0x2198),
                Emojicon.fromChar((char) 0x2199),
                Emojicon.fromChar((char) 0x2194), Emojicon.fromChar((char) 0x2195),
                Emojicon.fromCodePoint(0x1f504), Emojicon.fromChar((char) 0x25c0),
                Emojicon.fromChar(
                        (char) 0x25b6), Emojicon.fromCodePoint(0x1f53c),
                Emojicon.fromCodePoint(0x1f53d),
                Emojicon.fromChar((char) 0x21a9), Emojicon.fromChar((char) 0x21aa),
                Emojicon.fromChar(
                        (char) 0x2139), Emojicon.fromChar((char) 0x23ea),
                Emojicon.fromChar((char) 0x23e9),
                Emojicon.fromChar((char) 0x23eb), Emojicon.fromChar((char) 0x23ec),
                Emojicon.fromChar(
                        (char) 0x2935), Emojicon.fromChar((char) 0x2934),
                Emojicon.fromCodePoint(0x1f197),
                Emojicon.fromCodePoint(0x1f500), Emojicon.fromCodePoint(0x1f501),
                Emojicon.fromCodePoint(0x1f502), Emojicon.fromCodePoint(0x1f195),
                Emojicon.fromCodePoint(0x1f199), Emojicon.fromCodePoint(0x1f192),
                Emojicon.fromCodePoint(0x1f193), Emojicon.fromCodePoint(0x1f196),
                Emojicon.fromCodePoint(0x1f4f6), Emojicon.fromCodePoint(0x1f3a6),
                Emojicon.fromCodePoint(0x1f201), Emojicon.fromCodePoint(0x1f22f),
                Emojicon.fromCodePoint(0x1f233), Emojicon.fromCodePoint(0x1f235),
                Emojicon.fromCodePoint(0x1f234), Emojicon.fromCodePoint(0x1f232),
                Emojicon.fromCodePoint(0x1f250), Emojicon.fromCodePoint(0x1f239),
                Emojicon.fromCodePoint(0x1f23a), Emojicon.fromCodePoint(0x1f236),
                Emojicon.fromCodePoint(0x1f21a), Emojicon.fromCodePoint(0x1f6bb),
                Emojicon.fromCodePoint(0x1f6b9), Emojicon.fromCodePoint(0x1f6ba),
                Emojicon.fromCodePoint(0x1f6bc), Emojicon.fromCodePoint(0x1f6be),
                Emojicon.fromCodePoint(0x1f6b0), Emojicon.fromCodePoint(0x1f6ae),
                Emojicon.fromCodePoint(0x1f17f), Emojicon.fromChar((char) 0x267f),
                Emojicon.fromCodePoint(0x1f6ad), Emojicon.fromCodePoint(0x1f237),
                Emojicon.fromCodePoint(0x1f238), Emojicon.fromCodePoint(0x1f202), Emojicon.fromChar(
                (char) 0x24c2), Emojicon.fromCodePoint(0x1f6c2), Emojicon.fromCodePoint(0x1f6c4),
                Emojicon.fromCodePoint(0x1f6c5), Emojicon.fromCodePoint(0x1f6c3),
                Emojicon.fromCodePoint(0x1f251), Emojicon.fromChar((char) 0x3299),
                Emojicon.fromChar(
                        (char) 0x3297), Emojicon.fromCodePoint(0x1f191),
                Emojicon.fromCodePoint(0x1f198),
                Emojicon.fromCodePoint(0x1f194), Emojicon.fromCodePoint(0x1f6ab),
                Emojicon.fromCodePoint(0x1f51e), Emojicon.fromCodePoint(0x1f4f5),
                Emojicon.fromCodePoint(0x1f6af), Emojicon.fromCodePoint(0x1f6b1),
                Emojicon.fromCodePoint(0x1f6b3), Emojicon.fromCodePoint(0x1f6b7),
                Emojicon.fromCodePoint(0x1f6b8), Emojicon.fromChar((char) 0x26d4),
                Emojicon.fromChar(
                        (char) 0x2733), Emojicon.fromChar((char) 0x2747),
                Emojicon.fromChar((char) 0x274e),
                Emojicon.fromChar((char) 0x2705), Emojicon.fromChar((char) 0x2734),
                Emojicon.fromCodePoint(0x1f49f), Emojicon.fromCodePoint(0x1f19a),
                Emojicon.fromCodePoint(0x1f4f3), Emojicon.fromCodePoint(0x1f4f4),
                Emojicon.fromCodePoint(0x1f170), Emojicon.fromCodePoint(0x1f171),
                Emojicon.fromCodePoint(0x1f18e), Emojicon.fromCodePoint(0x1f17e),
                Emojicon.fromCodePoint(0x1f4a0), Emojicon.fromChar((char) 0x27bf),
                Emojicon.fromChar(
                        (char) 0x267b), Emojicon.fromChar((char) 0x2648),
                Emojicon.fromChar((char) 0x2649),
                Emojicon.fromChar((char) 0x264a), Emojicon.fromChar((char) 0x264b),
                Emojicon.fromChar(
                        (char) 0x264c), Emojicon.fromChar((char) 0x264d),
                Emojicon.fromChar((char) 0x264e),
                Emojicon.fromChar((char) 0x264f), Emojicon.fromChar((char) 0x2650),
                Emojicon.fromChar(
                        (char) 0x2651), Emojicon.fromChar((char) 0x2652),
                Emojicon.fromChar((char) 0x2653),
                Emojicon.fromChar((char) 0x26ce), Emojicon.fromCodePoint(0x1f52f),
                Emojicon.fromCodePoint(0x1f3e7), Emojicon.fromCodePoint(0x1f4b9),
                Emojicon.fromCodePoint(0x1f4b2), Emojicon.fromCodePoint(0x1f4b1),
                //            Emoji.fromChar((char)0x00a9),
                //            Emoji.fromChar((char)0x00ae),
                Emojicon.fromChar((char) 0xe24e), Emojicon.fromChar((char) 0xe24f),

                Emojicon.fromChar((char) 0x2122), Emojicon.fromChar((char) 0x274c),
                Emojicon.fromChar(
                        (char) 0x203c), Emojicon.fromChar((char) 0x2049),
                Emojicon.fromChar((char) 0x2757),
                Emojicon.fromChar((char) 0x2753), Emojicon.fromChar((char) 0x2755),
                Emojicon.fromChar(
                        (char) 0x2754), Emojicon.fromChar((char) 0x2b55),
                Emojicon.fromCodePoint(0x1f51d),
                Emojicon.fromCodePoint(0x1f51a), Emojicon.fromCodePoint(0x1f519),
                Emojicon.fromCodePoint(0x1f51b), Emojicon.fromCodePoint(0x1f51c),
                Emojicon.fromCodePoint(0x1f503), Emojicon.fromCodePoint(0x1f55b),
                Emojicon.fromCodePoint(0x1f567), Emojicon.fromCodePoint(0x1f550),
                Emojicon.fromCodePoint(0x1f55c), Emojicon.fromCodePoint(0x1f551),
                Emojicon.fromCodePoint(0x1f55d), Emojicon.fromCodePoint(0x1f552),
                Emojicon.fromCodePoint(0x1f55e), Emojicon.fromCodePoint(0x1f553),
                Emojicon.fromCodePoint(0x1f55f), Emojicon.fromCodePoint(0x1f554),
                Emojicon.fromCodePoint(0x1f560), Emojicon.fromCodePoint(0x1f555),
                Emojicon.fromCodePoint(0x1f556), Emojicon.fromCodePoint(0x1f557),
                Emojicon.fromCodePoint(0x1f558), Emojicon.fromCodePoint(0x1f559),
                Emojicon.fromCodePoint(0x1f55a), Emojicon.fromCodePoint(0x1f561),
                Emojicon.fromCodePoint(0x1f562), Emojicon.fromCodePoint(0x1f563),
                Emojicon.fromCodePoint(0x1f564), Emojicon.fromCodePoint(0x1f565),
                Emojicon.fromCodePoint(0x1f566), Emojicon.fromChar((char) 0x2716),
                Emojicon.fromChar(
                        (char) 0x2795), Emojicon.fromChar((char) 0x2796),
                Emojicon.fromChar((char) 0x2797),
                Emojicon.fromChar((char) 0x2660), Emojicon.fromChar((char) 0x2665),
                Emojicon.fromChar(
                        (char) 0x2663), Emojicon.fromChar((char) 0x2666),
                Emojicon.fromCodePoint(0x1f4ae),
                Emojicon.fromCodePoint(0x1f4af), Emojicon.fromChar((char) 0x2714),
                Emojicon.fromChar(
                        (char) 0x2611), Emojicon.fromCodePoint(0x1f518),
                Emojicon.fromCodePoint(0x1f517),
                Emojicon.fromChar((char) 0x27b0), Emojicon.fromChar((char) 0x3030),
                Emojicon.fromChar(
                        (char) 0x303d), Emojicon.fromCodePoint(0x1f531),
                Emojicon.fromChar((char) 0x25fc),
                Emojicon.fromChar((char) 0x25fb), Emojicon.fromChar((char) 0x25fe),
                Emojicon.fromChar(
                        (char) 0x25fd), Emojicon.fromChar((char) 0x25aa),
                Emojicon.fromChar((char) 0x25ab),
                Emojicon.fromCodePoint(0x1f53a), Emojicon.fromCodePoint(0x1f532),
                Emojicon.fromCodePoint(0x1f533), Emojicon.fromChar((char) 0x26ab),
                Emojicon.fromChar(
                        (char) 0x26aa), Emojicon.fromCodePoint(0x1f534),
                Emojicon.fromCodePoint(0x1f535),
                Emojicon.fromCodePoint(0x1f53b), Emojicon.fromChar((char) 0x2b1c),
                Emojicon.fromChar(
                        (char) 0x2b1b), Emojicon.fromCodePoint(0x1f536),
                Emojicon.fromCodePoint(0x1f537),
                Emojicon.fromCodePoint(0x1f538), Emojicon.fromCodePoint(0x1f539),

        };

    private Emojicon() {
    }

    public Emojicon(String emoji) {
        this.emoji = emoji;
    }

    public static Emojicon fromCodePoint(int codePoint) {
        Emojicon emoji = new Emojicon();
        emoji.emoji = newString(codePoint);
        return emoji;
    }

    public static Emojicon fromChar(char ch) {
        Emojicon emoji = new Emojicon();
        emoji.emoji = Character.toString(ch);
        return emoji;
    }

    public static Emojicon fromChars(String chars) {
        Emojicon emoji = new Emojicon();
        emoji.emoji = chars;
        return emoji;
    }

    public String getEmoji() {
        return emoji;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Emojicon && emoji.equals(((Emojicon) o).emoji);
    }

    @Override
    public int hashCode() {
        return emoji.hashCode();
    }

    public static final String newString(int codePoint) {
        if (Character.charCount(codePoint) == 1) {
            return String.valueOf(codePoint);
        } else {
            return new String(Character.toChars(codePoint));
        }
    }
}
