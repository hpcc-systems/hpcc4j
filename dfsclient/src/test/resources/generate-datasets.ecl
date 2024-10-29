IMPORT Std;

unique_keys :=  100000;  // Should be less than number of records
unique_values := 10212; // Should be less than number of records
totalrecs1 := 100000;

childRec := {STRING8 childField1, INTEGER8 childField2, REAL8 childField3};

rec := {  INTEGER8 int8, UNSIGNED8 uint8, INTEGER4 int4, UNSIGNED4 uint4,
          INTEGER2 int2, UNSIGNED2 uint2,
          REAL8 r8, REAL4 r4,
          DECIMAL16_8 dec16,
          DECIMAL15_8 dec15,
          UDECIMAL16_8 udec16,
          UDECIMAL15_8 udec15,
          QSTRING qStr,
          STRING8 fixStr8,
          STRING str,
          VARSTRING varStr,
          VARSTRING varStr8,
          UTF8 utfStr,
          UNICODE8 uni8,
          UNICODE uni,
          VARUNICODE varUni,
          DATASET(childRec) childDataset,
          SET OF INTEGER1 int1Set
        };
ds := DATASET(totalrecs1, transform(rec,
                                   self.int8 := (INTEGER)(random() % unique_keys);
                                   self.uint8 := (INTEGER)(random() % unique_values);
                                   self.int4 := (INTEGER)(random() % unique_values);
                                   self.uint4 := (INTEGER)(random() % unique_values);
                                   self.int2 := (INTEGER)(random() % unique_values);
                                   self.uint2 := (INTEGER)(random() % unique_values);
                                   self.r8 := (REAL)(random() % unique_values);
                                   self.r4 := (REAL)(random() % unique_values);
                                   self.dec16 := (REAL)(random() % unique_values);
                                   self.dec15 := (REAL)(random() % unique_values);
                                   self.udec16 := (REAL)(random() % unique_values);
                                   self.udec15 := (REAL)(random() % unique_values);
                                   self.qStr := (STRING)(random() % unique_values);
                                   self.fixStr8 := (STRING)(random() % unique_values);
                                   self.str := (STRING)(random() % unique_values);
                                   self.varStr := (STRING)(random() % unique_values);
                                   self.varStr8 := (STRING)(random() % unique_values);
                                   self.utfStr := (STRING)(random() % unique_values);
                                   self.uni8 := (STRING)(random() % unique_values);
                                   self.uni := (STRING)(random() % unique_values);
                                   self.varUni := (STRING)(random() % unique_values);
                                   self.childDataset := DATASET([{'field1',2,3},{'field1',2,3}],childRec);
                                   self.int1Set := [1,2,3];
                                  ), DISTRIBUTED);

dataset_name := '~unit_test::all_types::thor';
IF(~Std.File.FileExists(dataset_name), OUTPUT(ds,,dataset_name,overwrite));

// For the text files there appears to be an issue with reading sets from the datasets
// So, for those file formats create datasets wwith all types except SETs
recWithoutSet := {  INTEGER8 int8, UNSIGNED8 uint8, INTEGER4 int4, UNSIGNED4 uint4,
          INTEGER2 int2, UNSIGNED2 uint2,
          REAL8 r8, REAL4 r4,
          DECIMAL16_8 dec16,
          DECIMAL15_8 dec15,
          UDECIMAL16_8 udec16,
          UDECIMAL15_8 udec15,
          QSTRING qStr,
          STRING8 fixStr8,
          STRING str,
          VARSTRING varStr,
          VARSTRING varStr8,
          UTF8 utfStr,
          UNICODE8 uni8,
          UNICODE uni,
          VARUNICODE varUni,
          DATASET(childRec) childDataset,
        };
dsWithoutSet := DATASET(totalrecs1, transform(recWithoutSet,
                                   self.int8 := (INTEGER)(random() % unique_keys);
                                   self.uint8 := (INTEGER)(random() % unique_values);
                                   self.int4 := (INTEGER)(random() % unique_values);
                                   self.uint4 := (INTEGER)(random() % unique_values);
                                   self.int2 := (INTEGER)(random() % unique_values);
                                   self.uint2 := (INTEGER)(random() % unique_values);
                                   self.r8 := (REAL)(random() % unique_values);
                                   self.r4 := (REAL)(random() % unique_values);
                                   self.dec16 := (REAL)(random() % unique_values);
                                   self.dec15 := (REAL)(random() % unique_values);
                                   self.udec16 := (REAL)(random() % unique_values);
                                   self.udec15 := (REAL)(random() % unique_values);
                                   self.qStr := (STRING)(random() % unique_values);
                                   self.fixStr8 := (STRING)(random() % unique_values);
                                   self.str := (STRING)(random() % unique_values);
                                   self.varStr := (STRING)(random() % unique_values);
                                   self.varStr8 := (STRING)(random() % unique_values);
                                   self.utfStr := (STRING)(random() % unique_values);
                                   self.uni8 := (STRING)(random() % unique_values);
                                   self.uni := (STRING)(random() % unique_values);
                                   self.varUni := (STRING)(random() % unique_values);
                                   self.childDataset := DATASET([{'field1',2,3},{'field1',2,3}],childRec);
                                  ), DISTRIBUTED);

xml_dataset_name := '~unit_test::all_types::xml';
IF(~Std.File.FileExists(xml_dataset_name), OUTPUT(dsWithoutSet,,xml_dataset_name,XML,overwrite));

json_dataset_name := '~unit_test::all_types::json';
IF(~Std.File.FileExists(json_dataset_name), OUTPUT(dsWithoutSet,,json_dataset_name,JSON,overwrite));

csv_dataset_name := '~unit_test::all_types::csv';
IF(~Std.File.FileExists(csv_dataset_name), OUTPUT(dsWithoutSet,,csv_dataset_name,CSV,overwrite));

key_name := '~unit_test::all_types::key';
Ptbl := DATASET('~unit_test::all_types::thor', {rec,UNSIGNED8 RecPtr {virtual(fileposition)}},  FLAT);
indexds := INDEX(Ptbl, {int8, uint8, int4, uint4, int2, uint2, udec16, fixStr8,  RecPtr},key_name);
IF(~Std.File.FileExists(key_name), BUILDINDEX(indexds, overwrite));

dataset_name1 := '~benchmark::varstring::100MB';
totalrecs := 1250 * 50 * 100;

rec1 := {varstring key,varstring fill};
ds1 := DATASET(totalrecs, transform(rec1, self.key := (string) (random() % unique_keys);
                                        self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name1), OUTPUT(ds1,,dataset_name1,overwrite));

dataset_name2 := '~benchmark::utf8::100MB';

rec2 := {utf8 key,utf8 fill};
ds2 := DATASET(totalrecs, transform(rec2,
                                   self.key := (string) (random() % unique_keys);
                                   self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name2), OUTPUT(ds2,,dataset_name2,overwrite));

dataset_name3 := '~benchmark::unicode::100MB';

rec3 := {unicode8 key,unicode8 fill};
ds3 := DATASET(totalrecs, transform(rec3,
                                   self.key := (string) (random() % unique_keys);
                                   self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name3), OUTPUT(ds3,,dataset_name3,overwrite));

dataset_name4 := '~benchmark::real::100MB';

rec4 := {real8 key,real8 fill};
ds4 := DATASET(totalrecs, transform(rec4,
                                   self.key := (real) (random() % unique_keys);
                                   self.fill := (real) (random() % unique_values);
                                  ), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name4), OUTPUT(ds4,,dataset_name4,overwrite));

dataset_name5 := '~benchmark::decimal::100MB';

rec5 := {decimal16_8 key,decimal16_8 fill};
ds5 := DATASET(totalrecs, transform(rec5,
                                   self.key := (decimal16_8) (random() % unique_keys);
                                   self.fill := (decimal16_8) (random() % unique_values);
                                  ), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name5), OUTPUT(ds5,,dataset_name5,overwrite));

dataset_name6 := '~benchmark::string::100MB';

rec6 := {string8 key,string8 fill};
ds6 := DATASET(totalrecs, transform(rec6,
                                   self.key := (string) (random() % unique_keys);
                                   self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name6), OUTPUT(ds6,,dataset_name6,overwrite));

dataset_name7 := '~benchmark::integer::20KB';

rec7 := {integer  key, integer  fill};
ds7 := DATASET(1250, transform(rec7, self.key := random() % unique_keys; self.fill := random() % unique_values;), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name7), OUTPUT(ds7,,dataset_name7,overwrite));

dataset_name8 := '~benchmark::integer::100mb';
unique_keys8 :=  100000;  // Should be less than number of records
unique_values8 := 10212; // Should be less than number of records

rec8 := {integer  key, integer  fill};
ds8 := DATASET(1250 * 50 * 100, transform(rec8, self.key := random() % unique_keys8; self.fill := random() % unique_values8;), DISTRIBUTED);

IF(~Std.File.FileExists(dataset_name8), OUTPUT(ds8,,dataset_name8,overwrite));

childRec2 := RECORD
  	string8 str8;
	integer8 int8;
END;

rec9 := RECORD
    string12 str12;
	string8 str8;
	integer8 int8;
	DATASET(childRec2) children{maxcount(100)};
END;

ds9 := DATASET(125, transform(rec9,
                                self.str12 := (STRING) random();
                                self.str8 := (STRING) random();
                                self.int8 := random();
                                self.children := DATASET(random() % 100, transform(childRec2,
                                                                                  self.str8 := (string) random();
                                                                                  self.int8 := random();
                                                                                 ));
                               ), DISTRIBUTED);

dataset_name9 := '~test::index::child_dataset';
IF(~Std.File.FileExists(dataset_name9), OUTPUT(ds9,,dataset_name9, overwrite));

key_name2 := '~test::index::child_dataset::key';
idx := INDEX(ds9, {str12}, {str8, int8, DATASET(childRec2) childDS {maxcount(100)} := children}, key_name2);
IF(~Std.File.FileExists(key_name2), BUILDINDEX(idx, OVERWRITE));

rec10 := RECORD
    string12 str12;
	string content_string{blob, maxlength(2000000)};
    data content_data{blob, maxlength(2000000)};
    DATASET(childRec2) children{blob, maxcount(100)};
END;

ds10 := DATASET(125, transform(rec10,
                                self.str12 := (STRING) random();
                                self.content_string := (STRING) random();
                                self.content_data := (DATA) random();
                               	self.children := DATASET(random() % 100, transform(childRec2,
                                                                                  self.str8 := (string) random();
                                                                                  self.int8 := random();
                                                                                 ));
                               ), DISTRIBUTED);

dataset_name10 := '~test::index::blobs';
IF(~Std.File.FileExists(dataset_name10), OUTPUT(ds10,,dataset_name10, overwrite));

key_name3 := '~test::index::blobs::key';
idx2 := INDEX(ds10, {str12}, {content_string, content_data, DATASET(childRec2) childDS {blob, maxcount(100)} := children}, key_name3);
IF(~Std.File.FileExists(key_name3), BUILDINDEX(idx2, OVERWRITE));