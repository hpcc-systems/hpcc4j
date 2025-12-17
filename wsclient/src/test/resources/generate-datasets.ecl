IMPORT Std;

unique_keys :=  100000;  // Should be less than number of records
unique_values := 10212; // Should be less than number of records
dataset_name := '~benchmark::all_types::200KB';
totalrecs1 := 5600;

childRec := {STRING8 childField1, INTEGER8 childField2, REAL8 childField3};

rec := {INTEGER8 int8, UNSIGNED8 uint8, INTEGER4 int4, UNSIGNED4 uint4,
        INTEGER2 int2, UNSIGNED2 uint2,
          REAL8 r8, REAL4 r4,
          DECIMAL16_8 dec16, UDECIMAL16_8 udec16,
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
                                   self.udec16 := (REAL)(random() % unique_values);
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

IF(~Std.File.FileExists(dataset_name), OUTPUT(ds,,dataset_name,overwrite));

totalrecs := 1250 * 50 * 100;
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

key_name7 := '~benchmark::integer::20KB::key';
Ptbl7 := DATASET('~benchmark::integer::20KB', {rec7, UNSIGNED8 RecPtr {virtual(fileposition)}}, FLAT);
indexds7 := INDEX(Ptbl7, {key}, {fill, RecPtr}, key_name7);
IF(~Std.File.FileExists(key_name7), BUILDINDEX(indexds7, overwrite));

String subfilename := '~benchmark::all_types::200KB';
String sfname := '~benchmark::all_types::superfile';
IF(false = STD.file.SuperFileExists(sfname),STD.file.CreateSuperFile(sfname));
output(STD.file.SuperFileExists(sfname));
IF (STD.file.GetSuperFileSubCount(sfname) = 0, STD.file.AddSuperFile(sfname, subfilename));
