no_of_students = 0
no_of_subjects = 0
student_scores = []
total_scores = []
average_scores = []

def collect_scores():
    total_scores = [0] * no_of_students
    average_scores = [0] * no_of_students

    for student in range(no_of_students):
        total = 0

        for subject in range(no_of_subjects):
            print(f"Entering the score for student {student + 1}")
            print(f"Entering score for subject {subject + 1}")
            result = int(input())

            while result < 0 or result > 100:
                print("Score must be between 0 and 100")
                result = int(input())

            student_scores[student][subject] = result
            total += result

        total_scores[student] = total
        average_scores[student] = total / no_of_subjects
        print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully\n\n")

def main_app():
    no_of_students = int(input("How many students do you have? "))
    no_of_subjects = int(input("How many subjects do they offer? "))
    student_scores = [[0] * no_of_subjects for num in range(no_of_students)]

    print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved Successfully")
    collect_scores()
    print (student_scores)
    print (no_of_students)
    print (no_of_subjects)


main_app()
