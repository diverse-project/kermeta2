; ModuleID = 'lib_std.c'
target datalayout = "e-p:64:64:64-i1:8:8-i8:8:8-i16:16:16-i32:32:32-i64:64:64-f32:32:32-f64:64:64-v64:64:64-v128:128:128-a0:0:64-s0:64:64-f80:128:128-n8:16:32:64-S128"
target triple = "x86_64-pc-linux-gnu"

%struct._IO_FILE = type { i32, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, i8*, %struct._IO_marker*, %struct._IO_FILE*, i32, i32, i64, i16, i8, [1 x i8], i8*, i64, i8*, i8*, i8*, i8*, i64, i32, [20 x i8] }
%struct._IO_marker = type { %struct._IO_marker*, %struct._IO_FILE*, i32 }
%struct.kermeta_io__StdIO = type {}
%struct.kermeta_standard__Object = type { i8**, %struct.kermeta_standard__Object* }

@.str = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@.str1 = private unnamed_addr constant [5 x i8] c"true\00", align 1
@.str2 = private unnamed_addr constant [6 x i8] c"false\00", align 1
@.str3 = private unnamed_addr constant [3 x i8] c"%s\00", align 1
@stderr = external global %struct._IO_FILE*
@.str4 = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@SINGLETON_kermeta_io__StdIO = common global %struct.kermeta_io__StdIO zeroinitializer, align 1

define %struct.kermeta_standard__Object* @kermeta_standard__Object___container(%struct.kermeta_standard__Object* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__Object*, align 8
  store %struct.kermeta_standard__Object* %self, %struct.kermeta_standard__Object** %1, align 8
  %2 = load %struct.kermeta_standard__Object** %1, align 8
  %3 = getelementptr inbounds %struct.kermeta_standard__Object* %2, i32 0, i32 1
  %4 = load %struct.kermeta_standard__Object** %3, align 8
  ret %struct.kermeta_standard__Object* %4
}

define %struct.kermeta_standard__Object* @create_kermeta_standard__Object() nounwind uwtable {
  %1 = call noalias i8* @malloc(i64 16) nounwind
  %2 = bitcast i8* %1 to %struct.kermeta_standard__Object*
  ret %struct.kermeta_standard__Object* %2
}

declare noalias i8* @malloc(i64) nounwind

define zeroext i1 @kermeta_standard__Object___isVoid(%struct.kermeta_standard__Object* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__Object*, align 8
  store %struct.kermeta_standard__Object* %self, %struct.kermeta_standard__Object** %1, align 8
  ret i1 false
}

define i8* @kermeta_standard__Object___toString(%struct.kermeta_standard__Object* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__Object*, align 8
  store %struct.kermeta_standard__Object* %self, %struct.kermeta_standard__Object** %1, align 8
  ret i8* null
}

define void @delete_kermeta_standard__String(i8* %s) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %s, i8** %1, align 8
  %2 = load i8** %1, align 8
  call void @free(i8* %2) nounwind
  ret void
}

declare void @free(i8*) nounwind

define %struct.kermeta_standard__Object* @kermeta_standard__String___container(i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %self, i8** %1, align 8
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__String___plus(i8* %s, i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca i8*, align 8
  %res = alloca i8*, align 8
  store i8* %s, i8** %1, align 8
  store i8* %self, i8** %2, align 8
  %3 = load i8** %1, align 8
  %4 = call i64 @strlen(i8* %3) nounwind readonly
  %5 = load i8** %2, align 8
  %6 = call i64 @strlen(i8* %5) nounwind readonly
  %7 = add i64 %4, %6
  %8 = add i64 %7, 1
  %9 = call noalias i8* @calloc(i64 %8, i64 1) nounwind
  store i8* %9, i8** %res, align 8
  %10 = load i8** %res, align 8
  %11 = load i8** %2, align 8
  %12 = call i8* @strcat(i8* %10, i8* %11) nounwind
  %13 = load i8** %res, align 8
  %14 = load i8** %1, align 8
  %15 = call i8* @strcat(i8* %13, i8* %14) nounwind
  %16 = load i8** %res, align 8
  ret i8* %16
}

declare noalias i8* @calloc(i64, i64) nounwind

declare i64 @strlen(i8*) nounwind readonly

declare i8* @strcat(i8*, i8*) nounwind

define void @kermeta_standard__String___equals(%struct.kermeta_standard__Object* %o, i8* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_standard__Object*, align 8
  %2 = alloca i8*, align 8
  store %struct.kermeta_standard__Object* %o, %struct.kermeta_standard__Object** %1, align 8
  store i8* %self, i8** %2, align 8
  ret void
}

define i8* @kermeta_standard__String___toString(i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %self, i8** %1, align 8
  %2 = load i8** %1, align 8
  ret i8* %2
}

define void @kermeta_standard__String___hashcode(i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  store i8* %self, i8** %1, align 8
  ret void
}

define i32 @kermeta_standard__String___compareTo(i8* %s, i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca i8*, align 8
  store i8* %s, i8** %1, align 8
  store i8* %self, i8** %2, align 8
  %3 = load i8** %2, align 8
  %4 = load i8** %1, align 8
  %5 = call i32 @strcmp(i8* %3, i8* %4) nounwind readonly
  ret i32 %5
}

declare i32 @strcmp(i8*, i8*) nounwind readonly

define i32 @kermeta_standard__String___indexOf(i8* %s, i8* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca i8*, align 8
  %found = alloca i8*, align 8
  %res = alloca i32, align 4
  store i8* %s, i8** %1, align 8
  store i8* %self, i8** %2, align 8
  %3 = load i8** %2, align 8
  %4 = load i8** %1, align 8
  %5 = call i8* @strstr(i8* %3, i8* %4) nounwind readonly
  store i8* %5, i8** %found, align 8
  %6 = load i8** %found, align 8
  %7 = icmp eq i8* %6, null
  br i1 %7, label %8, label %9

; <label>:8                                       ; preds = %0
  store i32 -1, i32* %res, align 4
  br label %16

; <label>:9                                       ; preds = %0
  %10 = load i8** %found, align 8
  %11 = load i8** %2, align 8
  %12 = ptrtoint i8* %10 to i64
  %13 = ptrtoint i8* %11 to i64
  %14 = sub i64 %12, %13
  %15 = trunc i64 %14 to i32
  store i32 %15, i32* %res, align 4
  br label %16

; <label>:16                                      ; preds = %9, %8
  %17 = load i32* %res, align 4
  ret i32 %17
}

declare i8* @strstr(i8*, i8*) nounwind readonly

define signext i8 @kermeta_standard__String___charAt(i32 %index, i8* %self) nounwind uwtable {
  %1 = alloca i32, align 4
  %2 = alloca i8*, align 8
  store i32 %index, i32* %1, align 4
  store i8* %self, i8** %2, align 8
  %3 = load i32* %1, align 4
  %4 = icmp slt i32 %3, 0
  br i1 %4, label %11, label %5

; <label>:5                                       ; preds = %0
  %6 = load i32* %1, align 4
  %7 = sext i32 %6 to i64
  %8 = load i8** %2, align 8
  %9 = call i64 @strlen(i8* %8) nounwind readonly
  %10 = icmp uge i64 %7, %9
  br i1 %10, label %11, label %12

; <label>:11                                      ; preds = %5, %0
  br label %19

; <label>:12                                      ; preds = %5
  %13 = load i32* %1, align 4
  %14 = sext i32 %13 to i64
  %15 = load i8** %2, align 8
  %16 = getelementptr inbounds i8* %15, i64 %14
  %17 = load i8* %16
  %18 = sext i8 %17 to i32
  br label %19

; <label>:19                                      ; preds = %12, %11
  %20 = phi i32 [ 0, %11 ], [ %18, %12 ]
  %21 = trunc i32 %20 to i8
  ret i8 %21
}

define %struct.kermeta_standard__Object* @kermeta_standard__Integer___container(i32 %self) nounwind uwtable {
  %1 = alloca i32, align 4
  store i32 %self, i32* %1, align 4
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__Integer___toString(i32 %self) nounwind uwtable {
  %1 = alloca i32, align 4
  %lgth = alloca i32, align 4
  %str = alloca i8*, align 8
  store i32 %self, i32* %1, align 4
  %2 = load i32* %1, align 4
  %3 = icmp slt i32 %2, 0
  %4 = select i1 %3, i32 1, i32 0
  store i32 %4, i32* %lgth, align 4
  %5 = load i32* %1, align 4
  %6 = icmp eq i32 %5, 0
  br i1 %6, label %7, label %10

; <label>:7                                       ; preds = %0
  %8 = load i32* %lgth, align 4
  %9 = add nsw i32 %8, 1
  store i32 %9, i32* %lgth, align 4
  br label %21

; <label>:10                                      ; preds = %0
  %11 = load i32* %1, align 4
  %12 = call i32 @abs(i32 %11) nounwind readnone
  %13 = sitofp i32 %12 to double
  %14 = call double @log10(double %13) nounwind
  %15 = call double @floor(double %14) nounwind readnone
  %16 = fadd double %15, 1.000000e+00
  %17 = load i32* %lgth, align 4
  %18 = sitofp i32 %17 to double
  %19 = fadd double %18, %16
  %20 = fptosi double %19 to i32
  store i32 %20, i32* %lgth, align 4
  br label %21

; <label>:21                                      ; preds = %10, %7
  %22 = load i32* %lgth, align 4
  %23 = sext i32 %22 to i64
  %24 = mul i64 1, %23
  %25 = call noalias i8* @malloc(i64 %24) nounwind
  store i8* %25, i8** %str, align 8
  %26 = load i8** %str, align 8
  %27 = load i32* %1, align 4
  %28 = call i32 (i8*, i64, i8*, ...)* @snprintf(i8* %26, i64 8, i8* getelementptr inbounds ([3 x i8]* @.str, i32 0, i32 0), i32 %27) nounwind
  %29 = load i8** %str, align 8
  ret i8* %29
}

declare double @floor(double) nounwind readnone

declare double @log10(double) nounwind

declare i32 @abs(i32) nounwind readnone

declare i32 @snprintf(i8*, i64, i8*, ...) nounwind

define %struct.kermeta_standard__Object* @kermeta_standard__Boolean___container(i1 zeroext %self) nounwind uwtable {
  %1 = alloca i8, align 1
  %2 = zext i1 %self to i8
  store i8 %2, i8* %1, align 1
  ret %struct.kermeta_standard__Object* null
}

define i8* @kermeta_standard__Boolean___toString(i1 zeroext %self) nounwind uwtable {
  %1 = alloca i8, align 1
  %str = alloca i8*, align 8
  %2 = zext i1 %self to i8
  store i8 %2, i8* %1, align 1
  %3 = load i8* %1, align 1
  %4 = trunc i8 %3 to i1
  br i1 %4, label %5, label %9

; <label>:5                                       ; preds = %0
  %6 = call noalias i8* @malloc(i64 4) nounwind
  store i8* %6, i8** %str, align 8
  %7 = load i8** %str, align 8
  %8 = call i8* @strncpy(i8* %7, i8* getelementptr inbounds ([5 x i8]* @.str1, i32 0, i32 0), i64 4) nounwind
  br label %13

; <label>:9                                       ; preds = %0
  %10 = call noalias i8* @malloc(i64 5) nounwind
  store i8* %10, i8** %str, align 8
  %11 = load i8** %str, align 8
  %12 = call i8* @strncpy(i8* %11, i8* getelementptr inbounds ([6 x i8]* @.str2, i32 0, i32 0), i64 5) nounwind
  br label %13

; <label>:13                                      ; preds = %9, %5
  %14 = load i8** %str, align 8
  ret i8* %14
}

declare i8* @strncpy(i8*, i8*, i64) nounwind

define void @kermeta_io__StdIO___write(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load i8** %1, align 8
  %4 = call i32 (i8*, ...)* @printf(i8* getelementptr inbounds ([3 x i8]* @.str3, i32 0, i32 0), i8* %3)
  ret void
}

declare i32 @printf(i8*, ...)

define void @kermeta_io__StdIO___errorln(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load %struct._IO_FILE** @stderr, align 8
  %4 = load i8** %1, align 8
  %5 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %3, i8* getelementptr inbounds ([4 x i8]* @.str4, i32 0, i32 0), i8* %4)
  ret void
}

declare i32 @fprintf(%struct._IO_FILE*, i8*, ...)

define void @kermeta__o__StdIO___error(i8* %o, %struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca i8*, align 8
  %2 = alloca %struct.kermeta_io__StdIO*, align 8
  store i8* %o, i8** %1, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %2, align 8
  %3 = load %struct._IO_FILE** @stderr, align 8
  %4 = load i8** %1, align 8
  %5 = call i32 (%struct._IO_FILE*, i8*, ...)* @fprintf(%struct._IO_FILE* %3, i8* getelementptr inbounds ([3 x i8]* @.str3, i32 0, i32 0), i8* %4)
  ret void
}

define %struct.kermeta_standard__Object* @kermeta_io__StdIO___container(%struct.kermeta_io__StdIO* %self) nounwind uwtable {
  %1 = alloca %struct.kermeta_io__StdIO*, align 8
  store %struct.kermeta_io__StdIO* %self, %struct.kermeta_io__StdIO** %1, align 8
  ret %struct.kermeta_standard__Object* null
}
declare i32 @puts(i8*)
@"s0" = private unnamed_addr constant [7 x i8] c"B.foo!\00"
@"s1" = private unnamed_addr constant [7 x i8] c"C.foo!\00"
@"s2" = private unnamed_addr constant [6 x i8] c"C.bar\00"
@"s3" = private unnamed_addr constant [7 x i8] c"D.foo!\00"
@"s4" = private unnamed_addr constant [13 x i8] c"Hello World!\00"
@"s5" = private unnamed_addr constant [8 x i8] c"ifthen!\00"
@"s6" = private unnamed_addr constant [8 x i8] c"ifElse!\00"
%"pkgFoo__A" = type {i8**, %struct.kermeta_standard__Object*}
%"pkgFoo__B" = type {i8**, %"pkgFoo__A"*}
%"pkgFoo__C" = type {i8**, %"pkgFoo__B"*}
%"pkgFoo__D" = type {i8**, %"pkgFoo__C"*, %"pkgFoo__A"**}
%"pkgFoo__Main" = type {i8**, %struct.kermeta_standard__Object*}
@"kermeta_standard__Object##vtable" = global [3 x i8*] [i8* bitcast (i1 (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___isVoid to i8*), i8* bitcast (%struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___container to i8*), i8* bitcast (i8* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___toString to i8*)]
@"pkgFoo__A##vtable" = global [3 x i8*] [i8* bitcast (i1 (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___isVoid to i8*), i8* bitcast (%struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___container to i8*), i8* bitcast (i8* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___toString to i8*)]
@"pkgFoo__B##vtable" = global [4 x i8*] [i8* bitcast (void (%"pkgFoo__B"*)* @"pkgFoo__B___foo1" to i8*), i8* bitcast (i1 (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___isVoid to i8*), i8* bitcast (%struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___container to i8*), i8* bitcast (i8* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___toString to i8*)]
@"pkgFoo__C##vtable" = global [6 x i8*] [i8* bitcast (void (%"pkgFoo__C"*)* @"pkgFoo__C___foo2" to i8*), i8* bitcast (void (%"pkgFoo__C"*)* @"pkgFoo__C___bar3" to i8*), i8* bitcast (void (%"pkgFoo__B"*)* @"pkgFoo__B___#adapter11" to i8*), i8* bitcast (i1 (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___isVoid to i8*), i8* bitcast (%struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___container to i8*), i8* bitcast (i8* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___toString to i8*)]
@"pkgFoo__D##vtable" = global [7 x i8*] [i8* bitcast (void (%"pkgFoo__D"*)* @"pkgFoo__D___foo4" to i8*), i8* bitcast (void (%"pkgFoo__C"*)* @"pkgFoo__C___#adapter32" to i8*), i8* bitcast (void (%"pkgFoo__C"*)* @"pkgFoo__C___bar3" to i8*), i8* bitcast (void (%"pkgFoo__B"*)* @"pkgFoo__B___#adapter41" to i8*), i8* bitcast (i1 (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___isVoid to i8*), i8* bitcast (%struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___container to i8*), i8* bitcast (i8* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___toString to i8*)]
@"pkgFoo__Main##vtable" = global [4 x i8*] [i8* bitcast (void (%"pkgFoo__Main"*)* @"pkgFoo__Main___main5" to i8*), i8* bitcast (i1 (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___isVoid to i8*), i8* bitcast (%struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___container to i8*), i8* bitcast (i8* (%struct.kermeta_standard__Object*)* @kermeta_standard__Object___toString to i8*)]
define internal %"pkgFoo__A"* @"create_pkgFoo__A"(){
%"1" = alloca %"pkgFoo__A"*
%"2" = call noalias i8* @malloc(i64 16) nounwind
%"3" = bitcast i8* %"2" to %"pkgFoo__A"*
store %"pkgFoo__A"* %"3", %"pkgFoo__A"** %"1"
%"4" = load %"pkgFoo__A"** %"1"
%"5" = call %struct.kermeta_standard__Object* @"create_kermeta_standard__Object"()
%"6" = getelementptr %"pkgFoo__A"* %"4", i32 0, i32 1
store %struct.kermeta_standard__Object* %"5", %struct.kermeta_standard__Object** %"6"
%"7" = getelementptr %"pkgFoo__A"* %"4", i32 0, i32 0
store i8** getelementptr([3 x i8*]* @"pkgFoo__A##vtable", i64 0, i64 0), i8*** %"7"
%"9" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__A_kermeta_standard__Object"(%"pkgFoo__A"* %"4")
%"8" = getelementptr %struct.kermeta_standard__Object* %"9", i32 0, i32 0
store i8** getelementptr([3 x i8*]* @"pkgFoo__A##vtable", i64 0, i64 0), i8*** %"8"
ret %"pkgFoo__A"* %"4"
}
define internal %"pkgFoo__B"* @"create_pkgFoo__B"(){
%"1" = alloca %"pkgFoo__B"*
%"2" = call noalias i8* @malloc(i64 16) nounwind
%"3" = bitcast i8* %"2" to %"pkgFoo__B"*
store %"pkgFoo__B"* %"3", %"pkgFoo__B"** %"1"
%"4" = load %"pkgFoo__B"** %"1"
%"5" = call %"pkgFoo__A"* @"create_pkgFoo__A"()
%"6" = getelementptr %"pkgFoo__B"* %"4", i32 0, i32 1
store %"pkgFoo__A"* %"5", %"pkgFoo__A"** %"6"
%"7" = getelementptr %"pkgFoo__B"* %"4", i32 0, i32 0
store i8** getelementptr([4 x i8*]* @"pkgFoo__B##vtable", i64 0, i64 0), i8*** %"7"
%"9" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__B_kermeta_standard__Object"(%"pkgFoo__B"* %"4")
%"8" = getelementptr %struct.kermeta_standard__Object* %"9", i32 0, i32 0
store i8** getelementptr([4 x i8*]* @"pkgFoo__B##vtable", i64 0, i64 1), i8*** %"8"
%"11" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"4")
%"10" = getelementptr %"pkgFoo__A"* %"11", i32 0, i32 0
store i8** getelementptr([4 x i8*]* @"pkgFoo__B##vtable", i64 0, i64 1), i8*** %"10"
ret %"pkgFoo__B"* %"4"
}
define internal %"pkgFoo__C"* @"create_pkgFoo__C"(){
%"1" = alloca %"pkgFoo__C"*
%"2" = call noalias i8* @malloc(i64 16) nounwind
%"3" = bitcast i8* %"2" to %"pkgFoo__C"*
store %"pkgFoo__C"* %"3", %"pkgFoo__C"** %"1"
%"4" = load %"pkgFoo__C"** %"1"
%"5" = call %"pkgFoo__B"* @"create_pkgFoo__B"()
%"6" = getelementptr %"pkgFoo__C"* %"4", i32 0, i32 1
store %"pkgFoo__B"* %"5", %"pkgFoo__B"** %"6"
%"7" = getelementptr %"pkgFoo__C"* %"4", i32 0, i32 0
store i8** getelementptr([6 x i8*]* @"pkgFoo__C##vtable", i64 0, i64 0), i8*** %"7"
%"9" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__C_kermeta_standard__Object"(%"pkgFoo__C"* %"4")
%"8" = getelementptr %struct.kermeta_standard__Object* %"9", i32 0, i32 0
store i8** getelementptr([6 x i8*]* @"pkgFoo__C##vtable", i64 0, i64 2), i8*** %"8"
%"11" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"4")
%"10" = getelementptr %"pkgFoo__B"* %"11", i32 0, i32 0
store i8** getelementptr([6 x i8*]* @"pkgFoo__C##vtable", i64 0, i64 2), i8*** %"10"
%"13" = call %"pkgFoo__A"* @"cast_pkgFoo__C_pkgFoo__A"(%"pkgFoo__C"* %"4")
%"12" = getelementptr %"pkgFoo__A"* %"13", i32 0, i32 0
store i8** getelementptr([6 x i8*]* @"pkgFoo__C##vtable", i64 0, i64 2), i8*** %"12"
ret %"pkgFoo__C"* %"4"
}
define internal %"pkgFoo__D"* @"create_pkgFoo__D"(){
%"1" = alloca %"pkgFoo__D"*
%"2" = call noalias i8* @malloc(i64 24) nounwind
%"3" = bitcast i8* %"2" to %"pkgFoo__D"*
store %"pkgFoo__D"* %"3", %"pkgFoo__D"** %"1"
%"4" = load %"pkgFoo__D"** %"1"
%"5" = call %"pkgFoo__C"* @"create_pkgFoo__C"()
%"6" = getelementptr %"pkgFoo__D"* %"4", i32 0, i32 1
store %"pkgFoo__C"* %"5", %"pkgFoo__C"** %"6"
%"7" = getelementptr %"pkgFoo__D"* %"4", i32 0, i32 0
store i8** getelementptr([7 x i8*]* @"pkgFoo__D##vtable", i64 0, i64 0), i8*** %"7"
%"9" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__D_kermeta_standard__Object"(%"pkgFoo__D"* %"4")
%"8" = getelementptr %struct.kermeta_standard__Object* %"9", i32 0, i32 0
store i8** getelementptr([7 x i8*]* @"pkgFoo__D##vtable", i64 0, i64 3), i8*** %"8"
%"11" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"4")
%"10" = getelementptr %"pkgFoo__C"* %"11", i32 0, i32 0
store i8** getelementptr([7 x i8*]* @"pkgFoo__D##vtable", i64 0, i64 1), i8*** %"10"
%"13" = call %"pkgFoo__B"* @"cast_pkgFoo__D_pkgFoo__B"(%"pkgFoo__D"* %"4")
%"12" = getelementptr %"pkgFoo__B"* %"13", i32 0, i32 0
store i8** getelementptr([7 x i8*]* @"pkgFoo__D##vtable", i64 0, i64 3), i8*** %"12"
%"15" = call %"pkgFoo__A"* @"cast_pkgFoo__D_pkgFoo__A"(%"pkgFoo__D"* %"4")
%"14" = getelementptr %"pkgFoo__A"* %"15", i32 0, i32 0
store i8** getelementptr([7 x i8*]* @"pkgFoo__D##vtable", i64 0, i64 3), i8*** %"14"
ret %"pkgFoo__D"* %"4"
}
define internal %"pkgFoo__Main"* @"create_pkgFoo__Main"(){
%"1" = alloca %"pkgFoo__Main"*
%"2" = call noalias i8* @malloc(i64 16) nounwind
%"3" = bitcast i8* %"2" to %"pkgFoo__Main"*
store %"pkgFoo__Main"* %"3", %"pkgFoo__Main"** %"1"
%"4" = load %"pkgFoo__Main"** %"1"
%"5" = call %struct.kermeta_standard__Object* @"create_kermeta_standard__Object"()
%"6" = getelementptr %"pkgFoo__Main"* %"4", i32 0, i32 1
store %struct.kermeta_standard__Object* %"5", %struct.kermeta_standard__Object** %"6"
%"7" = getelementptr %"pkgFoo__Main"* %"4", i32 0, i32 0
store i8** getelementptr([4 x i8*]* @"pkgFoo__Main##vtable", i64 0, i64 0), i8*** %"7"
%"9" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__Main_kermeta_standard__Object"(%"pkgFoo__Main"* %"4")
%"8" = getelementptr %struct.kermeta_standard__Object* %"9", i32 0, i32 0
store i8** getelementptr([4 x i8*]* @"pkgFoo__Main##vtable", i64 0, i64 1), i8*** %"8"
ret %"pkgFoo__Main"* %"4"
}
define internal %"pkgFoo__A"* @"pkgFoo__D.#propCompo"(%"pkgFoo__D"* %"self") readonly inlinehint{
%"1" = getelementptr %"pkgFoo__D"* %"self", i32 0, i32 2
%"2" = load %"pkgFoo__A"*** %"1"
%"3" = load %"pkgFoo__A"** %"2"
ret %"pkgFoo__A"* %"3"
}
define internal %struct.kermeta_standard__Object* @"cast_pkgFoo__A_kermeta_standard__Object"(%"pkgFoo__A"* %"self") readonly inlinehint{
%"1" = getelementptr %"pkgFoo__A"* %"self", i32 0, i32 1
%"2" = load %struct.kermeta_standard__Object** %"1"
ret %struct.kermeta_standard__Object* %"2"
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self") readonly inlinehint{
%"1" = bitcast %"pkgFoo__A"* %"self" to i8*
%"2" = getelementptr i8* %"1", i64 -8
%"3" = bitcast i8* %"2" to %"pkgFoo__B"*
ret %"pkgFoo__B"* %"3"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__A_pkgFoo__C"(%"pkgFoo__A"* %"self") readonly{
%"1" = call %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self")
%"2" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"1")
ret %"pkgFoo__C"* %"2"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__A_pkgFoo__D"(%"pkgFoo__A"* %"self") readonly{
%"1" = call %"pkgFoo__B"* @"cast_pkgFoo__A_pkgFoo__B"(%"pkgFoo__A"* %"self")
%"2" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"1")
%"3" = call %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"2")
ret %"pkgFoo__D"* %"3"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"self") readonly inlinehint{
%"1" = getelementptr %"pkgFoo__B"* %"self", i32 0, i32 1
%"2" = load %"pkgFoo__A"** %"1"
ret %"pkgFoo__A"* %"2"
}
define internal %struct.kermeta_standard__Object* @"cast_pkgFoo__B_kermeta_standard__Object"(%"pkgFoo__B"* %"self") readonly{
%"1" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"self")
%"2" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__A_kermeta_standard__Object"(%"pkgFoo__A"* %"1")
ret %struct.kermeta_standard__Object* %"2"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self") readonly inlinehint{
%"1" = bitcast %"pkgFoo__B"* %"self" to i8*
%"2" = getelementptr i8* %"1", i64 -8
%"3" = bitcast i8* %"2" to %"pkgFoo__C"*
ret %"pkgFoo__C"* %"3"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__B_pkgFoo__D"(%"pkgFoo__B"* %"self") readonly{
%"1" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self")
%"2" = call %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"1")
ret %"pkgFoo__D"* %"2"
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self") readonly inlinehint{
%"1" = getelementptr %"pkgFoo__C"* %"self", i32 0, i32 1
%"2" = load %"pkgFoo__B"** %"1"
ret %"pkgFoo__B"* %"2"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__C_pkgFoo__A"(%"pkgFoo__C"* %"self") readonly{
%"1" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self")
%"2" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"1")
ret %"pkgFoo__A"* %"2"
}
define internal %struct.kermeta_standard__Object* @"cast_pkgFoo__C_kermeta_standard__Object"(%"pkgFoo__C"* %"self") readonly{
%"1" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"self")
%"2" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"1")
%"3" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__A_kermeta_standard__Object"(%"pkgFoo__A"* %"2")
ret %struct.kermeta_standard__Object* %"3"
}
define internal %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"self") readonly inlinehint{
%"1" = bitcast %"pkgFoo__C"* %"self" to i8*
%"2" = getelementptr i8* %"1", i64 -8
%"3" = bitcast i8* %"2" to %"pkgFoo__D"*
ret %"pkgFoo__D"* %"3"
}
define internal %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self") readonly inlinehint{
%"1" = getelementptr %"pkgFoo__D"* %"self", i32 0, i32 1
%"2" = load %"pkgFoo__C"** %"1"
ret %"pkgFoo__C"* %"2"
}
define internal %"pkgFoo__B"* @"cast_pkgFoo__D_pkgFoo__B"(%"pkgFoo__D"* %"self") readonly{
%"1" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self")
%"2" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"1")
ret %"pkgFoo__B"* %"2"
}
define internal %"pkgFoo__A"* @"cast_pkgFoo__D_pkgFoo__A"(%"pkgFoo__D"* %"self") readonly{
%"1" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self")
%"2" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"1")
%"3" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"2")
ret %"pkgFoo__A"* %"3"
}
define internal %struct.kermeta_standard__Object* @"cast_pkgFoo__D_kermeta_standard__Object"(%"pkgFoo__D"* %"self") readonly{
%"1" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"self")
%"2" = call %"pkgFoo__B"* @"cast_pkgFoo__C_pkgFoo__B"(%"pkgFoo__C"* %"1")
%"3" = call %"pkgFoo__A"* @"cast_pkgFoo__B_pkgFoo__A"(%"pkgFoo__B"* %"2")
%"4" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__A_kermeta_standard__Object"(%"pkgFoo__A"* %"3")
ret %struct.kermeta_standard__Object* %"4"
}
define internal %struct.kermeta_standard__Object* @"cast_pkgFoo__Main_kermeta_standard__Object"(%"pkgFoo__Main"* %"self") readonly inlinehint{
%"1" = getelementptr %"pkgFoo__Main"* %"self", i32 0, i32 1
%"2" = load %struct.kermeta_standard__Object** %"1"
ret %struct.kermeta_standard__Object* %"2"
}
define internal void @"pkgFoo__B___#adapter11"(%"pkgFoo__B"* %"self") inlinehint{
%"1" = call %"pkgFoo__C"* @"cast_pkgFoo__B_pkgFoo__C"(%"pkgFoo__B"* %"self")
call void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"1")
ret void
}
define internal void @"pkgFoo__C___#adapter32"(%"pkgFoo__C"* %"self") inlinehint{
%"1" = call %"pkgFoo__D"* @"cast_pkgFoo__C_pkgFoo__D"(%"pkgFoo__C"* %"self")
call void @"pkgFoo__D___foo4"(%"pkgFoo__D"* %"1")
ret void
}
define internal void @"pkgFoo__B___#adapter41"(%"pkgFoo__B"* %"self") inlinehint{
%"1" = call %"pkgFoo__D"* @"cast_pkgFoo__B_pkgFoo__D"(%"pkgFoo__B"* %"self")
call void @"pkgFoo__D___foo4"(%"pkgFoo__D"* %"1")
ret void
}
define internal void @"pkgFoo__B___foo1"(%"pkgFoo__B"* %"self"){
%"1" = getelementptr [7 x i8]* @"s0", i32 0, i32 0
call i32 @puts(i8* %"1")
ret void
}
define internal void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"self"){
%"1" = getelementptr [7 x i8]* @"s1", i32 0, i32 0
call i32 @puts(i8* %"1")
ret void
}
define internal void @"pkgFoo__C___bar3"(%"pkgFoo__C"* %"self"){
%"1" = getelementptr [6 x i8]* @"s2", i32 0, i32 0
call i32 @puts(i8* %"1")
ret void
}
define internal void @"pkgFoo__D___foo4"(%"pkgFoo__D"* %"self"){
%"1" = call %"pkgFoo__C"* @cast_pkgFoo__D_pkgFoo__C(%"pkgFoo__D"* %"self")
call void @"pkgFoo__C___foo2"(%"pkgFoo__C"* %"1")
%"2" = getelementptr [7 x i8]* @"s3", i32 0, i32 0
call i32 @puts(i8* %"2")
ret void
}
define i32 @main(){
%1 = call %"pkgFoo__Main"* @"create_pkgFoo__Main"()
call void @"pkgFoo__Main___main5"(%"pkgFoo__Main"*  %1)
ret i32 0
}
define internal void @"pkgFoo__Main___main5"(%"pkgFoo__Main"* %"self"){
%"1" = getelementptr [13 x i8]* @"s4", i32 0, i32 0
call i32 @puts(i8* %"1")
%"d" = alloca %"pkgFoo__D"*
%"2" = call %"pkgFoo__D"* @"create_pkgFoo__D"()
store %"pkgFoo__D"* %"2", %"pkgFoo__D"** %"d"
%"3" = load %"pkgFoo__D"** %"d"
%"4" = bitcast %"pkgFoo__D"* %"3" to void (%"pkgFoo__D"*)***
%"5" = load void (%"pkgFoo__D"*)*** %"4"
%"6" = getelementptr void (%"pkgFoo__D"*)** %"5", i64 0
%"7" = load void (%"pkgFoo__D"*)** %"6"
call void %"7"(%"pkgFoo__D"* %"3")
%"8" = icmp eq i1 false, true
br i1 %"8", label %llvmlabel9, label %llvmlabel11
llvmlabel9:
%"12" = getelementptr [8 x i8]* @"s5", i32 0, i32 0
call i32 @puts(i8* %"12")
br label %llvmlabel10
llvmlabel11:
%"13" = getelementptr [8 x i8]* @"s6", i32 0, i32 0
call i32 @puts(i8* %"13")
br label %llvmlabel10
llvmlabel10:
%"i" = alloca i1
store i1 false, i1* %"i"
br label %llvmlabel14
llvmlabel14:
%"17" = load i1* %"i"
%"18" = icmp eq i1 %"17", false
br i1 %"18", label %llvmlabel16, label %llvmlabel15
llvmlabel15:
%"19" = load i1* %"i"
%"20" = call i8* @kermeta_standard__Boolean___toString(i1 %"19")
call i32 @puts(i8* %"20")
%"21" = load i1* %"i"
store i1 false, i1* %"i"
br label %llvmlabel14
llvmlabel16:
%"22" = sub i32 2002, 2000
%"23" = call i8* @kermeta_standard__Integer___toString(i32 %"22")
call i32 @puts(i8* %"23")
%"24" = load %"pkgFoo__D"** %"d"
%"25" = call %"pkgFoo__C"* @"cast_pkgFoo__D_pkgFoo__C"(%"pkgFoo__D"* %"24")
%"26" = bitcast %"pkgFoo__C"* %"25" to void (%"pkgFoo__C"*)***
%"27" = load void (%"pkgFoo__C"*)*** %"26"
%"28" = getelementptr void (%"pkgFoo__C"*)** %"27", i64 1
%"29" = load void (%"pkgFoo__C"*)** %"28"
call void %"29"(%"pkgFoo__C"* %"25")
%"b" = alloca %"pkgFoo__B"*
%"30" = call %"pkgFoo__D"* @"create_pkgFoo__D"()
%"31" = call %"pkgFoo__B"* @"cast_pkgFoo__D_pkgFoo__B"(%"pkgFoo__D"* %"30")
store %"pkgFoo__B"* %"31", %"pkgFoo__B"** %"b"
%"32" = load %"pkgFoo__B"** %"b"
%"33" = bitcast %"pkgFoo__B"* %"32" to void (%"pkgFoo__B"*)***
%"34" = load void (%"pkgFoo__B"*)*** %"33"
%"35" = getelementptr void (%"pkgFoo__B"*)** %"34", i64 0
%"36" = load void (%"pkgFoo__B"*)** %"35"
call void %"36"(%"pkgFoo__B"* %"32")
%"37" = load %"pkgFoo__D"** %"d"
%"38" = call %"pkgFoo__A"* @"cast_pkgFoo__D_pkgFoo__A"(%"pkgFoo__D"* %"37")
%"39" = load %"pkgFoo__B"** %"b"
%"41" = call %"pkgFoo__D"* @"cast_pkgFoo__B_pkgFoo__D"(%"pkgFoo__B"* %"39")
%"40" = call %"pkgFoo__A"* @"pkgFoo__D.#propCompo"(%"pkgFoo__D"* %"41")
%"42" = call %struct.kermeta_standard__Object* @"cast_pkgFoo__A_kermeta_standard__Object"(%"pkgFoo__A"* %"40")
%"43" = bitcast %struct.kermeta_standard__Object* %"42" to %struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)***
%"44" = load %struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)*** %"43"
%"45" = getelementptr %struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)** %"44", i64 1
%"46" = load %struct.kermeta_standard__Object* (%struct.kermeta_standard__Object*)** %"45"
%"47" = call %struct.kermeta_standard__Object* %"46"(%struct.kermeta_standard__Object* %"42")
%"48" = bitcast %struct.kermeta_standard__Object* %"47" to i8* (%struct.kermeta_standard__Object*)***
%"49" = load i8* (%struct.kermeta_standard__Object*)*** %"48"
%"50" = getelementptr i8* (%struct.kermeta_standard__Object*)** %"49", i64 2
%"51" = load i8* (%struct.kermeta_standard__Object*)** %"50"
%"52" = call i8* %"51"(%struct.kermeta_standard__Object* %"47")
call i32 @puts(i8* %"52")
ret void
}
