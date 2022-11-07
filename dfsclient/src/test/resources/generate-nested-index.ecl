childRec := RECORD
  	string8 str8;
	integer8 int8;
END;

rec := RECORD
    string12 str12;
	string8 str8;
	integer8 int8;
	DATASET(childRec) children{maxcount(100)};
END;

ds := DATASET(125, transform(rec,
                                self.str12 := (STRING) random();
                                self.str8 := (STRING) random();
                                self.int8 := random();
                                self.children := DATASET(random() % 100, transform(childRec,
                                                                                  self.str8 := (string) random();
                                                                                  self.int8 := random();
                                                                                 ));
                               ), DISTRIBUTED);
OUTPUT(ds,,'~test::index::child_dataset', overwrite);

idx := INDEX(ds, {str12}, {str8, int8, DATASET(childRec) childDS {maxcount(100)} := children}, '~test::index::child_dataset::key');
BUILDINDEX(idx, OVERWRITE);
