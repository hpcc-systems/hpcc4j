package org.hpccsystems.commons.utils;

/*##############################################################################
Copyright (C) 2011 HPCC Systems.
All rights reserved. This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.
This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU Affero General Public License for more details.
You should have received a copy of the GNU Affero General Public License
along with this program. If not, see <http://www.gnu.org/licenses/>.
############################################################################## */

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utils
{
    public static final String DOTSEPERATORREGEX = "\\.";

    public static String       newLine           = System.getProperty("line.separator");
    public static String       fileSep           = System.getProperty("file.separator");;

    public final static String workingDir        = System.getProperty("user.dir") + fileSep;

    public static NumberFormat USNumberFormat    = NumberFormat.getInstance(Locale.US);
    static final char          BASE64_enc_pad    = '=';
    static final char          BASE64_enc[]      = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
            'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '"' };

    static final char          BASE64_dec[]      = { (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x3e, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x3f, (char) 0x34, (char) 0x35, (char) 0x36, (char) 0x37, (char) 0x38, (char) 0x39, (char) 0x3a, (char) 0x3b, (char) 0x3c,
            (char) 0x3d, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x01,
            (char) 0x02, (char) 0x03, (char) 0x04, (char) 0x05, (char) 0x06, (char) 0x07, (char) 0x08, (char) 0x09, (char) 0x0a, (char) 0x0b,
            (char) 0x0c, (char) 0x0d, (char) 0x0e, (char) 0x0f, (char) 0x10, (char) 0x11, (char) 0x12, (char) 0x13, (char) 0x14, (char) 0x15,
            (char) 0x16, (char) 0x17, (char) 0x18, (char) 0x19, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x1a, (char) 0x1b, (char) 0x1c, (char) 0x1d, (char) 0x1e, (char) 0x1f, (char) 0x20, (char) 0x21, (char) 0x22, (char) 0x23,
            (char) 0x24, (char) 0x25, (char) 0x26, (char) 0x27, (char) 0x28, (char) 0x29, (char) 0x2a, (char) 0x2b, (char) 0x2c, (char) 0x2d,
            (char) 0x2e, (char) 0x2f, (char) 0x30, (char) 0x31, (char) 0x32, (char) 0x33, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00,
            (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00, (char) 0x00 };

    /**
     * Base 64 encode.
     *
     * @param input
     *            the input
     * @param addLineBreaks
     *            the add line breaks
     * @return the string
     */
    public static String Base64Encode(byte[] input, boolean addLineBreaks)
    {
        int length = input.length;
        StringBuilder out = new StringBuilder("");
        char one;
        char two;
        char three;

        int i;
        for (i = 0; i < length && length - i >= 3;)
        {
            one = (char) input[i++];
            two = (char) input[i++];
            three = (char) input[i++];

            out.append((char) BASE64_enc[one >> 2]);
            out.append((char) BASE64_enc[((one << 4) & 0x30 | (two >> 4))]);
            out.append((char) BASE64_enc[((two << 2) & 0x3c | (three >> 6))]);
            out.append((char) BASE64_enc[three & 0x3f]);

            if (addLineBreaks && (i % 54 == 0)) out.append("\n");

            switch (length - i)
            {
                case 2:
                    one = (char) input[i++];
                    two = (char) input[i++];

                    out.append((char) BASE64_enc[one >> 2]);
                    out.append((char) BASE64_enc[((one << 4) & 0x30 | (two >> 4))]);
                    out.append((char) BASE64_enc[((two << 2) & 0x3c)]);
                    out.append(BASE64_enc_pad);
                    break;

                case 1:
                    one = (char) input[i++];

                    out.append((char) BASE64_enc[one >> 2]);
                    out.append((char) BASE64_enc[((one << 4) & 0x30)]);
                    out.append(BASE64_enc_pad);
                    out.append(BASE64_enc_pad);
                    break;
            }
        }
        return out.toString();
    }

    /**
     * Removes the all new lines.
     *
     * @param str
     *            the str
     * @return the string
     */
    public static String removeAllNewLines(String str)
    {
        return str.trim().replaceAll("\\r\\n|\\r|\\n", " ");
    }

    /**
     * Checks if is literal string.
     *
     * @param str
     *            the str
     * @return true, if is literal string
     */
    public static boolean isLiteralString(String str)
    {
        boolean match = QUOTEDSTRPATTERN.matcher(str).matches();

        if (match)
        {
            return !QUOTEDFULLFIELDPATTERN.matcher(str).matches();
        }

        return match;
    }

    /**
     * Checks if is SQL literal string.
     *
     * @param str
     *            the str
     * @return true, if is literal string
     */
    public static boolean isSQLLiteralString(String str)
    {
        boolean match = QUOTEDSQLSTRPATTERN.matcher(str).matches();

        if (match)
        {
            return !QUOTEDSQLQUALIFIEDIDPATTERN.matcher(str).matches();
        }

        return match;
    }

    /**
     * Checks if is numeric.
     *
     * @param str
     *            the str
     * @return true, if is numeric
     */
    public static boolean isNumeric(String str)
    {
        try
        {
            USNumberFormat.parse(str);
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    /**
     * Determines if entry represented by obj does not require single quote encapsulation.
     *
     * @param obj
     *            the entry
     * @return true, if single quotes not required
     */
    public static boolean doesNotRequireQuotes(Object obj)
    {
        try
        {
            if (obj == null)
                return false;
            if (obj instanceof Number)
                return true;
            if (obj instanceof String)
            {
                if(QUOTEDSQLSTRPATTERN.matcher((String)obj).matches())
                    return true;

                USNumberFormat.parse((String)obj);
            }
        }
        catch (Exception e)
        {
            return false;
        }

        return true;
    }

    private final static Pattern PARENSTRPATTERN = Pattern.compile("\\s*(\\()(.*?)(\\))\\s*", Pattern.DOTALL);

    /**
     * Checks if is in parenthesis.
     *
     * @param parenstring
     *            the parenstring
     * @return true, if is in parenthesis
     */
    public static boolean isInParenthesis(String parenstring)
    {
        if (parenstring == null) return false;

        Matcher matcher = PARENSTRPATTERN.matcher(parenstring);

        return matcher.matches();
    }

    public final static Pattern AGGFUNCPATTERN = Pattern.compile("\\s*(.*?)(\\()(.*?)(\\))\\s*", Pattern.DOTALL);

    /**
     * Checks if is agg function.
     *
     * @param aggfunstr
     *            the aggfunstr
     * @return true, if is agg function
     */
    public static boolean isAggFunction(String aggfunstr)
    {
        if (aggfunstr == null) return false;

        Matcher matcher = AGGFUNCPATTERN.matcher(aggfunstr);

        return matcher.matches();
    }

    /**
     * Gets the paren contents.
     *
     * @param parenstring
     *            the parenstring
     * @return the paren contents
     */
    public static String getParenContents(String parenstring)
    {
        if (parenstring == null) return "";

        Matcher matcher = PARENSTRPATTERN.matcher(parenstring);

        if (matcher.matches())
            return matcher.group(2).trim();
        else
            return parenstring;
    }

    /**
     * String to long.
     *
     * @param str
     *            the str
     * @param uponError
     *            the upon error
     * @return the long
     */
    public static long stringToLong(String str, long uponError)
    {
        try
        {
            Number num = USNumberFormat.parse(str);
            return num.longValue();
        }
        catch (Exception e)
        {
            return uponError;
        }
    }

    /**
     * String to int.
     *
     * @param str
     *            the str
     * @param uponError
     *            the upon error
     * @return the int
     */
    public static int stringToInt(String str, int uponError)
    {
        try
        {
            Number num = USNumberFormat.parse(str);
            return num.intValue();
        }
        catch (Exception e)
        {
            return uponError;
        }
    }

    /**
     * Replace all.
     *
     * @param input
     *            the input
     * @param forReplace
     *            the for replace
     * @param replaceWith
     *            the replace with
     * @return the string
     */
    public static String replaceAll(String input, String forReplace, String replaceWith)
    {
        if (input == null) return "null";

        StringBuffer result = new StringBuffer();
        boolean hasMore = true;
        while (hasMore)
        {
            int start = input.indexOf(forReplace);
            int end = start + forReplace.length();
            if (start != -1)
            {
                result.append(input.substring(0, start) + replaceWith);
                input = input.substring(end);
            }
            else
            {
                hasMore = false;
                result.append(input);
            }
        }
        if (result.toString().equals(""))
            return input; // nothing is changed
        else
            return result.toString();
    }

    private final static Pattern QUOTEDFULLFIELDPATTERN = Pattern.compile("\\s*(\"|\')(.*?){1}(\\.)(.*?){1}(\"|\')\\s*", Pattern.DOTALL);

    private final static Pattern QUOTEDSTRPATTERN       = Pattern.compile("\\s*(\"|\')(.*?)(\"|\')\\s*", Pattern.DOTALL);

    private final static Pattern QUOTEDSQLQUALIFIEDIDPATTERN = Pattern.compile("\\s*(\")(.*?){1}(\\.)(.*?){1}(\")\\s*", Pattern.DOTALL);
    private final static Pattern QUOTEDSQLIDPATTERN          = Pattern.compile("\\s*(\")(.*?)(\")\\s*", Pattern.DOTALL);
    private final static Pattern QUOTEDSQLSTRPATTERN         = Pattern.compile("\\s*(\')(.*?)(\')\\s*", Pattern.DOTALL);

    /**
     * Handle quoted string.
     *
     * @param quotedString
     *            the quoted string
     * @return the string
     */
    public static String handleQuotedString(String quotedString)
    {
        if (quotedString == null)
            return "";

        Matcher matcher = QUOTEDSTRPATTERN.matcher(quotedString);

        if (matcher.matches())
            return matcher.group(2);
        else
            return quotedString;
    }

    public static String handleQuotedIdentifier(String quotedString)
    {
        if (quotedString == null)
            return "";

        Matcher matcher = QUOTEDSQLIDPATTERN.matcher(quotedString);

        if (matcher.matches())
            return matcher.group(2);
        else
            return quotedString;
    }

    /**
     * Checks if is parameterized str.
     *
     * @param value
     *            the value
     * @return true, if is parameterized str
     */
    public static boolean isParameterizedStr(String value)
    {
        return (value.contains("${") || value.equals("?"));
    }

    public final static String EscapedSingleQuote = "\'\'";

    /**
     * Checks for possible escaped quote literal.
     *
     * @param quotedString
     *            the quoted string
     * @return true, if successful
     * @throws Exception
     *             the exception
     */
    public static boolean hasPossibleEscapedQuoteLiteral(String quotedString) throws Exception
    {
        if (quotedString == null) return false;

        return handleQuotedString(quotedString).contains(EscapedSingleQuote);
    }

    /**
     * Replace SQ lwith ECL escape char.
     *
     * @param quotedString
     *            the quoted string
     * @return the string
     * @throws Exception
     *             the exception
     */
    public static String replaceSQLwithECLEscapeChar(String quotedString) throws Exception
    {
        if (quotedString == null)
            return "";

        String eclescaped = "\\\\'";
        String replaced = '\'' + handleQuotedString(quotedString).replaceAll("\'\'", eclescaped) + '\'';

        return replaced;
    }

    public enum EclTypes
    {
        ECLTypeboolean (0),
        ECLTypeint (1),
        ECLTypereal (2),
        ECLTypedecimal (3),
        ECLTypestring (4),
        ECLTypeunused1 (5),
        ECLTypedate (6),
        ECLTypeunused2 (7),
        ECLTypeunused3 (8),
        ECLTypebitfield (9),
        ECLTypeunused4 (10),
        ECLTypechar (11),
        ECLTypeenumerated (12),
        ECLTyperecord (13),
        ECLTypevarstring (14),
        ECLTypeblob (15),
        ECLTypedata (16),
        ECLTypepointer (17),
        ECLTypeclass (18),
        ECLTypearray (19),
        ECLTypetable (20),
        ECLTypeset (21),
        ECLTyperow (22),
        ECLTypegroupedtable (23),
        ECLTypevoid (24),
        ECLTypealien (25),
        ECLTypeswapint (26),
        ECLTypepackedint (28),
        ECLTypeunused5 (29),
        ECLTypeqstring (30),
        ECLTypeunicode (31),
        ECLTypeany (32),
        ECLTypevarunicode (33),
        ECLTypepattern (34),
        ECLTyperule (35),
        ECLTypetoken (36),
        ECLTypefeature (37),
        ECLTypeevent (38),
        ECLTypenull (39),
        ECLTypescope (40),
        ECLTypeutf8 (41),
        ECLTypetransform (42),
        ECLTypeifblock (43), // not a real type -but used for the rtlfield serialization
        ECLTypefunction (44),
        ECLTypesortlist (45),
        ECLTypemodifier (0xff),  // used by getKind()
        ECLTypeunsigned (0x100), // combined with some of the above, when
                                 // returning summary type information. Not
                                 // returned by getTypeCode()
        ECLTypeebcdic (0x200),  // combined with some of the above, when returning
                                // summary type information. Not returned by
                                // getTypeCode()
        // Some pseudo types - never actually created
        ECLTypestringorunicode (0xfc), // any string/unicode variant
        ECLTypenumeric (0xfd),
        ECLTypescalar (0xfe);

        /**
         * Instantiates a new ecl types.
         *
         * @param eclcode
         *            the eclcode
         */
        EclTypes(int eclcode)
        {
        }
    }

    private final static HashMap<EclTypes, Integer> mapECLtypeCodeToSQLtype = new HashMap<EclTypes, Integer>();
    static
    {
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypeboolean, java.sql.Types.BOOLEAN);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypearray, java.sql.Types.ARRAY);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypeblob, java.sql.Types.BLOB);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypechar, java.sql.Types.CHAR);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypedate, java.sql.Types.DATE);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypedecimal, java.sql.Types.DECIMAL);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypeint, java.sql.Types.INTEGER);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypenull, java.sql.Types.NULL);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypenumeric, java.sql.Types.NUMERIC);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypepackedint, java.sql.Types.INTEGER);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypepointer, java.sql.Types.REF);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypeqstring, java.sql.Types.VARCHAR);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypereal, java.sql.Types.REAL);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypestring, java.sql.Types.VARCHAR);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypeunsigned, java.sql.Types.NUMERIC);
        mapECLtypeCodeToSQLtype.put(EclTypes.ECLTypevarstring, java.sql.Types.VARCHAR);
    }

    /**
     * Translates an ecltype element to sql type int (java.sql.Types value)
     *
     * @param ecltype
     *            The ecl type enumerated value.
     * @return The java.sql.Types value to convert to a string
     *         representation.
     */
    public static int convertECLtypeCode2SQLtype(EclTypes ecltype)
    {
        if (mapECLtypeCodeToSQLtype.containsKey(ecltype))
            return mapECLtypeCodeToSQLtype.get(ecltype);
        else
            return java.sql.Types.OTHER;
    }

    private final static HashMap<Integer, String> mapSQLtypeCodeToJavaClass = new HashMap<Integer, String>();
    static
    {
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.CHAR, "java.lang.Character");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.VARCHAR, "java.lang.String");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.LONGVARCHAR, "java.lang.String");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.NUMERIC, "java.math.BigDecimal");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.DECIMAL, "java.math.BigDecimal");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.BIT, "java.lang.Boolean");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.TINYINT, "java.lang.Byte");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.SMALLINT, "java.lang.Short");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.INTEGER, "java.lang.Integer");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.BIGINT, "java.lang.Long");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.REAL, "java.lang.Real");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.FLOAT, "java.lang.Double");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.DOUBLE, "java.lang.Double");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.BINARY, "java.lang.Byte[]");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.VARBINARY, "java.lang.Byte[]");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.LONGVARBINARY, "java.lang.Byte[]");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.DATE, "java.sql.Date");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.TIME, "java.sql.Time");
        mapSQLtypeCodeToJavaClass.put(java.sql.Types.TIMESTAMP, "java.sql.Timestamp");
    }

    private final static String JAVA_OBJECT_TYPE_NAME = "java.lang.Object";

    /**
     * Translates a data type from an integer (java.sql.Types value) to a string
     * that represents the corresponding class.
     *
     * @param type
     *            The java.sql.Types value to convert to a string
     *            representation.
     * @return The class name that corresponds to the given java.sql.Types
     *         value, or "java.lang.Object" if the type has no known mapping.
     */
    public static String convertSQLtype2JavaClassName(int type)
    {
        if (mapSQLtypeCodeToJavaClass.containsKey(type))
            return mapSQLtypeCodeToJavaClass.get(type);
        else
            return JAVA_OBJECT_TYPE_NAME;
    }

    /**
     * Attempts to map a string value to an enum value of
     * a given enum class.
     *
     * Iterates through all enum values of given enum class,
     * and compares to given string.
     * Returns enum value if it finds match, otherwise throws Exception
     *
     * @param <T>
     *            the generic type
     * @param enumclass
     *            reference to target enumaration
     * @param strvalue
     *            string value to be mapped to enum value
     * @return The corresponding enum value if found
     * @throws IllegalArgumentException
     *             if strvalue cannot be mapped to
     *             given enum
     */
    public static <T extends Enum<T>> T findEnumValFromString(Class<T> enumclass, String strvalue)
    {
        for (Enum enumValue : enumclass.getEnumConstants())
        {
            if (enumValue.name().equalsIgnoreCase(strvalue))
            {
                return (T) enumValue;
            }
        }
        throw new IllegalArgumentException(enumclass.getName() + ".'" + strvalue + "' is not valid.");
    }

    public static final Pattern BOOLEANPATTERN = Pattern.compile("((?i)true|(?i)false)", Pattern.DOTALL);

    /**
     * Checks if is boolean key word.
     *
     * @param str
     *            the str
     * @return true, if is boolean key word
     */
    public static boolean isBooleanKeyWord(String str)
    {
        return BOOLEANPATTERN.matcher(str).matches();
    }

    /**
     * Extracts raw (8 byte unsigned value) from Long type
     *
     * @param unsigned8 - 8 byte unsigned value stored in Long type
     *
     * @return  raw 8 byte unsigned value stored in BigInteger
     */
    public static BigInteger extractUnsigned8Val(long unsigned8)
    {
        return (BigInteger.valueOf((unsigned8 >> 32) & 0xffffffffL).shiftLeft(32)).add((BigInteger.valueOf(unsigned8 & 0xffffffffL)));
    }
}
