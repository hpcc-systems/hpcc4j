#!/bin/bash

#How to run:
# "--privilged" is important on CentOS. Otherwise "su - hpcc" will fail with error
# "su: cannot open session: Permission denied"
#sudo docker run --privileged --rm -v "$PWD/test-platform.sh:/usr/local/bin/test.sh" hpccsystems/hpcc:<tag> test.sh


cd ~
mkdir -p tmp
cd tmp

# Start HPCC
#/etc/init.d/hpcc-init start > /dev/null 2>&1
#rc=$?
#if [ $rc -ne 0 ]; then
#  echo "Start HPCC failed Error code: $rc"
#  exit 1
#fi

#sleep 5

cat > test.ecl << EOF
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

OUTPUT(ds,,dataset_name,overwrite);

key_name := '~benchmark::all_types::200KB::key';
Ptbl := DATASET(dataset_name, {rec,UNSIGNED8 RecPtr {virtual(fileposition)}},  FLAT);
indexds := INDEX(Ptbl, {int8, uint8, int4, uint4, int2, uint2, udec16, fixStr8,  RecPtr},key_name);
Bld := BUILDINDEX(indexds);
Bld;

dataset_name1 := '~benchmark::varstring::100MB';
totalrecs := 1250 * 50 * 100;

rec1 := {varstring key,varstring fill};
ds1 := DATASET(totalrecs, transform(rec1, self.key := (string) (random() % unique_keys);
                                        self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

OUTPUT(ds1,,dataset_name1,overwrite);

dataset_name2 := '~benchmark::utf8::100MB';

rec2 := {utf8 key,utf8 fill};
ds2 := DATASET(totalrecs, transform(rec2,
                                   self.key := (string) (random() % unique_keys);
                                   self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

OUTPUT(ds2,,dataset_name2,overwrite);

dataset_name3 := '~benchmark::unicode::100MB';

rec3 := {unicode8 key,unicode8 fill};
ds3 := DATASET(totalrecs, transform(rec3,
                                   self.key := (string) (random() % unique_keys);
                                   self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

OUTPUT(ds3,,dataset_name3,overwrite);


dataset_name4 := '~benchmark::real::100MB';

rec4 := {real8 key,real8 fill};
ds4 := DATASET(totalrecs, transform(rec4,
                                   self.key := (real) (random() % unique_keys);
                                   self.fill := (real) (random() % unique_values);
                                  ), DISTRIBUTED);

OUTPUT(ds4,,dataset_name4,overwrite);

dataset_name5 := '~benchmark::decimal::100MB';

rec5 := {decimal16_8 key,decimal16_8 fill};
ds5 := DATASET(totalrecs, transform(rec5,
                                   self.key := (decimal16_8) (random() % unique_keys);
                                   self.fill := (decimal16_8) (random() % unique_values);
                                  ), DISTRIBUTED);

OUTPUT(ds5,,dataset_name5,overwrite);

dataset_name6 := '~benchmark::string::100MB';

rec6 := {string8 key,string8 fill};
ds6 := DATASET(totalrecs, transform(rec6,
                                   self.key := (string) (random() % unique_keys);
                                   self.fill := (string) (random() % unique_values);
                                  ), DISTRIBUTED);

OUTPUT(ds6,,dataset_name6,overwrite);

dataset_name7 := '~benchmark::integer::20KB';

rec7 := {integer  key, integer  fill};
ds7 := DATASET(1250, transform(rec7, self.key := random() % unique_keys; self.fill := random() % unique_values;), DISTRIBUTED);

OUTPUT(ds7,,dataset_name7,overwrite);

dataset_name8 := '~benchmark::integer::100mb';
unique_keys8 :=  100000;  // Should be less than number of records
unique_values8 := 10212; // Should be less than number of records

rec8 := {integer  key, integer  fill};
ds8 := DATASET(1250 * 50 * 100, transform(rec8, self.key := random() % unique_keys8; self.fill := random() % unique_values8;), DISTRIBUTED);

OUTPUT(ds8,,dataset_name8,overwrite);
EOF

cat > createSuperFile.ecl << EOF
Import STD;
String subfilename := '~benchmark::all_types::200KB';
String sfname := '~benchmark::all_types::superfile';
IF(false = STD.file.SuperFileExists(sfname),STD.file.CreateSuperFile(sfname));
output(STD.file.SuperFileExists(sfname));
STD.file.AddSuperFile(sfname, subfilename);
EOF

cat  > verify.ecl << EOF
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

sampledataset := DATASET('~benchmark::all_types::200KB', rec, THOR);
output(count(sampledataset));
EOF

# Test ecl code through esp
/opt/HPCCSystems/bin/ecl run hthor test.ecl > test_result 2>&1
rc=$?
if [ $rc -ne 0 ]; then
  echo "Generate sample data via ecl code through esp failed! Error code: $rc"
  exit 2
fi

# Validate result
/opt/HPCCSystems/bin/ecl run hthor verify.ecl > test_result 2>&1
cat test_result | grep "<Row><Result_1>1558</Result_1></Row>" test_result > /dev/null
if [ $rc -ne 0 ]; then
  echo "Data validation failed - Expected: <Row><Result_1>1558</Result_1></Row>"
  exit 3
fi

cat > MyPackage.pkg << EOF
<RoxiePackages>
  <Package id="findcraig">
    <Base id="'~benchmark::all_types::superfile'"/>
  </Package>
</RoxiePackages>
EOF

#Add the above packagemap
/opt/HPCCSystems/bin/ecl  packagemap add roxie MyPackage.pkg > test_result 2>&1 
rc=$?
if [ $rc -ne 0 ]; then
  echo "Generate packagemap vi ecl executable failed! Error code: $rc"
  exit 2
fi

#verify packagemap created
/opt/HPCCSystems/bin/ecl  packagemap list >  test_result 2>&1

cat test_result | grep "Package Id = roxie::mypackage.pkg  active = 1" test_result > /dev/null
if [ $rc -ne 0 ]; then
  echo "Packagemap validation failed - Expected: <Row><Result_1>1558</Result_1></Row>"
  exit 3
fi



echo "ECL generated sample data through esp succeeded!"
