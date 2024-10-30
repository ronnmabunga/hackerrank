if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    for name in student_marks:
        grade = 0
        for x in student_marks[name]:
            grade = grade + x
        student_marks[name] = grade/len(student_marks[name])
    print("%.2f" % student_marks[query_name])
